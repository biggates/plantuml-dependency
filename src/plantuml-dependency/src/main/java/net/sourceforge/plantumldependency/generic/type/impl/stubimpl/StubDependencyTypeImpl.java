/*
 StubDependencyTypeImpl.java
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

package net.sourceforge.plantumldependency.generic.type.impl.stubimpl;

import static net.sourceforge.plantumldependency.main.option.display.argument.Display.CLASSES;

import java.util.Set;

import net.sourceforge.plantumldependency.generic.type.impl.DependencyTypeImpl;
import net.sourceforge.plantumldependency.main.option.display.argument.Display;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl;

/**
 * The stub implementation of the
 * {@link net.sourceforge.plantumldependency.generic.type.DependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public class StubDependencyTypeImpl extends DependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 9006430972122342589L;

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
    public StubDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        super(dependencyName, dependencyPackageName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    protected PlantUMLClassesDiagramElement generatePlantUMLClassesDiagramElement() {
        return new PlantUMLClassesDiagramClassElementImpl(getFullName());
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
        return getClass().getSimpleName() + " [" + super.toString() + "]";
    }
}
