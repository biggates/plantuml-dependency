/*
 PlantUMLSpottedCharacter.java
 Creation date : 8/12/2011
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

import java.io.Serializable;

import net.sourceforge.plantumldependency.cli.plantumldiagram.WithDescription;
import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.common.color.HTMLColor;

/**
 * Interface which represents a plantUML classes diagram spotted character. <code>
 * {@literal @}startuml<br>
 * class System << (S,#FF7700) Singleton >><br>
 * {@literal @}enduml
 * </code>
 *
 * <br>
 * <br>
 * Note that the generated text will only convert colors into their hexadecimal code, never in the
 * text form such as ;<br>
 * <code>
 * {@literal @}startuml<br>
 * class Date << (D,orchid) >><br>
 * {@literal @}enduml
 * </code>
 *
 * @see <a href="http://plantuml.sourceforge.net/classes.html#Specific">PlantUML classes diagram
 *      Specific Spot page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public interface PlantUMLSpottedCharacter extends Comparable < PlantUMLSpottedCharacter >, WithDescription,
        DeepCloneable < PlantUMLSpottedCharacter >, Serializable {

    /**
     * Gets the spotted character.
     *
     * @return the spotted character.
     * @since 1.1.1
     */
    char getCharacter();

    /**
     * Gets the spotted color.
     *
     * @return the {@link HTMLColor} instance.
     * @since 1.1.1
     */
    HTMLColor getColor();
}
