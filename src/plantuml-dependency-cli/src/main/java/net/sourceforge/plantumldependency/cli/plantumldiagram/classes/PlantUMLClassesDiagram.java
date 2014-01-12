/*
 PlantUMLClassesDiagram.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.plantumldiagram.PlantUMLDiagram;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

/**
 * The interface which represents a plantUML classes diagram. A plantUML classes diagram is mainly
 * defined by two things : the elements and their relations to each other.<br>
 * For instance, this class may be an object oriented description of the following plantUML text :<br>
 * <code>
 * {@literal @}startuml<br>
 * Class01 "1" *-- "many" Class02 : contains<br>
 * Class03 o-- Class04 : agregation<br>
 * Class05 --> "1" Class06<br>
 * {@literal @}enduml
 * </code>
 *
 * @see <a href="http://plantuml.sourceforge.net/classes.html">PlantUML classes diagram page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public interface PlantUMLClassesDiagram extends PlantUMLDiagram {

    /**
     * Gets all elements contained in the plantUML classes diagram.
     *
     * @return the {@link Set} of all {@link PlantUMLClassesDiagramElement} contained in the
     *         plantUML classes diagram.
     * @since 1.1.1
     */
    Set < PlantUMLClassesDiagramElement > getPlantUMLClassesDiagramElements();

    /**
     * Gets all relations contained in the plantUML classes diagram.
     *
     * @return the {@link Set} of all {@link PlantUMLClassesDiagramRelation} contained in the
     *         plantUML classes diagram.
     * @since 1.1.1
     */
    Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations();
}
