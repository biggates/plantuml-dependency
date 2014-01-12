/*
 WithStereotype.java
 Creation date : 10/12/2011
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype;

/**
 * The interface which marks an object having a plantUML stereotype.
 *
 * @see <a href="http://plantuml.sourceforge.net/classes.html#Notes">PlantUML classes diagram Notes
 *      and stereotype page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public interface WithStereotype {

    /**
     * Gets the element stereotype. It may be <code>null</code> if the element doesn't have any
     * specific stereotype.
     *
     * @return the element stereotype, as a {@link PlantUMLStereotype} instance, if one specified.
     * @since 1.1.1
     */
    PlantUMLStereotype getStereotype();
}
