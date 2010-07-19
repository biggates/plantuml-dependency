/*
 DependencyTypeImpl.java
 Creation date : 20/06/2010
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
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.IMPLEMENTS_LEFT_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.USES_RIGHT_PLANTUML;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;

/**
 * The default implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public abstract class DependencyTypeImpl implements DependencyType {

    /** Serial version UID. */
    private static final long serialVersionUID = -233142953615737115L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(DependencyTypeImpl.class.getName());

    /** The dependency type name, such as "String". */
    private final String name;

    /** The dependency type package name, such as "java.lang". */
    private final String packageName;

    /** The dependency type full name, such as "java.lang.String". */
    private final String fullName;

    /**
     * The {@link Set} of all {@link GenericDependency} which are needed by the current dependency
     * type to work.
     */
    private Set < GenericDependency > importDependencies;

    /**
     * The {@link Set} of all interfaces as {@link GenericDependency} which are used by the current
     * dependency type.
     */
    private Set < GenericDependency > parentInterfaces;

    /** The plantUML declaration as a {@link StringBuffer} describing the current dependency type. */
    private StringBuffer plantUMLDeclaration;

    /**
     * The plantUML description as a {@link StringBuffer} describing links to imports and the
     * dependency type parents.
     */
    private StringBuffer plantUMLLinksDescription;

    /**
     * Default constructor.
     * 
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, dependencyPackageName + DOT_CHAR + dependencyName,
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());
    }

    /**
     * Medium constructor.
     * 
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @param importDependenciesSet
     *            the {@link Set} of all {@link GenericDependency} which are needed by the current
     *            dependency type to work, mustn't be <code>null</code>.
     * @param parentInterfacesSet
     *            the {@link Set} of all interfaces as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet) {
        this(dependencyName, dependencyPackageName, dependencyPackageName + DOT_CHAR + dependencyName,
                importDependenciesSet, parentInterfacesSet);
    }

    /**
     * Full constructor.
     * 
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @param fullDependencyName
     *            the full dependency name, such as "java..lang.String", mustn't be
     *            <code>null</code>.
     * @param importDependenciesSet
     *            the {@link Set} of all {@link GenericDependency} which are needed by the current
     *            dependency type to work, mustn't be <code>null</code>.
     * @param parentInterfacesSet
     *            the {@link Set} of all interfaces as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final String fullDependencyName, final Set < GenericDependency > importDependenciesSet,
            final Set < GenericDependency > parentInterfacesSet) {
        name = dependencyName;
        packageName = dependencyPackageName;
        fullName = fullDependencyName;
        // TODO optimization
        importDependencies = importDependenciesSet;
        parentInterfaces = parentInterfacesSet;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int compareTo(final DependencyType d) {
        int comparison = AFTER.getResult();

        if (this == d) {
            comparison = EQUAL.getResult();
        } else {
            comparison = getFullName().compareTo(d.getFullName());
        }

        return comparison;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType deepClone() {
        DependencyTypeImpl d = null;

        try {
            d = (DependencyTypeImpl) super.clone();
            // TODO deepClone don't manage cycles
            d.importDependencies = new TreeSet < GenericDependency >(getImportDependencies());
            d.parentInterfaces = new TreeSet < GenericDependency >(getParentInterfaces());
            d.plantUMLDeclaration = new StringBuffer(getPlantUMLDeclaration());
            d.plantUMLLinksDescription = new StringBuffer(getPlantUMLLinksDescription());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return d;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DependencyTypeImpl other = (DependencyTypeImpl) obj;
        if (fullName == null) {
            if (other.fullName != null) {
                return false;
            }
        } else if (!fullName.equals(other.fullName)) {
            return false;
        }
        return true;
    }

    /**
     * Generates the plantUML declaration.
     * 
     * @return the {@link StringBuffer} containing the plantUML declaration of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDeclaration() {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML description footer.
     * 
     * @return the {@link StringBuffer} containing the plantUML description footer of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionFooter() {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML description header.
     * 
     * @return the {@link StringBuffer} containing the plantUML description header of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionHeader() {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML links description.
     * 
     * @return the {@link StringBuffer} containing the plantUML links description of the current
     *         dependency type.
     * @since 1.0
     */
    private StringBuffer generatePlantUMLLinksDescription() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(generatePlantUMLDescriptionHeader());

        for (final GenericDependency abstractImportDependency : getImportDependencies()) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(getFullName());
            buffer.append(USES_RIGHT_PLANTUML);
            buffer.append(abstractImportDependency.getFullName());
        }

        for (final GenericDependency interfaceDependency : getParentInterfaces()) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(interfaceDependency.getFullName());
            buffer.append(IMPLEMENTS_LEFT_PLANTUML);
            buffer.append(getFullName());
        }

        buffer.append(generatePlantUMLDescriptionFooter());
        return buffer;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getFullName() {
        return fullName;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getImportDependencies() {
        return importDependencies;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getPackageName() {
        return packageName;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getParentInterfaces() {
        return parentInterfaces;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLDeclaration() {
        if (plantUMLDeclaration == null) {
            plantUMLDeclaration = generatePlantUMLDeclaration();
        }
        return plantUMLDeclaration;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLLinksDescription() {
        if (plantUMLLinksDescription == null) {
            plantUMLLinksDescription = generatePlantUMLLinksDescription();
        }
        return plantUMLLinksDescription;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [fullName=" + fullName + "]";
    }
}
