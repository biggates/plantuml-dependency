/*
 AnnotationDependencyTypeImpl.java
 Creation date : 11/07/2013
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

package net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl;

import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ANNOTATIONS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImpl;

/**
 * The annotation implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.2.0
 * @version 1.2.0
 */
public class AnnotationDependencyTypeImpl extends DependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 5334015594567999340L;

    /**
     * Default constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.2.0
     */
    public AnnotationDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        super(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(),
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
     * @param annotationsSet
     *            the {@link Set} of all annotations as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.2.0
     */
    public AnnotationDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies, final Set < GenericDependency > annotationsSet) {
        super(dependencyName, dependencyPackageName, importDependencies, new TreeSet < GenericDependency >(),
                annotationsSet, false);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    protected PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement() {
        return new PlantUMLClassesDiagramAnnotationElementImpl(getFullName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    protected boolean hasImportNotToBeGenerated(final GenericDependency genericDependency) {
        return getAnnotationsDependencies().contains(genericDependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public boolean isDisplayable(final Set < Display > displayOptions) {
        return displayOptions.contains(ANNOTATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + "]";
    }
}
