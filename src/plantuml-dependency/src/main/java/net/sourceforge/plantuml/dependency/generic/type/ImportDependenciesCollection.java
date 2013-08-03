/*
 ImportDependencyCollection.java
 Creation date : 6/11/2011
 Copyright © Benjamin Croizet (graffity2199@yahoo.fr)

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 or GNU Lesser General Public License as published by the
 Free Software Foundation; either version 3 of the License,
 or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received copies of the GNU General Public License
 and GNU Lesser General Public License along with this program;
 if not, write to the Free Software Foundation, Inc.,
 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 http://www.fsf.org/licensing/licenses/gpl.html
 http://www.gnu.org/licenses/lgpl.html
 */

package net.sourceforge.plantuml.dependency.generic.type;

import java.io.Serializable;
import java.util.Set;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;

/**
 * The interface which describes a collection of import dependencies needed by a
 * {@link GenericDependency}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public interface ImportDependenciesCollection extends Serializable, DeepCloneable < ImportDependenciesCollection > {

    /**
     * Add an import dependency to the collection, with its type.
     *
     * @param importType
     *            the import dependency {@link ImportType} instance, mustn't be <code>null</code>.
     * @param importDependency
     *            the {@link GenericDependency} instance, mustn't be <code>null</code>.
     * @since 1.1.1
     */
    void addImportDependencies(ImportType importType, GenericDependency importDependency);

    /**
     * Add a {@link Set} of several import dependencies to the collection, with their type.
     *
     * @param importType
     *            the import type {@link ImportType} instance, mustn't be <code>null</code>.
     * @param importDependenciesSet
     *            the {@link Set} containing import {@link GenericDependency} instances, mustn't be
     *            <code>null</code>.
     * @since 1.1.1
     */
    void addImportDependenciesSet(ImportType importType, Set < GenericDependency > importDependenciesSet);

    /**
     * Finds the dependency following its name in the collection. be careful, this method doesn't
     * take care of the package name.
     *
     * @param dependencyName
     *            the dependency name to look for, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance associated to the passed name if found in the
     *         import import collection, <code>null</code> otherwise.
     * @since 1.1.1
     */
    GenericDependency findDependency(final String dependencyName);

    /**
     * Finds the dependency following its name and its package name in the collection.
     *
     * @param dependencyName
     *            the dependency name to look for, mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency package name to look for, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance associated to the passed name and package name
     *         if found in the import collection, <code>null</code> otherwise.
     * @since 1.1.1
     */
    GenericDependency findDependency(final String dependencyName, final String dependencyPackageName);

    /**
     * Gets the {@link Set} of all {@link GenericDependency} which are needed by the current
     * dependency type to work. If no dependencies are needed, it returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>import</i> keyword.
     * </p>
     *
     * @return the {@link Set} of all {@link GenericDependency} which are needed by the current
     *         dependency type to work.
     * @since 1.1.1
     */
    Set < GenericDependency > getAllImportDependencies();

    /**
     * Gets the {@link Set} of {@link GenericDependency} which are needed by the current dependency
     * type to work and have the following type. If no dependencies are needed with this type, it
     * returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>import</i> keyword.
     * </p>
     *
     * @param importType
     *            the import type to look for, mustn't be <code>null</code>.
     * @return the {@link Set} of {@link GenericDependency} which are needed by the current
     *         dependency type to work and have the following types.
     * @since 1.1.1
     */
    Set < GenericDependency > getImportDependenciesWithType(ImportType importType);

    /**
     * Gets the {@link Set} of {@link GenericDependency} which are needed by the current dependency
     * type to work and have one of the following type contained in the {@link Set}. If no
     * dependencies are needed with these types, it returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>import</i> keyword.
     * </p>
     *
     * @param importTypesSet
     *            the {@link Set} of all import types to look for, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link GenericDependency} which are needed by the current
     *         dependency type to work.
     * @since 1.1.1
     */
    Set < GenericDependency > getImportDependenciesWithTypes(Set < ImportType > importTypesSet);
}
