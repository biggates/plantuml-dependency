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
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY4;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY7;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY8;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY9;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;

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
    public void testReadDependencyFromFileClassWithExtendsGenericsNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY21, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithExtendsInImportFullPackageName() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.impl.JavaProgramImpl;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY19, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
    }

    // TODO test several class name with the same name but not with the same package (one in
    // java.lang and one in the current same package)

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithExtendsNotInImportFullPackageName()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY17, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithExtendsNotInImportJavaLang() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends ClassNotFoundException {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY15, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithExtendsNotInImportNotJavaLang() throws PlantUMLDependencyException {
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
    public void testReadDependencyFromFileClassWithImplementsGenericsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.InterfaceGenericsTest;\r\nimport com.plantuml.train.test.Integer;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY22, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY20, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithImplementsInImportFullPackageName()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements com.plantuml.train.test.AnotherInterfaceTest {\r\n\r\n}\r\n";
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportFullPackageName()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY18, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportJavaLang() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements Appendable {\r\n\r\n}\r\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY16, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportNotJavaLang()
            throws PlantUMLDependencyException {
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
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass TestMultipleImplementsAndExtendsGeneric extends TestExtendsGeneric < AnotherTestExtends > implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest < CharacterConstants, java.test.Test > {\r\n\r\n}\r\n";
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
    public void testReadDependencyFromFileInterface() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\ninterface TestReadDependencyFromFileInterface {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY24, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceGenericNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceGenericNotInImport < PlantUMLDependencyBaseDirectoryOptionTest > {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY25, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY26, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport extends DeepCloneable < Integer > {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY27, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsInImport() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends GenericDependency {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsInImportFullPackageName()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY29, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang extends Comparable {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY30, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY31, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithMultipleExtendsGenerics() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport java.util.Map;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileClassWithMultipleExtendsGenerics extends DeepCloneable < CppProgrammingLanguageTest >, Comparable < Integer>, Map < java.io.Serializable, ProgrammingLanguageTest >, Appendable {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY23, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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
    public void testReadDependencyFromFileInterfaceWithoutPackage() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY32, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
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

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(java.lang.String, java.util.Map)}
     * .
     * 
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicInterface() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFilePublicInterface {\n\n}\n";
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY33, JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(
                javaSourceFileContent, new HashMap < String, GenericDependency >()));
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
