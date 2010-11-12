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
import static net.sourceforge.mazix.components.utils.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.IMPLEMENTS_LEFT_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.USES_RIGHT_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.IMPORT_IS_AN_INTERFACE_FINE;

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

    /**
     * Generates the full dependency name following its package and its simple name.
     * 
     * @param dependencyPackageName
     *            the dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code>.
     * @return the full dependency name.
     * @since 1.0
     */
    private static String generateFullName(final String dependencyPackageName, final String dependencyName) {
        String fullName = null;

        if (isNotEmpty(dependencyPackageName)) {
            fullName = dependencyPackageName + DOT_CHAR + dependencyName;
        } else {
            fullName = dependencyName;
        }

        return fullName;
    }

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

    /** The boolean indicating if the dependency has native methods inside. */
    private final boolean nativeMethods;

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
        this(dependencyName, dependencyPackageName, new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >(), false);
    }

    /**
     * Full constructor.
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
     * @param nativeMth
     *            the boolean indicating if the dependency has native methods inside.
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet,
            final boolean nativeMth) {
        // TODO tests null
        // TODO tests that no space are present in the name
        name = dependencyName;
        packageName = dependencyPackageName;
        fullName = generateFullName(dependencyPackageName, dependencyName);
        // TODO optimization
        importDependencies = importDependenciesSet;
        parentInterfaces = parentInterfacesSet;
        nativeMethods = nativeMth;
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
     * Extracts full names of the given dependency {@link Set}.
     * 
     * @param genericDependencySet
     *            the {@link Set} containing {@link GenericDependency} instance where to extract
     *            full names, mustn't be <code>null</code>.
     * @return the {@link Set} of dependencies full names as {@link String}.
     * @since 1.0
     */
    protected Set < String > extractFullNames(final Set < GenericDependency > genericDependencySet) {
        final Set < String > fullNamesSet = new TreeSet < String >();

        for (final GenericDependency genericDependency : genericDependencySet) {
            fullNamesSet.add(genericDependency.getFullName());
        }

        return fullNamesSet;
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

        for (final GenericDependency abstractImportDependency : getImportDependenciesToGeneratePlantUML()) {
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
     * Gets the {@link Set} of all import as {@link GenericDependency} which are used by the current
     * dependency type and have to be generated in the PlantUML description. If no dependencies
     * interfaces are implemented nor extended, it returns an empty {@link Set}.
     * 
     * @return the {@link Set} of all import as {@link GenericDependency} which are used by the
     *         current dependency type but which are not directly implemented by this one.
     * @since 1.0
     */
    private Set < GenericDependency > getImportDependenciesToGeneratePlantUML() {
        final Set < GenericDependency > importDependenciesNotImplemented = new TreeSet < GenericDependency >();

        for (final GenericDependency genericDependency : getImportDependencies()) {
            if (hasImportNotToBeGenerated(genericDependency)) {
                LOGGER.fine(buildLogString(IMPORT_IS_AN_INTERFACE_FINE, genericDependency));
            } else {
                importDependenciesNotImplemented.add(genericDependency);
            }
        }

        return importDependenciesNotImplemented;
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
     * This method tells if the current import has to be generated in the PlantUML description or
     * not.
     * 
     * @param genericDependency
     *            the import to test if it has to be generated or not, shouldn't be
     *            <code>null</code>.
     * @return <code>true</code> if the PlantUML description of the current import has to be
     *         generated, <code>false</code> otherwise.
     * @since 1.0
     */
    protected abstract boolean hasImportNotToBeGenerated(GenericDependency genericDependency);

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public boolean hasNativeMethods() {
        return nativeMethods;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name + ", packageName=" + packageName + ", fullName="
                + fullName + ", importDependencies=" + extractFullNames(importDependencies) + ", parentInterfaces="
                + extractFullNames(parentInterfaces) + ", nativeMethods=" + nativeMethods + ", plantUMLDeclaration="
                + plantUMLDeclaration + ", plantUMLLinksDescription=" + plantUMLLinksDescription + "]";
    }
}
