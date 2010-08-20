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
import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY10;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY13;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY14;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY4;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY7;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY8;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY9;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;

import net.sourceforge.mazix.components.ObjectTest;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType;

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
     * @version 1.0
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
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract class Test {\r\n\r\n}";
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent,
                new HashMap < String, GenericDependency >());
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractPublicClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract public class Test {\r\n\r\n}";
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent,
                new HashMap < String, GenericDependency >());
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass Test {\r\n\r\n}";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassGenericNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY7, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsGenericsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends AnotherTestExtends {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends TestExtends {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY5, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsGenericsNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY10, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements AnotherInterfaceTest {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY14, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithImplementsNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements InterfaceTest {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY9, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithMultipleImplementsAndExtendsGenerics()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass TestMultipleImplementsAndExtendsGeneric extends TestExtendsGeneric < AnotherTestExtends > implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY13, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithMultipleImplementsGenerics() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestMultipleImplementsGeneric implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY12, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithoutPackage() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY3, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal class Test {\r\n\r\n}";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalPublicClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal public class Test {\r\n\r\n}";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicAbstractClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic abstract class Test {\r\n\r\n}";
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent,
                new HashMap < String, GenericDependency >());
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY4, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicFinalClass() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic final class Test {\r\n\r\n}";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    // TODO test that the dependency type inside the GenericDependencies have the right type
    // (Interface, Class, Stub etc...)
    // TODO test the java.lang and the same package when not in import
    // TODO test the package name such as "class CharacterConstants extends com.toto.Comparable"

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileTest() throws PlantUMLDependencyException {
        final String test = readFileIntoString("D:\\test.txt");
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testReadDependencyFromFileWithBlankContent() throws PlantUMLDependencyException {
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(BLANK_STRING, new HashMap < String, GenericDependency >());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileWithSpacesAndLineSeparator() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n      package      com.    plantuml.     \r\ntest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\n       public     class      \r\nTest        {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY2, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }
}
