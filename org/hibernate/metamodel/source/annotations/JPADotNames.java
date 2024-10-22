/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
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
package org.hibernate.metamodel.source.annotations;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AssociationOverrides;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EntityResult;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.ExcludeSuperclassListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.FieldResult;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.LockModeType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKey;
import jakarta.persistence.MapKeyClass;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.MapKeyJoinColumn;
import jakarta.persistence.MapKeyJoinColumns;
import jakarta.persistence.MapKeyTemporal;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.MapsId;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContexts;
import jakarta.persistence.PersistenceProperty;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.PersistenceUnits;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumns;
import jakarta.persistence.QueryHint;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.SecondaryTables;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.SqlResultSetMappings;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Version;

import org.jboss.jandex.DotName;

/**
 * Defines the dot names for the JPA annotations
 *
 * @author Hardy Ferentschik
 */
public interface JPADotNames {
	DotName ACCESS = DotName.createSimple( Access.class.getName() );
	DotName ACCESS_TYPE = DotName.createSimple( AccessType.class.getName() );
	DotName ASSOCIATION_OVERRIDE = DotName.createSimple( AssociationOverride.class.getName() );
	DotName ASSOCIATION_OVERRIDES = DotName.createSimple( AssociationOverrides.class.getName() );
	DotName ATTRIBUTE_OVERRIDE = DotName.createSimple( AttributeOverride.class.getName() );
	DotName ATTRIBUTE_OVERRIDES = DotName.createSimple( AttributeOverrides.class.getName() );
	DotName BASIC = DotName.createSimple( Basic.class.getName() );
	DotName CACHEABLE = DotName.createSimple( Cacheable.class.getName() );
	DotName CASCADE_TYPE = DotName.createSimple( CascadeType.class.getName() );
	DotName COLLECTION_TABLE = DotName.createSimple( CollectionTable.class.getName() );
	DotName COLUMN = DotName.createSimple( Column.class.getName() );
	DotName COLUMN_RESULT = DotName.createSimple( ColumnResult.class.getName() );
	DotName DISCRIMINATOR_COLUMN = DotName.createSimple( DiscriminatorColumn.class.getName() );
	DotName DISCRIMINATOR_TYPE = DotName.createSimple( DiscriminatorType.class.getName() );
	DotName DISCRIMINATOR_VALUE = DotName.createSimple( DiscriminatorValue.class.getName() );
	DotName ELEMENT_COLLECTION = DotName.createSimple( ElementCollection.class.getName() );
	DotName EMBEDDABLE = DotName.createSimple( Embeddable.class.getName() );
	DotName EMBEDDED = DotName.createSimple( Embedded.class.getName() );
	DotName EMBEDDED_ID = DotName.createSimple( EmbeddedId.class.getName() );
	DotName ENTITY = DotName.createSimple( Entity.class.getName() );
	DotName ENTITY_LISTENERS = DotName.createSimple( EntityListeners.class.getName() );
	DotName ENTITY_RESULT = DotName.createSimple( EntityResult.class.getName() );
	DotName ENUMERATED = DotName.createSimple( Enumerated.class.getName() );
	DotName ENUM_TYPE = DotName.createSimple( EnumType.class.getName() );
	DotName EXCLUDE_DEFAULT_LISTENERS = DotName.createSimple( ExcludeDefaultListeners.class.getName() );
	DotName EXCLUDE_SUPERCLASS_LISTENERS = DotName.createSimple( ExcludeSuperclassListeners.class.getName() );
	DotName FETCH_TYPE = DotName.createSimple( FetchType.class.getName() );
	DotName FIELD_RESULT = DotName.createSimple( FieldResult.class.getName() );
	DotName GENERATION_TYPE = DotName.createSimple( GenerationType.class.getName() );
	DotName GENERATED_VALUE = DotName.createSimple( GeneratedValue.class.getName() );
	DotName ID = DotName.createSimple( Id.class.getName() );
	DotName ID_CLASS = DotName.createSimple( IdClass.class.getName() );
	DotName INHERITANCE_TYPE = DotName.createSimple( InheritanceType.class.getName() );
	DotName JOIN_COLUMN = DotName.createSimple( JoinColumn.class.getName() );
	DotName INHERITANCE = DotName.createSimple( Inheritance.class.getName() );
	DotName JOIN_COLUMNS = DotName.createSimple( JoinColumns.class.getName() );
	DotName JOIN_TABLE = DotName.createSimple( JoinTable.class.getName() );
	DotName LOB = DotName.createSimple( Lob.class.getName() );
	DotName LOCK_MODE_TYPE = DotName.createSimple( LockModeType.class.getName() );
	DotName MANY_TO_MANY = DotName.createSimple( ManyToMany.class.getName() );
	DotName MANY_TO_ONE = DotName.createSimple( ManyToOne.class.getName() );
	DotName MAP_KEY = DotName.createSimple( MapKey.class.getName() );
	DotName MAP_KEY_CLASS = DotName.createSimple( MapKeyClass.class.getName() );
	DotName MAP_KEY_COLUMN = DotName.createSimple( MapKeyColumn.class.getName() );
	DotName MAP_KEY_ENUMERATED = DotName.createSimple( MapKeyEnumerated.class.getName() );
	DotName MAP_KEY_JOIN_COLUMN = DotName.createSimple( MapKeyJoinColumn.class.getName() );
	DotName MAP_KEY_JOIN_COLUMNS = DotName.createSimple( MapKeyJoinColumns.class.getName() );
	DotName MAP_KEY_TEMPORAL = DotName.createSimple( MapKeyTemporal.class.getName() );
	DotName MAPPED_SUPERCLASS = DotName.createSimple( MappedSuperclass.class.getName() );
	DotName MAPS_ID = DotName.createSimple( MapsId.class.getName() );
	DotName NAMED_NATIVE_QUERIES = DotName.createSimple( NamedNativeQueries.class.getName() );
	DotName NAMED_NATIVE_QUERY = DotName.createSimple( NamedNativeQuery.class.getName() );
	DotName NAMED_QUERIES = DotName.createSimple( NamedQueries.class.getName() );
	DotName NAMED_QUERY = DotName.createSimple( NamedQuery.class.getName() );
	DotName ONE_TO_MANY = DotName.createSimple( OneToMany.class.getName() );
	DotName ONE_TO_ONE = DotName.createSimple( OneToOne.class.getName() );
	DotName ORDER_BY = DotName.createSimple( OrderBy.class.getName() );
	DotName ORDER_COLUMN = DotName.createSimple( OrderColumn.class.getName() );
	DotName PERSISTENCE_CONTEXT = DotName.createSimple( PersistenceContext.class.getName() );
	DotName PERSISTENCE_CONTEXTS = DotName.createSimple( PersistenceContexts.class.getName() );
	DotName PERSISTENCE_PROPERTY = DotName.createSimple( PersistenceProperty.class.getName() );
	DotName PERSISTENCE_UNIT = DotName.createSimple( PersistenceUnit.class.getName() );
	DotName PERSISTENCE_UNITS = DotName.createSimple( PersistenceUnits.class.getName() );
	DotName POST_LOAD = DotName.createSimple( PostLoad.class.getName() );
	DotName POST_PERSIST = DotName.createSimple( PostPersist.class.getName() );
	DotName POST_REMOVE = DotName.createSimple( PostRemove.class.getName() );
	DotName POST_UPDATE = DotName.createSimple( PostUpdate.class.getName() );
	DotName PRE_PERSIST = DotName.createSimple( PrePersist.class.getName() );
	DotName PRE_REMOVE = DotName.createSimple( PreRemove.class.getName() );
	DotName PRE_UPDATE = DotName.createSimple( PreUpdate.class.getName() );
	DotName PRIMARY_KEY_JOIN_COLUMN = DotName.createSimple( PrimaryKeyJoinColumn.class.getName() );
	DotName PRIMARY_KEY_JOIN_COLUMNS = DotName.createSimple( PrimaryKeyJoinColumns.class.getName() );
	DotName QUERY_HINT = DotName.createSimple( QueryHint.class.getName() );
	DotName SECONDARY_TABLE = DotName.createSimple( SecondaryTable.class.getName() );
	DotName SECONDARY_TABLES = DotName.createSimple( SecondaryTables.class.getName() );
	DotName SEQUENCE_GENERATOR = DotName.createSimple( SequenceGenerator.class.getName() );
	DotName SQL_RESULT_SET_MAPPING = DotName.createSimple( SqlResultSetMapping.class.getName() );
	DotName SQL_RESULT_SET_MAPPINGS = DotName.createSimple( SqlResultSetMappings.class.getName() );
	DotName TABLE = DotName.createSimple( Table.class.getName() );
	DotName TABLE_GENERATOR = DotName.createSimple( TableGenerator.class.getName() );
	DotName TEMPORAL = DotName.createSimple( Temporal.class.getName() );
	DotName TEMPORAL_TYPE = DotName.createSimple( TemporalType.class.getName() );
	DotName TRANSIENT = DotName.createSimple( Transient.class.getName() );
	DotName UNIQUE_CONSTRAINT = DotName.createSimple( UniqueConstraint.class.getName() );
	DotName VERSION = DotName.createSimple( Version.class.getName() );
}


