/*
 PlantUMLDiagram.java
 Creation date : 6/12/2011
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

package net.sourceforge.plantumldependency.plantumldiagram;

import java.io.Serializable;

import net.sourceforge.mazix.components.clone.DeepCloneable;

/**
 * The mother interface which represents a plantUML diagram. Several types of UML diagram can be
 * done thanks to plantUML :<br>
 * <ul>
 * <li>sequence diagram</li>
 * <li>use case diagram</li>
 * <li>class diagram</li>
 * <li>activity diagram</li>
 * <li>component diagram</li>
 * <li>state diagram</li>
 * <li>object diagram</li>
 * </ul>
 *
 * @see <a href="http://plantuml.sourceforge.net/index.html">PlantUML home page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public interface PlantUMLDiagram extends WithDescription, DeepCloneable < PlantUMLDiagram >, Serializable {

}
