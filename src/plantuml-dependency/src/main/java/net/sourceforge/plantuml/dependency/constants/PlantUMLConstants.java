/*
 PlantUMLConstants.java
 Creation date : 14/07/2010
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

package net.sourceforge.plantuml.dependency.constants;

import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;

/**
 * The class which stores all necessary plantUML constants as Strings.
 * 
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public final class PlantUMLConstants {

    /** The string representing the plantUML "startuml" tag. */
    public static final String START_PLANTUML = "@startuml";

    /** The string representing the plantUML "enduml" tag. */
    public static final String END_PLANTUML = LINE_SEPARATOR + "@enduml";

    /** The string representing the plantUML "class" tag. */
    public static final String CLASS_PLANTUML = LINE_SEPARATOR + "class ";
    
    /** The string representing the plantUML "abstract" tag. */
    public static final String ABSTRACT_CLASS_PLANTUML = LINE_SEPARATOR + "abstract class ";

    /** The string representing the plantUML "enum" tag. */
    public static final String ENUM_PLANTUML = LINE_SEPARATOR + "enum ";

    /** The string representing the plantUML "interface" tag. */
    public static final String INTERFACE_PLANTUML = LINE_SEPARATOR + "interface ";

    /** The string representing the plantUML "<|--" tag. */
    public static final String IMPLEMENTS_LEFT_PLANTUML = " <|-- ";

    /** The string representing the plantUML "..>" tag. */
    public static final String USES_RIGHT_PLANTUML = " ..> ";

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private PlantUMLConstants() {
        super();
    }
}
