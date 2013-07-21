/*
 PlantUMLDependencyDisplaySetTestConstants.java
 Creation date : 21/07/2013
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

import static java.util.Arrays.asList;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ANNOTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

/**
 * The class which stores all necessary display set constants used for Junit tests.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.2.0
 * @version 1.2.0
 */
public final class PlantUMLDependencyDisplaySetTestConstants {

    /** Display set test 1 instance. */
    public static final Set < Display > DISPLAY_SET1 = new TreeSet < Display >();

    /** Display set test 2 instance. */
    public static final Set < Display > DISPLAY_SET2 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS}));

    /** Display set test 3 instance. */
    public static final Set < Display > DISPLAY_SET3 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES}));

    /** Display set test 4 instance. */
    public static final Set < Display > DISPLAY_SET4 = new TreeSet < Display >(asList(new Display[] {CLASSES}));

    /** Display set test 5 instance. */
    public static final Set < Display > DISPLAY_SET5 = new TreeSet < Display >(asList(new Display[] {ENUMS}));

    /** Display set test 6 instance. */
    public static final Set < Display > DISPLAY_SET6 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS}));

    /** Display set test 7 instance. */
    public static final Set < Display > DISPLAY_SET7 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS}));

    /** Display set test 8 instance. */
    public static final Set < Display > DISPLAY_SET8 = new TreeSet < Display >(asList(new Display[] {IMPORTS}));

    /** Display set test 9 instance. */
    public static final Set < Display > DISPLAY_SET9 = new TreeSet < Display >(asList(new Display[] {INTERFACES}));

    /** Display set test 10 instance. */
    public static final Set < Display > DISPLAY_SET10 = new TreeSet < Display >(asList(new Display[] {NATIVE_METHODS}));

    /** Display set test 11 instance. */
    public static final Set < Display > DISPLAY_SET11 = new TreeSet < Display >(asList(new Display[] {STATIC_IMPORTS}));

    /** Display set test 12 instance. */
    public static final Set < Display > DISPLAY_SET12 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES}));

    /** Display set test 13 instance. */
    public static final Set < Display > DISPLAY_SET13 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES}));

    /** Display set test 14 instance. */
    public static final Set < Display > DISPLAY_SET14 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS}));

    /** Display set test 15 instance. */
    public static final Set < Display > DISPLAY_SET15 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS}));

    /** Display set test 16 instance. */
    public static final Set < Display > DISPLAY_SET16 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS}));

    /** Display set test 17 instance. */
    public static final Set < Display > DISPLAY_SET17 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS}));

    /** Display set test 18 instance. */
    public static final Set < Display > DISPLAY_SET18 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, INTERFACES}));

    /** Display set test 19 instance. */
    public static final Set < Display > DISPLAY_SET19 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, NATIVE_METHODS}));

    /** Display set test 20 instance. */
    public static final Set < Display > DISPLAY_SET20 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, STATIC_IMPORTS}));

    /** Display set test 21 instance. */
    public static final Set < Display > DISPLAY_SET21 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES}));

    /** Display set test 22 instance. */
    public static final Set < Display > DISPLAY_SET22 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS}));

    /** Display set test 23 instance. */
    public static final Set < Display > DISPLAY_SET23 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS}));

    /** Display set test 24 instance. */
    public static final Set < Display > DISPLAY_SET24 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS}));

    /** Display set test 25 instance. */
    public static final Set < Display > DISPLAY_SET25 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS}));

    /** Display set test 26 instance. */
    public static final Set < Display > DISPLAY_SET26 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, INTERFACES}));

    /** Display set test 27 instance. */
    public static final Set < Display > DISPLAY_SET27 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, NATIVE_METHODS}));

    /** Display set test 28 instance. */
    public static final Set < Display > DISPLAY_SET28 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, STATIC_IMPORTS}));

    /** Display set test 29 instance. */
    public static final Set < Display > DISPLAY_SET29 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS}));

    /** Display set test 30 instance. */
    public static final Set < Display > DISPLAY_SET30 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS}));

    /** Display set test 31 instance. */
    public static final Set < Display > DISPLAY_SET31 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS}));

    /** Display set test 32 instance. */
    public static final Set < Display > DISPLAY_SET32 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS}));

    /** Display set test 33 instance. */
    public static final Set < Display > DISPLAY_SET33 = new TreeSet < Display >(asList(new Display[] {CLASSES, INTERFACES}));

    /** Display set test 34 instance. */
    public static final Set < Display > DISPLAY_SET34 = new TreeSet < Display >(asList(new Display[] {CLASSES, NATIVE_METHODS}));

    /** Display set test 35 instance. */
    public static final Set < Display > DISPLAY_SET35 = new TreeSet < Display >(asList(new Display[] {CLASSES, STATIC_IMPORTS}));

    /** Display set test 36 instance. */
    public static final Set < Display > DISPLAY_SET36 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS}));

    /** Display set test 37 instance. */
    public static final Set < Display > DISPLAY_SET37 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS}));

    /** Display set test 38 instance. */
    public static final Set < Display > DISPLAY_SET38 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS}));

    /** Display set test 39 instance. */
    public static final Set < Display > DISPLAY_SET39 = new TreeSet < Display >(asList(new Display[] {ENUMS, INTERFACES}));

    /** Display set test 40 instance. */
    public static final Set < Display > DISPLAY_SET40 = new TreeSet < Display >(asList(new Display[] {ENUMS, NATIVE_METHODS}));

    /** Display set test 41 instance. */
    public static final Set < Display > DISPLAY_SET41 = new TreeSet < Display >(asList(new Display[] {ENUMS, STATIC_IMPORTS}));

    /** Display set test 42 instance. */
    public static final Set < Display > DISPLAY_SET42 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 43 instance. */
    public static final Set < Display > DISPLAY_SET43 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS}));

    /** Display set test 44 instance. */
    public static final Set < Display > DISPLAY_SET44 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, INTERFACES}));

    /** Display set test 45 instance. */
    public static final Set < Display > DISPLAY_SET45 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 46 instance. */
    public static final Set < Display > DISPLAY_SET46 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 47 instance. */
    public static final Set < Display > DISPLAY_SET47 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 48 instance. */
    public static final Set < Display > DISPLAY_SET48 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 49 instance. */
    public static final Set < Display > DISPLAY_SET49 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 50 instance. */
    public static final Set < Display > DISPLAY_SET50 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 51 instance. */
    public static final Set < Display > DISPLAY_SET51 = new TreeSet < Display >(asList(new Display[] {IMPORTS, INTERFACES}));

    /** Display set test 52 instance. */
    public static final Set < Display > DISPLAY_SET52 = new TreeSet < Display >(asList(new Display[] {IMPORTS, NATIVE_METHODS}));

    /** Display set test 53 instance. */
    public static final Set < Display > DISPLAY_SET53 = new TreeSet < Display >(asList(new Display[] {IMPORTS, STATIC_IMPORTS}));

    /** Display set test 54 instance. */
    public static final Set < Display > DISPLAY_SET54 = new TreeSet < Display >(asList(new Display[] {INTERFACES, NATIVE_METHODS}));

    /** Display set test 55 instance. */
    public static final Set < Display > DISPLAY_SET55 = new TreeSet < Display >(asList(new Display[] {INTERFACES, STATIC_IMPORTS}));

    /** Display set test 56 instance. */
    public static final Set < Display > DISPLAY_SET56 = new TreeSet < Display >(asList(new Display[] {NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 57 instance. */
    public static final Set < Display > DISPLAY_SET57 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES}));

    /** Display set test 58 instance. */
    public static final Set < Display > DISPLAY_SET58 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS}));

    /** Display set test 59 instance. */
    public static final Set < Display > DISPLAY_SET59 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS}));

    /** Display set test 60 instance. */
    public static final Set < Display > DISPLAY_SET60 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS}));

    /** Display set test 61 instance. */
    public static final Set < Display > DISPLAY_SET61 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS}));

    /** Display set test 62 instance. */
    public static final Set < Display > DISPLAY_SET62 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, INTERFACES}));

    /** Display set test 63 instance. */
    public static final Set < Display > DISPLAY_SET63 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, NATIVE_METHODS}));

    /** Display set test 64 instance. */
    public static final Set < Display > DISPLAY_SET64 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, STATIC_IMPORTS}));

    /** Display set test 65 instance. */
    public static final Set < Display > DISPLAY_SET65 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS}));

    /** Display set test 66 instance. */
    public static final Set < Display > DISPLAY_SET66 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS}));

    /** Display set test 67 instance. */
    public static final Set < Display > DISPLAY_SET67 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS}));

    /** Display set test 68 instance. */
    public static final Set < Display > DISPLAY_SET68 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS}));

    /** Display set test 69 instance. */
    public static final Set < Display > DISPLAY_SET69 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, INTERFACES}));

    /** Display set test 70 instance. */
    public static final Set < Display > DISPLAY_SET70 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, NATIVE_METHODS}));

    /** Display set test 71 instance. */
    public static final Set < Display > DISPLAY_SET71 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, STATIC_IMPORTS}));

    /** Display set test 72 instance. */
    public static final Set < Display > DISPLAY_SET72 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS}));

    /** Display set test 73 instance. */
    public static final Set < Display > DISPLAY_SET73 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 74 instance. */
    public static final Set < Display > DISPLAY_SET74 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS}));

    /** Display set test 75 instance. */
    public static final Set < Display > DISPLAY_SET75 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, INTERFACES}));

    /** Display set test 76 instance. */
    public static final Set < Display > DISPLAY_SET76 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, NATIVE_METHODS}));

    /** Display set test 77 instance. */
    public static final Set < Display > DISPLAY_SET77 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, STATIC_IMPORTS}));

    /** Display set test 78 instance. */
    public static final Set < Display > DISPLAY_SET78 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 79 instance. */
    public static final Set < Display > DISPLAY_SET79 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS}));

    /** Display set test 80 instance. */
    public static final Set < Display > DISPLAY_SET80 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, INTERFACES}));

    /** Display set test 81 instance. */
    public static final Set < Display > DISPLAY_SET81 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 82 instance. */
    public static final Set < Display > DISPLAY_SET82 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 83 instance. */
    public static final Set < Display > DISPLAY_SET83 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 84 instance. */
    public static final Set < Display > DISPLAY_SET84 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 85 instance. */
    public static final Set < Display > DISPLAY_SET85 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 86 instance. */
    public static final Set < Display > DISPLAY_SET86 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 87 instance. */
    public static final Set < Display > DISPLAY_SET87 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 88 instance. */
    public static final Set < Display > DISPLAY_SET88 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 89 instance. */
    public static final Set < Display > DISPLAY_SET89 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 90 instance. */
    public static final Set < Display > DISPLAY_SET90 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 91 instance. */
    public static final Set < Display > DISPLAY_SET91 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 92 instance. */
    public static final Set < Display > DISPLAY_SET92 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 93 instance. */
    public static final Set < Display > DISPLAY_SET93 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS}));

    /** Display set test 94 instance. */
    public static final Set < Display > DISPLAY_SET94 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS}));

    /** Display set test 95 instance. */
    public static final Set < Display > DISPLAY_SET95 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS}));

    /** Display set test 96 instance. */
    public static final Set < Display > DISPLAY_SET96 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS}));

    /** Display set test 97 instance. */
    public static final Set < Display > DISPLAY_SET97 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, INTERFACES}));

    /** Display set test 98 instance. */
    public static final Set < Display > DISPLAY_SET98 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS}));

    /** Display set test 99 instance. */
    public static final Set < Display > DISPLAY_SET99 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, STATIC_IMPORTS}));

    /** Display set test 100 instance. */
    public static final Set < Display > DISPLAY_SET100 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 101 instance. */
    public static final Set < Display > DISPLAY_SET101 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 102 instance. */
    public static final Set < Display > DISPLAY_SET102 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS}));

    /** Display set test 103 instance. */
    public static final Set < Display > DISPLAY_SET103 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, INTERFACES}));

    /** Display set test 104 instance. */
    public static final Set < Display > DISPLAY_SET104 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 105 instance. */
    public static final Set < Display > DISPLAY_SET105 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 106 instance. */
    public static final Set < Display > DISPLAY_SET106 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 107 instance. */
    public static final Set < Display > DISPLAY_SET107 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 108 instance. */
    public static final Set < Display > DISPLAY_SET108 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 109 instance. */
    public static final Set < Display > DISPLAY_SET109 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 110 instance. */
    public static final Set < Display > DISPLAY_SET110 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 111 instance. */
    public static final Set < Display > DISPLAY_SET111 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 112 instance. */
    public static final Set < Display > DISPLAY_SET112 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 113 instance. */
    public static final Set < Display > DISPLAY_SET113 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 114 instance. */
    public static final Set < Display > DISPLAY_SET114 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 115 instance. */
    public static final Set < Display > DISPLAY_SET115 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 116 instance. */
    public static final Set < Display > DISPLAY_SET116 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 117 instance. */
    public static final Set < Display > DISPLAY_SET117 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 118 instance. */
    public static final Set < Display > DISPLAY_SET118 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 119 instance. */
    public static final Set < Display > DISPLAY_SET119 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 120 instance. */
    public static final Set < Display > DISPLAY_SET120 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 121 instance. */
    public static final Set < Display > DISPLAY_SET121 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 122 instance. */
    public static final Set < Display > DISPLAY_SET122 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 123 instance. */
    public static final Set < Display > DISPLAY_SET123 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS}));

    /** Display set test 124 instance. */
    public static final Set < Display > DISPLAY_SET124 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, INTERFACES}));

    /** Display set test 125 instance. */
    public static final Set < Display > DISPLAY_SET125 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 126 instance. */
    public static final Set < Display > DISPLAY_SET126 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 127 instance. */
    public static final Set < Display > DISPLAY_SET127 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 128 instance. */
    public static final Set < Display > DISPLAY_SET128 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 129 instance. */
    public static final Set < Display > DISPLAY_SET129 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 130 instance. */
    public static final Set < Display > DISPLAY_SET130 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 131 instance. */
    public static final Set < Display > DISPLAY_SET131 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 132 instance. */
    public static final Set < Display > DISPLAY_SET132 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 133 instance. */
    public static final Set < Display > DISPLAY_SET133 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 134 instance. */
    public static final Set < Display > DISPLAY_SET134 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 135 instance. */
    public static final Set < Display > DISPLAY_SET135 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 136 instance. */
    public static final Set < Display > DISPLAY_SET136 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 137 instance. */
    public static final Set < Display > DISPLAY_SET137 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 138 instance. */
    public static final Set < Display > DISPLAY_SET138 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 139 instance. */
    public static final Set < Display > DISPLAY_SET139 = new TreeSet < Display >(asList(new Display[] {CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 140 instance. */
    public static final Set < Display > DISPLAY_SET140 = new TreeSet < Display >(asList(new Display[] {CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 141 instance. */
    public static final Set < Display > DISPLAY_SET141 = new TreeSet < Display >(asList(new Display[] {CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 142 instance. */
    public static final Set < Display > DISPLAY_SET142 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 143 instance. */
    public static final Set < Display > DISPLAY_SET143 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 144 instance. */
    public static final Set < Display > DISPLAY_SET144 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 145 instance. */
    public static final Set < Display > DISPLAY_SET145 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 146 instance. */
    public static final Set < Display > DISPLAY_SET146 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 147 instance. */
    public static final Set < Display > DISPLAY_SET147 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 148 instance. */
    public static final Set < Display > DISPLAY_SET148 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 149 instance. */
    public static final Set < Display > DISPLAY_SET149 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 150 instance. */
    public static final Set < Display > DISPLAY_SET150 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 151 instance. */
    public static final Set < Display > DISPLAY_SET151 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 152 instance. */
    public static final Set < Display > DISPLAY_SET152 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 153 instance. */
    public static final Set < Display > DISPLAY_SET153 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 154 instance. */
    public static final Set < Display > DISPLAY_SET154 = new TreeSet < Display >(asList(new Display[] {ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 155 instance. */
    public static final Set < Display > DISPLAY_SET155 = new TreeSet < Display >(asList(new Display[] {ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 156 instance. */
    public static final Set < Display > DISPLAY_SET156 = new TreeSet < Display >(asList(new Display[] {ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 157 instance. */
    public static final Set < Display > DISPLAY_SET157 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 158 instance. */
    public static final Set < Display > DISPLAY_SET158 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 159 instance. */
    public static final Set < Display > DISPLAY_SET159 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 160 instance. */
    public static final Set < Display > DISPLAY_SET160 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 161 instance. */
    public static final Set < Display > DISPLAY_SET161 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 162 instance. */
    public static final Set < Display > DISPLAY_SET162 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 163 instance. */
    public static final Set < Display > DISPLAY_SET163 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 164 instance. */
    public static final Set < Display > DISPLAY_SET164 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 165 instance. */
    public static final Set < Display > DISPLAY_SET165 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 166 instance. */
    public static final Set < Display > DISPLAY_SET166 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 167 instance. */
    public static final Set < Display > DISPLAY_SET167 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 168 instance. */
    public static final Set < Display > DISPLAY_SET168 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 169 instance. */
    public static final Set < Display > DISPLAY_SET169 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 170 instance. */
    public static final Set < Display > DISPLAY_SET170 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 171 instance. */
    public static final Set < Display > DISPLAY_SET171 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 172 instance. */
    public static final Set < Display > DISPLAY_SET172 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 173 instance. */
    public static final Set < Display > DISPLAY_SET173 = new TreeSet < Display >(asList(new Display[] {IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 174 instance. */
    public static final Set < Display > DISPLAY_SET174 = new TreeSet < Display >(asList(new Display[] {IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 175 instance. */
    public static final Set < Display > DISPLAY_SET175 = new TreeSet < Display >(asList(new Display[] {IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 176 instance. */
    public static final Set < Display > DISPLAY_SET176 = new TreeSet < Display >(asList(new Display[] {INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 177 instance. */
    public static final Set < Display > DISPLAY_SET177 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS}));

    /** Display set test 178 instance. */
    public static final Set < Display > DISPLAY_SET178 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS}));

    /** Display set test 179 instance. */
    public static final Set < Display > DISPLAY_SET179 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS}));

    /** Display set test 180 instance. */
    public static final Set < Display > DISPLAY_SET180 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS}));

    /** Display set test 181 instance. */
    public static final Set < Display > DISPLAY_SET181 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, INTERFACES}));

    /** Display set test 182 instance. */
    public static final Set < Display > DISPLAY_SET182 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS}));

    /** Display set test 183 instance. */
    public static final Set < Display > DISPLAY_SET183 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, STATIC_IMPORTS}));

    /** Display set test 184 instance. */
    public static final Set < Display > DISPLAY_SET184 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 185 instance. */
    public static final Set < Display > DISPLAY_SET185 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 186 instance. */
    public static final Set < Display > DISPLAY_SET186 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS}));

    /** Display set test 187 instance. */
    public static final Set < Display > DISPLAY_SET187 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, INTERFACES}));

    /** Display set test 188 instance. */
    public static final Set < Display > DISPLAY_SET188 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 189 instance. */
    public static final Set < Display > DISPLAY_SET189 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 190 instance. */
    public static final Set < Display > DISPLAY_SET190 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 191 instance. */
    public static final Set < Display > DISPLAY_SET191 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 192 instance. */
    public static final Set < Display > DISPLAY_SET192 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 193 instance. */
    public static final Set < Display > DISPLAY_SET193 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 194 instance. */
    public static final Set < Display > DISPLAY_SET194 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 195 instance. */
    public static final Set < Display > DISPLAY_SET195 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 196 instance. */
    public static final Set < Display > DISPLAY_SET196 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 197 instance. */
    public static final Set < Display > DISPLAY_SET197 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 198 instance. */
    public static final Set < Display > DISPLAY_SET198 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 199 instance. */
    public static final Set < Display > DISPLAY_SET199 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 200 instance. */
    public static final Set < Display > DISPLAY_SET200 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 201 instance. */
    public static final Set < Display > DISPLAY_SET201 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 202 instance. */
    public static final Set < Display > DISPLAY_SET202 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 203 instance. */
    public static final Set < Display > DISPLAY_SET203 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 204 instance. */
    public static final Set < Display > DISPLAY_SET204 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 205 instance. */
    public static final Set < Display > DISPLAY_SET205 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 206 instance. */
    public static final Set < Display > DISPLAY_SET206 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 207 instance. */
    public static final Set < Display > DISPLAY_SET207 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS}));

    /** Display set test 208 instance. */
    public static final Set < Display > DISPLAY_SET208 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, INTERFACES}));

    /** Display set test 209 instance. */
    public static final Set < Display > DISPLAY_SET209 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 210 instance. */
    public static final Set < Display > DISPLAY_SET210 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 211 instance. */
    public static final Set < Display > DISPLAY_SET211 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 212 instance. */
    public static final Set < Display > DISPLAY_SET212 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 213 instance. */
    public static final Set < Display > DISPLAY_SET213 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 214 instance. */
    public static final Set < Display > DISPLAY_SET214 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 215 instance. */
    public static final Set < Display > DISPLAY_SET215 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 216 instance. */
    public static final Set < Display > DISPLAY_SET216 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 217 instance. */
    public static final Set < Display > DISPLAY_SET217 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 218 instance. */
    public static final Set < Display > DISPLAY_SET218 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 219 instance. */
    public static final Set < Display > DISPLAY_SET219 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 220 instance. */
    public static final Set < Display > DISPLAY_SET220 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 221 instance. */
    public static final Set < Display > DISPLAY_SET221 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 222 instance. */
    public static final Set < Display > DISPLAY_SET222 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 223 instance. */
    public static final Set < Display > DISPLAY_SET223 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 224 instance. */
    public static final Set < Display > DISPLAY_SET224 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 225 instance. */
    public static final Set < Display > DISPLAY_SET225 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 226 instance. */
    public static final Set < Display > DISPLAY_SET226 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 227 instance. */
    public static final Set < Display > DISPLAY_SET227 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 228 instance. */
    public static final Set < Display > DISPLAY_SET228 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 229 instance. */
    public static final Set < Display > DISPLAY_SET229 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 230 instance. */
    public static final Set < Display > DISPLAY_SET230 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 231 instance. */
    public static final Set < Display > DISPLAY_SET231 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 232 instance. */
    public static final Set < Display > DISPLAY_SET232 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 233 instance. */
    public static final Set < Display > DISPLAY_SET233 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 234 instance. */
    public static final Set < Display > DISPLAY_SET234 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 235 instance. */
    public static final Set < Display > DISPLAY_SET235 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 236 instance. */
    public static final Set < Display > DISPLAY_SET236 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 237 instance. */
    public static final Set < Display > DISPLAY_SET237 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 238 instance. */
    public static final Set < Display > DISPLAY_SET238 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 239 instance. */
    public static final Set < Display > DISPLAY_SET239 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 240 instance. */
    public static final Set < Display > DISPLAY_SET240 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 241 instance. */
    public static final Set < Display > DISPLAY_SET241 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 242 instance. */
    public static final Set < Display > DISPLAY_SET242 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 243 instance. */
    public static final Set < Display > DISPLAY_SET243 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 244 instance. */
    public static final Set < Display > DISPLAY_SET244 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 245 instance. */
    public static final Set < Display > DISPLAY_SET245 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 246 instance. */
    public static final Set < Display > DISPLAY_SET246 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 247 instance. */
    public static final Set < Display > DISPLAY_SET247 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 248 instance. */
    public static final Set < Display > DISPLAY_SET248 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 249 instance. */
    public static final Set < Display > DISPLAY_SET249 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 250 instance. */
    public static final Set < Display > DISPLAY_SET250 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 251 instance. */
    public static final Set < Display > DISPLAY_SET251 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 252 instance. */
    public static final Set < Display > DISPLAY_SET252 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 253 instance. */
    public static final Set < Display > DISPLAY_SET253 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 254 instance. */
    public static final Set < Display > DISPLAY_SET254 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 255 instance. */
    public static final Set < Display > DISPLAY_SET255 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 256 instance. */
    public static final Set < Display > DISPLAY_SET256 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 257 instance. */
    public static final Set < Display > DISPLAY_SET257 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 258 instance. */
    public static final Set < Display > DISPLAY_SET258 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 259 instance. */
    public static final Set < Display > DISPLAY_SET259 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 260 instance. */
    public static final Set < Display > DISPLAY_SET260 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 261 instance. */
    public static final Set < Display > DISPLAY_SET261 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 262 instance. */
    public static final Set < Display > DISPLAY_SET262 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 263 instance. */
    public static final Set < Display > DISPLAY_SET263 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS}));

    /** Display set test 264 instance. */
    public static final Set < Display > DISPLAY_SET264 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES}));

    /** Display set test 265 instance. */
    public static final Set < Display > DISPLAY_SET265 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 266 instance. */
    public static final Set < Display > DISPLAY_SET266 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 267 instance. */
    public static final Set < Display > DISPLAY_SET267 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 268 instance. */
    public static final Set < Display > DISPLAY_SET268 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 269 instance. */
    public static final Set < Display > DISPLAY_SET269 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 270 instance. */
    public static final Set < Display > DISPLAY_SET270 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 271 instance. */
    public static final Set < Display > DISPLAY_SET271 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 272 instance. */
    public static final Set < Display > DISPLAY_SET272 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 273 instance. */
    public static final Set < Display > DISPLAY_SET273 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 274 instance. */
    public static final Set < Display > DISPLAY_SET274 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 275 instance. */
    public static final Set < Display > DISPLAY_SET275 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 276 instance. */
    public static final Set < Display > DISPLAY_SET276 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 277 instance. */
    public static final Set < Display > DISPLAY_SET277 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 278 instance. */
    public static final Set < Display > DISPLAY_SET278 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 279 instance. */
    public static final Set < Display > DISPLAY_SET279 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 280 instance. */
    public static final Set < Display > DISPLAY_SET280 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 281 instance. */
    public static final Set < Display > DISPLAY_SET281 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 282 instance. */
    public static final Set < Display > DISPLAY_SET282 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 283 instance. */
    public static final Set < Display > DISPLAY_SET283 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 284 instance. */
    public static final Set < Display > DISPLAY_SET284 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 285 instance. */
    public static final Set < Display > DISPLAY_SET285 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 286 instance. */
    public static final Set < Display > DISPLAY_SET286 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 287 instance. */
    public static final Set < Display > DISPLAY_SET287 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 288 instance. */
    public static final Set < Display > DISPLAY_SET288 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 289 instance. */
    public static final Set < Display > DISPLAY_SET289 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 290 instance. */
    public static final Set < Display > DISPLAY_SET290 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 291 instance. */
    public static final Set < Display > DISPLAY_SET291 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 292 instance. */
    public static final Set < Display > DISPLAY_SET292 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 293 instance. */
    public static final Set < Display > DISPLAY_SET293 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 294 instance. */
    public static final Set < Display > DISPLAY_SET294 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 295 instance. */
    public static final Set < Display > DISPLAY_SET295 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 296 instance. */
    public static final Set < Display > DISPLAY_SET296 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 297 instance. */
    public static final Set < Display > DISPLAY_SET297 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 298 instance. */
    public static final Set < Display > DISPLAY_SET298 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 299 instance. */
    public static final Set < Display > DISPLAY_SET299 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 300 instance. */
    public static final Set < Display > DISPLAY_SET300 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 301 instance. */
    public static final Set < Display > DISPLAY_SET301 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 302 instance. */
    public static final Set < Display > DISPLAY_SET302 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 303 instance. */
    public static final Set < Display > DISPLAY_SET303 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 304 instance. */
    public static final Set < Display > DISPLAY_SET304 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 305 instance. */
    public static final Set < Display > DISPLAY_SET305 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 306 instance. */
    public static final Set < Display > DISPLAY_SET306 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 307 instance. */
    public static final Set < Display > DISPLAY_SET307 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 308 instance. */
    public static final Set < Display > DISPLAY_SET308 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 309 instance. */
    public static final Set < Display > DISPLAY_SET309 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 310 instance. */
    public static final Set < Display > DISPLAY_SET310 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 311 instance. */
    public static final Set < Display > DISPLAY_SET311 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 312 instance. */
    public static final Set < Display > DISPLAY_SET312 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 313 instance. */
    public static final Set < Display > DISPLAY_SET313 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 314 instance. */
    public static final Set < Display > DISPLAY_SET314 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 315 instance. */
    public static final Set < Display > DISPLAY_SET315 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 316 instance. */
    public static final Set < Display > DISPLAY_SET316 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 317 instance. */
    public static final Set < Display > DISPLAY_SET317 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 318 instance. */
    public static final Set < Display > DISPLAY_SET318 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 319 instance. */
    public static final Set < Display > DISPLAY_SET319 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 320 instance. */
    public static final Set < Display > DISPLAY_SET320 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 321 instance. */
    public static final Set < Display > DISPLAY_SET321 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 322 instance. */
    public static final Set < Display > DISPLAY_SET322 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 323 instance. */
    public static final Set < Display > DISPLAY_SET323 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 324 instance. */
    public static final Set < Display > DISPLAY_SET324 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 325 instance. */
    public static final Set < Display > DISPLAY_SET325 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 326 instance. */
    public static final Set < Display > DISPLAY_SET326 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 327 instance. */
    public static final Set < Display > DISPLAY_SET327 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 328 instance. */
    public static final Set < Display > DISPLAY_SET328 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 329 instance. */
    public static final Set < Display > DISPLAY_SET329 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 330 instance. */
    public static final Set < Display > DISPLAY_SET330 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 331 instance. */
    public static final Set < Display > DISPLAY_SET331 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 332 instance. */
    public static final Set < Display > DISPLAY_SET332 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 333 instance. */
    public static final Set < Display > DISPLAY_SET333 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 334 instance. */
    public static final Set < Display > DISPLAY_SET334 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 335 instance. */
    public static final Set < Display > DISPLAY_SET335 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 336 instance. */
    public static final Set < Display > DISPLAY_SET336 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 337 instance. */
    public static final Set < Display > DISPLAY_SET337 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 338 instance. */
    public static final Set < Display > DISPLAY_SET338 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 339 instance. */
    public static final Set < Display > DISPLAY_SET339 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 340 instance. */
    public static final Set < Display > DISPLAY_SET340 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 341 instance. */
    public static final Set < Display > DISPLAY_SET341 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 342 instance. */
    public static final Set < Display > DISPLAY_SET342 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 343 instance. */
    public static final Set < Display > DISPLAY_SET343 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 344 instance. */
    public static final Set < Display > DISPLAY_SET344 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 345 instance. */
    public static final Set < Display > DISPLAY_SET345 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 346 instance. */
    public static final Set < Display > DISPLAY_SET346 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 347 instance. */
    public static final Set < Display > DISPLAY_SET347 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 348 instance. */
    public static final Set < Display > DISPLAY_SET348 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 349 instance. */
    public static final Set < Display > DISPLAY_SET349 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 350 instance. */
    public static final Set < Display > DISPLAY_SET350 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 351 instance. */
    public static final Set < Display > DISPLAY_SET351 = new TreeSet < Display >(asList(new Display[] {CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 352 instance. */
    public static final Set < Display > DISPLAY_SET352 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 353 instance. */
    public static final Set < Display > DISPLAY_SET353 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 354 instance. */
    public static final Set < Display > DISPLAY_SET354 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 355 instance. */
    public static final Set < Display > DISPLAY_SET355 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 356 instance. */
    public static final Set < Display > DISPLAY_SET356 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 357 instance. */
    public static final Set < Display > DISPLAY_SET357 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 358 instance. */
    public static final Set < Display > DISPLAY_SET358 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 359 instance. */
    public static final Set < Display > DISPLAY_SET359 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 360 instance. */
    public static final Set < Display > DISPLAY_SET360 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 361 instance. */
    public static final Set < Display > DISPLAY_SET361 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 362 instance. */
    public static final Set < Display > DISPLAY_SET362 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 363 instance. */
    public static final Set < Display > DISPLAY_SET363 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 364 instance. */
    public static final Set < Display > DISPLAY_SET364 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 365 instance. */
    public static final Set < Display > DISPLAY_SET365 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 366 instance. */
    public static final Set < Display > DISPLAY_SET366 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 367 instance. */
    public static final Set < Display > DISPLAY_SET367 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 368 instance. */
    public static final Set < Display > DISPLAY_SET368 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 369 instance. */
    public static final Set < Display > DISPLAY_SET369 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 370 instance. */
    public static final Set < Display > DISPLAY_SET370 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 371 instance. */
    public static final Set < Display > DISPLAY_SET371 = new TreeSet < Display >(asList(new Display[] {ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 372 instance. */
    public static final Set < Display > DISPLAY_SET372 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 373 instance. */
    public static final Set < Display > DISPLAY_SET373 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 374 instance. */
    public static final Set < Display > DISPLAY_SET374 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 375 instance. */
    public static final Set < Display > DISPLAY_SET375 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 376 instance. */
    public static final Set < Display > DISPLAY_SET376 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 377 instance. */
    public static final Set < Display > DISPLAY_SET377 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 378 instance. */
    public static final Set < Display > DISPLAY_SET378 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 379 instance. */
    public static final Set < Display > DISPLAY_SET379 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 380 instance. */
    public static final Set < Display > DISPLAY_SET380 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 381 instance. */
    public static final Set < Display > DISPLAY_SET381 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 382 instance. */
    public static final Set < Display > DISPLAY_SET382 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 383 instance. */
    public static final Set < Display > DISPLAY_SET383 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 384 instance. */
    public static final Set < Display > DISPLAY_SET384 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 385 instance. */
    public static final Set < Display > DISPLAY_SET385 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 386 instance. */
    public static final Set < Display > DISPLAY_SET386 = new TreeSet < Display >(asList(new Display[] {IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 387 instance. */
    public static final Set < Display > DISPLAY_SET387 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 388 instance. */
    public static final Set < Display > DISPLAY_SET388 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 389 instance. */
    public static final Set < Display > DISPLAY_SET389 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS}));

    /** Display set test 390 instance. */
    public static final Set < Display > DISPLAY_SET390 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES}));

    /** Display set test 391 instance. */
    public static final Set < Display > DISPLAY_SET391 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 392 instance. */
    public static final Set < Display > DISPLAY_SET392 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 393 instance. */
    public static final Set < Display > DISPLAY_SET393 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 394 instance. */
    public static final Set < Display > DISPLAY_SET394 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 395 instance. */
    public static final Set < Display > DISPLAY_SET395 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 396 instance. */
    public static final Set < Display > DISPLAY_SET396 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 397 instance. */
    public static final Set < Display > DISPLAY_SET397 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 398 instance. */
    public static final Set < Display > DISPLAY_SET398 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 399 instance. */
    public static final Set < Display > DISPLAY_SET399 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 400 instance. */
    public static final Set < Display > DISPLAY_SET400 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 401 instance. */
    public static final Set < Display > DISPLAY_SET401 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 402 instance. */
    public static final Set < Display > DISPLAY_SET402 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 403 instance. */
    public static final Set < Display > DISPLAY_SET403 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 404 instance. */
    public static final Set < Display > DISPLAY_SET404 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 405 instance. */
    public static final Set < Display > DISPLAY_SET405 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 406 instance. */
    public static final Set < Display > DISPLAY_SET406 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 407 instance. */
    public static final Set < Display > DISPLAY_SET407 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 408 instance. */
    public static final Set < Display > DISPLAY_SET408 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 409 instance. */
    public static final Set < Display > DISPLAY_SET409 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 410 instance. */
    public static final Set < Display > DISPLAY_SET410 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 411 instance. */
    public static final Set < Display > DISPLAY_SET411 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 412 instance. */
    public static final Set < Display > DISPLAY_SET412 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 413 instance. */
    public static final Set < Display > DISPLAY_SET413 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 414 instance. */
    public static final Set < Display > DISPLAY_SET414 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 415 instance. */
    public static final Set < Display > DISPLAY_SET415 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 416 instance. */
    public static final Set < Display > DISPLAY_SET416 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 417 instance. */
    public static final Set < Display > DISPLAY_SET417 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 418 instance. */
    public static final Set < Display > DISPLAY_SET418 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 419 instance. */
    public static final Set < Display > DISPLAY_SET419 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 420 instance. */
    public static final Set < Display > DISPLAY_SET420 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 421 instance. */
    public static final Set < Display > DISPLAY_SET421 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 422 instance. */
    public static final Set < Display > DISPLAY_SET422 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 423 instance. */
    public static final Set < Display > DISPLAY_SET423 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 424 instance. */
    public static final Set < Display > DISPLAY_SET424 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 425 instance. */
    public static final Set < Display > DISPLAY_SET425 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 426 instance. */
    public static final Set < Display > DISPLAY_SET426 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 427 instance. */
    public static final Set < Display > DISPLAY_SET427 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 428 instance. */
    public static final Set < Display > DISPLAY_SET428 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 429 instance. */
    public static final Set < Display > DISPLAY_SET429 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 430 instance. */
    public static final Set < Display > DISPLAY_SET430 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 431 instance. */
    public static final Set < Display > DISPLAY_SET431 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 432 instance. */
    public static final Set < Display > DISPLAY_SET432 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 433 instance. */
    public static final Set < Display > DISPLAY_SET433 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 434 instance. */
    public static final Set < Display > DISPLAY_SET434 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 435 instance. */
    public static final Set < Display > DISPLAY_SET435 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 436 instance. */
    public static final Set < Display > DISPLAY_SET436 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 437 instance. */
    public static final Set < Display > DISPLAY_SET437 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 438 instance. */
    public static final Set < Display > DISPLAY_SET438 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 439 instance. */
    public static final Set < Display > DISPLAY_SET439 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 440 instance. */
    public static final Set < Display > DISPLAY_SET440 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 441 instance. */
    public static final Set < Display > DISPLAY_SET441 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 442 instance. */
    public static final Set < Display > DISPLAY_SET442 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 443 instance. */
    public static final Set < Display > DISPLAY_SET443 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 444 instance. */
    public static final Set < Display > DISPLAY_SET444 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 445 instance. */
    public static final Set < Display > DISPLAY_SET445 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 446 instance. */
    public static final Set < Display > DISPLAY_SET446 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 447 instance. */
    public static final Set < Display > DISPLAY_SET447 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 448 instance. */
    public static final Set < Display > DISPLAY_SET448 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 449 instance. */
    public static final Set < Display > DISPLAY_SET449 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 450 instance. */
    public static final Set < Display > DISPLAY_SET450 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 451 instance. */
    public static final Set < Display > DISPLAY_SET451 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 452 instance. */
    public static final Set < Display > DISPLAY_SET452 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 453 instance. */
    public static final Set < Display > DISPLAY_SET453 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 454 instance. */
    public static final Set < Display > DISPLAY_SET454 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 455 instance. */
    public static final Set < Display > DISPLAY_SET455 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 456 instance. */
    public static final Set < Display > DISPLAY_SET456 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 457 instance. */
    public static final Set < Display > DISPLAY_SET457 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 458 instance. */
    public static final Set < Display > DISPLAY_SET458 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 459 instance. */
    public static final Set < Display > DISPLAY_SET459 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 460 instance. */
    public static final Set < Display > DISPLAY_SET460 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 461 instance. */
    public static final Set < Display > DISPLAY_SET461 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 462 instance. */
    public static final Set < Display > DISPLAY_SET462 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 463 instance. */
    public static final Set < Display > DISPLAY_SET463 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 464 instance. */
    public static final Set < Display > DISPLAY_SET464 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 465 instance. */
    public static final Set < Display > DISPLAY_SET465 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 466 instance. */
    public static final Set < Display > DISPLAY_SET466 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 467 instance. */
    public static final Set < Display > DISPLAY_SET467 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 468 instance. */
    public static final Set < Display > DISPLAY_SET468 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 469 instance. */
    public static final Set < Display > DISPLAY_SET469 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 470 instance. */
    public static final Set < Display > DISPLAY_SET470 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 471 instance. */
    public static final Set < Display > DISPLAY_SET471 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 472 instance. */
    public static final Set < Display > DISPLAY_SET472 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 473 instance. */
    public static final Set < Display > DISPLAY_SET473 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 474 instance. */
    public static final Set < Display > DISPLAY_SET474 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 475 instance. */
    public static final Set < Display > DISPLAY_SET475 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 476 instance. */
    public static final Set < Display > DISPLAY_SET476 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 477 instance. */
    public static final Set < Display > DISPLAY_SET477 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 478 instance. */
    public static final Set < Display > DISPLAY_SET478 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 479 instance. */
    public static final Set < Display > DISPLAY_SET479 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 480 instance. */
    public static final Set < Display > DISPLAY_SET480 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 481 instance. */
    public static final Set < Display > DISPLAY_SET481 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 482 instance. */
    public static final Set < Display > DISPLAY_SET482 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 483 instance. */
    public static final Set < Display > DISPLAY_SET483 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 484 instance. */
    public static final Set < Display > DISPLAY_SET484 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 485 instance. */
    public static final Set < Display > DISPLAY_SET485 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 486 instance. */
    public static final Set < Display > DISPLAY_SET486 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 487 instance. */
    public static final Set < Display > DISPLAY_SET487 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 488 instance. */
    public static final Set < Display > DISPLAY_SET488 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 489 instance. */
    public static final Set < Display > DISPLAY_SET489 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 490 instance. */
    public static final Set < Display > DISPLAY_SET490 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 491 instance. */
    public static final Set < Display > DISPLAY_SET491 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 492 instance. */
    public static final Set < Display > DISPLAY_SET492 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 493 instance. */
    public static final Set < Display > DISPLAY_SET493 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 494 instance. */
    public static final Set < Display > DISPLAY_SET494 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 495 instance. */
    public static final Set < Display > DISPLAY_SET495 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 496 instance. */
    public static final Set < Display > DISPLAY_SET496 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 497 instance. */
    public static final Set < Display > DISPLAY_SET497 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 498 instance. */
    public static final Set < Display > DISPLAY_SET498 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 499 instance. */
    public static final Set < Display > DISPLAY_SET499 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 500 instance. */
    public static final Set < Display > DISPLAY_SET500 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 501 instance. */
    public static final Set < Display > DISPLAY_SET501 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 502 instance. */
    public static final Set < Display > DISPLAY_SET502 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 503 instance. */
    public static final Set < Display > DISPLAY_SET503 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 504 instance. */
    public static final Set < Display > DISPLAY_SET504 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 505 instance. */
    public static final Set < Display > DISPLAY_SET505 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 506 instance. */
    public static final Set < Display > DISPLAY_SET506 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 507 instance. */
    public static final Set < Display > DISPLAY_SET507 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 508 instance. */
    public static final Set < Display > DISPLAY_SET508 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 509 instance. */
    public static final Set < Display > DISPLAY_SET509 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 510 instance. */
    public static final Set < Display > DISPLAY_SET510 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 511 instance. */
    public static final Set < Display > DISPLAY_SET511 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 512 instance. */
    public static final Set < Display > DISPLAY_SET512 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 513 instance. */
    public static final Set < Display > DISPLAY_SET513 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 514 instance. */
    public static final Set < Display > DISPLAY_SET514 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 515 instance. */
    public static final Set < Display > DISPLAY_SET515 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 516 instance. */
    public static final Set < Display > DISPLAY_SET516 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 517 instance. */
    public static final Set < Display > DISPLAY_SET517 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 518 instance. */
    public static final Set < Display > DISPLAY_SET518 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 519 instance. */
    public static final Set < Display > DISPLAY_SET519 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 520 instance. */
    public static final Set < Display > DISPLAY_SET520 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 521 instance. */
    public static final Set < Display > DISPLAY_SET521 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 522 instance. */
    public static final Set < Display > DISPLAY_SET522 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 523 instance. */
    public static final Set < Display > DISPLAY_SET523 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 524 instance. */
    public static final Set < Display > DISPLAY_SET524 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 525 instance. */
    public static final Set < Display > DISPLAY_SET525 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 526 instance. */
    public static final Set < Display > DISPLAY_SET526 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 527 instance. */
    public static final Set < Display > DISPLAY_SET527 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 528 instance. */
    public static final Set < Display > DISPLAY_SET528 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 529 instance. */
    public static final Set < Display > DISPLAY_SET529 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 530 instance. */
    public static final Set < Display > DISPLAY_SET530 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 531 instance. */
    public static final Set < Display > DISPLAY_SET531 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 532 instance. */
    public static final Set < Display > DISPLAY_SET532 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 533 instance. */
    public static final Set < Display > DISPLAY_SET533 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 534 instance. */
    public static final Set < Display > DISPLAY_SET534 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 535 instance. */
    public static final Set < Display > DISPLAY_SET535 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 536 instance. */
    public static final Set < Display > DISPLAY_SET536 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 537 instance. */
    public static final Set < Display > DISPLAY_SET537 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 538 instance. */
    public static final Set < Display > DISPLAY_SET538 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 539 instance. */
    public static final Set < Display > DISPLAY_SET539 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 540 instance. */
    public static final Set < Display > DISPLAY_SET540 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 541 instance. */
    public static final Set < Display > DISPLAY_SET541 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 542 instance. */
    public static final Set < Display > DISPLAY_SET542 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 543 instance. */
    public static final Set < Display > DISPLAY_SET543 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 544 instance. */
    public static final Set < Display > DISPLAY_SET544 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 545 instance. */
    public static final Set < Display > DISPLAY_SET545 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 546 instance. */
    public static final Set < Display > DISPLAY_SET546 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 547 instance. */
    public static final Set < Display > DISPLAY_SET547 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 548 instance. */
    public static final Set < Display > DISPLAY_SET548 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 549 instance. */
    public static final Set < Display > DISPLAY_SET549 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 550 instance. */
    public static final Set < Display > DISPLAY_SET550 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 551 instance. */
    public static final Set < Display > DISPLAY_SET551 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 552 instance. */
    public static final Set < Display > DISPLAY_SET552 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 553 instance. */
    public static final Set < Display > DISPLAY_SET553 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 554 instance. */
    public static final Set < Display > DISPLAY_SET554 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 555 instance. */
    public static final Set < Display > DISPLAY_SET555 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 556 instance. */
    public static final Set < Display > DISPLAY_SET556 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 557 instance. */
    public static final Set < Display > DISPLAY_SET557 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 558 instance. */
    public static final Set < Display > DISPLAY_SET558 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 559 instance. */
    public static final Set < Display > DISPLAY_SET559 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 560 instance. */
    public static final Set < Display > DISPLAY_SET560 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 561 instance. */
    public static final Set < Display > DISPLAY_SET561 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 562 instance. */
    public static final Set < Display > DISPLAY_SET562 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 563 instance. */
    public static final Set < Display > DISPLAY_SET563 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 564 instance. */
    public static final Set < Display > DISPLAY_SET564 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 565 instance. */
    public static final Set < Display > DISPLAY_SET565 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 566 instance. */
    public static final Set < Display > DISPLAY_SET566 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 567 instance. */
    public static final Set < Display > DISPLAY_SET567 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 568 instance. */
    public static final Set < Display > DISPLAY_SET568 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 569 instance. */
    public static final Set < Display > DISPLAY_SET569 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 570 instance. */
    public static final Set < Display > DISPLAY_SET570 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 571 instance. */
    public static final Set < Display > DISPLAY_SET571 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 572 instance. */
    public static final Set < Display > DISPLAY_SET572 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 573 instance. */
    public static final Set < Display > DISPLAY_SET573 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 574 instance. */
    public static final Set < Display > DISPLAY_SET574 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 575 instance. */
    public static final Set < Display > DISPLAY_SET575 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 576 instance. */
    public static final Set < Display > DISPLAY_SET576 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 577 instance. */
    public static final Set < Display > DISPLAY_SET577 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 578 instance. */
    public static final Set < Display > DISPLAY_SET578 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 579 instance. */
    public static final Set < Display > DISPLAY_SET579 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 580 instance. */
    public static final Set < Display > DISPLAY_SET580 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 581 instance. */
    public static final Set < Display > DISPLAY_SET581 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 582 instance. */
    public static final Set < Display > DISPLAY_SET582 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 583 instance. */
    public static final Set < Display > DISPLAY_SET583 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 584 instance. */
    public static final Set < Display > DISPLAY_SET584 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 585 instance. */
    public static final Set < Display > DISPLAY_SET585 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 586 instance. */
    public static final Set < Display > DISPLAY_SET586 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 587 instance. */
    public static final Set < Display > DISPLAY_SET587 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 588 instance. */
    public static final Set < Display > DISPLAY_SET588 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 589 instance. */
    public static final Set < Display > DISPLAY_SET589 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 590 instance. */
    public static final Set < Display > DISPLAY_SET590 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 591 instance. */
    public static final Set < Display > DISPLAY_SET591 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 592 instance. */
    public static final Set < Display > DISPLAY_SET592 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 593 instance. */
    public static final Set < Display > DISPLAY_SET593 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 594 instance. */
    public static final Set < Display > DISPLAY_SET594 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 595 instance. */
    public static final Set < Display > DISPLAY_SET595 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 596 instance. */
    public static final Set < Display > DISPLAY_SET596 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 597 instance. */
    public static final Set < Display > DISPLAY_SET597 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 598 instance. */
    public static final Set < Display > DISPLAY_SET598 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 599 instance. */
    public static final Set < Display > DISPLAY_SET599 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 600 instance. */
    public static final Set < Display > DISPLAY_SET600 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 601 instance. */
    public static final Set < Display > DISPLAY_SET601 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 602 instance. */
    public static final Set < Display > DISPLAY_SET602 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 603 instance. */
    public static final Set < Display > DISPLAY_SET603 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 604 instance. */
    public static final Set < Display > DISPLAY_SET604 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 605 instance. */
    public static final Set < Display > DISPLAY_SET605 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 606 instance. */
    public static final Set < Display > DISPLAY_SET606 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 607 instance. */
    public static final Set < Display > DISPLAY_SET607 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 608 instance. */
    public static final Set < Display > DISPLAY_SET608 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 609 instance. */
    public static final Set < Display > DISPLAY_SET609 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 610 instance. */
    public static final Set < Display > DISPLAY_SET610 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 611 instance. */
    public static final Set < Display > DISPLAY_SET611 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 612 instance. */
    public static final Set < Display > DISPLAY_SET612 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 613 instance. */
    public static final Set < Display > DISPLAY_SET613 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 614 instance. */
    public static final Set < Display > DISPLAY_SET614 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 615 instance. */
    public static final Set < Display > DISPLAY_SET615 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 616 instance. */
    public static final Set < Display > DISPLAY_SET616 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 617 instance. */
    public static final Set < Display > DISPLAY_SET617 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 618 instance. */
    public static final Set < Display > DISPLAY_SET618 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 619 instance. */
    public static final Set < Display > DISPLAY_SET619 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 620 instance. */
    public static final Set < Display > DISPLAY_SET620 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 621 instance. */
    public static final Set < Display > DISPLAY_SET621 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 622 instance. */
    public static final Set < Display > DISPLAY_SET622 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 623 instance. */
    public static final Set < Display > DISPLAY_SET623 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 624 instance. */
    public static final Set < Display > DISPLAY_SET624 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 625 instance. */
    public static final Set < Display > DISPLAY_SET625 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 626 instance. */
    public static final Set < Display > DISPLAY_SET626 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 627 instance. */
    public static final Set < Display > DISPLAY_SET627 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 628 instance. */
    public static final Set < Display > DISPLAY_SET628 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 629 instance. */
    public static final Set < Display > DISPLAY_SET629 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 630 instance. */
    public static final Set < Display > DISPLAY_SET630 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 631 instance. */
    public static final Set < Display > DISPLAY_SET631 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 632 instance. */
    public static final Set < Display > DISPLAY_SET632 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 633 instance. */
    public static final Set < Display > DISPLAY_SET633 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 634 instance. */
    public static final Set < Display > DISPLAY_SET634 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 635 instance. */
    public static final Set < Display > DISPLAY_SET635 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 636 instance. */
    public static final Set < Display > DISPLAY_SET636 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 637 instance. */
    public static final Set < Display > DISPLAY_SET637 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 638 instance. */
    public static final Set < Display > DISPLAY_SET638 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 639 instance. */
    public static final Set < Display > DISPLAY_SET639 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 640 instance. */
    public static final Set < Display > DISPLAY_SET640 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 641 instance. */
    public static final Set < Display > DISPLAY_SET641 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 642 instance. */
    public static final Set < Display > DISPLAY_SET642 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 643 instance. */
    public static final Set < Display > DISPLAY_SET643 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 644 instance. */
    public static final Set < Display > DISPLAY_SET644 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 645 instance. */
    public static final Set < Display > DISPLAY_SET645 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 646 instance. */
    public static final Set < Display > DISPLAY_SET646 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 647 instance. */
    public static final Set < Display > DISPLAY_SET647 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 648 instance. */
    public static final Set < Display > DISPLAY_SET648 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 649 instance. */
    public static final Set < Display > DISPLAY_SET649 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 650 instance. */
    public static final Set < Display > DISPLAY_SET650 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 651 instance. */
    public static final Set < Display > DISPLAY_SET651 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 652 instance. */
    public static final Set < Display > DISPLAY_SET652 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 653 instance. */
    public static final Set < Display > DISPLAY_SET653 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 654 instance. */
    public static final Set < Display > DISPLAY_SET654 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 655 instance. */
    public static final Set < Display > DISPLAY_SET655 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 656 instance. */
    public static final Set < Display > DISPLAY_SET656 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 657 instance. */
    public static final Set < Display > DISPLAY_SET657 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 658 instance. */
    public static final Set < Display > DISPLAY_SET658 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 659 instance. */
    public static final Set < Display > DISPLAY_SET659 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 660 instance. */
    public static final Set < Display > DISPLAY_SET660 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 661 instance. */
    public static final Set < Display > DISPLAY_SET661 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 662 instance. */
    public static final Set < Display > DISPLAY_SET662 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 663 instance. */
    public static final Set < Display > DISPLAY_SET663 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 664 instance. */
    public static final Set < Display > DISPLAY_SET664 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 665 instance. */
    public static final Set < Display > DISPLAY_SET665 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 666 instance. */
    public static final Set < Display > DISPLAY_SET666 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 667 instance. */
    public static final Set < Display > DISPLAY_SET667 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 668 instance. */
    public static final Set < Display > DISPLAY_SET668 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 669 instance. */
    public static final Set < Display > DISPLAY_SET669 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 670 instance. */
    public static final Set < Display > DISPLAY_SET670 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 671 instance. */
    public static final Set < Display > DISPLAY_SET671 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 672 instance. */
    public static final Set < Display > DISPLAY_SET672 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 673 instance. */
    public static final Set < Display > DISPLAY_SET673 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 674 instance. */
    public static final Set < Display > DISPLAY_SET674 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 675 instance. */
    public static final Set < Display > DISPLAY_SET675 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 676 instance. */
    public static final Set < Display > DISPLAY_SET676 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 677 instance. */
    public static final Set < Display > DISPLAY_SET677 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 678 instance. */
    public static final Set < Display > DISPLAY_SET678 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 679 instance. */
    public static final Set < Display > DISPLAY_SET679 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 680 instance. */
    public static final Set < Display > DISPLAY_SET680 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 681 instance. */
    public static final Set < Display > DISPLAY_SET681 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 682 instance. */
    public static final Set < Display > DISPLAY_SET682 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 683 instance. */
    public static final Set < Display > DISPLAY_SET683 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 684 instance. */
    public static final Set < Display > DISPLAY_SET684 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 685 instance. */
    public static final Set < Display > DISPLAY_SET685 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 686 instance. */
    public static final Set < Display > DISPLAY_SET686 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 687 instance. */
    public static final Set < Display > DISPLAY_SET687 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 688 instance. */
    public static final Set < Display > DISPLAY_SET688 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 689 instance. */
    public static final Set < Display > DISPLAY_SET689 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 690 instance. */
    public static final Set < Display > DISPLAY_SET690 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 691 instance. */
    public static final Set < Display > DISPLAY_SET691 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 692 instance. */
    public static final Set < Display > DISPLAY_SET692 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 693 instance. */
    public static final Set < Display > DISPLAY_SET693 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 694 instance. */
    public static final Set < Display > DISPLAY_SET694 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 695 instance. */
    public static final Set < Display > DISPLAY_SET695 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 696 instance. */
    public static final Set < Display > DISPLAY_SET696 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 697 instance. */
    public static final Set < Display > DISPLAY_SET697 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 698 instance. */
    public static final Set < Display > DISPLAY_SET698 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 699 instance. */
    public static final Set < Display > DISPLAY_SET699 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 700 instance. */
    public static final Set < Display > DISPLAY_SET700 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 701 instance. */
    public static final Set < Display > DISPLAY_SET701 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 702 instance. */
    public static final Set < Display > DISPLAY_SET702 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 703 instance. */
    public static final Set < Display > DISPLAY_SET703 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 704 instance. */
    public static final Set < Display > DISPLAY_SET704 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 705 instance. */
    public static final Set < Display > DISPLAY_SET705 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 706 instance. */
    public static final Set < Display > DISPLAY_SET706 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 707 instance. */
    public static final Set < Display > DISPLAY_SET707 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 708 instance. */
    public static final Set < Display > DISPLAY_SET708 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 709 instance. */
    public static final Set < Display > DISPLAY_SET709 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 710 instance. */
    public static final Set < Display > DISPLAY_SET710 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 711 instance. */
    public static final Set < Display > DISPLAY_SET711 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 712 instance. */
    public static final Set < Display > DISPLAY_SET712 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 713 instance. */
    public static final Set < Display > DISPLAY_SET713 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 714 instance. */
    public static final Set < Display > DISPLAY_SET714 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 715 instance. */
    public static final Set < Display > DISPLAY_SET715 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 716 instance. */
    public static final Set < Display > DISPLAY_SET716 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 717 instance. */
    public static final Set < Display > DISPLAY_SET717 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 718 instance. */
    public static final Set < Display > DISPLAY_SET718 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 719 instance. */
    public static final Set < Display > DISPLAY_SET719 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 720 instance. */
    public static final Set < Display > DISPLAY_SET720 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 721 instance. */
    public static final Set < Display > DISPLAY_SET721 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 722 instance. */
    public static final Set < Display > DISPLAY_SET722 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 723 instance. */
    public static final Set < Display > DISPLAY_SET723 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 724 instance. */
    public static final Set < Display > DISPLAY_SET724 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 725 instance. */
    public static final Set < Display > DISPLAY_SET725 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 726 instance. */
    public static final Set < Display > DISPLAY_SET726 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 727 instance. */
    public static final Set < Display > DISPLAY_SET727 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 728 instance. */
    public static final Set < Display > DISPLAY_SET728 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 729 instance. */
    public static final Set < Display > DISPLAY_SET729 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 730 instance. */
    public static final Set < Display > DISPLAY_SET730 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 731 instance. */
    public static final Set < Display > DISPLAY_SET731 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 732 instance. */
    public static final Set < Display > DISPLAY_SET732 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 733 instance. */
    public static final Set < Display > DISPLAY_SET733 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 734 instance. */
    public static final Set < Display > DISPLAY_SET734 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 735 instance. */
    public static final Set < Display > DISPLAY_SET735 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 736 instance. */
    public static final Set < Display > DISPLAY_SET736 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 737 instance. */
    public static final Set < Display > DISPLAY_SET737 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 738 instance. */
    public static final Set < Display > DISPLAY_SET738 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 739 instance. */
    public static final Set < Display > DISPLAY_SET739 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 740 instance. */
    public static final Set < Display > DISPLAY_SET740 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 741 instance. */
    public static final Set < Display > DISPLAY_SET741 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 742 instance. */
    public static final Set < Display > DISPLAY_SET742 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 743 instance. */
    public static final Set < Display > DISPLAY_SET743 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 744 instance. */
    public static final Set < Display > DISPLAY_SET744 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 745 instance. */
    public static final Set < Display > DISPLAY_SET745 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 746 instance. */
    public static final Set < Display > DISPLAY_SET746 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 747 instance. */
    public static final Set < Display > DISPLAY_SET747 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 748 instance. */
    public static final Set < Display > DISPLAY_SET748 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 749 instance. */
    public static final Set < Display > DISPLAY_SET749 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 750 instance. */
    public static final Set < Display > DISPLAY_SET750 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 751 instance. */
    public static final Set < Display > DISPLAY_SET751 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 752 instance. */
    public static final Set < Display > DISPLAY_SET752 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 753 instance. */
    public static final Set < Display > DISPLAY_SET753 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 754 instance. */
    public static final Set < Display > DISPLAY_SET754 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 755 instance. */
    public static final Set < Display > DISPLAY_SET755 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 756 instance. */
    public static final Set < Display > DISPLAY_SET756 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 757 instance. */
    public static final Set < Display > DISPLAY_SET757 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 758 instance. */
    public static final Set < Display > DISPLAY_SET758 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 759 instance. */
    public static final Set < Display > DISPLAY_SET759 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 760 instance. */
    public static final Set < Display > DISPLAY_SET760 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 761 instance. */
    public static final Set < Display > DISPLAY_SET761 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 762 instance. */
    public static final Set < Display > DISPLAY_SET762 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 763 instance. */
    public static final Set < Display > DISPLAY_SET763 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 764 instance. */
    public static final Set < Display > DISPLAY_SET764 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 765 instance. */
    public static final Set < Display > DISPLAY_SET765 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 766 instance. */
    public static final Set < Display > DISPLAY_SET766 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 767 instance. */
    public static final Set < Display > DISPLAY_SET767 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 768 instance. */
    public static final Set < Display > DISPLAY_SET768 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 769 instance. */
    public static final Set < Display > DISPLAY_SET769 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 770 instance. */
    public static final Set < Display > DISPLAY_SET770 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 771 instance. */
    public static final Set < Display > DISPLAY_SET771 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 772 instance. */
    public static final Set < Display > DISPLAY_SET772 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 773 instance. */
    public static final Set < Display > DISPLAY_SET773 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 774 instance. */
    public static final Set < Display > DISPLAY_SET774 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 775 instance. */
    public static final Set < Display > DISPLAY_SET775 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 776 instance. */
    public static final Set < Display > DISPLAY_SET776 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 777 instance. */
    public static final Set < Display > DISPLAY_SET777 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 778 instance. */
    public static final Set < Display > DISPLAY_SET778 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 779 instance. */
    public static final Set < Display > DISPLAY_SET779 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 780 instance. */
    public static final Set < Display > DISPLAY_SET780 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 781 instance. */
    public static final Set < Display > DISPLAY_SET781 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 782 instance. */
    public static final Set < Display > DISPLAY_SET782 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 783 instance. */
    public static final Set < Display > DISPLAY_SET783 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 784 instance. */
    public static final Set < Display > DISPLAY_SET784 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 785 instance. */
    public static final Set < Display > DISPLAY_SET785 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 786 instance. */
    public static final Set < Display > DISPLAY_SET786 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 787 instance. */
    public static final Set < Display > DISPLAY_SET787 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 788 instance. */
    public static final Set < Display > DISPLAY_SET788 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 789 instance. */
    public static final Set < Display > DISPLAY_SET789 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 790 instance. */
    public static final Set < Display > DISPLAY_SET790 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 791 instance. */
    public static final Set < Display > DISPLAY_SET791 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 792 instance. */
    public static final Set < Display > DISPLAY_SET792 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 793 instance. */
    public static final Set < Display > DISPLAY_SET793 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 794 instance. */
    public static final Set < Display > DISPLAY_SET794 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 795 instance. */
    public static final Set < Display > DISPLAY_SET795 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 796 instance. */
    public static final Set < Display > DISPLAY_SET796 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 797 instance. */
    public static final Set < Display > DISPLAY_SET797 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 798 instance. */
    public static final Set < Display > DISPLAY_SET798 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 799 instance. */
    public static final Set < Display > DISPLAY_SET799 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 800 instance. */
    public static final Set < Display > DISPLAY_SET800 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 801 instance. */
    public static final Set < Display > DISPLAY_SET801 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 802 instance. */
    public static final Set < Display > DISPLAY_SET802 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 803 instance. */
    public static final Set < Display > DISPLAY_SET803 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 804 instance. */
    public static final Set < Display > DISPLAY_SET804 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 805 instance. */
    public static final Set < Display > DISPLAY_SET805 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 806 instance. */
    public static final Set < Display > DISPLAY_SET806 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 807 instance. */
    public static final Set < Display > DISPLAY_SET807 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 808 instance. */
    public static final Set < Display > DISPLAY_SET808 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 809 instance. */
    public static final Set < Display > DISPLAY_SET809 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 810 instance. */
    public static final Set < Display > DISPLAY_SET810 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 811 instance. */
    public static final Set < Display > DISPLAY_SET811 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 812 instance. */
    public static final Set < Display > DISPLAY_SET812 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 813 instance. */
    public static final Set < Display > DISPLAY_SET813 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 814 instance. */
    public static final Set < Display > DISPLAY_SET814 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 815 instance. */
    public static final Set < Display > DISPLAY_SET815 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 816 instance. */
    public static final Set < Display > DISPLAY_SET816 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 817 instance. */
    public static final Set < Display > DISPLAY_SET817 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 818 instance. */
    public static final Set < Display > DISPLAY_SET818 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 819 instance. */
    public static final Set < Display > DISPLAY_SET819 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 820 instance. */
    public static final Set < Display > DISPLAY_SET820 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 821 instance. */
    public static final Set < Display > DISPLAY_SET821 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 822 instance. */
    public static final Set < Display > DISPLAY_SET822 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 823 instance. */
    public static final Set < Display > DISPLAY_SET823 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 824 instance. */
    public static final Set < Display > DISPLAY_SET824 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 825 instance. */
    public static final Set < Display > DISPLAY_SET825 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 826 instance. */
    public static final Set < Display > DISPLAY_SET826 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 827 instance. */
    public static final Set < Display > DISPLAY_SET827 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 828 instance. */
    public static final Set < Display > DISPLAY_SET828 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 829 instance. */
    public static final Set < Display > DISPLAY_SET829 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 830 instance. */
    public static final Set < Display > DISPLAY_SET830 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 831 instance. */
    public static final Set < Display > DISPLAY_SET831 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 832 instance. */
    public static final Set < Display > DISPLAY_SET832 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 833 instance. */
    public static final Set < Display > DISPLAY_SET833 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 834 instance. */
    public static final Set < Display > DISPLAY_SET834 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 835 instance. */
    public static final Set < Display > DISPLAY_SET835 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 836 instance. */
    public static final Set < Display > DISPLAY_SET836 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 837 instance. */
    public static final Set < Display > DISPLAY_SET837 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 838 instance. */
    public static final Set < Display > DISPLAY_SET838 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 839 instance. */
    public static final Set < Display > DISPLAY_SET839 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 840 instance. */
    public static final Set < Display > DISPLAY_SET840 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 841 instance. */
    public static final Set < Display > DISPLAY_SET841 = new TreeSet < Display >(asList(new Display[] {CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 842 instance. */
    public static final Set < Display > DISPLAY_SET842 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 843 instance. */
    public static final Set < Display > DISPLAY_SET843 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 844 instance. */
    public static final Set < Display > DISPLAY_SET844 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 845 instance. */
    public static final Set < Display > DISPLAY_SET845 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 846 instance. */
    public static final Set < Display > DISPLAY_SET846 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 847 instance. */
    public static final Set < Display > DISPLAY_SET847 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 848 instance. */
    public static final Set < Display > DISPLAY_SET848 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 849 instance. */
    public static final Set < Display > DISPLAY_SET849 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 850 instance. */
    public static final Set < Display > DISPLAY_SET850 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 851 instance. */
    public static final Set < Display > DISPLAY_SET851 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 852 instance. */
    public static final Set < Display > DISPLAY_SET852 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 853 instance. */
    public static final Set < Display > DISPLAY_SET853 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 854 instance. */
    public static final Set < Display > DISPLAY_SET854 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 855 instance. */
    public static final Set < Display > DISPLAY_SET855 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 856 instance. */
    public static final Set < Display > DISPLAY_SET856 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 857 instance. */
    public static final Set < Display > DISPLAY_SET857 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 858 instance. */
    public static final Set < Display > DISPLAY_SET858 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 859 instance. */
    public static final Set < Display > DISPLAY_SET859 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 860 instance. */
    public static final Set < Display > DISPLAY_SET860 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 861 instance. */
    public static final Set < Display > DISPLAY_SET861 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 862 instance. */
    public static final Set < Display > DISPLAY_SET862 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 863 instance. */
    public static final Set < Display > DISPLAY_SET863 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 864 instance. */
    public static final Set < Display > DISPLAY_SET864 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 865 instance. */
    public static final Set < Display > DISPLAY_SET865 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 866 instance. */
    public static final Set < Display > DISPLAY_SET866 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 867 instance. */
    public static final Set < Display > DISPLAY_SET867 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 868 instance. */
    public static final Set < Display > DISPLAY_SET868 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 869 instance. */
    public static final Set < Display > DISPLAY_SET869 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 870 instance. */
    public static final Set < Display > DISPLAY_SET870 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 871 instance. */
    public static final Set < Display > DISPLAY_SET871 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 872 instance. */
    public static final Set < Display > DISPLAY_SET872 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 873 instance. */
    public static final Set < Display > DISPLAY_SET873 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 874 instance. */
    public static final Set < Display > DISPLAY_SET874 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 875 instance. */
    public static final Set < Display > DISPLAY_SET875 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 876 instance. */
    public static final Set < Display > DISPLAY_SET876 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 877 instance. */
    public static final Set < Display > DISPLAY_SET877 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 878 instance. */
    public static final Set < Display > DISPLAY_SET878 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 879 instance. */
    public static final Set < Display > DISPLAY_SET879 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 880 instance. */
    public static final Set < Display > DISPLAY_SET880 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 881 instance. */
    public static final Set < Display > DISPLAY_SET881 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 882 instance. */
    public static final Set < Display > DISPLAY_SET882 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 883 instance. */
    public static final Set < Display > DISPLAY_SET883 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 884 instance. */
    public static final Set < Display > DISPLAY_SET884 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 885 instance. */
    public static final Set < Display > DISPLAY_SET885 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 886 instance. */
    public static final Set < Display > DISPLAY_SET886 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 887 instance. */
    public static final Set < Display > DISPLAY_SET887 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 888 instance. */
    public static final Set < Display > DISPLAY_SET888 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 889 instance. */
    public static final Set < Display > DISPLAY_SET889 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 890 instance. */
    public static final Set < Display > DISPLAY_SET890 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 891 instance. */
    public static final Set < Display > DISPLAY_SET891 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 892 instance. */
    public static final Set < Display > DISPLAY_SET892 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 893 instance. */
    public static final Set < Display > DISPLAY_SET893 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 894 instance. */
    public static final Set < Display > DISPLAY_SET894 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 895 instance. */
    public static final Set < Display > DISPLAY_SET895 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 896 instance. */
    public static final Set < Display > DISPLAY_SET896 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 897 instance. */
    public static final Set < Display > DISPLAY_SET897 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 898 instance. */
    public static final Set < Display > DISPLAY_SET898 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 899 instance. */
    public static final Set < Display > DISPLAY_SET899 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 900 instance. */
    public static final Set < Display > DISPLAY_SET900 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 901 instance. */
    public static final Set < Display > DISPLAY_SET901 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 902 instance. */
    public static final Set < Display > DISPLAY_SET902 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 903 instance. */
    public static final Set < Display > DISPLAY_SET903 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 904 instance. */
    public static final Set < Display > DISPLAY_SET904 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 905 instance. */
    public static final Set < Display > DISPLAY_SET905 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 906 instance. */
    public static final Set < Display > DISPLAY_SET906 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 907 instance. */
    public static final Set < Display > DISPLAY_SET907 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 908 instance. */
    public static final Set < Display > DISPLAY_SET908 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 909 instance. */
    public static final Set < Display > DISPLAY_SET909 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 910 instance. */
    public static final Set < Display > DISPLAY_SET910 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 911 instance. */
    public static final Set < Display > DISPLAY_SET911 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 912 instance. */
    public static final Set < Display > DISPLAY_SET912 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 913 instance. */
    public static final Set < Display > DISPLAY_SET913 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 914 instance. */
    public static final Set < Display > DISPLAY_SET914 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 915 instance. */
    public static final Set < Display > DISPLAY_SET915 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 916 instance. */
    public static final Set < Display > DISPLAY_SET916 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 917 instance. */
    public static final Set < Display > DISPLAY_SET917 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 918 instance. */
    public static final Set < Display > DISPLAY_SET918 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 919 instance. */
    public static final Set < Display > DISPLAY_SET919 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 920 instance. */
    public static final Set < Display > DISPLAY_SET920 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 921 instance. */
    public static final Set < Display > DISPLAY_SET921 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 922 instance. */
    public static final Set < Display > DISPLAY_SET922 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 923 instance. */
    public static final Set < Display > DISPLAY_SET923 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 924 instance. */
    public static final Set < Display > DISPLAY_SET924 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 925 instance. */
    public static final Set < Display > DISPLAY_SET925 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 926 instance. */
    public static final Set < Display > DISPLAY_SET926 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 927 instance. */
    public static final Set < Display > DISPLAY_SET927 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 928 instance. */
    public static final Set < Display > DISPLAY_SET928 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 929 instance. */
    public static final Set < Display > DISPLAY_SET929 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 930 instance. */
    public static final Set < Display > DISPLAY_SET930 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 931 instance. */
    public static final Set < Display > DISPLAY_SET931 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 932 instance. */
    public static final Set < Display > DISPLAY_SET932 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 933 instance. */
    public static final Set < Display > DISPLAY_SET933 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 934 instance. */
    public static final Set < Display > DISPLAY_SET934 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 935 instance. */
    public static final Set < Display > DISPLAY_SET935 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 936 instance. */
    public static final Set < Display > DISPLAY_SET936 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 937 instance. */
    public static final Set < Display > DISPLAY_SET937 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 938 instance. */
    public static final Set < Display > DISPLAY_SET938 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 939 instance. */
    public static final Set < Display > DISPLAY_SET939 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 940 instance. */
    public static final Set < Display > DISPLAY_SET940 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 941 instance. */
    public static final Set < Display > DISPLAY_SET941 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 942 instance. */
    public static final Set < Display > DISPLAY_SET942 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 943 instance. */
    public static final Set < Display > DISPLAY_SET943 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 944 instance. */
    public static final Set < Display > DISPLAY_SET944 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 945 instance. */
    public static final Set < Display > DISPLAY_SET945 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 946 instance. */
    public static final Set < Display > DISPLAY_SET946 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 947 instance. */
    public static final Set < Display > DISPLAY_SET947 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 948 instance. */
    public static final Set < Display > DISPLAY_SET948 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 949 instance. */
    public static final Set < Display > DISPLAY_SET949 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 950 instance. */
    public static final Set < Display > DISPLAY_SET950 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 951 instance. */
    public static final Set < Display > DISPLAY_SET951 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 952 instance. */
    public static final Set < Display > DISPLAY_SET952 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 953 instance. */
    public static final Set < Display > DISPLAY_SET953 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 954 instance. */
    public static final Set < Display > DISPLAY_SET954 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 955 instance. */
    public static final Set < Display > DISPLAY_SET955 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 956 instance. */
    public static final Set < Display > DISPLAY_SET956 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 957 instance. */
    public static final Set < Display > DISPLAY_SET957 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 958 instance. */
    public static final Set < Display > DISPLAY_SET958 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 959 instance. */
    public static final Set < Display > DISPLAY_SET959 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 960 instance. */
    public static final Set < Display > DISPLAY_SET960 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 961 instance. */
    public static final Set < Display > DISPLAY_SET961 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 962 instance. */
    public static final Set < Display > DISPLAY_SET962 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 963 instance. */
    public static final Set < Display > DISPLAY_SET963 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 964 instance. */
    public static final Set < Display > DISPLAY_SET964 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 965 instance. */
    public static final Set < Display > DISPLAY_SET965 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 966 instance. */
    public static final Set < Display > DISPLAY_SET966 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 967 instance. */
    public static final Set < Display > DISPLAY_SET967 = new TreeSet < Display >(asList(new Display[] {CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 968 instance. */
    public static final Set < Display > DISPLAY_SET968 = new TreeSet < Display >(asList(new Display[] {ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 969 instance. */
    public static final Set < Display > DISPLAY_SET969 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 970 instance. */
    public static final Set < Display > DISPLAY_SET970 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 971 instance. */
    public static final Set < Display > DISPLAY_SET971 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 972 instance. */
    public static final Set < Display > DISPLAY_SET972 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 973 instance. */
    public static final Set < Display > DISPLAY_SET973 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 974 instance. */
    public static final Set < Display > DISPLAY_SET974 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 975 instance. */
    public static final Set < Display > DISPLAY_SET975 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 976 instance. */
    public static final Set < Display > DISPLAY_SET976 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 977 instance. */
    public static final Set < Display > DISPLAY_SET977 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 978 instance. */
    public static final Set < Display > DISPLAY_SET978 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 979 instance. */
    public static final Set < Display > DISPLAY_SET979 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 980 instance. */
    public static final Set < Display > DISPLAY_SET980 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 981 instance. */
    public static final Set < Display > DISPLAY_SET981 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 982 instance. */
    public static final Set < Display > DISPLAY_SET982 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 983 instance. */
    public static final Set < Display > DISPLAY_SET983 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 984 instance. */
    public static final Set < Display > DISPLAY_SET984 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 985 instance. */
    public static final Set < Display > DISPLAY_SET985 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 986 instance. */
    public static final Set < Display > DISPLAY_SET986 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 987 instance. */
    public static final Set < Display > DISPLAY_SET987 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 988 instance. */
    public static final Set < Display > DISPLAY_SET988 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 989 instance. */
    public static final Set < Display > DISPLAY_SET989 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 990 instance. */
    public static final Set < Display > DISPLAY_SET990 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 991 instance. */
    public static final Set < Display > DISPLAY_SET991 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 992 instance. */
    public static final Set < Display > DISPLAY_SET992 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 993 instance. */
    public static final Set < Display > DISPLAY_SET993 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 994 instance. */
    public static final Set < Display > DISPLAY_SET994 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 995 instance. */
    public static final Set < Display > DISPLAY_SET995 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 996 instance. */
    public static final Set < Display > DISPLAY_SET996 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 997 instance. */
    public static final Set < Display > DISPLAY_SET997 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 998 instance. */
    public static final Set < Display > DISPLAY_SET998 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 999 instance. */
    public static final Set < Display > DISPLAY_SET999 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1000 instance. */
    public static final Set < Display > DISPLAY_SET1000 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1001 instance. */
    public static final Set < Display > DISPLAY_SET1001 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1002 instance. */
    public static final Set < Display > DISPLAY_SET1002 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1003 instance. */
    public static final Set < Display > DISPLAY_SET1003 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1004 instance. */
    public static final Set < Display > DISPLAY_SET1004 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1005 instance. */
    public static final Set < Display > DISPLAY_SET1005 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 1006 instance. */
    public static final Set < Display > DISPLAY_SET1006 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 1007 instance. */
    public static final Set < Display > DISPLAY_SET1007 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1008 instance. */
    public static final Set < Display > DISPLAY_SET1008 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1009 instance. */
    public static final Set < Display > DISPLAY_SET1009 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1010 instance. */
    public static final Set < Display > DISPLAY_SET1010 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1011 instance. */
    public static final Set < Display > DISPLAY_SET1011 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1012 instance. */
    public static final Set < Display > DISPLAY_SET1012 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1013 instance. */
    public static final Set < Display > DISPLAY_SET1013 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1014 instance. */
    public static final Set < Display > DISPLAY_SET1014 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 1015 instance. */
    public static final Set < Display > DISPLAY_SET1015 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 1016 instance. */
    public static final Set < Display > DISPLAY_SET1016 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1017 instance. */
    public static final Set < Display > DISPLAY_SET1017 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1018 instance. */
    public static final Set < Display > DISPLAY_SET1018 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1019 instance. */
    public static final Set < Display > DISPLAY_SET1019 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1020 instance. */
    public static final Set < Display > DISPLAY_SET1020 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1021 instance. */
    public static final Set < Display > DISPLAY_SET1021 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1022 instance. */
    public static final Set < Display > DISPLAY_SET1022 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1023 instance. */
    public static final Set < Display > DISPLAY_SET1023 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1024 instance. */
    public static final Set < Display > DISPLAY_SET1024 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.2.0
     */
    private PlantUMLDependencyDisplaySetTestConstants() {
        super();
    }
}
