/*
 PlantUMLDependencyTestConstants.java
 Creation date : 11/07/2007
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
import static net.sourceforge.mazix.cli.utils.fileset.FileSetUtils.createFileSet;
import static net.sourceforge.mazix.components.constants.CommonConstants.CURRENT_DIRECTORY;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ATTRIBUTES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ONLY_PARSED_OBJECTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.PACKAGES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.values;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.command.impl.CommandLineImpl;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseOption;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

import org.apache.tools.ant.types.FileSet;

/**
 * The class which stores all necessary plantUML dependency constants used for Junit tests.
 * 
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public final class PlantUMLDependencyTestConstants {

    /** Command line test 1 instance. */
    public static final CommandLine COMMAND_LINE1 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-b", "."});

    /** Command line test 2 instance. */
    public static final CommandLine COMMAND_LINE2 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-b"});

    /** Command line test 3 instance. */
    public static final CommandLine COMMAND_LINE3 = new CommandLineImpl(new String[] {"-o", "plantuml.txt"});

    /** Command line test 4 instance. */
    public static final CommandLine COMMAND_LINE4 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-b", ".",
            "-b", "/"});

    /** Command line test 5 instance. */
    public static final CommandLine COMMAND_LINE5 = new CommandLineImpl(new String[] {"-o", "./log.txt", "-d",
            "classes,enums,imports,interfaces,packages,static_imports", "-v", "-version", "-d", "classes"});

    /** Command line test 6 instance. */
    public static final CommandLine COMMAND_LINE6 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-d", "-v",
            "-version"});

    /** Command line test 7 instance. */
    public static final CommandLine COMMAND_LINE7 = new CommandLineImpl(new String[] {"-v", "-d",
            "packages,static_imports,enums", "-o", "plantuml.txt"});

    /** Command line test 8 instance. */
    public static final CommandLine COMMAND_LINE8 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-e",
            "PlantUMLDependencyProgrammingLanguageOptionTest.java", "-e",
            "PlantUMLDependencyProgrammingLanguageOptionTest.java"});

    /** Command line test 9 instance. */
    public static final CommandLine COMMAND_LINE9 = new CommandLineImpl(new String[] {"-i", "*.cpp", "-i", "*.java",
            "-o", "plantuml.txt"});

    /** Command line test 10 instance. */
    public static final CommandLine COMMAND_LINE10 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-e"});

    /** Command line test 11 instance. */
    public static final CommandLine COMMAND_LINE11 = new CommandLineImpl(new String[] {"-i", "-o", "plantuml.txt"});

    /** Command line test 12 instance. */
    public static final CommandLine COMMAND_LINE12 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-e",
            "PlantUMLDependencyProgrammingLanguageOptionTest.java"});

    /** Command line test 13 instance. */
    public static final CommandLine COMMAND_LINE13 = new CommandLineImpl(new String[] {"-i", "*.java", "-o",
            "plantuml.txt"});

    /** Command line test 14 instance. */
    public static final CommandLine COMMAND_LINE14 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-l",
            "cpp"});

    /** Command line test 15 instance. */
    public static final CommandLine COMMAND_LINE15 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-l"});

    /** Command line test 16 instance. */
    public static final CommandLine COMMAND_LINE16 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-l",
            "cpp", "-l", "java"});
    
    /** Command line test 17 instance. */
    public static final CommandLine COMMAND_LINE17 = new CommandLineImpl(new String[] {"-o"});
    
    /** Command line test 18 instance. */
    public static final CommandLine COMMAND_LINE18 = new CommandLineImpl(new String[] {"-version"});
    
    /** Command line test 19 instance. */
    public static final CommandLine COMMAND_LINE19 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-o", "log.txt",});

    /** File set test 1 instance. */
    public static final FileSet FILE_SET1 = createFileSet(CURRENT_DIRECTORY, "**/*");

    /** File set test 1 instance. */
    public static final FileSet FILE_SET2 = createFileSet(CURRENT_DIRECTORY, "**/*A*.java");

    /** Display set test 1 instance. */
    public static final Set < Display > DISPLAY_SET1 = new TreeSet < Display >();

    /** Display set test 2 instance. */
    public static final Set < Display > DISPLAY_SET2 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES, PACKAGES, STATIC_IMPORTS}));

    /** Display set test 3 instance. */
    public static final Set < Display > DISPLAY_SET3 = new TreeSet < Display >(asList(values()));

    /** Display set test 4 instance. */
    public static final Set < Display > DISPLAY_SET4 = new TreeSet < Display >(asList(new Display[] {CLASSES}));

    /** Display set test 5 instance. */
    public static final Set < Display > DISPLAY_SET5 = new TreeSet < Display >(asList(new Display[] {CLASSES}));

    /** Display set test 6 instance. */
    public static final Set < Display > DISPLAY_SET6 = new TreeSet < Display >(asList(new Display[] {
            ONLY_PARSED_OBJECTS, METHODS, ATTRIBUTES}));

    /** Verbose option test 1 instance. */
    public static final VerboseOption VERBOSE_OPTION1 = new VerboseOption(false, new StringBuffer(
            "To display log information."));

    /** Verbose option test 2 instance. */
    public static final VerboseOption VERBOSE_OPTION2 = new VerboseOption(true, new StringBuffer(
            "To display log information."));
    
    /** Extensions set test 1 instance. */
    public static final Set < String > EXTENSIONS_SET1 = new TreeSet < String >(asList(new String[] {"java.lang.Number"}));
    
    /** Implementations set test 1 instance. */
    public static final Set < String > IMPLEMENTATIONS_SET1 = new TreeSet < String >(asList(new String[] {"java.lang.Comparable", "java.io.Serializable"}));

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private PlantUMLDependencyTestConstants() {
        super();
    }
}
