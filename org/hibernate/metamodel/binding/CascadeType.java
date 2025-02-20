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
package org.hibernate.metamodel.binding;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.MappingException;
import org.hibernate.engine.spi.CascadeStyle;


/**
 * @author Hardy Ferentschik
 * @todo integrate this w/ org.hibernate.engine.spi.CascadeStyle
 */
public enum CascadeType {
	/**
	 * Cascades save, delete, update, evict, lock, replicate, merge, persist
	 */
	ALL,

	/**
	 * Cascades save, delete, update, evict, lock, replicate, merge, persist + delete orphans
	 */
	ALL_DELETE_ORPHAN,

	/**
	 * Cascades save and update
	 */
	UPDATE,

	/**
	 * Cascades persist
	 */
	PERSIST,

	/**
	 * Cascades merge
	 */
	MERGE,

	/**
	 * Cascades lock
	 */
	LOCK,

	/**
	 * Cascades refresh
	 */
	REFRESH,

	/**
	 * Cascades replicate
	 */
	REPLICATE,

	/**
	 * Cascades evict
	 */
	EVICT,

	/**
	 * Cascade delete
	 */
	DELETE,

	/**
	 * Cascade delete + delete orphans
	 */
	DELETE_ORPHAN,

	/**
	 * No cascading
	 */
	NONE;

	private static final Map<String, CascadeType> hbmOptionToCascadeType = new HashMap<String, CascadeType>();

	static {
		hbmOptionToCascadeType.put( "all", ALL );
		hbmOptionToCascadeType.put( "all-delete-orphan", ALL_DELETE_ORPHAN );
		hbmOptionToCascadeType.put( "save-update", UPDATE );
		hbmOptionToCascadeType.put( "persist", PERSIST );
		hbmOptionToCascadeType.put( "merge", MERGE );
		hbmOptionToCascadeType.put( "lock", LOCK );
		hbmOptionToCascadeType.put( "refresh", REFRESH );
		hbmOptionToCascadeType.put( "replicate", REPLICATE );
		hbmOptionToCascadeType.put( "evict", EVICT );
		hbmOptionToCascadeType.put( "delete", DELETE );
		hbmOptionToCascadeType.put( "remove", DELETE ); // adds remove as a sort-of alias for delete...
		hbmOptionToCascadeType.put( "delete-orphan", DELETE_ORPHAN );
		hbmOptionToCascadeType.put( "none", NONE );
	}

	private static final Map<jakarta.persistence.CascadeType, CascadeType> jpaCascadeTypeToHibernateCascadeType = new HashMap<jakarta.persistence.CascadeType, CascadeType>();

	static {
		jpaCascadeTypeToHibernateCascadeType.put( jakarta.persistence.CascadeType.ALL, ALL );
		jpaCascadeTypeToHibernateCascadeType.put( jakarta.persistence.CascadeType.PERSIST, PERSIST );
		jpaCascadeTypeToHibernateCascadeType.put( jakarta.persistence.CascadeType.MERGE, MERGE );
		jpaCascadeTypeToHibernateCascadeType.put( jakarta.persistence.CascadeType.REFRESH, REFRESH );
		jpaCascadeTypeToHibernateCascadeType.put( jakarta.persistence.CascadeType.DETACH, EVICT );
	}

	private static final Map<CascadeType, CascadeStyle> cascadeTypeToCascadeStyle = new HashMap<CascadeType, CascadeStyle>();
	static {
		cascadeTypeToCascadeStyle.put( ALL, CascadeStyle.ALL );
		cascadeTypeToCascadeStyle.put( ALL_DELETE_ORPHAN, CascadeStyle.ALL_DELETE_ORPHAN );
		cascadeTypeToCascadeStyle.put( UPDATE, CascadeStyle.UPDATE );
		cascadeTypeToCascadeStyle.put( PERSIST, CascadeStyle.PERSIST );
		cascadeTypeToCascadeStyle.put( MERGE, CascadeStyle.MERGE );
		cascadeTypeToCascadeStyle.put( LOCK, CascadeStyle.LOCK );
		cascadeTypeToCascadeStyle.put( REFRESH, CascadeStyle.REFRESH );
		cascadeTypeToCascadeStyle.put( REPLICATE, CascadeStyle.REPLICATE );
		cascadeTypeToCascadeStyle.put( EVICT, CascadeStyle.EVICT );
		cascadeTypeToCascadeStyle.put( DELETE, CascadeStyle.DELETE );
		cascadeTypeToCascadeStyle.put( DELETE_ORPHAN, CascadeStyle.DELETE_ORPHAN );
		cascadeTypeToCascadeStyle.put( NONE, CascadeStyle.NONE );
	}

	/**
	 * @param hbmOptionName the cascading option as specified in the hbm mapping file
	 *
	 * @return Returns the {@code CascadeType} for a given hbm cascading option
	 */
	public static CascadeType getCascadeType(String hbmOptionName) {
		return hbmOptionToCascadeType.get( hbmOptionName );
	}

	/**
	 * @param jpaCascade the jpa cascade type
	 *
	 * @return Returns the Hibernate {@code CascadeType} for a given jpa cascade type
	 */
	public static CascadeType getCascadeType(jakarta.persistence.CascadeType jpaCascade) {
		return jpaCascadeTypeToHibernateCascadeType.get( jpaCascade );
	}

	/**
	 * @return Returns the {@code CascadeStyle} that corresponds to this {@code CascadeType}
	 *
	 * @throws MappingException if there is not corresponding {@code CascadeStyle}
	 */
	public CascadeStyle toCascadeStyle() {
		CascadeStyle cascadeStyle = cascadeTypeToCascadeStyle.get( this );
		if ( cascadeStyle == null ) {
			throw new MappingException( "No CascadeStyle that corresponds with CascadeType=" + this.name() );
		}
		return cascadeStyle;
	}
}
