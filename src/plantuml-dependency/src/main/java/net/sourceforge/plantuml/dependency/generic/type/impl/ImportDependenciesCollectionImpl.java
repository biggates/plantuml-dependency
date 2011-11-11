/*
 ImportDependenciesCollectionImpl.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantuml.dependency.generic.type.ImportType.IMPORT_TYPES;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantuml.dependency.generic.type.ImportType;

/**
 * The default implementation of the {@link ImportDependenciesCollection} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class ImportDependenciesCollectionImpl implements ImportDependenciesCollection {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(ImportDependenciesCollectionImpl.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -5520264467935038385L;

    /**
     * The {@link Map} of all {@link GenericDependency} which are needed by the current dependency
     * type to work. It has {@link ImportType} as keys and the {@link Set} of import dependencies as
     * values.
     */
    private Map < ImportType, Set < GenericDependency > > importDependenciesMap;

    /**
     * Default constructor. Initializes the import dependencies collection to empty.
     *
     * @since 1.1.1
     */
    public ImportDependenciesCollectionImpl() {
        importDependenciesMap = new TreeMap < ImportType, Set < GenericDependency > >();
        for (final ImportType importType : IMPORT_TYPES) {
            importDependenciesMap.put(importType, new TreeSet < GenericDependency >());
        }
    }

    /**
     * Medium constructor. Initializes the import dependencies collection with the passed Set and
     * the ImportType.
     *
     * @param importType
     *            the import type {@link ImportType} instance, mustn't be <code>null</code>.
     * @param importDependenciesSet
     *            the {@link Set} containing import {@link GenericDependency} instances, mustn't be
     *            <code>null</code>.
     * @since 1.1.1
     */
    public ImportDependenciesCollectionImpl(final ImportType importType,
            final Set < GenericDependency > importDependenciesSet) {
        this();
        addImportDependenciesSet(importType, importDependenciesSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public void addImportDependencies(final ImportType importType, final GenericDependency importDependency) {
        getImportDependenciesMap().get(importType).add(importDependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public void addImportDependenciesSet(final ImportType importType,
            final Set < GenericDependency > importDependenciesSet) {
        getImportDependenciesMap().get(importType).addAll(importDependenciesSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public ImportDependenciesCollection deepClone() {
        ImportDependenciesCollectionImpl i = null;

        try {
            i = (ImportDependenciesCollectionImpl) super.clone();
            // TODO deepClone don't manage cycles and copy all map
            i.importDependenciesMap = new TreeMap < ImportType, Set < GenericDependency > >(getImportDependenciesMap());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return i;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public GenericDependency findDependency(final String dependencyName) {
        GenericDependency dependency = null;

        final Iterator < GenericDependency > iter = getAllImportDependencies().iterator();
        while (dependency == null && iter.hasNext()) {
            final GenericDependency abstractImportDependency = iter.next();
            if (abstractImportDependency.getName().equals(dependencyName)) {
                dependency = abstractImportDependency;
            }
        }

        return dependency;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public GenericDependency findDependency(final String dependencyName, final String dependencyPackageName) {
        GenericDependency dependency = null;

        final Iterator < GenericDependency > iter = getAllImportDependencies().iterator();
        while (dependency == null && iter.hasNext()) {
            final GenericDependency abstractImportDependency = iter.next();
            if (abstractImportDependency.getName().equals(dependencyName)
                    && abstractImportDependency.getPackageName().equals(dependencyPackageName)) {
                dependency = abstractImportDependency;
            }
        }

        return dependency;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Set < GenericDependency > getAllImportDependencies() {
        return getImportDependenciesWithTypes(IMPORT_TYPES);
    }

    /**
     * Gets the value of <code>importDependenciesMap</code>.
     *
     * @return the value of <code>importDependenciesMap</code>.
     * @since 1.1.1
     */
    private Map < ImportType, Set < GenericDependency >> getImportDependenciesMap() {
        return importDependenciesMap;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Set < GenericDependency > getImportDependenciesWithType(final ImportType importType) {
        final Set < ImportType > importTypeSet = new TreeSet < ImportType >();
        importTypeSet.add(importType);
        return getImportDependenciesWithTypes(importTypeSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Set < GenericDependency > getImportDependenciesWithTypes(final Set < ImportType > importTypesSet) {
        final Set < GenericDependency > dependenciesSet = new TreeSet < GenericDependency >();

        for (final Map.Entry < ImportType, Set < GenericDependency >> importDependenciesEntry : getImportDependenciesMap()
                .entrySet()) {
            final ImportType importType = importDependenciesEntry.getKey();
            final Set < GenericDependency > importDependencies = importDependenciesEntry.getValue();
            if (importTypesSet.contains(importType)) {
                dependenciesSet.addAll(importDependencies);
            } else {
                // TODO log
            }
        }

        return dependenciesSet;
    }
}
