/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.cfg;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import org.hibernate.AnnotationException;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;
import org.hibernate.annotations.common.reflection.XProperty;
import org.hibernate.cfg.annotations.EntityBinder;
import org.hibernate.cfg.annotations.Nullability;
import org.hibernate.internal.util.StringHelper;

/**
 * Do the initial discovery of columns metadata and apply defaults.
 * Also hosts some convenient methods related to column processing
 *
 * @author Emmanuel Bernard
 */
class ColumnsBuilder {
	private PropertyHolder propertyHolder;
	private Nullability nullability;
	private XProperty property;
	private PropertyData inferredData;
	private EntityBinder entityBinder;
	private Mappings mappings;
	private Ejb3Column[] columns;
	private Ejb3JoinColumn[] joinColumns;

	public ColumnsBuilder(
			PropertyHolder propertyHolder,
			Nullability nullability,
			XProperty property,
			PropertyData inferredData,
			EntityBinder entityBinder,
			Mappings mappings) {
		this.propertyHolder = propertyHolder;
		this.nullability = nullability;
		this.property = property;
		this.inferredData = inferredData;
		this.entityBinder = entityBinder;
		this.mappings = mappings;
	}

	public Ejb3Column[] getColumns() {
		return columns;
	}

	public Ejb3JoinColumn[] getJoinColumns() {
		return joinColumns;
	}

	public ColumnsBuilder extractMetadata() {
		columns = null;
		joinColumns = buildExplicitJoinColumns(property, inferredData);


		if ( property.isAnnotationPresent( Column.class ) || property.isAnnotationPresent( Formula.class ) ) {
			Column ann = property.getAnnotation( Column.class );
			Formula formulaAnn = property.getAnnotation( Formula.class );
			columns = Ejb3Column.buildColumnFromAnnotation(
					new Column[] { ann }, formulaAnn, nullability, propertyHolder, inferredData,
					entityBinder.getSecondaryTables(), mappings
			);
		}
		else if ( property.isAnnotationPresent( Columns.class ) ) {
			Columns anns = property.getAnnotation( Columns.class );
			columns = Ejb3Column.buildColumnFromAnnotation(
					anns.columns(), null,
					nullability, propertyHolder, inferredData, entityBinder.getSecondaryTables(),
					mappings
			);
		}

		//set default values if needed
		if ( joinColumns == null &&
				( property.isAnnotationPresent( ManyToOne.class )
						|| property.isAnnotationPresent( OneToOne.class ) )
				) {
			joinColumns = buildDefaultJoinColumnsForXToOne(property, inferredData);
		}
		else if ( joinColumns == null &&
				( property.isAnnotationPresent( OneToMany.class )
						|| property.isAnnotationPresent( ElementCollection.class )
				) ) {
			OneToMany oneToMany = property.getAnnotation( OneToMany.class );
			String mappedBy = oneToMany != null ?
					oneToMany.mappedBy() :
					"";
			joinColumns = Ejb3JoinColumn.buildJoinColumns(
					null,
					mappedBy, entityBinder.getSecondaryTables(),
					propertyHolder, inferredData.getPropertyName(), mappings
			);
		}
		else if ( joinColumns == null && property.isAnnotationPresent( org.hibernate.annotations.Any.class ) ) {
			throw new AnnotationException( "@Any requires an explicit @JoinColumn(s): "
					+ BinderHelper.getPath( propertyHolder, inferredData ) );
		}
		if ( columns == null && !property.isAnnotationPresent( ManyToMany.class ) ) {
			//useful for collection of embedded elements
			columns = Ejb3Column.buildColumnFromAnnotation(
					null, null,
					nullability, propertyHolder, inferredData, entityBinder.getSecondaryTables(), mappings
			);
		}

		if ( nullability == Nullability.FORCED_NOT_NULL ) {
			//force columns to not null
			for (Ejb3Column col : columns ) {
				col.forceNotNull();
			}
		}
		return this;
	}

	Ejb3JoinColumn[] buildDefaultJoinColumnsForXToOne(XProperty property, PropertyData inferredData) {
		Ejb3JoinColumn[] joinColumns;
		JoinTable joinTableAnn = propertyHolder.getJoinTable( property );
		if ( joinTableAnn != null ) {
			joinColumns = Ejb3JoinColumn.buildJoinColumns(
					joinTableAnn.inverseJoinColumns(), null, entityBinder.getSecondaryTables(),
					propertyHolder, inferredData.getPropertyName(), mappings
			);
			if ( StringHelper.isEmpty( joinTableAnn.name() ) ) {
				throw new AnnotationException(
						"JoinTable.name() on a @ToOne association has to be explicit: "
								+ BinderHelper.getPath( propertyHolder, inferredData )
				);
			}
		}
		else {
			OneToOne oneToOneAnn = property.getAnnotation( OneToOne.class );
			String mappedBy = oneToOneAnn != null ?
					oneToOneAnn.mappedBy() :
					null;
			joinColumns = Ejb3JoinColumn.buildJoinColumns(
					null,
					mappedBy, entityBinder.getSecondaryTables(),
					propertyHolder, inferredData.getPropertyName(), mappings
			);
		}
		return joinColumns;
	}

	Ejb3JoinColumn[] buildExplicitJoinColumns(XProperty property, PropertyData inferredData) {
		//process @JoinColumn(s) before @Column(s) to handle collection of entities properly
		Ejb3JoinColumn[] joinColumns = null;
		{
			JoinColumn[] anns = null;

			if ( property.isAnnotationPresent( JoinColumn.class ) ) {
				anns = new JoinColumn[] { property.getAnnotation( JoinColumn.class ) };
			}
			else if ( property.isAnnotationPresent( JoinColumns.class ) ) {
				JoinColumns ann = property.getAnnotation( JoinColumns.class );
				anns = ann.value();
				int length = anns.length;
				if ( length == 0 ) {
					throw new AnnotationException( "Cannot bind an empty @JoinColumns" );
				}
			}
			if ( anns != null ) {
				joinColumns = Ejb3JoinColumn.buildJoinColumns(
						anns, null, entityBinder.getSecondaryTables(),
						propertyHolder, inferredData.getPropertyName(), mappings
				);
			}
			else if ( property.isAnnotationPresent( JoinColumnsOrFormulas.class ) ) {
				JoinColumnsOrFormulas ann = property.getAnnotation( JoinColumnsOrFormulas.class );
				joinColumns = Ejb3JoinColumn.buildJoinColumnsOrFormulas(
						ann, null, entityBinder.getSecondaryTables(),
						propertyHolder, inferredData.getPropertyName(), mappings
				);
			}
			else if (property.isAnnotationPresent( JoinFormula.class)) {
				JoinFormula ann = property.getAnnotation( JoinFormula.class );
				joinColumns = new Ejb3JoinColumn[1];
				joinColumns[0] = Ejb3JoinColumn.buildJoinFormula(
										ann, null, entityBinder.getSecondaryTables(), 
										propertyHolder, inferredData.getPropertyName(), mappings);
			}
		}
		return joinColumns;
	}

	Ejb3Column[] overrideColumnFromMapperOrMapsIdProperty(boolean isId) {
		Ejb3Column[] result = columns;
		final PropertyData overridingProperty = BinderHelper.getPropertyOverriddenByMapperOrMapsId(
				isId, propertyHolder, property.getName(), mappings
		);
		if ( overridingProperty != null ) {
			result = buildExcplicitOrDefaultJoinColumn( overridingProperty );
		}
		return result;
	}

	/**
	 * useful to override a column either by @MapsId or by @IdClass
	 */
	Ejb3Column[] buildExcplicitOrDefaultJoinColumn(PropertyData overridingProperty) {
		Ejb3Column[] result;
		result = buildExplicitJoinColumns( overridingProperty.getProperty(), overridingProperty );
		if (result == null) {
			result = buildDefaultJoinColumnsForXToOne( overridingProperty.getProperty(), overridingProperty);
		}
		return result;
	}
}
