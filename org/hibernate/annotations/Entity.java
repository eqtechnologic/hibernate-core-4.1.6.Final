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
package org.hibernate.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Extends {@link jakarta.persistence.Entity} with Hibernate features
 *
 * @author Emmanuel Bernard
 *
 * @deprecated See individual attributes for intended replacements.  To be removed in 4.1
 */
@Target(TYPE)
@Retention(RUNTIME)
@Deprecated
public @interface Entity {
	/**
	 * Is this entity mutable (read only) or not
	 *
	 * @deprecated use {@link org.hibernate.annotations.Immutable} 
	 */
	boolean mutable() default true;
	/**
	 * Needed column only in SQL on insert
	 * @deprecated use {@link DynamicInsert} instead
	 */
	boolean dynamicInsert() default false;
	/**
	 * Needed column only in SQL on update
	 * @deprecated Use {@link DynamicUpdate} instead
	 */
	boolean dynamicUpdate() default false;
	/**
	 *  Do a select to retrieve the entity before any potential update
	 *  @deprecated Use {@link SelectBeforeUpdate} instead
	 */
	boolean selectBeforeUpdate() default false;
	/**
	 * polymorphism strategy for this entity
	 * @deprecated use {@link Polymorphism} instead
	 */
	PolymorphismType polymorphism() default PolymorphismType.IMPLICIT;
	/**
	 * optimistic locking strategy
	 * @deprecated use {@link OptimisticLocking} instead.
	 */
	OptimisticLockType optimisticLock() default OptimisticLockType.VERSION;
	/**
	 * persister of this entity, default is hibernate internal one
	 * @deprecated  use {@link Persister} instead
	 */
	String persister() default "";
}
