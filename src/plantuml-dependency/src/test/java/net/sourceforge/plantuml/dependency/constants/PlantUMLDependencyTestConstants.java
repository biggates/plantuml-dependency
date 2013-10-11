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
import static net.sourceforge.mazix.cli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.mazix.cli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.mazix.cli.utils.fileset.FileSetUtils.createFileSet;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.constants.CommonConstants.CURRENT_DIRECTORY;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST10;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST11;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST12;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST13;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST14;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST15;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST16;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST17;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST18;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST19;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST20;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST21;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST22;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST23;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST3;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST4;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST5;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST6;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST7;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST8;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST9;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.command.impl.CommandLineImpl;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseLevelOption;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseOption;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl.AnnotationDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassAbstractDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.enumimpl.EnumDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;

import org.apache.tools.ant.types.FileSet;

/**
 * The class which stores all necessary plantUML dependency constants used for Junit tests.
 *
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.2.0
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
            "classes,enums,imports,interfaces,only_packages,static_imports,native_methods", "-v", "-version", "-d",
            "classes"});

    /** Command line test 6 instance. */
    public static final CommandLine COMMAND_LINE6 = new CommandLineImpl(new String[] {"-o", "plantuml.txt", "-d", "-v",
            "-version"});

    /** Command line test 7 instance. */
    public static final CommandLine COMMAND_LINE7 = new CommandLineImpl(new String[] {"-v", "-d",
            "classes,static_imports,enums", "-o", "plantuml.txt"});

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
    public static final FileSet FILE_SET1 = createFileSet(CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/b/**/*.java");

    /** File set test 2 instance. */
    public static final FileSet FILE_SET2 = createFileSet(CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/a/**/*a*.java",
            "**/Class2.java, **/Class5.java");

    /** File set test 3 instance. */
    public static final FileSet FILE_SET3 = createFileSet(CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/a/Toto.java");

    /** File set test 4 instance. */
    public static final FileSet FILE_SET4 = createFileSet(
            CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/a/**/*a*.java, **/test/resources/net/sourceforge/plantuml/dependency/main/option/output/a/pom.xml",
            "**/Class2.java, **/Class5.java");

    /** File set test 5 instance. */
    public static final FileSet FILE_SET5 = createFileSet(CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/c/**/*.java");

    /** File set test 6 instance. */
    public static final FileSet FILE_SET6 = createFileSet(CURRENT_DIRECTORY,
            "**/test/resources/net/sourceforge/plantuml/dependency/main/option/output/d/**/*.java");

    /** Verbose option test 1 instance. */
    public static final VerboseOption VERBOSE_OPTION1 = new VerboseOption(new StringBuilder(
            "To display log information."), ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 2 instance. */
    public static final VerboseOption VERBOSE_OPTION2 = new VerboseOption(new StringBuilder(
            "To display log information."), ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 1 instance. */
    public static final VerboseLevelOption VERBOSE_LEVEL_OPTION1 = new VerboseLevelOption();

    /** Extensions set test 1 instance. */
    public static final Set < String > EXTENSIONS_SET1 = new TreeSet < String >(
            asList(new String[] {"java.lang.Number"}));

    /** Implementations set test 1 instance. */
    public static final Set < String > IMPLEMENTATIONS_SET1 = new TreeSet < String >(asList(new String[] {
            "java.lang.Comparable", "java.io.Serializable"}));

    /** Annotations set test 1 instance. */
    public static final Set < String > ANNOTATIONS_SET1 = new TreeSet < String >(asList(new String[] {
            "javax.xml.bind.annotation.XmlType", "java.lang.Override"}));

    /** Class dependency type test 2 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE2 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test");

    /** Class dependency type test 3 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE3 = new ClassDependencyTypeImpl("Test",
            BLANK_STRING, IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 4 instance. */
    public static final ClassAbstractDependencyTypeImpl CLASS_DEPENDENCY_TYPE4 = new ClassAbstractDependencyTypeImpl(
            "Test", "com.plantuml.test", IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 5 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE5 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1,
            new GenericDependencyImpl("TestExtends", "com.plantuml.test"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 6 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE6 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", IMPORT_COLLECTION_TEST3, new GenericDependencyImpl("AnotherTestExtends",
                    "com.plantuml.train.test"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 7 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE7 = new ClassDependencyTypeImpl("TestGeneric",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 8 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE8 = new ClassDependencyTypeImpl(
            "TestExtendsWithGeneric", "com.plantuml.test", IMPORT_COLLECTION_TEST4, new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 9 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE9 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("InterfaceTest", "com.plantuml.test")})),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 10 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE10 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", IMPORT_COLLECTION_TEST1, null,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.test")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 11 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE11 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", IMPORT_COLLECTION_TEST1, null,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.test")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 12 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE12 = new ClassDependencyTypeImpl(
            "TestMultipleImplementsGeneric", "com.plantuml.test", IMPORT_COLLECTION_TEST5, null,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("Cloneable", "com.plantuml.test"),
                    new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.test"),
                    new GenericDependencyImpl("InterfaceTest", "com.plantuml.test"),
                    new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 13 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE13 = new ClassDependencyTypeImpl(
            "TestMultipleImplementsAndExtendsGeneric", "com.plantuml.test", IMPORT_COLLECTION_TEST6,
            new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test"),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("Cloneable", "com.plantuml.test"),
                    new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.test"),
                    new GenericDependencyImpl("InterfaceTest", "com.plantuml.test"),
                    new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test")})),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 14 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE14 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST7, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("AnotherInterfaceTest",
                            "com.plantuml.train.test")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 15 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE15 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, new GenericDependencyImpl("ClassNotFoundException",
                    "com.plantuml.test"), new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(),
            false);

    /** Class dependency type test 16 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE16 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("Appendable", "com.plantuml.test")})),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 17 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE17 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, new GenericDependencyImpl("JavaProgramImpl",
                    "net.sourceforge.mazix.cli.program.impl"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 18 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE18 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST1, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 19 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE19 = new ClassDependencyTypeImpl("Test",
            "com.plantuml.test", IMPORT_COLLECTION_TEST8, new GenericDependencyImpl("JavaProgramImpl",
                    "net.sourceforge.mazix.cli.program.impl"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 20 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE20 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST9, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 21 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE21 = new ClassDependencyTypeImpl(
            "TestExtendsWithGeneric", "com.plantuml.test", IMPORT_COLLECTION_TEST10, new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 22 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE22 = new ClassDependencyTypeImpl(
            "TestImplementsGenerics", "com.plantuml.test", IMPORT_COLLECTION_TEST11, null,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "InterfaceGenericsTest", "com.plantuml.train.test")})), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 23 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE23 = new ClassDependencyTypeImpl(
            "TestExtendsWithGeneric", "com.plantuml.test", IMPORT_COLLECTION_TEST12, new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test"), new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 24 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE24 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST13, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                            "net.sourceforge.mazix.cli.program")})), new TreeSet < GenericDependency >(), true);

    /** Class dependency type test 25 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE25 = new ClassDependencyTypeImpl(
            "Test_Implements", "com.plantuml.te_st", IMPORT_COLLECTION_TEST14, null, new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("Java_Program",
                            "net.sourceforge.mazix.cli.pro_gram")})), new TreeSet < GenericDependency >(), true);

    /** Class dependency type test 26 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE26 = new ClassDependencyTypeImpl("TestImplements",
            "com.plantuml.test", IMPORT_COLLECTION_TEST15, null, new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 27 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE27 = new ClassDependencyTypeImpl(
            "TestDisplayOption", "net.sourceforge.plantuml.dependency", IMPORT_COLLECTION_TEST16,
            new GenericDependencyImpl("BigInteger", "java.math"), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("DeepCloneable",
                            "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl(new AnnotationDependencyTypeImpl(
                            "Override", "net.sourceforge.plantuml.dependency"))})), false);

    /** Class dependency type test 28 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE28 = new ClassDependencyTypeImpl(
            "TestDisplayOption", "net.sourceforge.plantuml.dependency", IMPORT_COLLECTION_TEST1, null,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 29 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE29 = new ClassDependencyTypeImpl(
            "TestDisplayOption", "net.sourceforge.plantuml.dependency", IMPORT_COLLECTION_TEST17,
            new GenericDependencyImpl("BigInteger", "java.math"), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl("DeepCloneable",
                            "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {new GenericDependencyImpl(new AnnotationDependencyTypeImpl(
                            "Override", "net.sourceforge.plantuml.dependency"))})), false);

    /** Class dependency type test 30 instance. */
    public static final ClassAbstractDependencyTypeImpl CLASS_DEPENDENCY_TYPE30 = new ClassAbstractDependencyTypeImpl(
            "GenericEndpoint",
            "com.plantuml.test",
            IMPORT_COLLECTION_TEST23,
            null,
            new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Annotationinterface",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("AnotherAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MappedSuperclass",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MyAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Testabstract",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Deprecated",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Override", "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("SuppressWarnings",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Generated", "javax.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("XmlType",
                                    "javax.xml.bind.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Addressing",
                                    "javax.xml.ws.soap"))})), false);

    /** Class dependency type test 31 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE31 = new ClassDependencyTypeImpl(
            "GenericEndpoint",
            "com.plantuml.test",
            IMPORT_COLLECTION_TEST23,
            null,
            new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Annotationinterface",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("AnotherAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MappedSuperclass",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MyAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Testabstract",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Deprecated",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Override", "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("SuppressWarnings",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Generated", "javax.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("XmlType",
                                    "javax.xml.bind.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Addressing",
                                    "javax.xml.ws.soap"))})), false);

    /** Interface dependency type test 1 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE1 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileClassWithMultipleExtendsGenerics",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST18,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                    new GenericDependencyImpl("Comparable",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("Map", "java.util"),
                    new GenericDependencyImpl("Appendable",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage")})),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 2 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE2 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterface",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());

    /** Interface dependency type test 2 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE3 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceGenericNotInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());

    /** Interface dependency type test 4 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE4 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST19,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "DeepCloneable", "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >());

    /** Interface dependency type test 5 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE5 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST20,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "DeepCloneable", "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >());

    /** Interface dependency type test 6 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE6 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST21,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 7 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE7 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 8 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE8 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl("Comparable",
                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage")})),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 9 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE9 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestReadDependencyFromFileInterfaceWithoutPackage",
                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage")})),
            new TreeSet < GenericDependency >());

    /** Interface dependency type test 10 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE10 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithoutPackage", BLANK_STRING, IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());

    /** Interface dependency type test 10 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE11 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFilePublicInterface",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());

    /** Interface dependency type test 12 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE12 = new InterfaceDependencyTypeImpl(
            "TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport",
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage", IMPORT_COLLECTION_TEST22,
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "DeepCloneable", "net.sourceforge.mazix.components.clone")})), new TreeSet < GenericDependency >());

    /** Interface dependency type test 13 instance. */
    public static final InterfaceDependencyTypeImpl INTERFACE_DEPENDENCY_TYPE13 = new InterfaceDependencyTypeImpl(
            "GenericEndpoint",
            "com.plantuml.test",
            IMPORT_COLLECTION_TEST23,
            new TreeSet < GenericDependency >(),
            new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Annotationinterface",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("AnotherAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MappedSuperclass",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("MyAnnotation",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Testabstract",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Deprecated",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("SuppressWarnings",
                                    "com.plantuml.test")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Generated", "javax.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("XmlType",
                                    "javax.xml.bind.annotation")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Addressing",
                                    "javax.xml.ws.soap"))})));

    /** Enum dependency type test 1 instance. */
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE1 = new EnumDependencyTypeImpl(
            "TestReadDependencyFromFileEnum", "net.sourceforge.plantuml.dependency.main.option.programminglanguage",
            IMPORT_COLLECTION_TEST1, new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(), false);

    /** Enum dependency type test 2 instance. */
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE2 = new EnumDependencyTypeImpl(
            "TestReadDependencyFromFileEnum", BLANK_STRING, IMPORT_COLLECTION_TEST1,
            new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >(), false);

    /** Annotation dependency type test 1 instance. */
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE1 = new AnnotationDependencyTypeImpl(
            "Override", "javax.lang");

    /** Annotation dependency type test 2 instance. */
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE2 = new AnnotationDependencyTypeImpl(
            "Deprecated", "javax.lang");

    /** Annotation dependency type test 3 instance. */
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE3 = new AnnotationDependencyTypeImpl(
            "Generated", "javax.annotation");

    /** Generic dependency test 6 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY6 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE2);

    /** Generic dependency test 7 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY7 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE3);

    /** Generic dependency test 8 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY8 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE4);

    /** Generic dependency test 9 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY9 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE5);

    /** Generic dependency test 10 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY10 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE6);

    /** Generic dependency test 11 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY11 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE7);

    /** Generic dependency test 12 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY12 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE8);

    /** Generic dependency test 13 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY13 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE9);

    /** Generic dependency test 14 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY14 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE10);

    /** Generic dependency test 15 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY15 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE11);

    /** Generic dependency test 16 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY16 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE12);

    /** Generic dependency test 17 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY17 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE13);

    /** Generic dependency test 18 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY18 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE14);

    /** Generic dependency test 19 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY19 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE15);

    /** Generic dependency test 20 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY20 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE16);

    /** Generic dependency test 21 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY21 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE17);

    /** Generic dependency test 22 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY22 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE18);

    /** Generic dependency test 23 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY23 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE19);

    /** Generic dependency test 24 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY24 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE20);

    /** Generic dependency test 25 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY25 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE21);

    /** Generic dependency test 26 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY26 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE22);

    /** Generic dependency test 27 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY27 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE1);

    /** Generic dependency test 28 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY28 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE2);

    /** Generic dependency test 29 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY29 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE3);

    /** Generic dependency test 30 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY30 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE4);

    /** Generic dependency test 31 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY31 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE5);

    /** Generic dependency test 32 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY32 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE6);

    /** Generic dependency test 33 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY33 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE7);

    /** Generic dependency test 34 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY34 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE8);

    /** Generic dependency test 35 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY35 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE9);

    /** Generic dependency test 36 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY36 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE10);

    /** Generic dependency test 37 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY37 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE11);

    /** Generic dependency test 38 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY38 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE23);

    /** Generic dependency test 39 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY39 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE12);

    /** Generic dependency test 40 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY40 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE24);

    /** Generic dependency test 41 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY41 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE25);

    /** Generic dependency test 42 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY42 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE26);

    /** Generic dependency test 43 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY43 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE27);

    /** Generic dependency test 44 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY44 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE28);

    /** Generic dependency test 45 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY45 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE29);

    /** Generic dependency test 46 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY46 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE30);

    /** Generic dependency test 47 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY47 = new GenericDependencyImpl(ENUM_DEPENDENCY_TYPE1);

    /** Generic dependency test 48 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY48 = new GenericDependencyImpl(ENUM_DEPENDENCY_TYPE2);

    /** Generic dependency test 49 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY49 = new GenericDependencyImpl(
            INTERFACE_DEPENDENCY_TYPE13);

    /** Generic dependency test 50 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY50 = new GenericDependencyImpl(
            ANNOTATION_DEPENDENCY_TYPE1);

    /** Generic dependency test 51 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY51 = new GenericDependencyImpl(CLASS_DEPENDENCY_TYPE31);

    /** Generic dependency test 52 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY52 = new GenericDependencyImpl(
            ANNOTATION_DEPENDENCY_TYPE2);

    /** Generic dependency test 53 instance. */
    public static final GenericDependencyImpl GENERIC_DEPENDENCY53 = new GenericDependencyImpl(
            ANNOTATION_DEPENDENCY_TYPE3);

    /** Generic dependency set test 2 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET2 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {GENERIC_DEPENDENCY1}));

    /** Generic dependency set test 3 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET3 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {new GenericDependencyImpl("Cloneable", "javax.lang"),
                    new GenericDependencyImpl("Set", "java.lang")}));

    /** Generic dependency set test 4 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET4 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {new GenericDependencyImpl("Object", "java.lang")}));

    /** Generic dependency set test 5 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET5 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {GENERIC_DEPENDENCY50}));

    /** Generic dependency set test 6 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET6 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {GENERIC_DEPENDENCY52, GENERIC_DEPENDENCY53}));

    /** Generic dependency set test 7 instance. */
    public static final Set < GenericDependency > GENERIC_DEPENDENCY_SET7 = new TreeSet < GenericDependency >(
            asList(new GenericDependency[] {new GenericDependencyImpl("Serializable", "java.io"),
                    new GenericDependencyImpl("Set", "java.lang")}));
}
