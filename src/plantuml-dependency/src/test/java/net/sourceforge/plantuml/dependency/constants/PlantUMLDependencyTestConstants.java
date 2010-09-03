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
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.constants.CommonConstants.CURRENT_DIRECTORY;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ATTRIBUTES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_LINKS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ONLY_PACKAGES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ONLY_PARSED_OBJECTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.values;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.command.impl.CommandLineImpl;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseOption;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassAbstractDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext;

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
            "classes,enums,imports,interfaces,only_packages,static_imports,native_links", "-v", "-version", "-d",
            "classes"});

    /** Command line test 6 instance. */
    public static final CommandLine COMMAND_LINE6 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-d", "-v",
            "-version"});

    /** Command line test 7 instance. */
    public static final CommandLine COMMAND_LINE7 = new CommandLineImpl(new String[] {"-v", "-d",
            "only_packages,static_imports,enums", "-o", "plantuml.txt"});

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
    public static final CommandLine COMMAND_LINE19 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-o",
            "log.txt",});

    /** Command line test 20 instance. */
    public static final CommandLine COMMAND_LINE20 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-i"});

    /** File set test 1 instance. */
    public static final FileSet FILE_SET1 = createFileSet(CURRENT_DIRECTORY, "**/*");

    /** File set test 1 instance. */
    public static final FileSet FILE_SET2 = createFileSet(CURRENT_DIRECTORY, "**/*A*.java");

    /** Display set test 1 instance. */
    public static final Set < Display > DISPLAY_SET1 = new TreeSet < Display >();

    /** Display set test 2 instance. */
    public static final Set < Display > DISPLAY_SET2 = new TreeSet < Display >(asList(new Display[] {CLASSES, ENUMS,
            IMPORTS, INTERFACES, ONLY_PACKAGES, STATIC_IMPORTS, NATIVE_LINKS}));

    /** Display set test 3 instance. */
    public static final Set < Display > DISPLAY_SET3 = new TreeSet < Display >(asList(values()));

    /** Display set test 4 instance. */
    public static final Set < Display > DISPLAY_SET4 = new TreeSet < Display >(asList(new Display[] {CLASSES}));

    /** Display set test 5 instance. */
    public static final Set < Display > DISPLAY_SET5 = new TreeSet < Display >(asList(new Display[] {CLASSES}));

    /** Display set test 6 instance. */
    public static final Set < Display > DISPLAY_SET6 = new TreeSet < Display >(asList(new Display[] {
            ONLY_PARSED_OBJECTS, METHODS, ATTRIBUTES}));

    /** Generic dependency set test 1 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET1 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {GENERIC_DEPENDENCY1, new GenericDependencyImpl("Serializable", "java.io"),
                    new GenericDependencyImpl("Comparable", "java.lang")}));

    /** Generic dependency set test 2 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET2 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {GENERIC_DEPENDENCY1}));

    /** Generic dependency set test 4 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET3 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {new GenericDependencyImpl("Cloneable", "javax.lang"),
                    new GenericDependencyImpl("Set", "java.lang")}));

    /** Generic dependency set test 5 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET5 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {new GenericDependencyImpl("Object", "java.lang")}));

    /** Verbose option test 1 instance. */
    public static final VerboseOption VERBOSE_OPTION1 = new VerboseOption(false, new StringBuffer(
            "To display log information."));

    /** Verbose option test 2 instance. */
    public static final VerboseOption VERBOSE_OPTION2 = new VerboseOption(true, new StringBuffer(
            "To display log information."));

    /** Extensions set test 1 instance. */
    public static final Set < String > EXTENSIONS_SET1 = new TreeSet < String >(
            asList(new String[] {"java.lang.Number"}));

    /** Implementations set test 1 instance. */
    public static final Set < String > IMPLEMENTATIONS_SET1 = new TreeSet < String >(asList(new String[] {
            "java.lang.Comparable", "java.io.Serializable"}));

    /** Class dependency type test 2 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE2 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test");

    /** Class dependency type test 3 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE3 = new ClassDependencyTypeImpl("Test",
            BLANK_STRING, new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 4 instance. */
    public static final ClassAbstractDependencyTypeImpl CLASS_DEPENDENCY_TYPE4 = new ClassAbstractDependencyTypeImpl(
            "Test", "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 5 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE5 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl("TestExtends",
                    "com.plantuml.test")})));

    /** Class dependency type test 6 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE6 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("AnotherTestExtends",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "AnotherTestExtends", "com.plantuml.train.test")})));

    /** Class dependency type test 7 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE7 = new ClassDependencyTypeImpl("TestGeneric",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 8 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE8 = new ClassDependencyTypeImpl(
            "TestExtendsWithGeneric", "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("AnotherTestExtends", "com.plantuml.train.test"),
                            new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("TestExtendsGeneric",
                            "com.plantuml.train.test")})));

    /** Class dependency type test 9 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE9 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("InterfaceTest", "com.plantuml.test")})),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 10 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE10 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.test")})), new TreeSet < GenericDependency >());

    /** Class dependency type test 11 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE11 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.test")})), new TreeSet < GenericDependency >());

    /** Class dependency type test 12 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE12 = new ClassDependencyTypeImpl(
            "TestMultipleImplementsGeneric", "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("AnotherInterfaceTest",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("Cloneable", "java.lang"),
                            new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.test"),
                            new GenericDependencyImpl("InterfaceTest", "com.plantuml.test"),
                            new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 13 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE13 = new ClassDependencyTypeImpl(
            "TestMultipleImplementsAndExtendsGeneric", "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test"),
                            new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test"),
                            new GenericDependencyImpl("AnotherTestExtends", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("Cloneable", "java.lang"),
                    new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.test"),
                    new GenericDependencyImpl("InterfaceTest", "com.plantuml.test"),
                    new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test")})));

    /** Class dependency type test 14 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE14 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("AnotherInterfaceTest",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("AnotherInterfaceTest",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >());

    /** Class dependency type test 15 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE15 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "ClassNotFoundException", "java.lang")})));

    /** Class dependency type test 16 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE16 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("Appendable", "java.lang")})),
            new TreeSet < GenericDependency >());

    /** Class dependency type test 17 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE17 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "JavaProgramImpl", "net.sourceforge.mazix.cli.program.impl")})));

    /** Class dependency type test 18 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE18 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >());

    /** Class dependency type test 19 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE19 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgramImpl",
                            "net.sourceforge.mazix.cli.program.impl")})), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "JavaProgramImpl", "net.sourceforge.mazix.cli.program.impl")})));

    /** Class dependency type test 20 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE20 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >());

    /** Class dependency type test 21 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE21 = new ClassDependencyTypeImpl(
            "TestExtendsWithGeneric", "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("TestExtendsGeneric",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test")})));

    /** Class dependency type test 22 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE22 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.train.test"),
                            new GenericDependencyImpl("Integer", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.train.test")})), new TreeSet < GenericDependency >());

    /** Interface dependency type test 1 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE1 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileClassWithMultipleExtendsGenerics",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                            new GenericDependencyImpl("CppProgrammingLanguageTest",
                                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument"),
                            new GenericDependencyImpl("ProgrammingLanguageTest",
                                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument"),
                            new GenericDependencyImpl("Map", "java.util")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                            new GenericDependencyImpl("Comparable", "java.lang"),
                            new GenericDependencyImpl("Map", "java.util"),
                            new GenericDependencyImpl("Appendable", "java.lang")})));

    /** Interface dependency type test 2 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE2 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterface",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 2 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE3 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceGenericNotInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 4 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE4 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                            new GenericDependencyImpl("CppProgrammingLanguageTest",
                                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "DeepCloneable", "net.sourceforge.mazix.components.clone")})));

    /** Interface dependency type test 5 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE5 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("DeepCloneable",
                            "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("DeepCloneable",
                            "net.sourceforge.mazix.components.clone")})));

    /** Interface dependency type test 6 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE6 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("GenericDependency",
                            "net.sourceforge.plantuml.dependency.generic")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("GenericDependency",
                            "net.sourceforge.plantuml.dependency.generic")})));

    /** Interface dependency type test 7 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE7 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})));

    /** Interface dependency type test 8 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE8 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl("Comparable",
                    "java.lang")})));

    /** Interface dependency type test 9 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE9 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestReadDependencyFromFileInterfaceWithoutPackage",
                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage")})));

    /** Interface dependency type test 10 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE10 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithoutPackage", BLANK_STRING, new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 10 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE11 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFilePublicInterface",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >());

    /** Java programming language test 10 instance. */
    public static final ProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT1 = new JavaProgrammingLanguageContext(DISPLAY_SET2);

    /** Generic dependency test 2 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY2 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE2);

    /** Generic dependency test 3 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY3 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE3);

    /** Generic dependency test 4 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY4 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE4);

    /** Generic dependency test 5 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY5 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE5);

    /** Generic dependency test 6 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY6 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE6);

    /** Generic dependency test 7 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY7 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE7);

    /** Generic dependency test 8 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY8 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE8);

    /** Generic dependency test 9 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY9 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE9);

    /** Generic dependency test 10 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY10 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE10);

    /** Generic dependency test 11 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY11 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE11);

    /** Generic dependency test 12 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY12 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE12);

    /** Generic dependency test 13 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY13 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE13);

    /** Generic dependency test 14 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY14 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE14);

    /** Generic dependency test 15 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY15 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE15);

    /** Generic dependency test 16 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY16 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE16);

    /** Generic dependency test 17 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY17 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE17);

    /** Generic dependency test 18 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY18 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE18);

    /** Generic dependency test 19 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY19 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE19);

    /** Generic dependency test 20 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY20 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE20);

    /** Generic dependency test 21 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY21 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE21);

    /** Generic dependency test 22 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY22 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE22);

    /** Generic dependency test 23 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY23 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE1);

    /** Generic dependency test 24 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY24 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE2);

    /** Generic dependency test 25 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY25 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE3);

    /** Generic dependency test 26 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY26 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE4);

    /** Generic dependency test 27 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY27 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE5);

    /** Generic dependency test 28 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY28 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE6);

    /** Generic dependency test 29 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY29 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE7);

    /** Generic dependency test 30 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY30 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE8);

    /** Generic dependency test 31 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY31 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE9);

    /** Generic dependency test 32 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY32 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE10);

    /** Generic dependency test 33 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY33 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE11);

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private PlantUMLDependencyTestConstants() {
        super();
    }
}
