/*
 ClassDependencyTypeImpl.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl.classimpl;

import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassElementImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImpl;

/**
 * The class implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public class ClassDependencyTypeImpl extends DependencyTypeImpl implements ClassDependencyType {

    /** Serial version UID. */
    private static final long serialVersionUID = -8464283913821256094L;

    /**
     * The {@link Set} of all parent classes as {@link GenericDependency} which are used by the
     * current dependency type.
     */
    private Set < GenericDependency > parentClasses;

    /**
     * Default constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public ClassDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(),
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(), false);
    }

    /**
     * Full constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @param importDependencies
     *            the {@link ImportDependenciesCollection} containing all import dependencies which
     *            are needed by the current dependency type to work, mustn't be <code>null</code>.
     * @param parentInterfacesSet
     *            the {@link Set} of all parent interfaces as {@link GenericDependency} which are
     *            used by the current dependency type, mustn't be <code>null</code>.
     * @param parentClassesSet
     *            the {@link Set} of all parent classes as {@link GenericDependency} which are used
     *            by the current dependency type, mustn't be <code>null</code>.
     * @param hasNativeMethods
     *            the boolean indicating if the dependency has native methods inside.
     * @since 1.0
     */
    public ClassDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies, final Set < GenericDependency > parentInterfacesSet,
            final Set < GenericDependency > parentClassesSet, final boolean hasNativeMethods) {
        super(dependencyName, dependencyPackageName, importDependencies, parentInterfacesSet, hasNativeMethods);
        // TODO optimization
        parentClasses = parentClassesSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public DependencyType deepClone() {
        final ClassDependencyTypeImpl c = (ClassDependencyTypeImpl) super.deepClone();
        // TODO deepClone don't manage cycles
        c.parentClasses = new TreeSet < GenericDependency >(getParentClasses());
        return c;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    protected PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement() {
        return new PlantUMLClassElementImpl(getFullName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    protected Set < PlantUMLClassesDiagramRelation > generatePlantUMLClassesDiagramRelationFooter(
            final Set < Display > displayOptions) {
        final Set < PlantUMLClassesDiagramRelation > linkSet = super
                .generatePlantUMLClassesDiagramRelationFooter(displayOptions);

        for (final GenericDependency classDependency : getParentClassesToGeneratePlantUML(displayOptions)) {
            linkSet.add(new PlantUMLClassesDiagramImplementRelationImpl(getFullName(), classDependency.getFullName()));
        }

        return linkSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getParentClasses() {
        return parentClasses;
    }

    /**
     * Gets the parent interfaces which have to be generated appear in the plantUML file.
     *
     * @param displayOptions
     *            the {@link Set} of all displays options to display the PlantUML links description,
     *            mustn't be <code>null</code>.
     * @return the {@link Set} of {@link GenericDependency} which have to be generated appear in the
     *         plantUML file.
     * @since 1.1.1
     */
    private Set < GenericDependency > getParentClassesToGeneratePlantUML(final Set < Display > displayOptions) {
        Set < GenericDependency > classesSet = null;

        if (displayOptions.contains(EXTENSIONS)) {
            classesSet = getParentClasses();
        } else {
            classesSet = new TreeSet < GenericDependency >();
        }

        return classesSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    protected boolean hasImportNotToBeGenerated(final GenericDependency genericDependency) {
        return getParentInterfaces().contains(genericDependency) || getParentClasses().contains(genericDependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public boolean isDisplayable(final Set < Display > displayOptions) {
        return displayOptions.contains(CLASSES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + ", parentClasses="
                + extractFullNames(parentClasses) + "]";
    }
}
