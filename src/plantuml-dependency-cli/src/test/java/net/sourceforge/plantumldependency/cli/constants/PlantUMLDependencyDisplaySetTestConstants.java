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

package net.sourceforge.plantumldependency.cli.constants;

import static java.util.Arrays.asList;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.ANNOTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.Display.STATIC_IMPORTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.main.option.display.argument.Display;

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
    public static final Set < Display > DISPLAY_SET12 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES}));

    /** Display set test 13 instance. */
    public static final Set < Display > DISPLAY_SET13 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES}));

    /** Display set test 14 instance. */
    public static final Set < Display > DISPLAY_SET14 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS}));

    /** Display set test 15 instance. */
    public static final Set < Display > DISPLAY_SET15 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS}));

    /** Display set test 16 instance. */
    public static final Set < Display > DISPLAY_SET16 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS}));

    /** Display set test 17 instance. */
    public static final Set < Display > DISPLAY_SET17 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS}));

    /** Display set test 18 instance. */
    public static final Set < Display > DISPLAY_SET18 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            INTERFACES}));

    /** Display set test 19 instance. */
    public static final Set < Display > DISPLAY_SET19 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            NATIVE_METHODS}));

    /** Display set test 20 instance. */
    public static final Set < Display > DISPLAY_SET20 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            STATIC_IMPORTS}));

    /** Display set test 21 instance. */
    public static final Set < Display > DISPLAY_SET21 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES}));

    /** Display set test 22 instance. */
    public static final Set < Display > DISPLAY_SET22 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            ENUMS}));

    /** Display set test 23 instance. */
    public static final Set < Display > DISPLAY_SET23 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            EXTENSIONS}));

    /** Display set test 24 instance. */
    public static final Set < Display > DISPLAY_SET24 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            IMPLEMENTATIONS}));

    /** Display set test 25 instance. */
    public static final Set < Display > DISPLAY_SET25 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            IMPORTS}));

    /** Display set test 26 instance. */
    public static final Set < Display > DISPLAY_SET26 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            INTERFACES}));

    /** Display set test 27 instance. */
    public static final Set < Display > DISPLAY_SET27 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            NATIVE_METHODS}));

    /** Display set test 28 instance. */
    public static final Set < Display > DISPLAY_SET28 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            STATIC_IMPORTS}));

    /** Display set test 29 instance. */
    public static final Set < Display > DISPLAY_SET29 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS}));

    /** Display set test 30 instance. */
    public static final Set < Display > DISPLAY_SET30 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS}));

    /** Display set test 31 instance. */
    public static final Set < Display > DISPLAY_SET31 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS}));

    /** Display set test 32 instance. */
    public static final Set < Display > DISPLAY_SET32 = new TreeSet < Display >(
            asList(new Display[] {CLASSES, IMPORTS}));

    /** Display set test 33 instance. */
    public static final Set < Display > DISPLAY_SET33 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            INTERFACES}));

    /** Display set test 34 instance. */
    public static final Set < Display > DISPLAY_SET34 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            NATIVE_METHODS}));

    /** Display set test 35 instance. */
    public static final Set < Display > DISPLAY_SET35 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            STATIC_IMPORTS}));

    /** Display set test 36 instance. */
    public static final Set < Display > DISPLAY_SET36 = new TreeSet < Display >(
            asList(new Display[] {ENUMS, EXTENSIONS}));

    /** Display set test 37 instance. */
    public static final Set < Display > DISPLAY_SET37 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS}));

    /** Display set test 38 instance. */
    public static final Set < Display > DISPLAY_SET38 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS}));

    /** Display set test 39 instance. */
    public static final Set < Display > DISPLAY_SET39 = new TreeSet < Display >(
            asList(new Display[] {ENUMS, INTERFACES}));

    /** Display set test 40 instance. */
    public static final Set < Display > DISPLAY_SET40 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            NATIVE_METHODS}));

    /** Display set test 41 instance. */
    public static final Set < Display > DISPLAY_SET41 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            STATIC_IMPORTS}));

    /** Display set test 42 instance. */
    public static final Set < Display > DISPLAY_SET42 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS}));

    /** Display set test 43 instance. */
    public static final Set < Display > DISPLAY_SET43 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS}));

    /** Display set test 44 instance. */
    public static final Set < Display > DISPLAY_SET44 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            INTERFACES}));

    /** Display set test 45 instance. */
    public static final Set < Display > DISPLAY_SET45 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            NATIVE_METHODS}));

    /** Display set test 46 instance. */
    public static final Set < Display > DISPLAY_SET46 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            STATIC_IMPORTS}));

    /** Display set test 47 instance. */
    public static final Set < Display > DISPLAY_SET47 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS}));

    /** Display set test 48 instance. */
    public static final Set < Display > DISPLAY_SET48 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            INTERFACES}));

    /** Display set test 49 instance. */
    public static final Set < Display > DISPLAY_SET49 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            NATIVE_METHODS}));

    /** Display set test 50 instance. */
    public static final Set < Display > DISPLAY_SET50 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            STATIC_IMPORTS}));

    /** Display set test 51 instance. */
    public static final Set < Display > DISPLAY_SET51 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            INTERFACES}));

    /** Display set test 52 instance. */
    public static final Set < Display > DISPLAY_SET52 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            NATIVE_METHODS}));

    /** Display set test 53 instance. */
    public static final Set < Display > DISPLAY_SET53 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            STATIC_IMPORTS}));

    /** Display set test 54 instance. */
    public static final Set < Display > DISPLAY_SET54 = new TreeSet < Display >(asList(new Display[] {INTERFACES,
            NATIVE_METHODS}));

    /** Display set test 55 instance. */
    public static final Set < Display > DISPLAY_SET55 = new TreeSet < Display >(asList(new Display[] {INTERFACES,
            STATIC_IMPORTS}));

    /** Display set test 56 instance. */
    public static final Set < Display > DISPLAY_SET56 = new TreeSet < Display >(asList(new Display[] {NATIVE_METHODS,
            STATIC_IMPORTS}));

    /** Display set test 57 instance. */
    public static final Set < Display > DISPLAY_SET57 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES}));

    /** Display set test 58 instance. */
    public static final Set < Display > DISPLAY_SET58 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS}));

    /** Display set test 59 instance. */
    public static final Set < Display > DISPLAY_SET59 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS}));

    /** Display set test 60 instance. */
    public static final Set < Display > DISPLAY_SET60 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS}));

    /** Display set test 61 instance. */
    public static final Set < Display > DISPLAY_SET61 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS}));

    /** Display set test 62 instance. */
    public static final Set < Display > DISPLAY_SET62 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, INTERFACES}));

    /** Display set test 63 instance. */
    public static final Set < Display > DISPLAY_SET63 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, NATIVE_METHODS}));

    /** Display set test 64 instance. */
    public static final Set < Display > DISPLAY_SET64 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, STATIC_IMPORTS}));

    /** Display set test 65 instance. */
    public static final Set < Display > DISPLAY_SET65 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS}));

    /** Display set test 66 instance. */
    public static final Set < Display > DISPLAY_SET66 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS}));

    /** Display set test 67 instance. */
    public static final Set < Display > DISPLAY_SET67 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS}));

    /** Display set test 68 instance. */
    public static final Set < Display > DISPLAY_SET68 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS}));

    /** Display set test 69 instance. */
    public static final Set < Display > DISPLAY_SET69 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, INTERFACES}));

    /** Display set test 70 instance. */
    public static final Set < Display > DISPLAY_SET70 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, NATIVE_METHODS}));

    /** Display set test 71 instance. */
    public static final Set < Display > DISPLAY_SET71 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, STATIC_IMPORTS}));

    /** Display set test 72 instance. */
    public static final Set < Display > DISPLAY_SET72 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS}));

    /** Display set test 73 instance. */
    public static final Set < Display > DISPLAY_SET73 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS}));

    /** Display set test 74 instance. */
    public static final Set < Display > DISPLAY_SET74 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS}));

    /** Display set test 75 instance. */
    public static final Set < Display > DISPLAY_SET75 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, INTERFACES}));

    /** Display set test 76 instance. */
    public static final Set < Display > DISPLAY_SET76 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, NATIVE_METHODS}));

    /** Display set test 77 instance. */
    public static final Set < Display > DISPLAY_SET77 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, STATIC_IMPORTS}));

    /** Display set test 78 instance. */
    public static final Set < Display > DISPLAY_SET78 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 79 instance. */
    public static final Set < Display > DISPLAY_SET79 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS}));

    /** Display set test 80 instance. */
    public static final Set < Display > DISPLAY_SET80 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, INTERFACES}));

    /** Display set test 81 instance. */
    public static final Set < Display > DISPLAY_SET81 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 82 instance. */
    public static final Set < Display > DISPLAY_SET82 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 83 instance. */
    public static final Set < Display > DISPLAY_SET83 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 84 instance. */
    public static final Set < Display > DISPLAY_SET84 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 85 instance. */
    public static final Set < Display > DISPLAY_SET85 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 86 instance. */
    public static final Set < Display > DISPLAY_SET86 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 87 instance. */
    public static final Set < Display > DISPLAY_SET87 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, INTERFACES}));

    /** Display set test 88 instance. */
    public static final Set < Display > DISPLAY_SET88 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, NATIVE_METHODS}));

    /** Display set test 89 instance. */
    public static final Set < Display > DISPLAY_SET89 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, STATIC_IMPORTS}));

    /** Display set test 90 instance. */
    public static final Set < Display > DISPLAY_SET90 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 91 instance. */
    public static final Set < Display > DISPLAY_SET91 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 92 instance. */
    public static final Set < Display > DISPLAY_SET92 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 93 instance. */
    public static final Set < Display > DISPLAY_SET93 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, ENUMS}));

    /** Display set test 94 instance. */
    public static final Set < Display > DISPLAY_SET94 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, EXTENSIONS}));

    /** Display set test 95 instance. */
    public static final Set < Display > DISPLAY_SET95 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, IMPLEMENTATIONS}));

    /** Display set test 96 instance. */
    public static final Set < Display > DISPLAY_SET96 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, IMPORTS}));

    /** Display set test 97 instance. */
    public static final Set < Display > DISPLAY_SET97 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, INTERFACES}));

    /** Display set test 98 instance. */
    public static final Set < Display > DISPLAY_SET98 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, NATIVE_METHODS}));

    /** Display set test 99 instance. */
    public static final Set < Display > DISPLAY_SET99 = new TreeSet < Display >(asList(new Display[] {ABSTRACT_CLASSES,
            CLASSES, STATIC_IMPORTS}));

    /** Display set test 100 instance. */
    public static final Set < Display > DISPLAY_SET100 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 101 instance. */
    public static final Set < Display > DISPLAY_SET101 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 102 instance. */
    public static final Set < Display > DISPLAY_SET102 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS}));

    /** Display set test 103 instance. */
    public static final Set < Display > DISPLAY_SET103 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, INTERFACES}));

    /** Display set test 104 instance. */
    public static final Set < Display > DISPLAY_SET104 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 105 instance. */
    public static final Set < Display > DISPLAY_SET105 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 106 instance. */
    public static final Set < Display > DISPLAY_SET106 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 107 instance. */
    public static final Set < Display > DISPLAY_SET107 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 108 instance. */
    public static final Set < Display > DISPLAY_SET108 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 109 instance. */
    public static final Set < Display > DISPLAY_SET109 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 110 instance. */
    public static final Set < Display > DISPLAY_SET110 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 111 instance. */
    public static final Set < Display > DISPLAY_SET111 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 112 instance. */
    public static final Set < Display > DISPLAY_SET112 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 113 instance. */
    public static final Set < Display > DISPLAY_SET113 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 114 instance. */
    public static final Set < Display > DISPLAY_SET114 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 115 instance. */
    public static final Set < Display > DISPLAY_SET115 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 116 instance. */
    public static final Set < Display > DISPLAY_SET116 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 117 instance. */
    public static final Set < Display > DISPLAY_SET117 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 118 instance. */
    public static final Set < Display > DISPLAY_SET118 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 119 instance. */
    public static final Set < Display > DISPLAY_SET119 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 120 instance. */
    public static final Set < Display > DISPLAY_SET120 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 121 instance. */
    public static final Set < Display > DISPLAY_SET121 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS}));

    /** Display set test 122 instance. */
    public static final Set < Display > DISPLAY_SET122 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS}));

    /** Display set test 123 instance. */
    public static final Set < Display > DISPLAY_SET123 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS}));

    /** Display set test 124 instance. */
    public static final Set < Display > DISPLAY_SET124 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            INTERFACES}));

    /** Display set test 125 instance. */
    public static final Set < Display > DISPLAY_SET125 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            NATIVE_METHODS}));

    /** Display set test 126 instance. */
    public static final Set < Display > DISPLAY_SET126 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            STATIC_IMPORTS}));

    /** Display set test 127 instance. */
    public static final Set < Display > DISPLAY_SET127 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 128 instance. */
    public static final Set < Display > DISPLAY_SET128 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS}));

    /** Display set test 129 instance. */
    public static final Set < Display > DISPLAY_SET129 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, INTERFACES}));

    /** Display set test 130 instance. */
    public static final Set < Display > DISPLAY_SET130 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 131 instance. */
    public static final Set < Display > DISPLAY_SET131 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 132 instance. */
    public static final Set < Display > DISPLAY_SET132 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 133 instance. */
    public static final Set < Display > DISPLAY_SET133 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 134 instance. */
    public static final Set < Display > DISPLAY_SET134 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 135 instance. */
    public static final Set < Display > DISPLAY_SET135 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 136 instance. */
    public static final Set < Display > DISPLAY_SET136 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, INTERFACES}));

    /** Display set test 137 instance. */
    public static final Set < Display > DISPLAY_SET137 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, NATIVE_METHODS}));

    /** Display set test 138 instance. */
    public static final Set < Display > DISPLAY_SET138 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, STATIC_IMPORTS}));

    /** Display set test 139 instance. */
    public static final Set < Display > DISPLAY_SET139 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 140 instance. */
    public static final Set < Display > DISPLAY_SET140 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 141 instance. */
    public static final Set < Display > DISPLAY_SET141 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 142 instance. */
    public static final Set < Display > DISPLAY_SET142 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 143 instance. */
    public static final Set < Display > DISPLAY_SET143 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS}));

    /** Display set test 144 instance. */
    public static final Set < Display > DISPLAY_SET144 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, INTERFACES}));

    /** Display set test 145 instance. */
    public static final Set < Display > DISPLAY_SET145 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 146 instance. */
    public static final Set < Display > DISPLAY_SET146 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 147 instance. */
    public static final Set < Display > DISPLAY_SET147 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 148 instance. */
    public static final Set < Display > DISPLAY_SET148 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 149 instance. */
    public static final Set < Display > DISPLAY_SET149 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 150 instance. */
    public static final Set < Display > DISPLAY_SET150 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 151 instance. */
    public static final Set < Display > DISPLAY_SET151 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            INTERFACES}));

    /** Display set test 152 instance. */
    public static final Set < Display > DISPLAY_SET152 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            NATIVE_METHODS}));

    /** Display set test 153 instance. */
    public static final Set < Display > DISPLAY_SET153 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            STATIC_IMPORTS}));

    /** Display set test 154 instance. */
    public static final Set < Display > DISPLAY_SET154 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 155 instance. */
    public static final Set < Display > DISPLAY_SET155 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 156 instance. */
    public static final Set < Display > DISPLAY_SET156 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 157 instance. */
    public static final Set < Display > DISPLAY_SET157 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 158 instance. */
    public static final Set < Display > DISPLAY_SET158 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 159 instance. */
    public static final Set < Display > DISPLAY_SET159 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 160 instance. */
    public static final Set < Display > DISPLAY_SET160 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 161 instance. */
    public static final Set < Display > DISPLAY_SET161 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, INTERFACES}));

    /** Display set test 162 instance. */
    public static final Set < Display > DISPLAY_SET162 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, NATIVE_METHODS}));

    /** Display set test 163 instance. */
    public static final Set < Display > DISPLAY_SET163 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, STATIC_IMPORTS}));

    /** Display set test 164 instance. */
    public static final Set < Display > DISPLAY_SET164 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 165 instance. */
    public static final Set < Display > DISPLAY_SET165 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 166 instance. */
    public static final Set < Display > DISPLAY_SET166 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 167 instance. */
    public static final Set < Display > DISPLAY_SET167 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, INTERFACES}));

    /** Display set test 168 instance. */
    public static final Set < Display > DISPLAY_SET168 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, NATIVE_METHODS}));

    /** Display set test 169 instance. */
    public static final Set < Display > DISPLAY_SET169 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, STATIC_IMPORTS}));

    /** Display set test 170 instance. */
    public static final Set < Display > DISPLAY_SET170 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 171 instance. */
    public static final Set < Display > DISPLAY_SET171 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 172 instance. */
    public static final Set < Display > DISPLAY_SET172 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 173 instance. */
    public static final Set < Display > DISPLAY_SET173 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 174 instance. */
    public static final Set < Display > DISPLAY_SET174 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 175 instance. */
    public static final Set < Display > DISPLAY_SET175 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 176 instance. */
    public static final Set < Display > DISPLAY_SET176 = new TreeSet < Display >(asList(new Display[] {INTERFACES,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 177 instance. */
    public static final Set < Display > DISPLAY_SET177 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS}));

    /** Display set test 178 instance. */
    public static final Set < Display > DISPLAY_SET178 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS}));

    /** Display set test 179 instance. */
    public static final Set < Display > DISPLAY_SET179 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS}));

    /** Display set test 180 instance. */
    public static final Set < Display > DISPLAY_SET180 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS}));

    /** Display set test 181 instance. */
    public static final Set < Display > DISPLAY_SET181 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, INTERFACES}));

    /** Display set test 182 instance. */
    public static final Set < Display > DISPLAY_SET182 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS}));

    /** Display set test 183 instance. */
    public static final Set < Display > DISPLAY_SET183 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, STATIC_IMPORTS}));

    /** Display set test 184 instance. */
    public static final Set < Display > DISPLAY_SET184 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 185 instance. */
    public static final Set < Display > DISPLAY_SET185 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 186 instance. */
    public static final Set < Display > DISPLAY_SET186 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS}));

    /** Display set test 187 instance. */
    public static final Set < Display > DISPLAY_SET187 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, INTERFACES}));

    /** Display set test 188 instance. */
    public static final Set < Display > DISPLAY_SET188 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 189 instance. */
    public static final Set < Display > DISPLAY_SET189 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 190 instance. */
    public static final Set < Display > DISPLAY_SET190 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 191 instance. */
    public static final Set < Display > DISPLAY_SET191 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 192 instance. */
    public static final Set < Display > DISPLAY_SET192 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 193 instance. */
    public static final Set < Display > DISPLAY_SET193 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 194 instance. */
    public static final Set < Display > DISPLAY_SET194 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 195 instance. */
    public static final Set < Display > DISPLAY_SET195 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 196 instance. */
    public static final Set < Display > DISPLAY_SET196 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 197 instance. */
    public static final Set < Display > DISPLAY_SET197 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 198 instance. */
    public static final Set < Display > DISPLAY_SET198 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 199 instance. */
    public static final Set < Display > DISPLAY_SET199 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 200 instance. */
    public static final Set < Display > DISPLAY_SET200 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 201 instance. */
    public static final Set < Display > DISPLAY_SET201 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 202 instance. */
    public static final Set < Display > DISPLAY_SET202 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 203 instance. */
    public static final Set < Display > DISPLAY_SET203 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 204 instance. */
    public static final Set < Display > DISPLAY_SET204 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 205 instance. */
    public static final Set < Display > DISPLAY_SET205 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 206 instance. */
    public static final Set < Display > DISPLAY_SET206 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 207 instance. */
    public static final Set < Display > DISPLAY_SET207 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS}));

    /** Display set test 208 instance. */
    public static final Set < Display > DISPLAY_SET208 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, INTERFACES}));

    /** Display set test 209 instance. */
    public static final Set < Display > DISPLAY_SET209 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 210 instance. */
    public static final Set < Display > DISPLAY_SET210 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 211 instance. */
    public static final Set < Display > DISPLAY_SET211 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 212 instance. */
    public static final Set < Display > DISPLAY_SET212 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 213 instance. */
    public static final Set < Display > DISPLAY_SET213 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 214 instance. */
    public static final Set < Display > DISPLAY_SET214 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 215 instance. */
    public static final Set < Display > DISPLAY_SET215 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 216 instance. */
    public static final Set < Display > DISPLAY_SET216 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 217 instance. */
    public static final Set < Display > DISPLAY_SET217 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 218 instance. */
    public static final Set < Display > DISPLAY_SET218 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 219 instance. */
    public static final Set < Display > DISPLAY_SET219 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 220 instance. */
    public static final Set < Display > DISPLAY_SET220 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 221 instance. */
    public static final Set < Display > DISPLAY_SET221 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 222 instance. */
    public static final Set < Display > DISPLAY_SET222 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 223 instance. */
    public static final Set < Display > DISPLAY_SET223 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 224 instance. */
    public static final Set < Display > DISPLAY_SET224 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 225 instance. */
    public static final Set < Display > DISPLAY_SET225 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 226 instance. */
    public static final Set < Display > DISPLAY_SET226 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 227 instance. */
    public static final Set < Display > DISPLAY_SET227 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 228 instance. */
    public static final Set < Display > DISPLAY_SET228 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 229 instance. */
    public static final Set < Display > DISPLAY_SET229 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 230 instance. */
    public static final Set < Display > DISPLAY_SET230 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 231 instance. */
    public static final Set < Display > DISPLAY_SET231 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 232 instance. */
    public static final Set < Display > DISPLAY_SET232 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 233 instance. */
    public static final Set < Display > DISPLAY_SET233 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 234 instance. */
    public static final Set < Display > DISPLAY_SET234 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 235 instance. */
    public static final Set < Display > DISPLAY_SET235 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 236 instance. */
    public static final Set < Display > DISPLAY_SET236 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 237 instance. */
    public static final Set < Display > DISPLAY_SET237 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 238 instance. */
    public static final Set < Display > DISPLAY_SET238 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 239 instance. */
    public static final Set < Display > DISPLAY_SET239 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 240 instance. */
    public static final Set < Display > DISPLAY_SET240 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 241 instance. */
    public static final Set < Display > DISPLAY_SET241 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 242 instance. */
    public static final Set < Display > DISPLAY_SET242 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 243 instance. */
    public static final Set < Display > DISPLAY_SET243 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 244 instance. */
    public static final Set < Display > DISPLAY_SET244 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 245 instance. */
    public static final Set < Display > DISPLAY_SET245 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 246 instance. */
    public static final Set < Display > DISPLAY_SET246 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 247 instance. */
    public static final Set < Display > DISPLAY_SET247 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 248 instance. */
    public static final Set < Display > DISPLAY_SET248 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 249 instance. */
    public static final Set < Display > DISPLAY_SET249 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 250 instance. */
    public static final Set < Display > DISPLAY_SET250 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 251 instance. */
    public static final Set < Display > DISPLAY_SET251 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 252 instance. */
    public static final Set < Display > DISPLAY_SET252 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 253 instance. */
    public static final Set < Display > DISPLAY_SET253 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 254 instance. */
    public static final Set < Display > DISPLAY_SET254 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 255 instance. */
    public static final Set < Display > DISPLAY_SET255 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 256 instance. */
    public static final Set < Display > DISPLAY_SET256 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 257 instance. */
    public static final Set < Display > DISPLAY_SET257 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 258 instance. */
    public static final Set < Display > DISPLAY_SET258 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 259 instance. */
    public static final Set < Display > DISPLAY_SET259 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 260 instance. */
    public static final Set < Display > DISPLAY_SET260 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 261 instance. */
    public static final Set < Display > DISPLAY_SET261 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 262 instance. */
    public static final Set < Display > DISPLAY_SET262 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 263 instance. */
    public static final Set < Display > DISPLAY_SET263 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS}));

    /** Display set test 264 instance. */
    public static final Set < Display > DISPLAY_SET264 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES}));

    /** Display set test 265 instance. */
    public static final Set < Display > DISPLAY_SET265 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 266 instance. */
    public static final Set < Display > DISPLAY_SET266 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 267 instance. */
    public static final Set < Display > DISPLAY_SET267 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 268 instance. */
    public static final Set < Display > DISPLAY_SET268 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 269 instance. */
    public static final Set < Display > DISPLAY_SET269 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 270 instance. */
    public static final Set < Display > DISPLAY_SET270 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 271 instance. */
    public static final Set < Display > DISPLAY_SET271 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 272 instance. */
    public static final Set < Display > DISPLAY_SET272 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 273 instance. */
    public static final Set < Display > DISPLAY_SET273 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 274 instance. */
    public static final Set < Display > DISPLAY_SET274 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 275 instance. */
    public static final Set < Display > DISPLAY_SET275 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 276 instance. */
    public static final Set < Display > DISPLAY_SET276 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 277 instance. */
    public static final Set < Display > DISPLAY_SET277 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 278 instance. */
    public static final Set < Display > DISPLAY_SET278 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 279 instance. */
    public static final Set < Display > DISPLAY_SET279 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 280 instance. */
    public static final Set < Display > DISPLAY_SET280 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 281 instance. */
    public static final Set < Display > DISPLAY_SET281 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 282 instance. */
    public static final Set < Display > DISPLAY_SET282 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 283 instance. */
    public static final Set < Display > DISPLAY_SET283 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 284 instance. */
    public static final Set < Display > DISPLAY_SET284 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 285 instance. */
    public static final Set < Display > DISPLAY_SET285 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 286 instance. */
    public static final Set < Display > DISPLAY_SET286 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 287 instance. */
    public static final Set < Display > DISPLAY_SET287 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 288 instance. */
    public static final Set < Display > DISPLAY_SET288 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 289 instance. */
    public static final Set < Display > DISPLAY_SET289 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 290 instance. */
    public static final Set < Display > DISPLAY_SET290 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 291 instance. */
    public static final Set < Display > DISPLAY_SET291 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 292 instance. */
    public static final Set < Display > DISPLAY_SET292 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 293 instance. */
    public static final Set < Display > DISPLAY_SET293 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 294 instance. */
    public static final Set < Display > DISPLAY_SET294 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 295 instance. */
    public static final Set < Display > DISPLAY_SET295 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 296 instance. */
    public static final Set < Display > DISPLAY_SET296 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 297 instance. */
    public static final Set < Display > DISPLAY_SET297 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 298 instance. */
    public static final Set < Display > DISPLAY_SET298 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 299 instance. */
    public static final Set < Display > DISPLAY_SET299 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 300 instance. */
    public static final Set < Display > DISPLAY_SET300 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 301 instance. */
    public static final Set < Display > DISPLAY_SET301 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 302 instance. */
    public static final Set < Display > DISPLAY_SET302 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 303 instance. */
    public static final Set < Display > DISPLAY_SET303 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 304 instance. */
    public static final Set < Display > DISPLAY_SET304 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 305 instance. */
    public static final Set < Display > DISPLAY_SET305 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 306 instance. */
    public static final Set < Display > DISPLAY_SET306 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 307 instance. */
    public static final Set < Display > DISPLAY_SET307 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 308 instance. */
    public static final Set < Display > DISPLAY_SET308 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 309 instance. */
    public static final Set < Display > DISPLAY_SET309 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 310 instance. */
    public static final Set < Display > DISPLAY_SET310 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 311 instance. */
    public static final Set < Display > DISPLAY_SET311 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 312 instance. */
    public static final Set < Display > DISPLAY_SET312 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 313 instance. */
    public static final Set < Display > DISPLAY_SET313 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 314 instance. */
    public static final Set < Display > DISPLAY_SET314 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 315 instance. */
    public static final Set < Display > DISPLAY_SET315 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 316 instance. */
    public static final Set < Display > DISPLAY_SET316 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 317 instance. */
    public static final Set < Display > DISPLAY_SET317 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 318 instance. */
    public static final Set < Display > DISPLAY_SET318 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS}));

    /** Display set test 319 instance. */
    public static final Set < Display > DISPLAY_SET319 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, INTERFACES}));

    /** Display set test 320 instance. */
    public static final Set < Display > DISPLAY_SET320 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 321 instance. */
    public static final Set < Display > DISPLAY_SET321 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 322 instance. */
    public static final Set < Display > DISPLAY_SET322 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 323 instance. */
    public static final Set < Display > DISPLAY_SET323 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 324 instance. */
    public static final Set < Display > DISPLAY_SET324 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 325 instance. */
    public static final Set < Display > DISPLAY_SET325 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 326 instance. */
    public static final Set < Display > DISPLAY_SET326 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES}));

    /** Display set test 327 instance. */
    public static final Set < Display > DISPLAY_SET327 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, NATIVE_METHODS}));

    /** Display set test 328 instance. */
    public static final Set < Display > DISPLAY_SET328 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, STATIC_IMPORTS}));

    /** Display set test 329 instance. */
    public static final Set < Display > DISPLAY_SET329 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 330 instance. */
    public static final Set < Display > DISPLAY_SET330 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 331 instance. */
    public static final Set < Display > DISPLAY_SET331 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 332 instance. */
    public static final Set < Display > DISPLAY_SET332 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 333 instance. */
    public static final Set < Display > DISPLAY_SET333 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 334 instance. */
    public static final Set < Display > DISPLAY_SET334 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 335 instance. */
    public static final Set < Display > DISPLAY_SET335 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 336 instance. */
    public static final Set < Display > DISPLAY_SET336 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 337 instance. */
    public static final Set < Display > DISPLAY_SET337 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 338 instance. */
    public static final Set < Display > DISPLAY_SET338 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 339 instance. */
    public static final Set < Display > DISPLAY_SET339 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 340 instance. */
    public static final Set < Display > DISPLAY_SET340 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 341 instance. */
    public static final Set < Display > DISPLAY_SET341 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 342 instance. */
    public static final Set < Display > DISPLAY_SET342 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 343 instance. */
    public static final Set < Display > DISPLAY_SET343 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 344 instance. */
    public static final Set < Display > DISPLAY_SET344 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 345 instance. */
    public static final Set < Display > DISPLAY_SET345 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 346 instance. */
    public static final Set < Display > DISPLAY_SET346 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 347 instance. */
    public static final Set < Display > DISPLAY_SET347 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 348 instance. */
    public static final Set < Display > DISPLAY_SET348 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 349 instance. */
    public static final Set < Display > DISPLAY_SET349 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 350 instance. */
    public static final Set < Display > DISPLAY_SET350 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 351 instance. */
    public static final Set < Display > DISPLAY_SET351 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 352 instance. */
    public static final Set < Display > DISPLAY_SET352 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 353 instance. */
    public static final Set < Display > DISPLAY_SET353 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 354 instance. */
    public static final Set < Display > DISPLAY_SET354 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 355 instance. */
    public static final Set < Display > DISPLAY_SET355 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 356 instance. */
    public static final Set < Display > DISPLAY_SET356 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 357 instance. */
    public static final Set < Display > DISPLAY_SET357 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 358 instance. */
    public static final Set < Display > DISPLAY_SET358 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 359 instance. */
    public static final Set < Display > DISPLAY_SET359 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 360 instance. */
    public static final Set < Display > DISPLAY_SET360 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 361 instance. */
    public static final Set < Display > DISPLAY_SET361 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 362 instance. */
    public static final Set < Display > DISPLAY_SET362 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 363 instance. */
    public static final Set < Display > DISPLAY_SET363 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 364 instance. */
    public static final Set < Display > DISPLAY_SET364 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 365 instance. */
    public static final Set < Display > DISPLAY_SET365 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 366 instance. */
    public static final Set < Display > DISPLAY_SET366 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 367 instance. */
    public static final Set < Display > DISPLAY_SET367 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 368 instance. */
    public static final Set < Display > DISPLAY_SET368 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            INTERFACES, NATIVE_METHODS}));

    /** Display set test 369 instance. */
    public static final Set < Display > DISPLAY_SET369 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            INTERFACES, STATIC_IMPORTS}));

    /** Display set test 370 instance. */
    public static final Set < Display > DISPLAY_SET370 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 371 instance. */
    public static final Set < Display > DISPLAY_SET371 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 372 instance. */
    public static final Set < Display > DISPLAY_SET372 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 373 instance. */
    public static final Set < Display > DISPLAY_SET373 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 374 instance. */
    public static final Set < Display > DISPLAY_SET374 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 375 instance. */
    public static final Set < Display > DISPLAY_SET375 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 376 instance. */
    public static final Set < Display > DISPLAY_SET376 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 377 instance. */
    public static final Set < Display > DISPLAY_SET377 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 378 instance. */
    public static final Set < Display > DISPLAY_SET378 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 379 instance. */
    public static final Set < Display > DISPLAY_SET379 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 380 instance. */
    public static final Set < Display > DISPLAY_SET380 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 381 instance. */
    public static final Set < Display > DISPLAY_SET381 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 382 instance. */
    public static final Set < Display > DISPLAY_SET382 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 383 instance. */
    public static final Set < Display > DISPLAY_SET383 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 384 instance. */
    public static final Set < Display > DISPLAY_SET384 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 385 instance. */
    public static final Set < Display > DISPLAY_SET385 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 386 instance. */
    public static final Set < Display > DISPLAY_SET386 = new TreeSet < Display >(asList(new Display[] {IMPORTS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 387 instance. */
    public static final Set < Display > DISPLAY_SET387 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS}));

    /** Display set test 388 instance. */
    public static final Set < Display > DISPLAY_SET388 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS}));

    /** Display set test 389 instance. */
    public static final Set < Display > DISPLAY_SET389 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS}));

    /** Display set test 390 instance. */
    public static final Set < Display > DISPLAY_SET390 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES}));

    /** Display set test 391 instance. */
    public static final Set < Display > DISPLAY_SET391 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS}));

    /** Display set test 392 instance. */
    public static final Set < Display > DISPLAY_SET392 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, STATIC_IMPORTS}));

    /** Display set test 393 instance. */
    public static final Set < Display > DISPLAY_SET393 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 394 instance. */
    public static final Set < Display > DISPLAY_SET394 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS}));

    /** Display set test 395 instance. */
    public static final Set < Display > DISPLAY_SET395 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES}));

    /** Display set test 396 instance. */
    public static final Set < Display > DISPLAY_SET396 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 397 instance. */
    public static final Set < Display > DISPLAY_SET397 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 398 instance. */
    public static final Set < Display > DISPLAY_SET398 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 399 instance. */
    public static final Set < Display > DISPLAY_SET399 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 400 instance. */
    public static final Set < Display > DISPLAY_SET400 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 401 instance. */
    public static final Set < Display > DISPLAY_SET401 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 402 instance. */
    public static final Set < Display > DISPLAY_SET402 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES}));

    /** Display set test 403 instance. */
    public static final Set < Display > DISPLAY_SET403 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS}));

    /** Display set test 404 instance. */
    public static final Set < Display > DISPLAY_SET404 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 405 instance. */
    public static final Set < Display > DISPLAY_SET405 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS}));

    /** Display set test 406 instance. */
    public static final Set < Display > DISPLAY_SET406 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 407 instance. */
    public static final Set < Display > DISPLAY_SET407 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 408 instance. */
    public static final Set < Display > DISPLAY_SET408 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 409 instance. */
    public static final Set < Display > DISPLAY_SET409 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 410 instance. */
    public static final Set < Display > DISPLAY_SET410 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 411 instance. */
    public static final Set < Display > DISPLAY_SET411 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 412 instance. */
    public static final Set < Display > DISPLAY_SET412 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 413 instance. */
    public static final Set < Display > DISPLAY_SET413 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 414 instance. */
    public static final Set < Display > DISPLAY_SET414 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 415 instance. */
    public static final Set < Display > DISPLAY_SET415 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 416 instance. */
    public static final Set < Display > DISPLAY_SET416 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 417 instance. */
    public static final Set < Display > DISPLAY_SET417 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 418 instance. */
    public static final Set < Display > DISPLAY_SET418 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 419 instance. */
    public static final Set < Display > DISPLAY_SET419 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 420 instance. */
    public static final Set < Display > DISPLAY_SET420 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 421 instance. */
    public static final Set < Display > DISPLAY_SET421 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 422 instance. */
    public static final Set < Display > DISPLAY_SET422 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 423 instance. */
    public static final Set < Display > DISPLAY_SET423 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 424 instance. */
    public static final Set < Display > DISPLAY_SET424 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 425 instance. */
    public static final Set < Display > DISPLAY_SET425 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 426 instance. */
    public static final Set < Display > DISPLAY_SET426 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 427 instance. */
    public static final Set < Display > DISPLAY_SET427 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 428 instance. */
    public static final Set < Display > DISPLAY_SET428 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 429 instance. */
    public static final Set < Display > DISPLAY_SET429 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 430 instance. */
    public static final Set < Display > DISPLAY_SET430 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 431 instance. */
    public static final Set < Display > DISPLAY_SET431 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 432 instance. */
    public static final Set < Display > DISPLAY_SET432 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 433 instance. */
    public static final Set < Display > DISPLAY_SET433 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 434 instance. */
    public static final Set < Display > DISPLAY_SET434 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 435 instance. */
    public static final Set < Display > DISPLAY_SET435 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 436 instance. */
    public static final Set < Display > DISPLAY_SET436 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 437 instance. */
    public static final Set < Display > DISPLAY_SET437 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 438 instance. */
    public static final Set < Display > DISPLAY_SET438 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 439 instance. */
    public static final Set < Display > DISPLAY_SET439 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 440 instance. */
    public static final Set < Display > DISPLAY_SET440 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 441 instance. */
    public static final Set < Display > DISPLAY_SET441 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 442 instance. */
    public static final Set < Display > DISPLAY_SET442 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 443 instance. */
    public static final Set < Display > DISPLAY_SET443 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 444 instance. */
    public static final Set < Display > DISPLAY_SET444 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 445 instance. */
    public static final Set < Display > DISPLAY_SET445 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 446 instance. */
    public static final Set < Display > DISPLAY_SET446 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 447 instance. */
    public static final Set < Display > DISPLAY_SET447 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 448 instance. */
    public static final Set < Display > DISPLAY_SET448 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 449 instance. */
    public static final Set < Display > DISPLAY_SET449 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 450 instance. */
    public static final Set < Display > DISPLAY_SET450 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 451 instance. */
    public static final Set < Display > DISPLAY_SET451 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 452 instance. */
    public static final Set < Display > DISPLAY_SET452 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 453 instance. */
    public static final Set < Display > DISPLAY_SET453 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 454 instance. */
    public static final Set < Display > DISPLAY_SET454 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 455 instance. */
    public static final Set < Display > DISPLAY_SET455 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 456 instance. */
    public static final Set < Display > DISPLAY_SET456 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 457 instance. */
    public static final Set < Display > DISPLAY_SET457 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 458 instance. */
    public static final Set < Display > DISPLAY_SET458 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 459 instance. */
    public static final Set < Display > DISPLAY_SET459 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 460 instance. */
    public static final Set < Display > DISPLAY_SET460 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 461 instance. */
    public static final Set < Display > DISPLAY_SET461 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 462 instance. */
    public static final Set < Display > DISPLAY_SET462 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 463 instance. */
    public static final Set < Display > DISPLAY_SET463 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 464 instance. */
    public static final Set < Display > DISPLAY_SET464 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 465 instance. */
    public static final Set < Display > DISPLAY_SET465 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 466 instance. */
    public static final Set < Display > DISPLAY_SET466 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 467 instance. */
    public static final Set < Display > DISPLAY_SET467 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 468 instance. */
    public static final Set < Display > DISPLAY_SET468 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 469 instance. */
    public static final Set < Display > DISPLAY_SET469 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 470 instance. */
    public static final Set < Display > DISPLAY_SET470 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 471 instance. */
    public static final Set < Display > DISPLAY_SET471 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 472 instance. */
    public static final Set < Display > DISPLAY_SET472 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 473 instance. */
    public static final Set < Display > DISPLAY_SET473 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 474 instance. */
    public static final Set < Display > DISPLAY_SET474 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 475 instance. */
    public static final Set < Display > DISPLAY_SET475 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 476 instance. */
    public static final Set < Display > DISPLAY_SET476 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 477 instance. */
    public static final Set < Display > DISPLAY_SET477 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 478 instance. */
    public static final Set < Display > DISPLAY_SET478 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 479 instance. */
    public static final Set < Display > DISPLAY_SET479 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 480 instance. */
    public static final Set < Display > DISPLAY_SET480 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 481 instance. */
    public static final Set < Display > DISPLAY_SET481 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 482 instance. */
    public static final Set < Display > DISPLAY_SET482 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 483 instance. */
    public static final Set < Display > DISPLAY_SET483 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 484 instance. */
    public static final Set < Display > DISPLAY_SET484 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 485 instance. */
    public static final Set < Display > DISPLAY_SET485 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 486 instance. */
    public static final Set < Display > DISPLAY_SET486 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 487 instance. */
    public static final Set < Display > DISPLAY_SET487 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 488 instance. */
    public static final Set < Display > DISPLAY_SET488 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 489 instance. */
    public static final Set < Display > DISPLAY_SET489 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 490 instance. */
    public static final Set < Display > DISPLAY_SET490 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 491 instance. */
    public static final Set < Display > DISPLAY_SET491 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 492 instance. */
    public static final Set < Display > DISPLAY_SET492 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 493 instance. */
    public static final Set < Display > DISPLAY_SET493 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 494 instance. */
    public static final Set < Display > DISPLAY_SET494 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 495 instance. */
    public static final Set < Display > DISPLAY_SET495 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 496 instance. */
    public static final Set < Display > DISPLAY_SET496 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 497 instance. */
    public static final Set < Display > DISPLAY_SET497 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 498 instance. */
    public static final Set < Display > DISPLAY_SET498 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 499 instance. */
    public static final Set < Display > DISPLAY_SET499 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 500 instance. */
    public static final Set < Display > DISPLAY_SET500 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 501 instance. */
    public static final Set < Display > DISPLAY_SET501 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 502 instance. */
    public static final Set < Display > DISPLAY_SET502 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 503 instance. */
    public static final Set < Display > DISPLAY_SET503 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 504 instance. */
    public static final Set < Display > DISPLAY_SET504 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 505 instance. */
    public static final Set < Display > DISPLAY_SET505 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 506 instance. */
    public static final Set < Display > DISPLAY_SET506 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 507 instance. */
    public static final Set < Display > DISPLAY_SET507 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 508 instance. */
    public static final Set < Display > DISPLAY_SET508 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 509 instance. */
    public static final Set < Display > DISPLAY_SET509 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 510 instance. */
    public static final Set < Display > DISPLAY_SET510 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 511 instance. */
    public static final Set < Display > DISPLAY_SET511 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 512 instance. */
    public static final Set < Display > DISPLAY_SET512 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 513 instance. */
    public static final Set < Display > DISPLAY_SET513 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 514 instance. */
    public static final Set < Display > DISPLAY_SET514 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 515 instance. */
    public static final Set < Display > DISPLAY_SET515 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 516 instance. */
    public static final Set < Display > DISPLAY_SET516 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 517 instance. */
    public static final Set < Display > DISPLAY_SET517 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 518 instance. */
    public static final Set < Display > DISPLAY_SET518 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 519 instance. */
    public static final Set < Display > DISPLAY_SET519 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 520 instance. */
    public static final Set < Display > DISPLAY_SET520 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 521 instance. */
    public static final Set < Display > DISPLAY_SET521 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 522 instance. */
    public static final Set < Display > DISPLAY_SET522 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 523 instance. */
    public static final Set < Display > DISPLAY_SET523 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 524 instance. */
    public static final Set < Display > DISPLAY_SET524 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 525 instance. */
    public static final Set < Display > DISPLAY_SET525 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 526 instance. */
    public static final Set < Display > DISPLAY_SET526 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 527 instance. */
    public static final Set < Display > DISPLAY_SET527 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 528 instance. */
    public static final Set < Display > DISPLAY_SET528 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 529 instance. */
    public static final Set < Display > DISPLAY_SET529 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 530 instance. */
    public static final Set < Display > DISPLAY_SET530 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 531 instance. */
    public static final Set < Display > DISPLAY_SET531 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 532 instance. */
    public static final Set < Display > DISPLAY_SET532 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 533 instance. */
    public static final Set < Display > DISPLAY_SET533 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 534 instance. */
    public static final Set < Display > DISPLAY_SET534 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 535 instance. */
    public static final Set < Display > DISPLAY_SET535 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 536 instance. */
    public static final Set < Display > DISPLAY_SET536 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 537 instance. */
    public static final Set < Display > DISPLAY_SET537 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 538 instance. */
    public static final Set < Display > DISPLAY_SET538 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 539 instance. */
    public static final Set < Display > DISPLAY_SET539 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 540 instance. */
    public static final Set < Display > DISPLAY_SET540 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 541 instance. */
    public static final Set < Display > DISPLAY_SET541 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 542 instance. */
    public static final Set < Display > DISPLAY_SET542 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 543 instance. */
    public static final Set < Display > DISPLAY_SET543 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 544 instance. */
    public static final Set < Display > DISPLAY_SET544 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 545 instance. */
    public static final Set < Display > DISPLAY_SET545 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 546 instance. */
    public static final Set < Display > DISPLAY_SET546 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 547 instance. */
    public static final Set < Display > DISPLAY_SET547 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 548 instance. */
    public static final Set < Display > DISPLAY_SET548 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 549 instance. */
    public static final Set < Display > DISPLAY_SET549 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 550 instance. */
    public static final Set < Display > DISPLAY_SET550 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 551 instance. */
    public static final Set < Display > DISPLAY_SET551 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 552 instance. */
    public static final Set < Display > DISPLAY_SET552 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 553 instance. */
    public static final Set < Display > DISPLAY_SET553 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 554 instance. */
    public static final Set < Display > DISPLAY_SET554 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 555 instance. */
    public static final Set < Display > DISPLAY_SET555 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 556 instance. */
    public static final Set < Display > DISPLAY_SET556 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 557 instance. */
    public static final Set < Display > DISPLAY_SET557 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 558 instance. */
    public static final Set < Display > DISPLAY_SET558 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 559 instance. */
    public static final Set < Display > DISPLAY_SET559 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 560 instance. */
    public static final Set < Display > DISPLAY_SET560 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 561 instance. */
    public static final Set < Display > DISPLAY_SET561 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 562 instance. */
    public static final Set < Display > DISPLAY_SET562 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 563 instance. */
    public static final Set < Display > DISPLAY_SET563 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 564 instance. */
    public static final Set < Display > DISPLAY_SET564 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 565 instance. */
    public static final Set < Display > DISPLAY_SET565 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 566 instance. */
    public static final Set < Display > DISPLAY_SET566 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 567 instance. */
    public static final Set < Display > DISPLAY_SET567 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 568 instance. */
    public static final Set < Display > DISPLAY_SET568 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 569 instance. */
    public static final Set < Display > DISPLAY_SET569 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 570 instance. */
    public static final Set < Display > DISPLAY_SET570 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 571 instance. */
    public static final Set < Display > DISPLAY_SET571 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 572 instance. */
    public static final Set < Display > DISPLAY_SET572 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 573 instance. */
    public static final Set < Display > DISPLAY_SET573 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 574 instance. */
    public static final Set < Display > DISPLAY_SET574 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 575 instance. */
    public static final Set < Display > DISPLAY_SET575 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 576 instance. */
    public static final Set < Display > DISPLAY_SET576 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 577 instance. */
    public static final Set < Display > DISPLAY_SET577 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 578 instance. */
    public static final Set < Display > DISPLAY_SET578 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 579 instance. */
    public static final Set < Display > DISPLAY_SET579 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 580 instance. */
    public static final Set < Display > DISPLAY_SET580 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 581 instance. */
    public static final Set < Display > DISPLAY_SET581 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 582 instance. */
    public static final Set < Display > DISPLAY_SET582 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 583 instance. */
    public static final Set < Display > DISPLAY_SET583 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 584 instance. */
    public static final Set < Display > DISPLAY_SET584 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 585 instance. */
    public static final Set < Display > DISPLAY_SET585 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 586 instance. */
    public static final Set < Display > DISPLAY_SET586 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 587 instance. */
    public static final Set < Display > DISPLAY_SET587 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 588 instance. */
    public static final Set < Display > DISPLAY_SET588 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 589 instance. */
    public static final Set < Display > DISPLAY_SET589 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 590 instance. */
    public static final Set < Display > DISPLAY_SET590 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 591 instance. */
    public static final Set < Display > DISPLAY_SET591 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 592 instance. */
    public static final Set < Display > DISPLAY_SET592 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 593 instance. */
    public static final Set < Display > DISPLAY_SET593 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 594 instance. */
    public static final Set < Display > DISPLAY_SET594 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 595 instance. */
    public static final Set < Display > DISPLAY_SET595 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 596 instance. */
    public static final Set < Display > DISPLAY_SET596 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 597 instance. */
    public static final Set < Display > DISPLAY_SET597 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 598 instance. */
    public static final Set < Display > DISPLAY_SET598 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 599 instance. */
    public static final Set < Display > DISPLAY_SET599 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 600 instance. */
    public static final Set < Display > DISPLAY_SET600 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 601 instance. */
    public static final Set < Display > DISPLAY_SET601 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 602 instance. */
    public static final Set < Display > DISPLAY_SET602 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 603 instance. */
    public static final Set < Display > DISPLAY_SET603 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 604 instance. */
    public static final Set < Display > DISPLAY_SET604 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 605 instance. */
    public static final Set < Display > DISPLAY_SET605 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 606 instance. */
    public static final Set < Display > DISPLAY_SET606 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 607 instance. */
    public static final Set < Display > DISPLAY_SET607 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 608 instance. */
    public static final Set < Display > DISPLAY_SET608 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 609 instance. */
    public static final Set < Display > DISPLAY_SET609 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 610 instance. */
    public static final Set < Display > DISPLAY_SET610 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 611 instance. */
    public static final Set < Display > DISPLAY_SET611 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 612 instance. */
    public static final Set < Display > DISPLAY_SET612 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 613 instance. */
    public static final Set < Display > DISPLAY_SET613 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 614 instance. */
    public static final Set < Display > DISPLAY_SET614 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 615 instance. */
    public static final Set < Display > DISPLAY_SET615 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 616 instance. */
    public static final Set < Display > DISPLAY_SET616 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 617 instance. */
    public static final Set < Display > DISPLAY_SET617 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 618 instance. */
    public static final Set < Display > DISPLAY_SET618 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 619 instance. */
    public static final Set < Display > DISPLAY_SET619 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 620 instance. */
    public static final Set < Display > DISPLAY_SET620 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 621 instance. */
    public static final Set < Display > DISPLAY_SET621 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 622 instance. */
    public static final Set < Display > DISPLAY_SET622 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 623 instance. */
    public static final Set < Display > DISPLAY_SET623 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 624 instance. */
    public static final Set < Display > DISPLAY_SET624 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 625 instance. */
    public static final Set < Display > DISPLAY_SET625 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 626 instance. */
    public static final Set < Display > DISPLAY_SET626 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 627 instance. */
    public static final Set < Display > DISPLAY_SET627 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 628 instance. */
    public static final Set < Display > DISPLAY_SET628 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 629 instance. */
    public static final Set < Display > DISPLAY_SET629 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 630 instance. */
    public static final Set < Display > DISPLAY_SET630 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 631 instance. */
    public static final Set < Display > DISPLAY_SET631 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 632 instance. */
    public static final Set < Display > DISPLAY_SET632 = new TreeSet < Display >(asList(new Display[] {ENUMS, IMPORTS,
            INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 633 instance. */
    public static final Set < Display > DISPLAY_SET633 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 634 instance. */
    public static final Set < Display > DISPLAY_SET634 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 635 instance. */
    public static final Set < Display > DISPLAY_SET635 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 636 instance. */
    public static final Set < Display > DISPLAY_SET636 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 637 instance. */
    public static final Set < Display > DISPLAY_SET637 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 638 instance. */
    public static final Set < Display > DISPLAY_SET638 = new TreeSet < Display >(asList(new Display[] {IMPLEMENTATIONS,
            IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 639 instance. */
    public static final Set < Display > DISPLAY_SET639 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS}));

    /** Display set test 640 instance. */
    public static final Set < Display > DISPLAY_SET640 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS}));

    /** Display set test 641 instance. */
    public static final Set < Display > DISPLAY_SET641 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES}));

    /** Display set test 642 instance. */
    public static final Set < Display > DISPLAY_SET642 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS}));

    /** Display set test 643 instance. */
    public static final Set < Display > DISPLAY_SET643 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, STATIC_IMPORTS}));

    /** Display set test 644 instance. */
    public static final Set < Display > DISPLAY_SET644 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 645 instance. */
    public static final Set < Display > DISPLAY_SET645 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 646 instance. */
    public static final Set < Display > DISPLAY_SET646 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 647 instance. */
    public static final Set < Display > DISPLAY_SET647 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 648 instance. */
    public static final Set < Display > DISPLAY_SET648 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES}));

    /** Display set test 649 instance. */
    public static final Set < Display > DISPLAY_SET649 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 650 instance. */
    public static final Set < Display > DISPLAY_SET650 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 651 instance. */
    public static final Set < Display > DISPLAY_SET651 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 652 instance. */
    public static final Set < Display > DISPLAY_SET652 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 653 instance. */
    public static final Set < Display > DISPLAY_SET653 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 654 instance. */
    public static final Set < Display > DISPLAY_SET654 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 655 instance. */
    public static final Set < Display > DISPLAY_SET655 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 656 instance. */
    public static final Set < Display > DISPLAY_SET656 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 657 instance. */
    public static final Set < Display > DISPLAY_SET657 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 658 instance. */
    public static final Set < Display > DISPLAY_SET658 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 659 instance. */
    public static final Set < Display > DISPLAY_SET659 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 660 instance. */
    public static final Set < Display > DISPLAY_SET660 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 661 instance. */
    public static final Set < Display > DISPLAY_SET661 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 662 instance. */
    public static final Set < Display > DISPLAY_SET662 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 663 instance. */
    public static final Set < Display > DISPLAY_SET663 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 664 instance. */
    public static final Set < Display > DISPLAY_SET664 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 665 instance. */
    public static final Set < Display > DISPLAY_SET665 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 666 instance. */
    public static final Set < Display > DISPLAY_SET666 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 667 instance. */
    public static final Set < Display > DISPLAY_SET667 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 668 instance. */
    public static final Set < Display > DISPLAY_SET668 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 669 instance. */
    public static final Set < Display > DISPLAY_SET669 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 670 instance. */
    public static final Set < Display > DISPLAY_SET670 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 671 instance. */
    public static final Set < Display > DISPLAY_SET671 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 672 instance. */
    public static final Set < Display > DISPLAY_SET672 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 673 instance. */
    public static final Set < Display > DISPLAY_SET673 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 674 instance. */
    public static final Set < Display > DISPLAY_SET674 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 675 instance. */
    public static final Set < Display > DISPLAY_SET675 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 676 instance. */
    public static final Set < Display > DISPLAY_SET676 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 677 instance. */
    public static final Set < Display > DISPLAY_SET677 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 678 instance. */
    public static final Set < Display > DISPLAY_SET678 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 679 instance. */
    public static final Set < Display > DISPLAY_SET679 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 680 instance. */
    public static final Set < Display > DISPLAY_SET680 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 681 instance. */
    public static final Set < Display > DISPLAY_SET681 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 682 instance. */
    public static final Set < Display > DISPLAY_SET682 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 683 instance. */
    public static final Set < Display > DISPLAY_SET683 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 684 instance. */
    public static final Set < Display > DISPLAY_SET684 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 685 instance. */
    public static final Set < Display > DISPLAY_SET685 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 686 instance. */
    public static final Set < Display > DISPLAY_SET686 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 687 instance. */
    public static final Set < Display > DISPLAY_SET687 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 688 instance. */
    public static final Set < Display > DISPLAY_SET688 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 689 instance. */
    public static final Set < Display > DISPLAY_SET689 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 690 instance. */
    public static final Set < Display > DISPLAY_SET690 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 691 instance. */
    public static final Set < Display > DISPLAY_SET691 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 692 instance. */
    public static final Set < Display > DISPLAY_SET692 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 693 instance. */
    public static final Set < Display > DISPLAY_SET693 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 694 instance. */
    public static final Set < Display > DISPLAY_SET694 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 695 instance. */
    public static final Set < Display > DISPLAY_SET695 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 696 instance. */
    public static final Set < Display > DISPLAY_SET696 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 697 instance. */
    public static final Set < Display > DISPLAY_SET697 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 698 instance. */
    public static final Set < Display > DISPLAY_SET698 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 699 instance. */
    public static final Set < Display > DISPLAY_SET699 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 700 instance. */
    public static final Set < Display > DISPLAY_SET700 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 701 instance. */
    public static final Set < Display > DISPLAY_SET701 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 702 instance. */
    public static final Set < Display > DISPLAY_SET702 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 703 instance. */
    public static final Set < Display > DISPLAY_SET703 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 704 instance. */
    public static final Set < Display > DISPLAY_SET704 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 705 instance. */
    public static final Set < Display > DISPLAY_SET705 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 706 instance. */
    public static final Set < Display > DISPLAY_SET706 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 707 instance. */
    public static final Set < Display > DISPLAY_SET707 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 708 instance. */
    public static final Set < Display > DISPLAY_SET708 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 709 instance. */
    public static final Set < Display > DISPLAY_SET709 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 710 instance. */
    public static final Set < Display > DISPLAY_SET710 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 711 instance. */
    public static final Set < Display > DISPLAY_SET711 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 712 instance. */
    public static final Set < Display > DISPLAY_SET712 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 713 instance. */
    public static final Set < Display > DISPLAY_SET713 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 714 instance. */
    public static final Set < Display > DISPLAY_SET714 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 715 instance. */
    public static final Set < Display > DISPLAY_SET715 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 716 instance. */
    public static final Set < Display > DISPLAY_SET716 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 717 instance. */
    public static final Set < Display > DISPLAY_SET717 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 718 instance. */
    public static final Set < Display > DISPLAY_SET718 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 719 instance. */
    public static final Set < Display > DISPLAY_SET719 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 720 instance. */
    public static final Set < Display > DISPLAY_SET720 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 721 instance. */
    public static final Set < Display > DISPLAY_SET721 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 722 instance. */
    public static final Set < Display > DISPLAY_SET722 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 723 instance. */
    public static final Set < Display > DISPLAY_SET723 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 724 instance. */
    public static final Set < Display > DISPLAY_SET724 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 725 instance. */
    public static final Set < Display > DISPLAY_SET725 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 726 instance. */
    public static final Set < Display > DISPLAY_SET726 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 727 instance. */
    public static final Set < Display > DISPLAY_SET727 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 728 instance. */
    public static final Set < Display > DISPLAY_SET728 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 729 instance. */
    public static final Set < Display > DISPLAY_SET729 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 730 instance. */
    public static final Set < Display > DISPLAY_SET730 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 731 instance. */
    public static final Set < Display > DISPLAY_SET731 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 732 instance. */
    public static final Set < Display > DISPLAY_SET732 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 733 instance. */
    public static final Set < Display > DISPLAY_SET733 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 734 instance. */
    public static final Set < Display > DISPLAY_SET734 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 735 instance. */
    public static final Set < Display > DISPLAY_SET735 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 736 instance. */
    public static final Set < Display > DISPLAY_SET736 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 737 instance. */
    public static final Set < Display > DISPLAY_SET737 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 738 instance. */
    public static final Set < Display > DISPLAY_SET738 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 739 instance. */
    public static final Set < Display > DISPLAY_SET739 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 740 instance. */
    public static final Set < Display > DISPLAY_SET740 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 741 instance. */
    public static final Set < Display > DISPLAY_SET741 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 742 instance. */
    public static final Set < Display > DISPLAY_SET742 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 743 instance. */
    public static final Set < Display > DISPLAY_SET743 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 744 instance. */
    public static final Set < Display > DISPLAY_SET744 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 745 instance. */
    public static final Set < Display > DISPLAY_SET745 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 746 instance. */
    public static final Set < Display > DISPLAY_SET746 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 747 instance. */
    public static final Set < Display > DISPLAY_SET747 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 748 instance. */
    public static final Set < Display > DISPLAY_SET748 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 749 instance. */
    public static final Set < Display > DISPLAY_SET749 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 750 instance. */
    public static final Set < Display > DISPLAY_SET750 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 751 instance. */
    public static final Set < Display > DISPLAY_SET751 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 752 instance. */
    public static final Set < Display > DISPLAY_SET752 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 753 instance. */
    public static final Set < Display > DISPLAY_SET753 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 754 instance. */
    public static final Set < Display > DISPLAY_SET754 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 755 instance. */
    public static final Set < Display > DISPLAY_SET755 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 756 instance. */
    public static final Set < Display > DISPLAY_SET756 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 757 instance. */
    public static final Set < Display > DISPLAY_SET757 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 758 instance. */
    public static final Set < Display > DISPLAY_SET758 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 759 instance. */
    public static final Set < Display > DISPLAY_SET759 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 760 instance. */
    public static final Set < Display > DISPLAY_SET760 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 761 instance. */
    public static final Set < Display > DISPLAY_SET761 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 762 instance. */
    public static final Set < Display > DISPLAY_SET762 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 763 instance. */
    public static final Set < Display > DISPLAY_SET763 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 764 instance. */
    public static final Set < Display > DISPLAY_SET764 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 765 instance. */
    public static final Set < Display > DISPLAY_SET765 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 766 instance. */
    public static final Set < Display > DISPLAY_SET766 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 767 instance. */
    public static final Set < Display > DISPLAY_SET767 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 768 instance. */
    public static final Set < Display > DISPLAY_SET768 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 769 instance. */
    public static final Set < Display > DISPLAY_SET769 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 770 instance. */
    public static final Set < Display > DISPLAY_SET770 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 771 instance. */
    public static final Set < Display > DISPLAY_SET771 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 772 instance. */
    public static final Set < Display > DISPLAY_SET772 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 773 instance. */
    public static final Set < Display > DISPLAY_SET773 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 774 instance. */
    public static final Set < Display > DISPLAY_SET774 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 775 instance. */
    public static final Set < Display > DISPLAY_SET775 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 776 instance. */
    public static final Set < Display > DISPLAY_SET776 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 777 instance. */
    public static final Set < Display > DISPLAY_SET777 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 778 instance. */
    public static final Set < Display > DISPLAY_SET778 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 779 instance. */
    public static final Set < Display > DISPLAY_SET779 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 780 instance. */
    public static final Set < Display > DISPLAY_SET780 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 781 instance. */
    public static final Set < Display > DISPLAY_SET781 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 782 instance. */
    public static final Set < Display > DISPLAY_SET782 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 783 instance. */
    public static final Set < Display > DISPLAY_SET783 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 784 instance. */
    public static final Set < Display > DISPLAY_SET784 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 785 instance. */
    public static final Set < Display > DISPLAY_SET785 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 786 instance. */
    public static final Set < Display > DISPLAY_SET786 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 787 instance. */
    public static final Set < Display > DISPLAY_SET787 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 788 instance. */
    public static final Set < Display > DISPLAY_SET788 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 789 instance. */
    public static final Set < Display > DISPLAY_SET789 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 790 instance. */
    public static final Set < Display > DISPLAY_SET790 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 791 instance. */
    public static final Set < Display > DISPLAY_SET791 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 792 instance. */
    public static final Set < Display > DISPLAY_SET792 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 793 instance. */
    public static final Set < Display > DISPLAY_SET793 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 794 instance. */
    public static final Set < Display > DISPLAY_SET794 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 795 instance. */
    public static final Set < Display > DISPLAY_SET795 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 796 instance. */
    public static final Set < Display > DISPLAY_SET796 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 797 instance. */
    public static final Set < Display > DISPLAY_SET797 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 798 instance. */
    public static final Set < Display > DISPLAY_SET798 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 799 instance. */
    public static final Set < Display > DISPLAY_SET799 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 800 instance. */
    public static final Set < Display > DISPLAY_SET800 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 801 instance. */
    public static final Set < Display > DISPLAY_SET801 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 802 instance. */
    public static final Set < Display > DISPLAY_SET802 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 803 instance. */
    public static final Set < Display > DISPLAY_SET803 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 804 instance. */
    public static final Set < Display > DISPLAY_SET804 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 805 instance. */
    public static final Set < Display > DISPLAY_SET805 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 806 instance. */
    public static final Set < Display > DISPLAY_SET806 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 807 instance. */
    public static final Set < Display > DISPLAY_SET807 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 808 instance. */
    public static final Set < Display > DISPLAY_SET808 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 809 instance. */
    public static final Set < Display > DISPLAY_SET809 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 810 instance. */
    public static final Set < Display > DISPLAY_SET810 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 811 instance. */
    public static final Set < Display > DISPLAY_SET811 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 812 instance. */
    public static final Set < Display > DISPLAY_SET812 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 813 instance. */
    public static final Set < Display > DISPLAY_SET813 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 814 instance. */
    public static final Set < Display > DISPLAY_SET814 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 815 instance. */
    public static final Set < Display > DISPLAY_SET815 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 816 instance. */
    public static final Set < Display > DISPLAY_SET816 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 817 instance. */
    public static final Set < Display > DISPLAY_SET817 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 818 instance. */
    public static final Set < Display > DISPLAY_SET818 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 819 instance. */
    public static final Set < Display > DISPLAY_SET819 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 820 instance. */
    public static final Set < Display > DISPLAY_SET820 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 821 instance. */
    public static final Set < Display > DISPLAY_SET821 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 822 instance. */
    public static final Set < Display > DISPLAY_SET822 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 823 instance. */
    public static final Set < Display > DISPLAY_SET823 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 824 instance. */
    public static final Set < Display > DISPLAY_SET824 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 825 instance. */
    public static final Set < Display > DISPLAY_SET825 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 826 instance. */
    public static final Set < Display > DISPLAY_SET826 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 827 instance. */
    public static final Set < Display > DISPLAY_SET827 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 828 instance. */
    public static final Set < Display > DISPLAY_SET828 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 829 instance. */
    public static final Set < Display > DISPLAY_SET829 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 830 instance. */
    public static final Set < Display > DISPLAY_SET830 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 831 instance. */
    public static final Set < Display > DISPLAY_SET831 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 832 instance. */
    public static final Set < Display > DISPLAY_SET832 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 833 instance. */
    public static final Set < Display > DISPLAY_SET833 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 834 instance. */
    public static final Set < Display > DISPLAY_SET834 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 835 instance. */
    public static final Set < Display > DISPLAY_SET835 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 836 instance. */
    public static final Set < Display > DISPLAY_SET836 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 837 instance. */
    public static final Set < Display > DISPLAY_SET837 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 838 instance. */
    public static final Set < Display > DISPLAY_SET838 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 839 instance. */
    public static final Set < Display > DISPLAY_SET839 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 840 instance. */
    public static final Set < Display > DISPLAY_SET840 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 841 instance. */
    public static final Set < Display > DISPLAY_SET841 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 842 instance. */
    public static final Set < Display > DISPLAY_SET842 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 843 instance. */
    public static final Set < Display > DISPLAY_SET843 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 844 instance. */
    public static final Set < Display > DISPLAY_SET844 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 845 instance. */
    public static final Set < Display > DISPLAY_SET845 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 846 instance. */
    public static final Set < Display > DISPLAY_SET846 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 847 instance. */
    public static final Set < Display > DISPLAY_SET847 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 848 instance. */
    public static final Set < Display > DISPLAY_SET848 = new TreeSet < Display >(asList(new Display[] {EXTENSIONS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 849 instance. */
    public static final Set < Display > DISPLAY_SET849 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS}));

    /** Display set test 850 instance. */
    public static final Set < Display > DISPLAY_SET850 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES}));

    /** Display set test 851 instance. */
    public static final Set < Display > DISPLAY_SET851 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS}));

    /** Display set test 852 instance. */
    public static final Set < Display > DISPLAY_SET852 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, STATIC_IMPORTS}));

    /** Display set test 853 instance. */
    public static final Set < Display > DISPLAY_SET853 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES}));

    /** Display set test 854 instance. */
    public static final Set < Display > DISPLAY_SET854 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 855 instance. */
    public static final Set < Display > DISPLAY_SET855 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 856 instance. */
    public static final Set < Display > DISPLAY_SET856 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 857 instance. */
    public static final Set < Display > DISPLAY_SET857 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 858 instance. */
    public static final Set < Display > DISPLAY_SET858 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 859 instance. */
    public static final Set < Display > DISPLAY_SET859 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 860 instance. */
    public static final Set < Display > DISPLAY_SET860 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 861 instance. */
    public static final Set < Display > DISPLAY_SET861 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 862 instance. */
    public static final Set < Display > DISPLAY_SET862 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 863 instance. */
    public static final Set < Display > DISPLAY_SET863 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 864 instance. */
    public static final Set < Display > DISPLAY_SET864 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 865 instance. */
    public static final Set < Display > DISPLAY_SET865 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 866 instance. */
    public static final Set < Display > DISPLAY_SET866 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 867 instance. */
    public static final Set < Display > DISPLAY_SET867 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 868 instance. */
    public static final Set < Display > DISPLAY_SET868 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 869 instance. */
    public static final Set < Display > DISPLAY_SET869 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 870 instance. */
    public static final Set < Display > DISPLAY_SET870 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 871 instance. */
    public static final Set < Display > DISPLAY_SET871 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 872 instance. */
    public static final Set < Display > DISPLAY_SET872 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 873 instance. */
    public static final Set < Display > DISPLAY_SET873 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 874 instance. */
    public static final Set < Display > DISPLAY_SET874 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 875 instance. */
    public static final Set < Display > DISPLAY_SET875 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 876 instance. */
    public static final Set < Display > DISPLAY_SET876 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 877 instance. */
    public static final Set < Display > DISPLAY_SET877 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 878 instance. */
    public static final Set < Display > DISPLAY_SET878 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 879 instance. */
    public static final Set < Display > DISPLAY_SET879 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 880 instance. */
    public static final Set < Display > DISPLAY_SET880 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 881 instance. */
    public static final Set < Display > DISPLAY_SET881 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 882 instance. */
    public static final Set < Display > DISPLAY_SET882 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 883 instance. */
    public static final Set < Display > DISPLAY_SET883 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 884 instance. */
    public static final Set < Display > DISPLAY_SET884 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 885 instance. */
    public static final Set < Display > DISPLAY_SET885 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 886 instance. */
    public static final Set < Display > DISPLAY_SET886 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 887 instance. */
    public static final Set < Display > DISPLAY_SET887 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 888 instance. */
    public static final Set < Display > DISPLAY_SET888 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 889 instance. */
    public static final Set < Display > DISPLAY_SET889 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 890 instance. */
    public static final Set < Display > DISPLAY_SET890 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 891 instance. */
    public static final Set < Display > DISPLAY_SET891 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 892 instance. */
    public static final Set < Display > DISPLAY_SET892 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 893 instance. */
    public static final Set < Display > DISPLAY_SET893 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 894 instance. */
    public static final Set < Display > DISPLAY_SET894 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 895 instance. */
    public static final Set < Display > DISPLAY_SET895 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 896 instance. */
    public static final Set < Display > DISPLAY_SET896 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 897 instance. */
    public static final Set < Display > DISPLAY_SET897 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 898 instance. */
    public static final Set < Display > DISPLAY_SET898 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 899 instance. */
    public static final Set < Display > DISPLAY_SET899 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 900 instance. */
    public static final Set < Display > DISPLAY_SET900 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 901 instance. */
    public static final Set < Display > DISPLAY_SET901 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 902 instance. */
    public static final Set < Display > DISPLAY_SET902 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 903 instance. */
    public static final Set < Display > DISPLAY_SET903 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 904 instance. */
    public static final Set < Display > DISPLAY_SET904 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 905 instance. */
    public static final Set < Display > DISPLAY_SET905 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 906 instance. */
    public static final Set < Display > DISPLAY_SET906 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 907 instance. */
    public static final Set < Display > DISPLAY_SET907 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 908 instance. */
    public static final Set < Display > DISPLAY_SET908 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 909 instance. */
    public static final Set < Display > DISPLAY_SET909 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 910 instance. */
    public static final Set < Display > DISPLAY_SET910 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 911 instance. */
    public static final Set < Display > DISPLAY_SET911 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 912 instance. */
    public static final Set < Display > DISPLAY_SET912 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 913 instance. */
    public static final Set < Display > DISPLAY_SET913 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 914 instance. */
    public static final Set < Display > DISPLAY_SET914 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 915 instance. */
    public static final Set < Display > DISPLAY_SET915 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 916 instance. */
    public static final Set < Display > DISPLAY_SET916 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 917 instance. */
    public static final Set < Display > DISPLAY_SET917 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 918 instance. */
    public static final Set < Display > DISPLAY_SET918 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 919 instance. */
    public static final Set < Display > DISPLAY_SET919 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 920 instance. */
    public static final Set < Display > DISPLAY_SET920 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 921 instance. */
    public static final Set < Display > DISPLAY_SET921 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 922 instance. */
    public static final Set < Display > DISPLAY_SET922 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 923 instance. */
    public static final Set < Display > DISPLAY_SET923 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 924 instance. */
    public static final Set < Display > DISPLAY_SET924 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 925 instance. */
    public static final Set < Display > DISPLAY_SET925 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 926 instance. */
    public static final Set < Display > DISPLAY_SET926 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 927 instance. */
    public static final Set < Display > DISPLAY_SET927 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 928 instance. */
    public static final Set < Display > DISPLAY_SET928 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 929 instance. */
    public static final Set < Display > DISPLAY_SET929 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 930 instance. */
    public static final Set < Display > DISPLAY_SET930 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 931 instance. */
    public static final Set < Display > DISPLAY_SET931 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 932 instance. */
    public static final Set < Display > DISPLAY_SET932 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 933 instance. */
    public static final Set < Display > DISPLAY_SET933 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 934 instance. */
    public static final Set < Display > DISPLAY_SET934 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 935 instance. */
    public static final Set < Display > DISPLAY_SET935 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 936 instance. */
    public static final Set < Display > DISPLAY_SET936 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 937 instance. */
    public static final Set < Display > DISPLAY_SET937 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 938 instance. */
    public static final Set < Display > DISPLAY_SET938 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 939 instance. */
    public static final Set < Display > DISPLAY_SET939 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 940 instance. */
    public static final Set < Display > DISPLAY_SET940 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 941 instance. */
    public static final Set < Display > DISPLAY_SET941 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 942 instance. */
    public static final Set < Display > DISPLAY_SET942 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 943 instance. */
    public static final Set < Display > DISPLAY_SET943 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 944 instance. */
    public static final Set < Display > DISPLAY_SET944 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 945 instance. */
    public static final Set < Display > DISPLAY_SET945 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 946 instance. */
    public static final Set < Display > DISPLAY_SET946 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 947 instance. */
    public static final Set < Display > DISPLAY_SET947 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 948 instance. */
    public static final Set < Display > DISPLAY_SET948 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 949 instance. */
    public static final Set < Display > DISPLAY_SET949 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 950 instance. */
    public static final Set < Display > DISPLAY_SET950 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 951 instance. */
    public static final Set < Display > DISPLAY_SET951 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 952 instance. */
    public static final Set < Display > DISPLAY_SET952 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 953 instance. */
    public static final Set < Display > DISPLAY_SET953 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 954 instance. */
    public static final Set < Display > DISPLAY_SET954 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 955 instance. */
    public static final Set < Display > DISPLAY_SET955 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 956 instance. */
    public static final Set < Display > DISPLAY_SET956 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 957 instance. */
    public static final Set < Display > DISPLAY_SET957 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 958 instance. */
    public static final Set < Display > DISPLAY_SET958 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 959 instance. */
    public static final Set < Display > DISPLAY_SET959 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 960 instance. */
    public static final Set < Display > DISPLAY_SET960 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 961 instance. */
    public static final Set < Display > DISPLAY_SET961 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 962 instance. */
    public static final Set < Display > DISPLAY_SET962 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 963 instance. */
    public static final Set < Display > DISPLAY_SET963 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 964 instance. */
    public static final Set < Display > DISPLAY_SET964 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 965 instance. */
    public static final Set < Display > DISPLAY_SET965 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 966 instance. */
    public static final Set < Display > DISPLAY_SET966 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 967 instance. */
    public static final Set < Display > DISPLAY_SET967 = new TreeSet < Display >(asList(new Display[] {CLASSES,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 968 instance. */
    public static final Set < Display > DISPLAY_SET968 = new TreeSet < Display >(asList(new Display[] {ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 969 instance. */
    public static final Set < Display > DISPLAY_SET969 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES}));

    /** Display set test 970 instance. */
    public static final Set < Display > DISPLAY_SET970 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS}));

    /** Display set test 971 instance. */
    public static final Set < Display > DISPLAY_SET971 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, STATIC_IMPORTS}));

    /** Display set test 972 instance. */
    public static final Set < Display > DISPLAY_SET972 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 973 instance. */
    public static final Set < Display > DISPLAY_SET973 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 974 instance. */
    public static final Set < Display > DISPLAY_SET974 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 975 instance. */
    public static final Set < Display > DISPLAY_SET975 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 976 instance. */
    public static final Set < Display > DISPLAY_SET976 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 977 instance. */
    public static final Set < Display > DISPLAY_SET977 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 978 instance. */
    public static final Set < Display > DISPLAY_SET978 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 979 instance. */
    public static final Set < Display > DISPLAY_SET979 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 980 instance. */
    public static final Set < Display > DISPLAY_SET980 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 981 instance. */
    public static final Set < Display > DISPLAY_SET981 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 982 instance. */
    public static final Set < Display > DISPLAY_SET982 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 983 instance. */
    public static final Set < Display > DISPLAY_SET983 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 984 instance. */
    public static final Set < Display > DISPLAY_SET984 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 985 instance. */
    public static final Set < Display > DISPLAY_SET985 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 986 instance. */
    public static final Set < Display > DISPLAY_SET986 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 987 instance. */
    public static final Set < Display > DISPLAY_SET987 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 988 instance. */
    public static final Set < Display > DISPLAY_SET988 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 989 instance. */
    public static final Set < Display > DISPLAY_SET989 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 990 instance. */
    public static final Set < Display > DISPLAY_SET990 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 991 instance. */
    public static final Set < Display > DISPLAY_SET991 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 992 instance. */
    public static final Set < Display > DISPLAY_SET992 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 993 instance. */
    public static final Set < Display > DISPLAY_SET993 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 994 instance. */
    public static final Set < Display > DISPLAY_SET994 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 995 instance. */
    public static final Set < Display > DISPLAY_SET995 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 996 instance. */
    public static final Set < Display > DISPLAY_SET996 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 997 instance. */
    public static final Set < Display > DISPLAY_SET997 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 998 instance. */
    public static final Set < Display > DISPLAY_SET998 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 999 instance. */
    public static final Set < Display > DISPLAY_SET999 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1000 instance. */
    public static final Set < Display > DISPLAY_SET1000 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1001 instance. */
    public static final Set < Display > DISPLAY_SET1001 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1002 instance. */
    public static final Set < Display > DISPLAY_SET1002 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1003 instance. */
    public static final Set < Display > DISPLAY_SET1003 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1004 instance. */
    public static final Set < Display > DISPLAY_SET1004 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1005 instance. */
    public static final Set < Display > DISPLAY_SET1005 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 1006 instance. */
    public static final Set < Display > DISPLAY_SET1006 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 1007 instance. */
    public static final Set < Display > DISPLAY_SET1007 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1008 instance. */
    public static final Set < Display > DISPLAY_SET1008 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1009 instance. */
    public static final Set < Display > DISPLAY_SET1009 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1010 instance. */
    public static final Set < Display > DISPLAY_SET1010 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1011 instance. */
    public static final Set < Display > DISPLAY_SET1011 = new TreeSet < Display >(
            asList(new Display[] {ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES,
                    NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1012 instance. */
    public static final Set < Display > DISPLAY_SET1012 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1013 instance. */
    public static final Set < Display > DISPLAY_SET1013 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1014 instance. */
    public static final Set < Display > DISPLAY_SET1014 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS}));

    /** Display set test 1015 instance. */
    public static final Set < Display > DISPLAY_SET1015 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, STATIC_IMPORTS}));

    /** Display set test 1016 instance. */
    public static final Set < Display > DISPLAY_SET1016 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1017 instance. */
    public static final Set < Display > DISPLAY_SET1017 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1018 instance. */
    public static final Set < Display > DISPLAY_SET1018 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1019 instance. */
    public static final Set < Display > DISPLAY_SET1019 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1020 instance. */
    public static final Set < Display > DISPLAY_SET1020 = new TreeSet < Display >(
            asList(new Display[] {ANNOTATIONS, ABSTRACT_CLASSES, CLASSES, EXTENSIONS, IMPLEMENTATIONS, IMPORTS,
                    INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1021 instance. */
    public static final Set < Display > DISPLAY_SET1021 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1022 instance. */
    public static final Set < Display > DISPLAY_SET1022 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS, STATIC_IMPORTS}));

    /** Display set test 1023 instance. */
    public static final Set < Display > DISPLAY_SET1023 = new TreeSet < Display >(asList(new Display[] {
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS,
            STATIC_IMPORTS}));

    /** Display set test 1024 instance. */
    public static final Set < Display > DISPLAY_SET1024 = new TreeSet < Display >(asList(new Display[] {ANNOTATIONS,
            ABSTRACT_CLASSES, CLASSES, ENUMS, EXTENSIONS, IMPLEMENTATIONS, IMPORTS, INTERFACES, NATIVE_METHODS,
            STATIC_IMPORTS}));

    /** The Set containing all display sets which are available. */
    public static final List < Set < Display > > DISPLAY_SETS = new ArrayList < Set < Display > >() {
        private static final long serialVersionUID = 1L;
        {
            add(DISPLAY_SET1);
            add(DISPLAY_SET2);
            add(DISPLAY_SET3);
            add(DISPLAY_SET4);
            add(DISPLAY_SET5);
            add(DISPLAY_SET6);
            add(DISPLAY_SET7);
            add(DISPLAY_SET8);
            add(DISPLAY_SET9);
            add(DISPLAY_SET10);
            add(DISPLAY_SET11);
            add(DISPLAY_SET12);
            add(DISPLAY_SET13);
            add(DISPLAY_SET14);
            add(DISPLAY_SET15);
            add(DISPLAY_SET16);
            add(DISPLAY_SET17);
            add(DISPLAY_SET18);
            add(DISPLAY_SET19);
            add(DISPLAY_SET20);
            add(DISPLAY_SET21);
            add(DISPLAY_SET22);
            add(DISPLAY_SET23);
            add(DISPLAY_SET24);
            add(DISPLAY_SET25);
            add(DISPLAY_SET26);
            add(DISPLAY_SET27);
            add(DISPLAY_SET28);
            add(DISPLAY_SET29);
            add(DISPLAY_SET30);
            add(DISPLAY_SET31);
            add(DISPLAY_SET32);
            add(DISPLAY_SET33);
            add(DISPLAY_SET34);
            add(DISPLAY_SET35);
            add(DISPLAY_SET36);
            add(DISPLAY_SET37);
            add(DISPLAY_SET38);
            add(DISPLAY_SET39);
            add(DISPLAY_SET40);
            add(DISPLAY_SET41);
            add(DISPLAY_SET42);
            add(DISPLAY_SET43);
            add(DISPLAY_SET44);
            add(DISPLAY_SET45);
            add(DISPLAY_SET46);
            add(DISPLAY_SET47);
            add(DISPLAY_SET48);
            add(DISPLAY_SET49);
            add(DISPLAY_SET50);
            add(DISPLAY_SET51);
            add(DISPLAY_SET52);
            add(DISPLAY_SET53);
            add(DISPLAY_SET54);
            add(DISPLAY_SET55);
            add(DISPLAY_SET56);
            add(DISPLAY_SET57);
            add(DISPLAY_SET58);
            add(DISPLAY_SET59);
            add(DISPLAY_SET60);
            add(DISPLAY_SET61);
            add(DISPLAY_SET62);
            add(DISPLAY_SET63);
            add(DISPLAY_SET64);
            add(DISPLAY_SET65);
            add(DISPLAY_SET66);
            add(DISPLAY_SET67);
            add(DISPLAY_SET68);
            add(DISPLAY_SET69);
            add(DISPLAY_SET70);
            add(DISPLAY_SET71);
            add(DISPLAY_SET72);
            add(DISPLAY_SET73);
            add(DISPLAY_SET74);
            add(DISPLAY_SET75);
            add(DISPLAY_SET76);
            add(DISPLAY_SET77);
            add(DISPLAY_SET78);
            add(DISPLAY_SET79);
            add(DISPLAY_SET80);
            add(DISPLAY_SET81);
            add(DISPLAY_SET82);
            add(DISPLAY_SET83);
            add(DISPLAY_SET84);
            add(DISPLAY_SET85);
            add(DISPLAY_SET86);
            add(DISPLAY_SET87);
            add(DISPLAY_SET88);
            add(DISPLAY_SET89);
            add(DISPLAY_SET90);
            add(DISPLAY_SET91);
            add(DISPLAY_SET92);
            add(DISPLAY_SET93);
            add(DISPLAY_SET94);
            add(DISPLAY_SET95);
            add(DISPLAY_SET96);
            add(DISPLAY_SET97);
            add(DISPLAY_SET98);
            add(DISPLAY_SET99);
            add(DISPLAY_SET100);
            add(DISPLAY_SET101);
            add(DISPLAY_SET102);
            add(DISPLAY_SET103);
            add(DISPLAY_SET104);
            add(DISPLAY_SET105);
            add(DISPLAY_SET106);
            add(DISPLAY_SET107);
            add(DISPLAY_SET108);
            add(DISPLAY_SET109);
            add(DISPLAY_SET110);
            add(DISPLAY_SET111);
            add(DISPLAY_SET112);
            add(DISPLAY_SET113);
            add(DISPLAY_SET114);
            add(DISPLAY_SET115);
            add(DISPLAY_SET116);
            add(DISPLAY_SET117);
            add(DISPLAY_SET118);
            add(DISPLAY_SET119);
            add(DISPLAY_SET120);
            add(DISPLAY_SET121);
            add(DISPLAY_SET122);
            add(DISPLAY_SET123);
            add(DISPLAY_SET124);
            add(DISPLAY_SET125);
            add(DISPLAY_SET126);
            add(DISPLAY_SET127);
            add(DISPLAY_SET128);
            add(DISPLAY_SET129);
            add(DISPLAY_SET130);
            add(DISPLAY_SET131);
            add(DISPLAY_SET132);
            add(DISPLAY_SET133);
            add(DISPLAY_SET134);
            add(DISPLAY_SET135);
            add(DISPLAY_SET136);
            add(DISPLAY_SET137);
            add(DISPLAY_SET138);
            add(DISPLAY_SET139);
            add(DISPLAY_SET140);
            add(DISPLAY_SET141);
            add(DISPLAY_SET142);
            add(DISPLAY_SET143);
            add(DISPLAY_SET144);
            add(DISPLAY_SET145);
            add(DISPLAY_SET146);
            add(DISPLAY_SET147);
            add(DISPLAY_SET148);
            add(DISPLAY_SET149);
            add(DISPLAY_SET150);
            add(DISPLAY_SET151);
            add(DISPLAY_SET152);
            add(DISPLAY_SET153);
            add(DISPLAY_SET154);
            add(DISPLAY_SET155);
            add(DISPLAY_SET156);
            add(DISPLAY_SET157);
            add(DISPLAY_SET158);
            add(DISPLAY_SET159);
            add(DISPLAY_SET160);
            add(DISPLAY_SET161);
            add(DISPLAY_SET162);
            add(DISPLAY_SET163);
            add(DISPLAY_SET164);
            add(DISPLAY_SET165);
            add(DISPLAY_SET166);
            add(DISPLAY_SET167);
            add(DISPLAY_SET168);
            add(DISPLAY_SET169);
            add(DISPLAY_SET170);
            add(DISPLAY_SET171);
            add(DISPLAY_SET172);
            add(DISPLAY_SET173);
            add(DISPLAY_SET174);
            add(DISPLAY_SET175);
            add(DISPLAY_SET176);
            add(DISPLAY_SET177);
            add(DISPLAY_SET178);
            add(DISPLAY_SET179);
            add(DISPLAY_SET180);
            add(DISPLAY_SET181);
            add(DISPLAY_SET182);
            add(DISPLAY_SET183);
            add(DISPLAY_SET184);
            add(DISPLAY_SET185);
            add(DISPLAY_SET186);
            add(DISPLAY_SET187);
            add(DISPLAY_SET188);
            add(DISPLAY_SET189);
            add(DISPLAY_SET190);
            add(DISPLAY_SET191);
            add(DISPLAY_SET192);
            add(DISPLAY_SET193);
            add(DISPLAY_SET194);
            add(DISPLAY_SET195);
            add(DISPLAY_SET196);
            add(DISPLAY_SET197);
            add(DISPLAY_SET198);
            add(DISPLAY_SET199);
            add(DISPLAY_SET200);
            add(DISPLAY_SET201);
            add(DISPLAY_SET202);
            add(DISPLAY_SET203);
            add(DISPLAY_SET204);
            add(DISPLAY_SET205);
            add(DISPLAY_SET206);
            add(DISPLAY_SET207);
            add(DISPLAY_SET208);
            add(DISPLAY_SET209);
            add(DISPLAY_SET210);
            add(DISPLAY_SET211);
            add(DISPLAY_SET212);
            add(DISPLAY_SET213);
            add(DISPLAY_SET214);
            add(DISPLAY_SET215);
            add(DISPLAY_SET216);
            add(DISPLAY_SET217);
            add(DISPLAY_SET218);
            add(DISPLAY_SET219);
            add(DISPLAY_SET220);
            add(DISPLAY_SET221);
            add(DISPLAY_SET222);
            add(DISPLAY_SET223);
            add(DISPLAY_SET224);
            add(DISPLAY_SET225);
            add(DISPLAY_SET226);
            add(DISPLAY_SET227);
            add(DISPLAY_SET228);
            add(DISPLAY_SET229);
            add(DISPLAY_SET230);
            add(DISPLAY_SET231);
            add(DISPLAY_SET232);
            add(DISPLAY_SET233);
            add(DISPLAY_SET234);
            add(DISPLAY_SET235);
            add(DISPLAY_SET236);
            add(DISPLAY_SET237);
            add(DISPLAY_SET238);
            add(DISPLAY_SET239);
            add(DISPLAY_SET240);
            add(DISPLAY_SET241);
            add(DISPLAY_SET242);
            add(DISPLAY_SET243);
            add(DISPLAY_SET244);
            add(DISPLAY_SET245);
            add(DISPLAY_SET246);
            add(DISPLAY_SET247);
            add(DISPLAY_SET248);
            add(DISPLAY_SET249);
            add(DISPLAY_SET250);
            add(DISPLAY_SET251);
            add(DISPLAY_SET252);
            add(DISPLAY_SET253);
            add(DISPLAY_SET254);
            add(DISPLAY_SET255);
            add(DISPLAY_SET256);
            add(DISPLAY_SET257);
            add(DISPLAY_SET258);
            add(DISPLAY_SET259);
            add(DISPLAY_SET260);
            add(DISPLAY_SET261);
            add(DISPLAY_SET262);
            add(DISPLAY_SET263);
            add(DISPLAY_SET264);
            add(DISPLAY_SET265);
            add(DISPLAY_SET266);
            add(DISPLAY_SET267);
            add(DISPLAY_SET268);
            add(DISPLAY_SET269);
            add(DISPLAY_SET270);
            add(DISPLAY_SET271);
            add(DISPLAY_SET272);
            add(DISPLAY_SET273);
            add(DISPLAY_SET274);
            add(DISPLAY_SET275);
            add(DISPLAY_SET276);
            add(DISPLAY_SET277);
            add(DISPLAY_SET278);
            add(DISPLAY_SET279);
            add(DISPLAY_SET280);
            add(DISPLAY_SET281);
            add(DISPLAY_SET282);
            add(DISPLAY_SET283);
            add(DISPLAY_SET284);
            add(DISPLAY_SET285);
            add(DISPLAY_SET286);
            add(DISPLAY_SET287);
            add(DISPLAY_SET288);
            add(DISPLAY_SET289);
            add(DISPLAY_SET290);
            add(DISPLAY_SET291);
            add(DISPLAY_SET292);
            add(DISPLAY_SET293);
            add(DISPLAY_SET294);
            add(DISPLAY_SET295);
            add(DISPLAY_SET296);
            add(DISPLAY_SET297);
            add(DISPLAY_SET298);
            add(DISPLAY_SET299);
            add(DISPLAY_SET300);
            add(DISPLAY_SET301);
            add(DISPLAY_SET302);
            add(DISPLAY_SET303);
            add(DISPLAY_SET304);
            add(DISPLAY_SET305);
            add(DISPLAY_SET306);
            add(DISPLAY_SET307);
            add(DISPLAY_SET308);
            add(DISPLAY_SET309);
            add(DISPLAY_SET310);
            add(DISPLAY_SET311);
            add(DISPLAY_SET312);
            add(DISPLAY_SET313);
            add(DISPLAY_SET314);
            add(DISPLAY_SET315);
            add(DISPLAY_SET316);
            add(DISPLAY_SET317);
            add(DISPLAY_SET318);
            add(DISPLAY_SET319);
            add(DISPLAY_SET320);
            add(DISPLAY_SET321);
            add(DISPLAY_SET322);
            add(DISPLAY_SET323);
            add(DISPLAY_SET324);
            add(DISPLAY_SET325);
            add(DISPLAY_SET326);
            add(DISPLAY_SET327);
            add(DISPLAY_SET328);
            add(DISPLAY_SET329);
            add(DISPLAY_SET330);
            add(DISPLAY_SET331);
            add(DISPLAY_SET332);
            add(DISPLAY_SET333);
            add(DISPLAY_SET334);
            add(DISPLAY_SET335);
            add(DISPLAY_SET336);
            add(DISPLAY_SET337);
            add(DISPLAY_SET338);
            add(DISPLAY_SET339);
            add(DISPLAY_SET340);
            add(DISPLAY_SET341);
            add(DISPLAY_SET342);
            add(DISPLAY_SET343);
            add(DISPLAY_SET344);
            add(DISPLAY_SET345);
            add(DISPLAY_SET346);
            add(DISPLAY_SET347);
            add(DISPLAY_SET348);
            add(DISPLAY_SET349);
            add(DISPLAY_SET350);
            add(DISPLAY_SET351);
            add(DISPLAY_SET352);
            add(DISPLAY_SET353);
            add(DISPLAY_SET354);
            add(DISPLAY_SET355);
            add(DISPLAY_SET356);
            add(DISPLAY_SET357);
            add(DISPLAY_SET358);
            add(DISPLAY_SET359);
            add(DISPLAY_SET360);
            add(DISPLAY_SET361);
            add(DISPLAY_SET362);
            add(DISPLAY_SET363);
            add(DISPLAY_SET364);
            add(DISPLAY_SET365);
            add(DISPLAY_SET366);
            add(DISPLAY_SET367);
            add(DISPLAY_SET368);
            add(DISPLAY_SET369);
            add(DISPLAY_SET370);
            add(DISPLAY_SET371);
            add(DISPLAY_SET372);
            add(DISPLAY_SET373);
            add(DISPLAY_SET374);
            add(DISPLAY_SET375);
            add(DISPLAY_SET376);
            add(DISPLAY_SET377);
            add(DISPLAY_SET378);
            add(DISPLAY_SET379);
            add(DISPLAY_SET380);
            add(DISPLAY_SET381);
            add(DISPLAY_SET382);
            add(DISPLAY_SET383);
            add(DISPLAY_SET384);
            add(DISPLAY_SET385);
            add(DISPLAY_SET386);
            add(DISPLAY_SET387);
            add(DISPLAY_SET388);
            add(DISPLAY_SET389);
            add(DISPLAY_SET390);
            add(DISPLAY_SET391);
            add(DISPLAY_SET392);
            add(DISPLAY_SET393);
            add(DISPLAY_SET394);
            add(DISPLAY_SET395);
            add(DISPLAY_SET396);
            add(DISPLAY_SET397);
            add(DISPLAY_SET398);
            add(DISPLAY_SET399);
            add(DISPLAY_SET400);
            add(DISPLAY_SET401);
            add(DISPLAY_SET402);
            add(DISPLAY_SET403);
            add(DISPLAY_SET404);
            add(DISPLAY_SET405);
            add(DISPLAY_SET406);
            add(DISPLAY_SET407);
            add(DISPLAY_SET408);
            add(DISPLAY_SET409);
            add(DISPLAY_SET410);
            add(DISPLAY_SET411);
            add(DISPLAY_SET412);
            add(DISPLAY_SET413);
            add(DISPLAY_SET414);
            add(DISPLAY_SET415);
            add(DISPLAY_SET416);
            add(DISPLAY_SET417);
            add(DISPLAY_SET418);
            add(DISPLAY_SET419);
            add(DISPLAY_SET420);
            add(DISPLAY_SET421);
            add(DISPLAY_SET422);
            add(DISPLAY_SET423);
            add(DISPLAY_SET424);
            add(DISPLAY_SET425);
            add(DISPLAY_SET426);
            add(DISPLAY_SET427);
            add(DISPLAY_SET428);
            add(DISPLAY_SET429);
            add(DISPLAY_SET430);
            add(DISPLAY_SET431);
            add(DISPLAY_SET432);
            add(DISPLAY_SET433);
            add(DISPLAY_SET434);
            add(DISPLAY_SET435);
            add(DISPLAY_SET436);
            add(DISPLAY_SET437);
            add(DISPLAY_SET438);
            add(DISPLAY_SET439);
            add(DISPLAY_SET440);
            add(DISPLAY_SET441);
            add(DISPLAY_SET442);
            add(DISPLAY_SET443);
            add(DISPLAY_SET444);
            add(DISPLAY_SET445);
            add(DISPLAY_SET446);
            add(DISPLAY_SET447);
            add(DISPLAY_SET448);
            add(DISPLAY_SET449);
            add(DISPLAY_SET450);
            add(DISPLAY_SET451);
            add(DISPLAY_SET452);
            add(DISPLAY_SET453);
            add(DISPLAY_SET454);
            add(DISPLAY_SET455);
            add(DISPLAY_SET456);
            add(DISPLAY_SET457);
            add(DISPLAY_SET458);
            add(DISPLAY_SET459);
            add(DISPLAY_SET460);
            add(DISPLAY_SET461);
            add(DISPLAY_SET462);
            add(DISPLAY_SET463);
            add(DISPLAY_SET464);
            add(DISPLAY_SET465);
            add(DISPLAY_SET466);
            add(DISPLAY_SET467);
            add(DISPLAY_SET468);
            add(DISPLAY_SET469);
            add(DISPLAY_SET470);
            add(DISPLAY_SET471);
            add(DISPLAY_SET472);
            add(DISPLAY_SET473);
            add(DISPLAY_SET474);
            add(DISPLAY_SET475);
            add(DISPLAY_SET476);
            add(DISPLAY_SET477);
            add(DISPLAY_SET478);
            add(DISPLAY_SET479);
            add(DISPLAY_SET480);
            add(DISPLAY_SET481);
            add(DISPLAY_SET482);
            add(DISPLAY_SET483);
            add(DISPLAY_SET484);
            add(DISPLAY_SET485);
            add(DISPLAY_SET486);
            add(DISPLAY_SET487);
            add(DISPLAY_SET488);
            add(DISPLAY_SET489);
            add(DISPLAY_SET490);
            add(DISPLAY_SET491);
            add(DISPLAY_SET492);
            add(DISPLAY_SET493);
            add(DISPLAY_SET494);
            add(DISPLAY_SET495);
            add(DISPLAY_SET496);
            add(DISPLAY_SET497);
            add(DISPLAY_SET498);
            add(DISPLAY_SET499);
            add(DISPLAY_SET500);
            add(DISPLAY_SET501);
            add(DISPLAY_SET502);
            add(DISPLAY_SET503);
            add(DISPLAY_SET504);
            add(DISPLAY_SET505);
            add(DISPLAY_SET506);
            add(DISPLAY_SET507);
            add(DISPLAY_SET508);
            add(DISPLAY_SET509);
            add(DISPLAY_SET510);
            add(DISPLAY_SET511);
            add(DISPLAY_SET512);
            add(DISPLAY_SET513);
            add(DISPLAY_SET514);
            add(DISPLAY_SET515);
            add(DISPLAY_SET516);
            add(DISPLAY_SET517);
            add(DISPLAY_SET518);
            add(DISPLAY_SET519);
            add(DISPLAY_SET520);
            add(DISPLAY_SET521);
            add(DISPLAY_SET522);
            add(DISPLAY_SET523);
            add(DISPLAY_SET524);
            add(DISPLAY_SET525);
            add(DISPLAY_SET526);
            add(DISPLAY_SET527);
            add(DISPLAY_SET528);
            add(DISPLAY_SET529);
            add(DISPLAY_SET530);
            add(DISPLAY_SET531);
            add(DISPLAY_SET532);
            add(DISPLAY_SET533);
            add(DISPLAY_SET534);
            add(DISPLAY_SET535);
            add(DISPLAY_SET536);
            add(DISPLAY_SET537);
            add(DISPLAY_SET538);
            add(DISPLAY_SET539);
            add(DISPLAY_SET540);
            add(DISPLAY_SET541);
            add(DISPLAY_SET542);
            add(DISPLAY_SET543);
            add(DISPLAY_SET544);
            add(DISPLAY_SET545);
            add(DISPLAY_SET546);
            add(DISPLAY_SET547);
            add(DISPLAY_SET548);
            add(DISPLAY_SET549);
            add(DISPLAY_SET550);
            add(DISPLAY_SET551);
            add(DISPLAY_SET552);
            add(DISPLAY_SET553);
            add(DISPLAY_SET554);
            add(DISPLAY_SET555);
            add(DISPLAY_SET556);
            add(DISPLAY_SET557);
            add(DISPLAY_SET558);
            add(DISPLAY_SET559);
            add(DISPLAY_SET560);
            add(DISPLAY_SET561);
            add(DISPLAY_SET562);
            add(DISPLAY_SET563);
            add(DISPLAY_SET564);
            add(DISPLAY_SET565);
            add(DISPLAY_SET566);
            add(DISPLAY_SET567);
            add(DISPLAY_SET568);
            add(DISPLAY_SET569);
            add(DISPLAY_SET570);
            add(DISPLAY_SET571);
            add(DISPLAY_SET572);
            add(DISPLAY_SET573);
            add(DISPLAY_SET574);
            add(DISPLAY_SET575);
            add(DISPLAY_SET576);
            add(DISPLAY_SET577);
            add(DISPLAY_SET578);
            add(DISPLAY_SET579);
            add(DISPLAY_SET580);
            add(DISPLAY_SET581);
            add(DISPLAY_SET582);
            add(DISPLAY_SET583);
            add(DISPLAY_SET584);
            add(DISPLAY_SET585);
            add(DISPLAY_SET586);
            add(DISPLAY_SET587);
            add(DISPLAY_SET588);
            add(DISPLAY_SET589);
            add(DISPLAY_SET590);
            add(DISPLAY_SET591);
            add(DISPLAY_SET592);
            add(DISPLAY_SET593);
            add(DISPLAY_SET594);
            add(DISPLAY_SET595);
            add(DISPLAY_SET596);
            add(DISPLAY_SET597);
            add(DISPLAY_SET598);
            add(DISPLAY_SET599);
            add(DISPLAY_SET600);
            add(DISPLAY_SET601);
            add(DISPLAY_SET602);
            add(DISPLAY_SET603);
            add(DISPLAY_SET604);
            add(DISPLAY_SET605);
            add(DISPLAY_SET606);
            add(DISPLAY_SET607);
            add(DISPLAY_SET608);
            add(DISPLAY_SET609);
            add(DISPLAY_SET610);
            add(DISPLAY_SET611);
            add(DISPLAY_SET612);
            add(DISPLAY_SET613);
            add(DISPLAY_SET614);
            add(DISPLAY_SET615);
            add(DISPLAY_SET616);
            add(DISPLAY_SET617);
            add(DISPLAY_SET618);
            add(DISPLAY_SET619);
            add(DISPLAY_SET620);
            add(DISPLAY_SET621);
            add(DISPLAY_SET622);
            add(DISPLAY_SET623);
            add(DISPLAY_SET624);
            add(DISPLAY_SET625);
            add(DISPLAY_SET626);
            add(DISPLAY_SET627);
            add(DISPLAY_SET628);
            add(DISPLAY_SET629);
            add(DISPLAY_SET630);
            add(DISPLAY_SET631);
            add(DISPLAY_SET632);
            add(DISPLAY_SET633);
            add(DISPLAY_SET634);
            add(DISPLAY_SET635);
            add(DISPLAY_SET636);
            add(DISPLAY_SET637);
            add(DISPLAY_SET638);
            add(DISPLAY_SET639);
            add(DISPLAY_SET640);
            add(DISPLAY_SET641);
            add(DISPLAY_SET642);
            add(DISPLAY_SET643);
            add(DISPLAY_SET644);
            add(DISPLAY_SET645);
            add(DISPLAY_SET646);
            add(DISPLAY_SET647);
            add(DISPLAY_SET648);
            add(DISPLAY_SET649);
            add(DISPLAY_SET650);
            add(DISPLAY_SET651);
            add(DISPLAY_SET652);
            add(DISPLAY_SET653);
            add(DISPLAY_SET654);
            add(DISPLAY_SET655);
            add(DISPLAY_SET656);
            add(DISPLAY_SET657);
            add(DISPLAY_SET658);
            add(DISPLAY_SET659);
            add(DISPLAY_SET660);
            add(DISPLAY_SET661);
            add(DISPLAY_SET662);
            add(DISPLAY_SET663);
            add(DISPLAY_SET664);
            add(DISPLAY_SET665);
            add(DISPLAY_SET666);
            add(DISPLAY_SET667);
            add(DISPLAY_SET668);
            add(DISPLAY_SET669);
            add(DISPLAY_SET670);
            add(DISPLAY_SET671);
            add(DISPLAY_SET672);
            add(DISPLAY_SET673);
            add(DISPLAY_SET674);
            add(DISPLAY_SET675);
            add(DISPLAY_SET676);
            add(DISPLAY_SET677);
            add(DISPLAY_SET678);
            add(DISPLAY_SET679);
            add(DISPLAY_SET680);
            add(DISPLAY_SET681);
            add(DISPLAY_SET682);
            add(DISPLAY_SET683);
            add(DISPLAY_SET684);
            add(DISPLAY_SET685);
            add(DISPLAY_SET686);
            add(DISPLAY_SET687);
            add(DISPLAY_SET688);
            add(DISPLAY_SET689);
            add(DISPLAY_SET690);
            add(DISPLAY_SET691);
            add(DISPLAY_SET692);
            add(DISPLAY_SET693);
            add(DISPLAY_SET694);
            add(DISPLAY_SET695);
            add(DISPLAY_SET696);
            add(DISPLAY_SET697);
            add(DISPLAY_SET698);
            add(DISPLAY_SET699);
            add(DISPLAY_SET700);
            add(DISPLAY_SET701);
            add(DISPLAY_SET702);
            add(DISPLAY_SET703);
            add(DISPLAY_SET704);
            add(DISPLAY_SET705);
            add(DISPLAY_SET706);
            add(DISPLAY_SET707);
            add(DISPLAY_SET708);
            add(DISPLAY_SET709);
            add(DISPLAY_SET710);
            add(DISPLAY_SET711);
            add(DISPLAY_SET712);
            add(DISPLAY_SET713);
            add(DISPLAY_SET714);
            add(DISPLAY_SET715);
            add(DISPLAY_SET716);
            add(DISPLAY_SET717);
            add(DISPLAY_SET718);
            add(DISPLAY_SET719);
            add(DISPLAY_SET720);
            add(DISPLAY_SET721);
            add(DISPLAY_SET722);
            add(DISPLAY_SET723);
            add(DISPLAY_SET724);
            add(DISPLAY_SET725);
            add(DISPLAY_SET726);
            add(DISPLAY_SET727);
            add(DISPLAY_SET728);
            add(DISPLAY_SET729);
            add(DISPLAY_SET730);
            add(DISPLAY_SET731);
            add(DISPLAY_SET732);
            add(DISPLAY_SET733);
            add(DISPLAY_SET734);
            add(DISPLAY_SET735);
            add(DISPLAY_SET736);
            add(DISPLAY_SET737);
            add(DISPLAY_SET738);
            add(DISPLAY_SET739);
            add(DISPLAY_SET740);
            add(DISPLAY_SET741);
            add(DISPLAY_SET742);
            add(DISPLAY_SET743);
            add(DISPLAY_SET744);
            add(DISPLAY_SET745);
            add(DISPLAY_SET746);
            add(DISPLAY_SET747);
            add(DISPLAY_SET748);
            add(DISPLAY_SET749);
            add(DISPLAY_SET750);
            add(DISPLAY_SET751);
            add(DISPLAY_SET752);
            add(DISPLAY_SET753);
            add(DISPLAY_SET754);
            add(DISPLAY_SET755);
            add(DISPLAY_SET756);
            add(DISPLAY_SET757);
            add(DISPLAY_SET758);
            add(DISPLAY_SET759);
            add(DISPLAY_SET760);
            add(DISPLAY_SET761);
            add(DISPLAY_SET762);
            add(DISPLAY_SET763);
            add(DISPLAY_SET764);
            add(DISPLAY_SET765);
            add(DISPLAY_SET766);
            add(DISPLAY_SET767);
            add(DISPLAY_SET768);
            add(DISPLAY_SET769);
            add(DISPLAY_SET770);
            add(DISPLAY_SET771);
            add(DISPLAY_SET772);
            add(DISPLAY_SET773);
            add(DISPLAY_SET774);
            add(DISPLAY_SET775);
            add(DISPLAY_SET776);
            add(DISPLAY_SET777);
            add(DISPLAY_SET778);
            add(DISPLAY_SET779);
            add(DISPLAY_SET780);
            add(DISPLAY_SET781);
            add(DISPLAY_SET782);
            add(DISPLAY_SET783);
            add(DISPLAY_SET784);
            add(DISPLAY_SET785);
            add(DISPLAY_SET786);
            add(DISPLAY_SET787);
            add(DISPLAY_SET788);
            add(DISPLAY_SET789);
            add(DISPLAY_SET790);
            add(DISPLAY_SET791);
            add(DISPLAY_SET792);
            add(DISPLAY_SET793);
            add(DISPLAY_SET794);
            add(DISPLAY_SET795);
            add(DISPLAY_SET796);
            add(DISPLAY_SET797);
            add(DISPLAY_SET798);
            add(DISPLAY_SET799);
            add(DISPLAY_SET800);
            add(DISPLAY_SET801);
            add(DISPLAY_SET802);
            add(DISPLAY_SET803);
            add(DISPLAY_SET804);
            add(DISPLAY_SET805);
            add(DISPLAY_SET806);
            add(DISPLAY_SET807);
            add(DISPLAY_SET808);
            add(DISPLAY_SET809);
            add(DISPLAY_SET810);
            add(DISPLAY_SET811);
            add(DISPLAY_SET812);
            add(DISPLAY_SET813);
            add(DISPLAY_SET814);
            add(DISPLAY_SET815);
            add(DISPLAY_SET816);
            add(DISPLAY_SET817);
            add(DISPLAY_SET818);
            add(DISPLAY_SET819);
            add(DISPLAY_SET820);
            add(DISPLAY_SET821);
            add(DISPLAY_SET822);
            add(DISPLAY_SET823);
            add(DISPLAY_SET824);
            add(DISPLAY_SET825);
            add(DISPLAY_SET826);
            add(DISPLAY_SET827);
            add(DISPLAY_SET828);
            add(DISPLAY_SET829);
            add(DISPLAY_SET830);
            add(DISPLAY_SET831);
            add(DISPLAY_SET832);
            add(DISPLAY_SET833);
            add(DISPLAY_SET834);
            add(DISPLAY_SET835);
            add(DISPLAY_SET836);
            add(DISPLAY_SET837);
            add(DISPLAY_SET838);
            add(DISPLAY_SET839);
            add(DISPLAY_SET840);
            add(DISPLAY_SET841);
            add(DISPLAY_SET842);
            add(DISPLAY_SET843);
            add(DISPLAY_SET844);
            add(DISPLAY_SET845);
            add(DISPLAY_SET846);
            add(DISPLAY_SET847);
            add(DISPLAY_SET848);
            add(DISPLAY_SET849);
            add(DISPLAY_SET850);
            add(DISPLAY_SET851);
            add(DISPLAY_SET852);
            add(DISPLAY_SET853);
            add(DISPLAY_SET854);
            add(DISPLAY_SET855);
            add(DISPLAY_SET856);
            add(DISPLAY_SET857);
            add(DISPLAY_SET858);
            add(DISPLAY_SET859);
            add(DISPLAY_SET860);
            add(DISPLAY_SET861);
            add(DISPLAY_SET862);
            add(DISPLAY_SET863);
            add(DISPLAY_SET864);
            add(DISPLAY_SET865);
            add(DISPLAY_SET866);
            add(DISPLAY_SET867);
            add(DISPLAY_SET868);
            add(DISPLAY_SET869);
            add(DISPLAY_SET870);
            add(DISPLAY_SET871);
            add(DISPLAY_SET872);
            add(DISPLAY_SET873);
            add(DISPLAY_SET874);
            add(DISPLAY_SET875);
            add(DISPLAY_SET876);
            add(DISPLAY_SET877);
            add(DISPLAY_SET878);
            add(DISPLAY_SET879);
            add(DISPLAY_SET880);
            add(DISPLAY_SET881);
            add(DISPLAY_SET882);
            add(DISPLAY_SET883);
            add(DISPLAY_SET884);
            add(DISPLAY_SET885);
            add(DISPLAY_SET886);
            add(DISPLAY_SET887);
            add(DISPLAY_SET888);
            add(DISPLAY_SET889);
            add(DISPLAY_SET890);
            add(DISPLAY_SET891);
            add(DISPLAY_SET892);
            add(DISPLAY_SET893);
            add(DISPLAY_SET894);
            add(DISPLAY_SET895);
            add(DISPLAY_SET896);
            add(DISPLAY_SET897);
            add(DISPLAY_SET898);
            add(DISPLAY_SET899);
            add(DISPLAY_SET900);
            add(DISPLAY_SET901);
            add(DISPLAY_SET902);
            add(DISPLAY_SET903);
            add(DISPLAY_SET904);
            add(DISPLAY_SET905);
            add(DISPLAY_SET906);
            add(DISPLAY_SET907);
            add(DISPLAY_SET908);
            add(DISPLAY_SET909);
            add(DISPLAY_SET910);
            add(DISPLAY_SET911);
            add(DISPLAY_SET912);
            add(DISPLAY_SET913);
            add(DISPLAY_SET914);
            add(DISPLAY_SET915);
            add(DISPLAY_SET916);
            add(DISPLAY_SET917);
            add(DISPLAY_SET918);
            add(DISPLAY_SET919);
            add(DISPLAY_SET920);
            add(DISPLAY_SET921);
            add(DISPLAY_SET922);
            add(DISPLAY_SET923);
            add(DISPLAY_SET924);
            add(DISPLAY_SET925);
            add(DISPLAY_SET926);
            add(DISPLAY_SET927);
            add(DISPLAY_SET928);
            add(DISPLAY_SET929);
            add(DISPLAY_SET930);
            add(DISPLAY_SET931);
            add(DISPLAY_SET932);
            add(DISPLAY_SET933);
            add(DISPLAY_SET934);
            add(DISPLAY_SET935);
            add(DISPLAY_SET936);
            add(DISPLAY_SET937);
            add(DISPLAY_SET938);
            add(DISPLAY_SET939);
            add(DISPLAY_SET940);
            add(DISPLAY_SET941);
            add(DISPLAY_SET942);
            add(DISPLAY_SET943);
            add(DISPLAY_SET944);
            add(DISPLAY_SET945);
            add(DISPLAY_SET946);
            add(DISPLAY_SET947);
            add(DISPLAY_SET948);
            add(DISPLAY_SET949);
            add(DISPLAY_SET950);
            add(DISPLAY_SET951);
            add(DISPLAY_SET952);
            add(DISPLAY_SET953);
            add(DISPLAY_SET954);
            add(DISPLAY_SET955);
            add(DISPLAY_SET956);
            add(DISPLAY_SET957);
            add(DISPLAY_SET958);
            add(DISPLAY_SET959);
            add(DISPLAY_SET960);
            add(DISPLAY_SET961);
            add(DISPLAY_SET962);
            add(DISPLAY_SET963);
            add(DISPLAY_SET964);
            add(DISPLAY_SET965);
            add(DISPLAY_SET966);
            add(DISPLAY_SET967);
            add(DISPLAY_SET968);
            add(DISPLAY_SET969);
            add(DISPLAY_SET970);
            add(DISPLAY_SET971);
            add(DISPLAY_SET972);
            add(DISPLAY_SET973);
            add(DISPLAY_SET974);
            add(DISPLAY_SET975);
            add(DISPLAY_SET976);
            add(DISPLAY_SET977);
            add(DISPLAY_SET978);
            add(DISPLAY_SET979);
            add(DISPLAY_SET980);
            add(DISPLAY_SET981);
            add(DISPLAY_SET982);
            add(DISPLAY_SET983);
            add(DISPLAY_SET984);
            add(DISPLAY_SET985);
            add(DISPLAY_SET986);
            add(DISPLAY_SET987);
            add(DISPLAY_SET988);
            add(DISPLAY_SET989);
            add(DISPLAY_SET990);
            add(DISPLAY_SET991);
            add(DISPLAY_SET992);
            add(DISPLAY_SET993);
            add(DISPLAY_SET994);
            add(DISPLAY_SET995);
            add(DISPLAY_SET996);
            add(DISPLAY_SET997);
            add(DISPLAY_SET998);
            add(DISPLAY_SET999);
            add(DISPLAY_SET1000);
            add(DISPLAY_SET1001);
            add(DISPLAY_SET1002);
            add(DISPLAY_SET1003);
            add(DISPLAY_SET1004);
            add(DISPLAY_SET1005);
            add(DISPLAY_SET1006);
            add(DISPLAY_SET1007);
            add(DISPLAY_SET1008);
            add(DISPLAY_SET1009);
            add(DISPLAY_SET1010);
            add(DISPLAY_SET1011);
            add(DISPLAY_SET1012);
            add(DISPLAY_SET1013);
            add(DISPLAY_SET1014);
            add(DISPLAY_SET1015);
            add(DISPLAY_SET1016);
            add(DISPLAY_SET1017);
            add(DISPLAY_SET1018);
            add(DISPLAY_SET1019);
            add(DISPLAY_SET1020);
            add(DISPLAY_SET1021);
            add(DISPLAY_SET1022);
            add(DISPLAY_SET1023);
            add(DISPLAY_SET1024);
        }
    };

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.2.0
     */
    private PlantUMLDependencyDisplaySetTestConstants() {
        super();
    }
}
