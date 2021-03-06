/*
 ImportDependenciesCollectionImplTest.java
 Creation date : 16/01/2012
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

package net.sourceforge.plantumldependency.cli.generic.type.impl;

import static java.util.Arrays.asList;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET2;
import static net.sourceforge.plantumldependency.cli.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantumldependency.cli.generic.type.ImportType.IMPORT_TYPES;
import static net.sourceforge.plantumldependency.cli.generic.type.ImportType.NATIVE;
import static net.sourceforge.plantumldependency.cli.generic.type.ImportType.STANDARD;
import static net.sourceforge.plantumldependency.cli.generic.type.ImportType.STATIC;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantumldependency.cli.generic.type.ImportType;
import net.sourceforge.plantumldependency.cli.generic.type.impl.annotationimpl.AnnotationDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassAbstractDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.enumimpl.EnumDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ImportDependenciesCollectionImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.0
 * @version 1.3.0
 */
public class ImportDependenciesCollectionImplTest extends DeepCloneableObjectTest < ImportDependenciesCollectionImpl > {

    /** Display import dependencies collection test 1 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST1 = new ImportDependenciesCollectionImpl();

    /** Display import dependencies collection test 2 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST2 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {GENERIC_DEPENDENCY1,
                    new GenericDependencyImpl("Serializable", "java.io"),
                    new GenericDependencyImpl("Comparable", "java.lang")})));

    /** Display import dependencies collection test 3 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST3 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "AnotherTestExtends", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 4 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST4 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("AnotherTestExtends", "com.plantuml.train.test"),
                    new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 5 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST5 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "AnotherInterfaceTest", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 6 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST6 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("AnotherInterfaceTest", "com.plantuml.train.test"),
                    new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test"),
                    new GenericDependencyImpl("AnotherTestExtends", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 7 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST7 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "AnotherInterfaceTest", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 8 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST8 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "JavaProgramImpl", "net.sourceforge.plantumldependency.commoncli.program.impl")})));

    /** Display import dependencies collection test 9 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST9 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "JavaProgram", "net.sourceforge.plantumldependency.commoncli.program")})));

    /** Display import dependencies collection test 10 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST10 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestExtendsGeneric", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 11 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST11 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("InterfaceGenericsTest", "com.plantuml.train.test"),
                    new GenericDependencyImpl("Integer", "com.plantuml.train.test")})));

    /** Display import dependencies collection test 12 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST12 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("AnotherTestExtends", "com.plantuml.train.test"),
                    new GenericDependencyImpl("TestExtendsGeneric", "com.plantuml.train.test"),
                    new GenericDependencyImpl("InnerTest", "com.plantuml.train.test.TestExtendsGeneric")})));

    /** Display import dependencies collection test 13 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST13 = new ImportDependenciesCollectionImpl(
            new TreeMap < ImportType, Set < GenericDependency >>() {
                private static final long serialVersionUID = 1L;
                {
                    put(STANDARD, new TreeSet < GenericDependency >(
                            asList(new GenericDependency[] {new GenericDependencyImpl("JavaProgram",
                                    "net.sourceforge.plantumldependency.commoncli.program")})));
                    put(NATIVE, new TreeSet < GenericDependency >(asList(new GenericDependency[] {NATIVE_DEPENDENCY})));
                }
            });

    /** Display import dependencies collection test 14 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST14 = new ImportDependenciesCollectionImpl(
            new TreeMap < ImportType, Set < GenericDependency >>() {
                private static final long serialVersionUID = 1L;
                {
                    put(STANDARD, new TreeSet < GenericDependency >(
                            asList(new GenericDependency[] {new GenericDependencyImpl("Java_Program",
                                    "net.sourceforge.plantumldependency.commoncli.pro_gram")})));
                    put(NATIVE, new TreeSet < GenericDependency >(asList(new GenericDependency[] {NATIVE_DEPENDENCY})));
                }
            });

    /** Display import dependencies collection test 15 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST15 = new ImportDependenciesCollectionImpl(
            STATIC, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "JavaProgram", "net.sourceforge.plantumldependency.commoncli.program")})));

    /** Display import dependencies collection test 16 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST16 = new ImportDependenciesCollectionImpl(
            new TreeMap < ImportType, Set < GenericDependency >>() {
                private static final long serialVersionUID = 1L;
                {
                    put(STANDARD,
                            new TreeSet < GenericDependency >(
                                    asList(new GenericDependency[] {
                                            new GenericDependencyImpl("File", "java.io"),
                                            new GenericDependencyImpl("FileInputStream", "java.io"),
                                            new GenericDependencyImpl("FileNotFoundException", "java.io"),
                                            new GenericDependencyImpl("InputStream", "java.io"),
                                            new GenericDependencyImpl("Serializable", "java.io"),
                                            new GenericDependencyImpl("BigInteger", "java.math"),
                                            new GenericDependencyImpl("Random", "java.util"),
                                            new GenericDependencyImpl("DeepCloneable",
                                                    "net.sourceforge.mazix.components.clone"),
                                            new GenericDependencyImpl("ProgrammingLanguage",
                                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                                            new GenericDependencyImpl("JavaRawDependency",
                                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument.java")})));
                    put(STATIC, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                            new GenericDependencyImpl("Level", "java.util.logging"),
                            new GenericDependencyImpl("Arrays", "java.util")})));
                }
            });

    /** Display import dependencies collection test 17 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST17 = new ImportDependenciesCollectionImpl(
            new TreeMap < ImportType, Set < GenericDependency >>() {
                private static final long serialVersionUID = 1L;
                {
                    put(STANDARD,
                            new TreeSet < GenericDependency >(
                                    asList(new GenericDependency[] {
                                            new GenericDependencyImpl("File", "java.io"),
                                            new GenericDependencyImpl("FileInputStream", "java.io"),
                                            new GenericDependencyImpl("FileNotFoundException", "java.io"),
                                            new GenericDependencyImpl("InputStream", "java.io"),
                                            new GenericDependencyImpl("Serializable", "java.io"),
                                            new GenericDependencyImpl("BigInteger", "java.math"),
                                            new GenericDependencyImpl("Random", "java.util"),
                                            new GenericDependencyImpl("DeepCloneable",
                                                    "net.sourceforge.mazix.components.clone"),
                                            new GenericDependencyImpl("ProgrammingLanguage",
                                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                                            new GenericDependencyImpl("JavaRawDependency",
                                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument.java")})));
                    put(STATIC, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                            new GenericDependencyImpl("Arrays", "java.util"),
                            new GenericDependencyImpl("Level", "java.util.logging")})));
                }
            });

    /** Display import dependencies collection test 18 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST18 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                    new GenericDependencyImpl("CppProgrammingLanguageTest",
                            "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                    new GenericDependencyImpl("ProgrammingLanguageTest",
                            "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                    new GenericDependencyImpl("Map", "java.util")})));

    /** Display import dependencies collection test 19 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST19 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                    new GenericDependencyImpl("CppProgrammingLanguageTest",
                            "net.sourceforge.plantumldependency.main.option.programminglanguage.argument")})));

    /** Display import dependencies collection test 20 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST20 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "DeepCloneable", "net.sourceforge.mazix.components.clone")})));

    /** Display import dependencies collection test 21 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST21 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantumldependency.generic")})));

    /** Display import dependencies collection test 22 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST22 = new ImportDependenciesCollectionImpl(
            STANDARD,
            new TreeSet < GenericDependency >(
                    asList(new GenericDependency[] {
                            new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                            new GenericDependencyImpl("CppProgrammingLanguageTest",
                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                            new GenericDependencyImpl("InnerTest",
                                    "net.sourceforge.plantumldependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")})));

    /** Display import dependencies collection test 23 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST23 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("ElementType", "java.lang.annotation"),
                    new GenericDependencyImpl("XmlType", "javax.xml.bind.annotation"),
                    new GenericDependencyImpl("Addressing", "javax.xml.ws.soap"),})));

    /** Display import dependencies collection test 24 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST24 = new ImportDependenciesCollectionImpl(
            STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {GENERIC_DEPENDENCY1,
                    new GenericDependencyImpl("Serializable", "java.io"),
                    new GenericDependencyImpl("Comparable", "java.lang"),
                    new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Deprecated", "javax.lang"))})));

    /** Display import dependencies collection test 25 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST25 = new ImportDependenciesCollectionImpl(
            new HashMap < ImportType, Set < GenericDependency > >() {
                /** Serial version UID. */
                private static final long serialVersionUID = -6430121225499443154L;

                {
                    put(STANDARD, new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                            new GenericDependencyImpl("Serializable", "java.io"),
                            new GenericDependencyImpl(new InterfaceDependencyTypeImpl("Comparable", "java.lang")),
                            new GenericDependencyImpl(new InterfaceDependencyTypeImpl("Set", "java.lang")),
                            new GenericDependencyImpl(new ClassDependencyTypeImpl("Number", "java.lang")),
                            new GenericDependencyImpl(new ClassAbstractDependencyTypeImpl("InputStream", "java.io")),
                            new GenericDependencyImpl(new ClassAbstractDependencyTypeImpl("File", "java.io")),
                            new GenericDependencyImpl(new EnumDependencyTypeImpl("Display",
                                    "net.sourceforge.plantumldependency.main.option.display.argument")),
                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Deprecated", "javax.lang"))})));
                    put(STATIC,
                            new TreeSet < GenericDependency >(
                                    asList(new GenericDependency[] {
                                            new GenericDependencyImpl("Cloneable", "java.lang"),
                                            new GenericDependencyImpl(new InterfaceDependencyTypeImpl("Character",
                                                    "java.lang")),
                                            new GenericDependencyImpl(new ClassDependencyTypeImpl("Tag",
                                                    "javax.activation")),
                                            new GenericDependencyImpl(
                                                    new ClassDependencyTypeImpl("Number", "java.lang")),
                                            new GenericDependencyImpl(new ClassAbstractDependencyTypeImpl(
                                                    "AbstractOption",
                                                    "net.sourceforge.plantumldependency.commoncli.option")),
                                            new GenericDependencyImpl(new EnumDependencyTypeImpl("ImportType",
                                                    "net.sourceforge.plantumldependency.generic.type")),
                                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Generated",
                                                    "javax.annotation")),
                                            new GenericDependencyImpl(new AnnotationDependencyTypeImpl("Target",
                                                    "java.lang.annotation"))})));
                    put(NATIVE, new TreeSet < GenericDependency >(asList(new GenericDependency[] {NATIVE_DEPENDENCY})));
                }
            });

    /** Display import dependencies collection test 26 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST26 = new ImportDependenciesCollectionImpl();

    /** Display import dependencies collection test 27 instance. */
    @DataPoint
    public static final ImportDependenciesCollectionImpl IMPORT_COLLECTION_TEST27 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependenciesSet(net.sourceforge.plantumldependency.cli.generic.type.ImportType, java.util.Set)}
     * .
     */
    @Test
    public void testAddImportDependenciesSetWithExistingDependenciesInNotSameImportType() {
        final ImportDependenciesCollection importDependenciesCollectionImpl = IMPORT_COLLECTION_TEST2.deepClone();
        importDependenciesCollectionImpl.addImportDependenciesSet(STATIC, GENERIC_DEPENDENCY_SET2);
        assertEquals(3, IMPORT_COLLECTION_TEST2.getAllImportDependencies().size());
        assertTrue(IMPORT_COLLECTION_TEST2.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependenciesSet(net.sourceforge.plantumldependency.cli.generic.type.ImportType, java.util.Set)}
     * .
     */
    @Test
    public void testAddImportDependenciesSetWithExistingDependenciesInSameImportType() {
        IMPORT_COLLECTION_TEST2.addImportDependenciesSet(STANDARD, GENERIC_DEPENDENCY_SET2);
        assertEquals(3, IMPORT_COLLECTION_TEST2.getAllImportDependencies().size());
        assertTrue(IMPORT_COLLECTION_TEST2.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependenciesSet(net.sourceforge.plantumldependency.cli.generic.type.ImportType, java.util.Set)}
     * .
     */
    @Test
    public void testAddImportDependenciesSetWithNotExistingDependenciesInNotSameImportType() {
        final ImportDependenciesCollection importDependenciesCollectionImpl = new ImportDependenciesCollectionImpl(
                STANDARD,
                new TreeSet < GenericDependency >(
                        asList(new GenericDependency[] {
                                new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                                new GenericDependencyImpl("CppProgrammingLanguageTest",
                                        "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                                new GenericDependencyImpl("InnerTest",
                                        "net.sourceforge.plantumldependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")})));
        importDependenciesCollectionImpl.addImportDependenciesSet(STATIC, GENERIC_DEPENDENCY_SET2);
        assertEquals(4, importDependenciesCollectionImpl.getAllImportDependencies().size());
        assertTrue(importDependenciesCollectionImpl.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependenciesSet(net.sourceforge.plantumldependency.cli.generic.type.ImportType, java.util.Set)}
     * .
     */
    @Test
    public void testAddImportDependenciesSetWithNotExistingDependenciesInSameImportType() {
        final ImportDependenciesCollection importDependenciesCollectionImpl = new ImportDependenciesCollectionImpl(
                STANDARD,
                new TreeSet < GenericDependency >(
                        asList(new GenericDependency[] {
                                new GenericDependencyImpl("DeepCloneable", "net.sourceforge.mazix.components.clone"),
                                new GenericDependencyImpl("CppProgrammingLanguageTest",
                                        "net.sourceforge.plantumldependency.main.option.programminglanguage.argument"),
                                new GenericDependencyImpl("InnerTest",
                                        "net.sourceforge.plantumldependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")})));
        importDependenciesCollectionImpl.addImportDependenciesSet(STANDARD, GENERIC_DEPENDENCY_SET2);
        assertEquals(4, importDependenciesCollectionImpl.getAllImportDependencies().size());
        assertTrue(importDependenciesCollectionImpl.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependencies(net.sourceforge.plantumldependency.cli.generic.type.ImportType, net.sourceforge.plantumldependency.cli.generic.GenericDependency)}
     * .
     */
    @Test
    public void testAddImportDependenciesWithExistingDependency() {
        IMPORT_COLLECTION_TEST2.addImportDependencies(STANDARD, GENERIC_DEPENDENCY1);
        assertEquals(3, IMPORT_COLLECTION_TEST2.getAllImportDependencies().size());
        assertTrue(IMPORT_COLLECTION_TEST2.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#addImportDependencies(net.sourceforge.plantumldependency.cli.generic.type.ImportType, net.sourceforge.plantumldependency.cli.generic.GenericDependency)}
     * .
     */
    @Test
    public void testAddImportDependenciesWithNotExistingDependency() {
        final ImportDependenciesCollectionImpl importDependenciesCollectionImpl = new ImportDependenciesCollectionImpl();
        importDependenciesCollectionImpl.addImportDependencies(STANDARD, GENERIC_DEPENDENCY1);
        assertEquals(1, importDependenciesCollectionImpl.getAllImportDependencies().size());
        assertTrue(importDependenciesCollectionImpl.getAllImportDependencies().contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithExistingDependency() {
        assertEquals(GENERIC_DEPENDENCY1, IMPORT_COLLECTION_TEST2.findDependency(GENERIC_DEPENDENCY1.getName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithExistingNameAndExistingPackageName() {
        assertEquals(
                GENERIC_DEPENDENCY1,
                IMPORT_COLLECTION_TEST2.findDependency(GENERIC_DEPENDENCY1.getName(),
                        GENERIC_DEPENDENCY1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithExistingNameAndNotExistingPackageName() {
        assertEquals(null, IMPORT_COLLECTION_TEST2.findDependency(GENERIC_DEPENDENCY1.getName(), BLANK_STRING));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithNotExistingDependency() {
        assertEquals(null, IMPORT_COLLECTION_TEST22.findDependency(GENERIC_DEPENDENCY1.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithNotExistingNameAndExistingPackageName() {
        assertEquals(null, IMPORT_COLLECTION_TEST2.findDependency(BLANK_STRING, GENERIC_DEPENDENCY1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#findDependency(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testFindDependencyWithNotExistingNameAndNotExistingPackageName() {
        assertEquals(
                null,
                IMPORT_COLLECTION_TEST22.findDependency(GENERIC_DEPENDENCY1.getName(),
                        GENERIC_DEPENDENCY1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#getAllImportDependencies()}
     * .
     */
    @Test
    public void testGetAllImportDependencies() {
        assertEquals(12, IMPORT_COLLECTION_TEST16.getAllImportDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#getImportDependenciesWithType(net.sourceforge.plantumldependency.cli.generic.type.ImportType)}
     * .
     */
    @Test
    public void testGetImportDependenciesWithType() {
        assertEquals(2, IMPORT_COLLECTION_TEST16.getImportDependenciesWithType(STATIC).size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl#getImportDependenciesWithTypes(java.util.Set)}
     * .
     */
    @Test
    public void testGetImportDependenciesWithTypes() {
        assertEquals(12, IMPORT_COLLECTION_TEST16.getImportDependenciesWithTypes(IMPORT_TYPES).size());
    }
}
