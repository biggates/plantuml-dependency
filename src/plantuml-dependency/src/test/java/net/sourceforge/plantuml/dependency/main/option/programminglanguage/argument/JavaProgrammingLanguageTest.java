/*
 JavaProgrammingLanguageTest.java
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.DISPLAY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY10;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY13;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY14;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY15;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY16;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY17;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY18;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY19;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY20;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY21;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY22;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY23;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY24;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY25;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY26;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY27;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY28;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY29;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY30;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY31;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY32;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY33;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY34;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY35;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY36;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY37;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY38;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY4;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY7;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY8;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY9;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sourceforge.mazix.components.ObjectTest;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType;
import net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.stubimpl.StubDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaProgrammingLanguage}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaProgrammingLanguageTest extends ObjectTest < JavaProgrammingLanguage > {

    /** Java programming language test 1 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE1 = JAVA;

    /** Java programming language test 2 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE2 = JAVA;

    /** Java programming language test 3 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE3 = null;

    /**
     * Asserts that two {@link GenericDependency} instance are strictly identical.
     * 
     * @param expectedDependency
     *            the expected {@link GenericDependency} instance, mustn't be <code>null</code>.
     * @param resultDependency
     *            the result {@link GenericDependency} instance, mustn't be <code>null</code>.
     */
    public static void assertGenericDependencyAreEquals(final GenericDependency expectedDependency,
            final GenericDependency resultDependency) {
        assertEquals(expectedDependency, resultDependency);
        assertEquals(expectedDependency.getDependencyType().getImportDependencies(), resultDependency
                .getDependencyType().getImportDependencies());
        assertEquals(expectedDependency.getDependencyType().getParentInterfaces(), resultDependency.getDependencyType()
                .getParentInterfaces());
        if (expectedDependency.getDependencyType() instanceof ClassDependencyType) {
            final ClassDependencyType expectedDependencyType = (ClassDependencyType) expectedDependency
                    .getDependencyType();
            final ClassDependencyType resultDependencyType = (ClassDependencyType) resultDependency.getDependencyType();
            assertEquals(expectedDependencyType.getParentClasses(), resultDependencyType.getParentClasses());
        }
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY4.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractPublicClassWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract public class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY4.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassGenericNotInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY7, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY7.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithCarriageReturnsAsSeparator() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.\ntest;\r\n\r\nimport net.sourceforge.mazix.\ncli.program.\nJavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class\nTestImplements implements\nnet.sourceforge.mazix.cli.program.\nJavaProgram {\r\nprivate static native void\nregisterNatives\n();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY36.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithClassWordInComments() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\n//Hello class ! my name is brian\r\npublic class Test extends TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY5, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY5.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.TestExtends").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithCommentsAsSeparator() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\n//Hello class ! my name is brian\r\npublic/*@bgen(jjtree)*/class/*@bgen(jjtree)*/Test/*@bgen(jjtree)*/extends/**@bgen(jjtree)**/TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY5, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY5.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.TestExtends").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsGenericsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY8.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsGenericsNotInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY21, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY8.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.impl.JavaProgramImpl;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY19, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY19.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.impl.JavaProgramImpl").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends AnotherTestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY6.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsNotInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY17, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY17.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.impl.JavaProgramImpl").getDependencyType().getClass());
    }

    // TODO test several class name with the same name but not with the same package (one in
    // java.lang and one in the current same package)
    // TODO test with the context
    // TODO test method and attributes
    // TODO test with other displays

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsNotInImportJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends ClassNotFoundException {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY15, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.ClassNotFoundException"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY15.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.ClassNotFoundException").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsNotInImportNotJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY5, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY5.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.TestExtends").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithGenericDefinition() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric < A extends AnotherTestExtends > extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY8.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsGenericsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.InterfaceGenericsTest;\r\nimport com.plantuml.train.test.Integer;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY22, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.Integer"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY22.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.InterfaceGenericsTest").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.Integer").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsGenericsNotInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY10, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY10.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceGenericsTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements com.plantuml.train.test.AnotherInterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY14, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY14.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherInterfaceTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY20, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY20.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsNotInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY18, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY18.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsNotInImportJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements Appendable {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY16, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Appendable"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY16.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Appendable").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsNotInImportNotJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements InterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY9, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY9.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithInnerCLass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\nimport com.plantuml.train.test.TestExtendsGeneric.InnerTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY34, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(4, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext
                .getDependencies("com.plantuml.train.test.TestExtendsGeneric.InnerTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY8.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric.InnerTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithMultipleImplementsAndExtendsGenericsWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass TestMultipleImplementsAndExtendsGeneric extends TestExtendsGeneric < AnotherTestExtends > implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest < CharacterConstants, java.test.Test > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY13, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(7, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Cloneable"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY13.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherInterfaceTest").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.TestExtendsGeneric").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Cloneable").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceGenericsTest").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithMultipleImplementsGenericsWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestMultipleImplementsGeneric implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY12, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(5, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Cloneable"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY12.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherInterfaceTest").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Cloneable").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceGenericsTest").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.test.InterfaceTest").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithNativeMethod() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\nprivate static native void registerNatives();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY36.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithStaticImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport static net.sourceforge.mazix.cli.program.JavaProgram.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements {\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY38, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY38.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithoutPackageWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY3, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY3.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithTabsAsSeparator() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.\ttest;\r\n\r\nimport net.sourceforge.mazix.\tcli.program.\tJavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class\tTestImplements implements\tnet.sourceforge.mazix.cli.program.\tJavaProgram {\r\nprivate static native void\tregisterNatives\t();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY36.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.program.JavaProgram").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithUnderscores() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test_Implements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.te_st;\r\n\r\nimport net.sourceforge.mazix.cli.pro_gram.Java_Program;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test_Implements implements net.sourceforge.mazix.cli.pro_gram.Java_Program {\r\nprivate static native void register_Natives();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY37, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext.getDependencies("net.sourceforge.mazix.cli.pro_gram.Java_Program"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY37.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.cli.pro_gram.Java_Program").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithWildcardImports() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.wildcard.*;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends AnotherTestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY6.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "com.plantuml.train.test.AnotherTestExtends").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalPublicClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal public class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceGenericNotInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceGenericNotInImport < PlantUMLDependencyBaseDirectoryOptionTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY25, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY25.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithCommentsAsSeparator() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\n//Hello interface ! my name is brian\r\npublic/*@bgen(jjtree)*/interface/*@bgen(jjtree)*/TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends/**@bgen(jjtree)**/TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY31, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY31.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY26, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY26.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.components.clone.DeepCloneable").getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsNotInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport extends DeepCloneable < Integer > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY27, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY27.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.components.clone.DeepCloneable").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY28.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.plantuml.dependency.generic.GenericDependency").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsInImportWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY28.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.plantuml.dependency.generic.GenericDependency").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageNameWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY29, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY29.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.plantuml.dependency.generic.GenericDependency").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang extends Comparable {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY30, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Comparable"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY30.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Comparable").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLangWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY31, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY31.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithGenericDefinition() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport < A extends CppProgrammingLanguageTest > extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY26, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY26.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.components.clone.DeepCloneable").getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithInnerClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest.InnerTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY35, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(4, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest.InnerTest"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY26.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.components.clone.DeepCloneable").getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest.InnerTest")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithInterfaceWordInComments() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\n//Hello interface ! my name is brian\r\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY31, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY31.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage")
                        .getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithMultipleExtendsGenericsWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport java.util.Map;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileClassWithMultipleExtendsGenerics extends DeepCloneable < CppProgrammingLanguageTest >, Comparable < Integer>, Map < java.io.Serializable, ProgrammingLanguageTest >, Appendable {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY23, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(7, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies("java.util.Map"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Comparable"));
        assertNotNull(programmingLanguageContext.getDependencies("java.lang.Appendable"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY23.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies("java.util.Map")
                .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.mazix.components.clone.DeepCloneable").getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getDependencies(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest")
                .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Comparable").getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "java.lang.Appendable").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithoutPackageWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY32, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY32.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\ninterface TestReadDependencyFromFileInterface {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY24, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY24.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithWildcardImports() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\nimport net.sourceforge.plantuml.dependency.generic.wildcard.*;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getDependencies("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY28.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class, programmingLanguageContext.getDependencies(
                "net.sourceforge.plantuml.dependency.generic.GenericDependency").getDependencyType().getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicAbstractClassWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic abstract class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY4.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicFinalClassWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic final class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicInterfaceWithStandardEmptyContext() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFilePublicInterface {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY33, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY33.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testReadDependencyFromFileWithBlankContentWithStandardEmptyContext() throws PlantUMLDependencyException {
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(BLANK_STRING, JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileWithSpacesAndLineSeparatorWithStandardEmptyContext()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n      package      com.    plantuml.     \r\ntest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\n       public     class      \r\nTest        {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET2);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getDependencies(GENERIC_DEPENDENCY2.getFullName()));
    }
}
