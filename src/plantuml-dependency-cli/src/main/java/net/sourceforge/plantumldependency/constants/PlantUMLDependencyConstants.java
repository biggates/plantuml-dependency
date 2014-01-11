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

package net.sourceforge.plantumldependency.constants;

import static java.util.Arrays.asList;
import static net.sourceforge.mazix.components.color.HTMLColor.YELLOW;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.utils.collection.CollectionUtils.collectionToString;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.ANNOTATIONS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantumldependency.main.option.display.argument.Display.STATIC_IMPORTS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.generic.GenericDependency;
import net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantumldependency.generic.type.impl.nativeimpl.NativeDependencyTypeImpl;
import net.sourceforge.plantumldependency.main.option.display.argument.Display;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.stereotype.PlantUMLStereotype;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImpl;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl;

/**
 * The class which stores all necessary plantUML dependency constants as Strings.
 *
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.2.0
 */
public final class PlantUMLDependencyConstants {

    /** The default display options to apply if not specified. */
    public static final Set < Display > DEFAULT_DISPLAY_OPTIONS = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS, NATIVE_METHODS,
            IMPLEMENTATIONS, EXTENSIONS}));

    /** The default display options argument as a String to apply if not specified. */
    public static final String DEFAULT_DISPLAY_OPTIONS_STRING = collectionToString(DEFAULT_DISPLAY_OPTIONS, COMMA_CHAR,
            BLANK_STRING, BLANK_STRING);

    /** The default exclude options to apply if not specified. */
    public static final String DEFAULT_EXCLUDE_OPTIONS = "**/*~";

    /** The default include options to apply if not specified. */
    public static final String DEFAULT_INCLUDE_OPTIONS = "**/*.";

    /** The string representing the "java.lang" package. */
    public static final String JAVA_LANG_PACKAGE = "java.lang";

    /** Logging properties path. */
    public static final String LOGGING_PROPERTIES_PATH = "net/sourceforge/plantumldependency/log/logging.properties";

    /** The custom dependency which is used to link with native code. */
    public static final GenericDependency NATIVE_DEPENDENCY = new GenericDependencyImpl(new NativeDependencyTypeImpl(
            "NativeCall", "javax.native"));

    /** The custom native plantUML stereotype. */
    public static final PlantUMLStereotype NATIVE_PLANTUML_STEREOTYPE = new PlantUMLStereotypeImpl(
            new PlantUMLSpottedCharacterImpl('N', YELLOW));

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.0
     */
    private PlantUMLDependencyConstants() {
        super();
    }
}
