/*
 ClassAbstractDependencyTypeImpl.java
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

package net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl;

import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ABSTRACT_CLASSES;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImpl;

/**
 * The class abstract implementation of the
 * {@link net.sourceforge.plantumldependency.generic.type.ClassDependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class ClassAbstractDependencyTypeImpl extends ClassDependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = -8097477597427695042L;

    /**
     * Default constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.0.0
     */
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(), null,
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());
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
     * @param parentExtensionsDependency
     *            the parent extensions {@link GenericDependency} which are used by the current
     *            dependency type, may be <code>null</code>.
     * @param parentImplementationsDependenciesSet
     *            the {@link Set} of all implementations as {@link GenericDependency} which are used
     *            by the current dependency type, mustn't be <code>null</code>.
     * @param annotationsDependenciesSet
     *            the {@link Set} of all annotations as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies, final GenericDependency parentExtensionsDependency,
            final Set < GenericDependency > parentImplementationsDependenciesSet,
            final Set < GenericDependency > annotationsDependenciesSet) {
        super(dependencyName, dependencyPackageName, importDependencies, parentExtensionsDependency,
                parentImplementationsDependenciesSet, annotationsDependenciesSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    protected PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement() {
        return new PlantUMLClassesDiagramAbstractClassElementImpl(getFullName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public boolean isDisplayable(final Set < DisplayType > displayTypesOptions,
            final Pattern displayPackageNamePattern, final Pattern displayNamePattern) {
        return displayTypesOptions.contains(ABSTRACT_CLASSES)
                && displayPackageNamePattern.matcher(getPackageName()).matches()
                && displayNamePattern.matcher(getName()).matches();
    }
}
