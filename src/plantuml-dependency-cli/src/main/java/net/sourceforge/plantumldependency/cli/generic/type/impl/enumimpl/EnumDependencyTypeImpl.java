/*
 EnumDependencyTypeImpl.java
 Creation date : 31/05/2010
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

package net.sourceforge.plantumldependency.cli.generic.type.impl.enumimpl;

import static net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType.ENUMS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImpl;

/**
 * The enum implementation of the
 * {@link net.sourceforge.plantumldependency.cli.generic.type.DependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class EnumDependencyTypeImpl extends DependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 4101721547615760115L;

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
    public EnumDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new ImportDependenciesCollectionImpl(),
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
     * @param parentImplementationsDependenciesSet
     *            the {@link Set} of all implementations as {@link GenericDependency} which are used
     *            by the current dependency type, mustn't be <code>null</code>.
     * @param annotationsDependenciesSet
     *            the {@link Set} of all annotations as {@link GenericDependency} which are used by
     *            the current dependency type, mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public EnumDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final ImportDependenciesCollection importDependencies,
            final Set < GenericDependency > parentImplementationsDependenciesSet,
            final Set < GenericDependency > annotationsDependenciesSet) {
        super(dependencyName, dependencyPackageName, importDependencies, new TreeSet < GenericDependency >(),
                parentImplementationsDependenciesSet, annotationsDependenciesSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    protected PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement() {
        return new PlantUMLClassesDiagramEnumElementImpl(getFullName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public boolean isDisplayable(final Set < DisplayType > displayTypesOptions) {
        return displayTypesOptions.contains(ENUMS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + "]";
    }
}
