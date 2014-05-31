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

package net.sourceforge.plantumldependency.cli.constants;

import static java.util.Arrays.asList;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ABSTRACT_CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ANNOTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ENUMS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.EXTENSIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.IMPLEMENTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.IMPORTS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.INTERFACES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.NATIVE_METHODS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.STATIC_IMPORTS;
import static net.sourceforge.plantumldependency.common.color.HTMLColor.YELLOW;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.utils.collection.CollectionUtils.collectionToString;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.nativeimpl.NativeDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.PlantUMLStereotype;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl;

/**
 * The class which stores all necessary plantUML dependency constants as Strings.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public final class PlantUMLDependencyConstants {

    /** The default display name options to apply if not specified. */
    public static final String DEFAULT_DISPLAY_NAME_OPTIONS = ".*";

    /** The default display package name options to apply if not specified. */
    public static final String DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS = ".*";

    /** The default display types options to apply if not specified. */
    public static final Set < DisplayType > DEFAULT_DISPLAY_TYPES_OPTIONS = new TreeSet < DisplayType >(asList(new DisplayType[] {
            ABSTRACT_CLASSES, ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS, NATIVE_METHODS,
            IMPLEMENTATIONS, EXTENSIONS}));

    /** The default display types options argument as a String to apply if not specified. */
    public static final String DEFAULT_DISPLAY_TYPES_OPTIONS_STRING = collectionToString(DEFAULT_DISPLAY_TYPES_OPTIONS, COMMA_CHAR,
            BLANK_STRING, BLANK_STRING);

    /** The default exclude options to apply if not specified. */
    public static final String DEFAULT_EXCLUDE_OPTIONS = "**/package-info.java";

    /** The default include options to apply if not specified. */
    public static final String DEFAULT_INCLUDE_OPTIONS = "**/*.";

    /** The string representing the "java.lang" package. */
    public static final String JAVA_LANG_PACKAGE = "java.lang";

    /** Logging properties path. */
    public static final String LOGGING_PROPERTIES_PATH = "net/sourceforge/plantumldependency/cli/log/logging.properties";

    /** The custom dependency which is used to link with native code. */
    public static final GenericDependency NATIVE_DEPENDENCY = new GenericDependencyImpl(new NativeDependencyTypeImpl(
            "NativeCall", "javax.native"));

    /** The custom native plantUML stereotype. */
    public static final PlantUMLStereotype NATIVE_PLANTUML_STEREOTYPE = new PlantUMLStereotypeImpl(
            new PlantUMLSpottedCharacterImpl('N', YELLOW));

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.0.0
     */
    private PlantUMLDependencyConstants() {
        super();
    }
}
