/*
 PlantUMLClassesDiagramElement.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element;

import java.io.Serializable;

import net.sourceforge.plantumldependency.cli.plantumldiagram.WithDescription;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag;
import net.sourceforge.plantumldependency.common.clone.DeepCloneable;

/**
 * The mother interface of all plantUML classes diagram elements. The classic elements are usually
 * "class", "interface", "enum" and "abstract class".
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public interface PlantUMLClassesDiagramElement extends WithDescription,
        DeepCloneable < PlantUMLClassesDiagramElement >, Serializable, Comparable < PlantUMLClassesDiagramElement > {

    /**
     * Gets the element tag, which represents the element string used in the plantUML classes
     * diagram language.
     *
     * @return the element tag, as a {@link PlantUMLClassesDiagramElementTag} instance.
     * @since 1.1.1
     */
    PlantUMLClassesDiagramElementTag getElementTag();

    /**
     * Gets the full element name, i.e. the package name and the element name. For instance, it can
     * be "java.lang.String".
     *
     * @return the full element name.
     * @since 1.1.1
     */
    String getName();
}
