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
import static net.sourceforge.plantuml.dependency.generic.type.ImportType.IMPORT_TYPES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantuml.dependency.generic.type.ImportType;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

/**
 * The default implementation of the {@link DependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.1.1
 */
public abstract class DependencyTypeImpl implements DependencyType {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(DependencyTypeImpl.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -233142953615737115L;

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

    /** The dependency type full name, such as "java.lang.String". */
    private final String fullName;

    /**
     * The {@link ImportDependenciesCollection} containing all import dependencies which are needed
     * by the current dependency type to work.
     */
    private ImportDependenciesCollection importDependenciesCollection;

    /** The dependency type name, such as "String". */
    private final String name;

    /** The boolean indicating if the dependency has native methods inside. */
    private final boolean nativeMethods;

    /** The dependency type package name, such as "java.lang". */
    private final String packageName;

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
        this(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(),
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
     * @param importDependencies
     *            the {@link ImportDependenciesCollection} containing all import dependencies which
     *            are needed by the current dependency type to work, mustn't be <code>null</code>.
     * @param parentInterfacesSet
     *            the {@link Set} of all interfaces as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @param nativeMth
     *            the boolean indicating if the dependency has native methods inside.
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies, final Set < GenericDependency > parentInterfacesSet,
            final boolean nativeMth) {
        // TODO tests null
        // TODO tests that no space are present in the name
        name = dependencyName;
        packageName = dependencyPackageName;
        fullName = generateFullName(dependencyPackageName, dependencyName);
        // TODO optimization
        importDependenciesCollection = importDependencies;
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
            d.importDependenciesCollection = getImportDependenciesCollection().deepClone();
            d.parentInterfaces = new TreeSet < GenericDependency >(getParentInterfaces());
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
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML declaration,
     *            mustn't be <code>null</code>.
     * @return the {@link StringBuffer} containing the plantUML declaration of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDeclaration(final Set < Display > displayOptions) {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML description footer.
     * 
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link StringBuffer} containing the plantUML description footer of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionFooter(final Set < Display > displayOptions) {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML description header.
     * 
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link StringBuffer} containing the plantUML description header of the current
     *         dependency type.
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionHeader(final Set < Display > displayOptions) {
        return new StringBuffer();
    }

    /**
     * Generates the plantUML links description.
     * 
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link StringBuffer} containing the plantUML links description of the current
     *         dependency type.
     * @since 1.0
     */
    private StringBuffer generatePlantUMLLinksDescription(final Set < Display > displayOptions) {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(generatePlantUMLDescriptionHeader(displayOptions));

        for (final GenericDependency abstractImportDependency : getImportDependenciesToGeneratePlantUML(displayOptions)) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(getFullName());
            buffer.append(USES_RIGHT_PLANTUML);
            buffer.append(abstractImportDependency.getFullName());
        }

        for (final GenericDependency interfaceDependency : getParentInterfacesToGeneratePlantUML(displayOptions)) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(interfaceDependency.getFullName());
            buffer.append(IMPLEMENTS_LEFT_PLANTUML);
            buffer.append(getFullName());
        }

        buffer.append(generatePlantUMLDescriptionFooter(displayOptions));
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
    public ImportDependenciesCollection getImportDependenciesCollection() {
        return importDependenciesCollection;
    }

    /**
     * Gets the import dependencies which have to be generated in the plantUML description file.
     * 
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link Set} of import {@link GenericDependency} which have to be generated in the
     *         plantUML file.
     * @since 1.1.1
     */
    private Set < GenericDependency > getImportDependenciesToGeneratePlantUML(final Set < Display > displayOptions) {
        final Set < GenericDependency > importDependenciesNotImplementedAndDisplayable = new TreeSet < GenericDependency >();

        for (final ImportType importType : IMPORT_TYPES) {
            if (displayOptions.contains(importType.getDisplayOption())) {
                for (final GenericDependency genericDependency : getImportDependenciesCollection()
                        .getImportDependenciesWithType(importType)) {
                    if (hasImportNotToBeGenerated(genericDependency)) {
                        LOGGER.fine(buildLogString(IMPORT_IS_AN_INTERFACE_FINE, genericDependency));
                    } else {
                        importDependenciesNotImplementedAndDisplayable.add(genericDependency);
                    }
                }
            } else {
                // TODO log, import type doesn't have to be displayed
            }
        }

        return importDependenciesNotImplementedAndDisplayable;
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
     * Gets the parent interfaces which have to be generated in the plantUML description file.
     * 
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link Set} of parent {@link GenericDependency} which have to be generated in the
     *         plantUML file.
     * @since 1.1.1
     */
    private Set < GenericDependency > getParentInterfacesToGeneratePlantUML(final Set < Display > displayOptions) {
        Set < GenericDependency > interfacesSet = null;

        if (displayOptions.contains(IMPLEMENTATIONS)) {
            interfacesSet = getParentInterfaces();
        } else {
            interfacesSet = new TreeSet < GenericDependency >();
        }

        return interfacesSet;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLDeclaration(final Set < Display > displayOptions) {
        if (plantUMLDeclaration == null) {
            plantUMLDeclaration = generatePlantUMLDeclaration(displayOptions);
        }
        return plantUMLDeclaration;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLLinksDescription(final Set < Display > displayOptions) {
        if (plantUMLLinksDescription == null) {
            plantUMLLinksDescription = generatePlantUMLLinksDescription(displayOptions);
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
                + fullName + ", importDependencies="
                + extractFullNames(getImportDependenciesCollection().getAllImportDependencies())
                + ", parentInterfaces=" + extractFullNames(parentInterfaces) + ", nativeMethods=" + nativeMethods
                + ", plantUMLDeclaration=" + plantUMLDeclaration + ", plantUMLLinksDescription="
                + plantUMLLinksDescription + "]";
    }
}
