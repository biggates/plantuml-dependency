/*
 PlantUMLDependencyConstants.java
 Creation date : 29/08/2010
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

import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;

/**
 * The class which stores all necessary plantUML dependency constants as Strings.
 * 
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public final class PlantUMLDependencyConstants {

    /** The string representing the "java.lang" package. */
    public static final String JAVA_LANG_PACKAGE = "java.lang";

    /** The default display options to apply if not specified. */
    public static final String DEFAULT_DISPLAY_OPTIONS = CLASSES + COMMA_CHAR + ENUMS + COMMA_CHAR + IMPORTS
            + COMMA_CHAR + INTERFACES + COMMA_CHAR + STATIC_IMPORTS + COMMA_CHAR + NATIVE_METHODS + COMMA_CHAR
            + IMPLEMENTATIONS + COMMA_CHAR + EXTENSIONS;

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private PlantUMLDependencyConstants() {
        super();
    }
}
