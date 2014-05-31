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

package net.sourceforge.plantumldependency.cli.generic.type.impl;

import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.DEPENDENCY_IS_NOT_DISPLAYABLE_FINE;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.IMPORT_IS_AN_EXTENSION_AN_IMPLEMENTATION_OR_AN_ANNOTATION_FINE;
import static net.sourceforge.plantumldependency.cli.generic.type.ImportType.IMPORT_TYPES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ANNOTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.DISPLAY_TYPES_OPTIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.EXTENSIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.IMPLEMENTATIONS;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.type.DependencyType;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantumldependency.cli.generic.type.ImportType;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramExtendRelationImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImpl;

/**
 * The default implementation of the {@link DependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
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
     *            <code>null</code> but can be empty.
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code> nor
     *            empty.
     * @return the full dependency name.
     * @since 1.0.0
     */
    public static String generateDependencyFullName(final String dependencyPackageName, final String dependencyName) {
        String fullName = null;

        if (isNotEmpty(dependencyPackageName)) {
            fullName = dependencyPackageName + DOT_CHAR + dependencyName;
        } else {
            fullName = dependencyName;
        }

        return fullName;
    }

    /** The dependency type full name, such as "java.lang.String". */
    private String fullName;

    /**
     * The {@link ImportDependenciesCollection} containing all import dependencies which are needed
     * by the current dependency type to work.
     */
    private ImportDependenciesCollection importDependenciesCollection;

    /** The dependency type name, such as "String". */
    private String name;

    /** The dependency type package name, such as "java.lang". */
    private String packageName;

    /**
     * The {@link Set} of all parent extensions as {@link GenericDependency} which are used by the
     * current dependency type.
     */
    private Set < GenericDependency > parentExtensionsDependencies;

    /**
     * The {@link Set} of all parent implementations as {@link GenericDependency} which are used by
     * the current dependency type.
     */
    private Set < GenericDependency > parentImplementationsDependencies;

    /**
     * The {@link Set} of all annotations as {@link GenericDependency} which are used by the current
     * dependency type.
     */
    private Set < GenericDependency > annotationsDependencies;

    /**
     * The plantUML classes diagram element as a {@link PlantUMLClassesDiagramElement} instance
     * describing the current dependency type.
     */
    private PlantUMLClassesDiagramElement plantUMLClassesDiagramElement;

    /**
     * The set of all PlantUML classes diagram relations as a {@link Set} of
     * {@link PlantUMLClassesDiagramRelation} instances describing relations to imports and the
     * dependency type parents.
     */
    private Set < PlantUMLClassesDiagramRelation > plantUMLClassesDiagramRelationSet;

    /**
     * This field is only used by the {@link #toString()} method to avoid recursive calls (leading
     * to a {@link java.lang.StackOverflowError} when printing the dependencies graph.
     */
    private boolean isToStringResursiveCall = false;

    /**
     * Default constructor.
     *
     * @param dependencyName
     *            the dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.0.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(),
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >());
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
     * @param parentExtensionsDependenciesSet
     *            the {@link Set} of all extensions as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @param parentImplementationsDependenciesSet
     *            the {@link Set} of all implementations as {@link GenericDependency} which are used
     *            by the current dependency type, mustn't be <code>null</code>.
     * @param annotationsDependenciesSet
     *            the {@link Set} of all annotations as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.0.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies,
            final Set < GenericDependency > parentExtensionsDependenciesSet,
            final Set < GenericDependency > parentImplementationsDependenciesSet,
            final Set < GenericDependency > annotationsDependenciesSet) {
        // TODO tests null
        // TODO tests that no space are present in the name
        setFullName(dependencyPackageName, dependencyName);
        importDependenciesCollection = importDependencies;
        parentExtensionsDependencies = parentExtensionsDependenciesSet;
        parentImplementationsDependencies = parentImplementationsDependenciesSet;
        annotationsDependencies = annotationsDependenciesSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
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
     * @since 1.0.0
     */
    @Override
    public DependencyType deepClone() {
        DependencyTypeImpl d = null;

        try {
            d = (DependencyTypeImpl) super.clone();
            // TODO deepClone doesn't manage cycles
            d.importDependenciesCollection = getImportDependenciesCollection().deepClone();
            d.parentExtensionsDependencies = new TreeSet < GenericDependency >(getParentExtensionsDependencies());
            d.parentImplementationsDependencies = new TreeSet < GenericDependency >(
                    getParentImplementationsDependencies());
            d.annotationsDependencies = new TreeSet < GenericDependency >(getAnnotationsDependencies());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return d;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
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
     * Generates the plantUML classes diagram element.
     *
     * @return the {@link PlantUMLClassesDiagramElement} containing the plantUML classes diagram
     *         element of the current dependency type.
     * @since 1.1.1
     */
    protected abstract PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement();

    /**
     * Generates the plantUML classes diagram relations.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML links
     *            description, mustn't be <code>null</code>.
     * @return the set of all PlantUML classes diagram relations as a {@link Set} of
     *         {@link PlantUMLClassesDiagramRelation} instances describing relations to imports and
     *         the dependency type parents.
     * @since 1.1.1
     */
    private Set < PlantUMLClassesDiagramRelation > generatePlantUMLClassesDiagramRelations(
            final Set < DisplayType > displayTypesOptions) {
        final Set < PlantUMLClassesDiagramRelation > linkSet = new TreeSet < PlantUMLClassesDiagramRelation >();

        for (final GenericDependency importDependency : getImportDependenciesToGeneratePlantUML(displayTypesOptions)) {
            linkSet.add(new PlantUMLClassesDiagramUseRelationImpl(getPlantUMLClassesDiagramElement(), importDependency
                    .getDependencyType().getPlantUMLClassesDiagramElement()));
        }

        for (final GenericDependency parentImplementationsDependency : getParentImplementationsToGeneratePlantUML(displayTypesOptions)) {
            linkSet.add(new PlantUMLClassesDiagramImplementRelationImpl(getPlantUMLClassesDiagramElement(),
                    parentImplementationsDependency.getDependencyType().getPlantUMLClassesDiagramElement()));
        }

        for (final GenericDependency parentExtensionsDependency : getParentExtensionsToGeneratePlantUML(displayTypesOptions)) {
            linkSet.add(new PlantUMLClassesDiagramExtendRelationImpl(getPlantUMLClassesDiagramElement(),
                    parentExtensionsDependency.getDependencyType().getPlantUMLClassesDiagramElement()));
        }

        for (final GenericDependency annotationDependency : getAnnotationsToGeneratePlantUML(displayTypesOptions)) {
            linkSet.add(new PlantUMLClassesDiagramUseRelationImpl(getPlantUMLClassesDiagramElement(),
                    annotationDependency.getDependencyType().getPlantUMLClassesDiagramElement()));
        }

        return linkSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public Set < GenericDependency > getAnnotationsDependencies() {
        return annotationsDependencies;
    }

    /**
     * Gets the annotations which have to be generated in the plantUML description file.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML links
     *            description, mustn't be <code>null</code>.
     * @return the {@link Set} of annotation {@link GenericDependency} which have to be generated in
     *         the plantUML file.
     * @since 1.2.0
     */
    private Set < GenericDependency > getAnnotationsToGeneratePlantUML(final Set < DisplayType > displayTypesOptions) {
        final Set < GenericDependency > annotationsDependenciesDisplayable = new TreeSet < GenericDependency >();

        if (displayTypesOptions.contains(ANNOTATIONS)) {
            for (final GenericDependency genericDependency : getAnnotationsDependencies()) {
                if (genericDependency.getDependencyType().isDisplayable(displayTypesOptions)) {
                    annotationsDependenciesDisplayable.add(genericDependency);
                } else {
                    LOGGER.log(FINE, buildLogString(DEPENDENCY_IS_NOT_DISPLAYABLE_FINE, genericDependency));
                }
            }
        } else {
            LOGGER.log(FINE, buildLogString(DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE, ANNOTATIONS));
        }

        return annotationsDependenciesDisplayable;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getFullName() {
        return fullName;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public ImportDependenciesCollection getImportDependenciesCollection() {
        return importDependenciesCollection;
    }

    /**
     * Gets the import dependencies which have to be generated in the plantUML description file.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML links
     *            description, mustn't be <code>null</code>.
     * @return the {@link Set} of import {@link GenericDependency} which have to be generated in the
     *         plantUML file.
     * @since 1.1.1
     */
    private Set < GenericDependency > getImportDependenciesToGeneratePlantUML(
            final Set < DisplayType > displayTypesOptions) {
        final Set < GenericDependency > importDependenciesNotImplementedNorExtendedNorAnnonatedAndDisplayable = new TreeSet < GenericDependency >();

        for (final ImportType importType : IMPORT_TYPES) {
            if (displayTypesOptions.contains(importType.getDisplayType())) {
                for (final GenericDependency genericDependency : getImportDependenciesCollection()
                        .getImportDependenciesWithType(importType)) {
                    if (!isDependencyInExtensionsImplementationsOrAnnotationsDependencies(genericDependency)) {
                        if (genericDependency.getDependencyType().isDisplayable(displayTypesOptions)) {
                            importDependenciesNotImplementedNorExtendedNorAnnonatedAndDisplayable
                                    .add(genericDependency);
                        } else {
                            LOGGER.log(FINE, buildLogString(DEPENDENCY_IS_NOT_DISPLAYABLE_FINE, genericDependency));
                        }
                    } else {
                        LOGGER.log(
                                FINE,
                                buildLogString(IMPORT_IS_AN_EXTENSION_AN_IMPLEMENTATION_OR_AN_ANNOTATION_FINE,
                                        genericDependency));
                    }
                }
            } else {
                LOGGER.log(FINE, buildLogString(DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE, importType.getDisplayType()));
            }
        }

        return importDependenciesNotImplementedNorExtendedNorAnnonatedAndDisplayable;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getPackageName() {
        return packageName;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public Set < GenericDependency > getParentExtensionsDependencies() {
        return parentExtensionsDependencies;
    }

    /**
     * Gets the parent extensions which have to be generated in the plantUML description file.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML links
     *            description, mustn't be <code>null</code>.
     * @return the {@link Set} of parent extensions as {@link GenericDependency} which have to be
     *         generated in the plantUML file.
     * @since 1.2.0
     */
    private Set < GenericDependency > getParentExtensionsToGeneratePlantUML(
            final Set < DisplayType > displayTypesOptions) {
        final Set < GenericDependency > extensionsDependenciesDisplayable = new TreeSet < GenericDependency >();

        if (displayTypesOptions.contains(EXTENSIONS)) {
            for (final GenericDependency genericDependency : getParentExtensionsDependencies()) {
                if (genericDependency.getDependencyType().isDisplayable(displayTypesOptions)) {
                    extensionsDependenciesDisplayable.add(genericDependency);
                } else {
                    LOGGER.log(FINE, buildLogString(DEPENDENCY_IS_NOT_DISPLAYABLE_FINE, genericDependency));
                }
            }
        } else {
            LOGGER.log(FINE, buildLogString(DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE, EXTENSIONS));
        }

        return extensionsDependenciesDisplayable;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Set < GenericDependency > getParentImplementationsDependencies() {
        return parentImplementationsDependencies;
    }

    /**
     * Gets the parent implementations which have to be generated in the plantUML description file.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML links
     *            description, mustn't be <code>null</code>.
     * @return the {@link Set} of parent implementations as {@link GenericDependency} which have to
     *         be generated in the plantUML file.
     * @since 1.1.1
     */
    private Set < GenericDependency > getParentImplementationsToGeneratePlantUML(
            final Set < DisplayType > displayTypesOptions) {
        final Set < GenericDependency > implementationsDependenciesDisplayable = new TreeSet < GenericDependency >();

        if (displayTypesOptions.contains(IMPLEMENTATIONS)) {
            for (final GenericDependency genericDependency : getParentImplementationsDependencies()) {
                if (genericDependency.getDependencyType().isDisplayable(displayTypesOptions)) {
                    implementationsDependenciesDisplayable.add(genericDependency);
                } else {
                    LOGGER.log(FINE, buildLogString(DEPENDENCY_IS_NOT_DISPLAYABLE_FINE, genericDependency));
                }
            }
        } else {
            LOGGER.log(FINE, buildLogString(DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE, IMPLEMENTATIONS));
        }

        return implementationsDependenciesDisplayable;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLClassesDiagramElement getPlantUMLClassesDiagramElement() {
        if (plantUMLClassesDiagramElement == null) {
            plantUMLClassesDiagramElement = generatePlantUMLClassesDiagramElement();
        }
        return plantUMLClassesDiagramElement;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.3
     */
    @Override
    public Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations() {
        if (plantUMLClassesDiagramRelationSet == null) {
            plantUMLClassesDiagramRelationSet = getPlantUMLClassesDiagramRelations(DISPLAY_TYPES_OPTIONS);
        }
        return plantUMLClassesDiagramRelationSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations(
            final Set < DisplayType > displayTypesOptions) {
        return generatePlantUMLClassesDiagramRelations(displayTypesOptions);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        return result;
    }

    /**
     * This method tells if the current dependency is in the extensions, implementations or
     * annotations dependencies collection.
     *
     * @param genericDependency
     *            the dependency to test if it is in the extensions, implementations or annotations
     *            dependencies collection, shouldn't be <code>null</code>.
     * @return <code>true</code> if the dependency is in the extensions, implementations or
     *         annotations dependencies collection, <code>false</code> otherwise.
     * @since 1.0.0
     */
    private boolean isDependencyInExtensionsImplementationsOrAnnotationsDependencies(
            final GenericDependency genericDependency) {
        return getParentImplementationsDependencies().contains(genericDependency)
                || getParentExtensionsDependencies().contains(genericDependency)
                || getAnnotationsDependencies().contains(genericDependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public void setFullName(final String dependencyPackageName, final String dependencyName) {
        name = dependencyName;
        packageName = dependencyPackageName;
        fullName = generateDependencyFullName(packageName, name);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        String result = getClass().getSimpleName() + " [fullName=" + fullName;

        if (isToStringResursiveCall) {
            result += "....]";
        } else {
            isToStringResursiveCall = true;
            result += ", importDependenciesCollection=" + importDependenciesCollection + ", name=" + name
                    + ", packageName=" + packageName + ", parentExtensionsDependencies=" + parentExtensionsDependencies
                    + ", parentImplementationsDependencies=" + parentImplementationsDependencies + ", annotations="
                    + annotationsDependencies + ", plantUMLClassesDiagramElement=" + plantUMLClassesDiagramElement
                    + ", plantUMLClassesDiagramRelationSet=" + plantUMLClassesDiagramRelationSet + "]";
            isToStringResursiveCall = false;
        }

        return result;
    }
}
