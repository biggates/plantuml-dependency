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
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET30;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET31;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET32;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET34;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET35;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET4;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET9;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY10;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY11;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY13;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY14;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY16;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY17;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY18;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY19;
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
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY30;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY31;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY32;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY33;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY34;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY35;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY36;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY37;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY38;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY39;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY40;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY41;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY42;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY43;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY44;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY45;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY46;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY47;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY48;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY49;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY51;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY7;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY8;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY9;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sourceforge.mazix.components.ComparableObjectTest;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl.AnnotationDependencyTypeImpl;
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
 * @version 1.2.0
 */
public class JavaProgrammingLanguageTest extends ComparableObjectTest < JavaProgrammingLanguage > {

    /** Java programming language test 1 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE1 = JAVA;

    /** Java programming language test 2 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE2 = JAVA;

    /** Java programming language test 3 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE3 = CPP;

    /** Java programming language test 4 instance. */
    @DataPoint
    public static final ProgrammingLanguage JAVA_PROGRAMMING_LANGUAGE4 = null;

    /**
     * Asserts that two {@link GenericDependency} instance are strictly identical.
     *
     * @param expectedDependency
     *            the expected {@link GenericDependency} instance, mustn't be <code>null</code>.
     * @param resultDependency
     *            the result {@link GenericDependency} instance, mustn't be <code>null</code>.
     */
    private static void assertGenericDependencyAreEquals(final GenericDependency expectedDependency,
            final GenericDependency resultDependency) {
        assertEquals(expectedDependency, resultDependency);
        assertEquals(expectedDependency.getDependencyType(), resultDependency.getDependencyType());
        assertEquals(expectedDependency.getDependencyType().getImportDependenciesCollection(), resultDependency
                .getDependencyType().getImportDependenciesCollection());
        assertEquals(expectedDependency.getDependencyType().getParentImplementationsDependencies(), resultDependency
                .getDependencyType().getParentImplementationsDependencies());
        assertEquals(expectedDependency.getDependencyType().getParentExtensionsDependencies(), resultDependency
                .getDependencyType().getParentExtensionsDependencies());
        assertEquals(expectedDependency.getDependencyType().getAnnotationsDependencies(), resultDependency
                .getDependencyType().getAnnotationsDependencies());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testReadDependencyFromEmptyFileWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "///*\r\n// Test.java\r\n// Creation date : 20 août 2010\r\n// */\r\n//package com.plantuml.test;\r\n//\r\n///**\r\n// * @author Benjamin Croizet\r\n// *\r\n// * @since\r\n// * @version\r\n// */\r\n//abstract class Test {\r\n//\r\n//}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * Test reproducing the <a href="https://sourceforge.net/p/plantuml-depend/bugs/3/">#3
     * Annotations cause problems</a> bug.
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractClassWithAnnotationsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package com.plantuml.test;\r\n\r\nimport java.lang.annotation.ElementType;\r\n\r\nimport javax.xml.bind.annotation.XmlType;\r\nimport javax.xml.ws.soap.Addressing;\r\n\r\n@    Testabstract\r\n@    Deprecated\r\n@    SuppressWarnings(   {  \"deprecation\"  ,  \"unckeked\"  }   )\r\n@    Addressing   (   enabled  =  true   )\r\n@    Annotationinterface\r\n@    AnotherAnnotation ( {  ElementType.CONSTRUCTOR  , ElementType.METHOD   } )\r\n@    MyAnnotation (  tab  =  {  1  ,  2  ,  3  ,  4  ,  5  }  )\r\n@    XmlType   (   propOrder   =   {   \"street\"   ,   \"city\"  ,   \"state\"  ,   \"zip\"   ,   \"name\"   }  )\r\n@    MappedSuperclass\r\n@ javax.annotation.Generated(value=\"\")\r\npublic abstract class GenericEndpoint {\r\n@   Override  \r\n public void toto() {\r\nString t = \"@test\";}\r\n \r\n@   Override  \r\n public void titi() {\r\nString t = \"@test\";}\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY46,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(13, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY46.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Override").getDependencyType()
                        .getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractClassWithStandardEmptyContextAndClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET4);
        assertEquals(GENERIC_DEPENDENCY8,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY8.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY8.getFullName()));
    }

    // TODO test annotation with enum etc...
    // TODO test with the context

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileAbstractPublicClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nabstract public class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY8.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassGenericNotInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY11,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY11.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithAnnotationsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package com.plantuml.test;\r\n\r\nimport java.lang.annotation.ElementType;\r\n\r\nimport javax.xml.bind.annotation.XmlType;\r\nimport javax.xml.ws.soap.Addressing;\r\n\r\n@    Testabstract\r\n@    Deprecated\r\n@    SuppressWarnings(   {  \"deprecation\"  ,  \"unckeked\"  }   )\r\n@    Addressing   (   enabled  =  true   )\r\n@    Annotationinterface\r\n@    AnotherAnnotation ( {  ElementType.CONSTRUCTOR  , ElementType.METHOD   } )\r\n@    MyAnnotation (  tab  =  {  1  ,  2  ,  3  ,  4  ,  5  }  )\r\n@    XmlType   (   propOrder   =   {   \"street\"   ,   \"city\"  ,   \"state\"  ,   \"zip\"   ,   \"name\"   }  )\r\n@    MappedSuperclass\r\n@ javax.annotation.Generated(value=\"\")\r\npublic class GenericEndpoint {\r\n@   Override  \r\n public void toto() {\r\nString t = \"@test\";}\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY51,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(13, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY51.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Override").getDependencyType()
                        .getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithCarriageReturnsAsSeparatorAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.\ntest;\r\n\r\nimport net.sourceforge.mazix.\ncli.program.\nJavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class\nTestImplements implements\nnet.sourceforge.mazix.cli.program.\nJavaProgram {\r\nprivate static native void\nregisterNatives\n();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY40,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY40.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithClassWordInCommentsAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\n//Hello class ! my name is brian\r\npublic class Test extends TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY9,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY9.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends")
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
    public void testReadDependencyFromFileClassWithCommentsAsSeparatorAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\n//Hello class ! my name is brian\r\npublic/*@bgen(jjtree)*/class/*@bgen(jjtree)*/Test/*@bgen(jjtree)*/extends/**@bgen(jjtree)**/TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY9,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY9.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends")
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
    public void testReadDependencyFromFileClassWithExtendsGenericsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY12,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY12.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
                        .getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric")
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
    public void testReadDependencyFromFileClassWithExtendsGenericsNotInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY25,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY12.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric")
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
    public void testReadDependencyFromFileClassWithExtendsInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.impl.JavaProgramImpl;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY23,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY23.getFullName()));
        assertEquals(
                ClassDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\n    public TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET4);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY43,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY44.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends AnotherTestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY10,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY10.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndExtensionsDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\npublic TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET30);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY45,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY45.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndImplementationsDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\n    \r\n\r\n    public TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET31);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY45,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY45.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndImportsDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\n    \r\n\r\n    public TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET32);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY45,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY45.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndImportsStaticDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\n    \r\n\r\n    public TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET35);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY45,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY45.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsInImportWithStandardEmptyContextAndNativeDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency;\r\n\r\nimport java.io.File;\r\nimport java.io.FileInputStream;\r\nimport java.io.FileNotFoundException;\r\nimport java.io.InputStream;\r\nimport java.io.Serializable;\r\nimport java.math.BigInteger;\r\nimport java.util.Random;\r\n\r\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;\r\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;\r\nimport static java.util.Arrays.asList;\r\nimport static java.util.logging.Level.SEVERE;\r\n\r\npublic class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {\r\n\r\n    /**\r\n     * \r\n     */\r\n    private static final long serialVersionUID = 8210152156402402701L;\r\n\r\n    public TestDisplayOption(byte[] arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n    \r\n    \r\n\r\n    public TestDisplayOption(int arg0, byte[] arg1) {\r\n        super(arg0, arg1);\r\n        File file = new File(\"toto\");\r\n        try {\r\n            InputStream inputStream = new FileInputStream(file);\r\n        } catch (FileNotFoundException e) {\r\n            // TODO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, int arg1, Random arg2) {\r\n        super(arg0, arg1, arg2);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(int arg0, Random arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0, int arg1) {\r\n        super(arg0, arg1);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    public TestDisplayOption(String arg0) {\r\n        super(arg0);\r\n        // TODO Auto-generated constructor stub\r\n    }\r\n\r\n    @Override\r\n    public JavaRawDependency deepClone() {\r\n        // TODO Auto-generated method stub\r\n        return null;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET34);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY45,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(14, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.File"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Random"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY45.getFullName()));
        assertEquals(StubDependencyTypeImpl.class, programmingLanguageContext.getParsedOrSeenDependency("java.io.File")
                .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileInputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.FileNotFoundException")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.InputStream").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.io.Serializable").getDependencyType()
                        .getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.math.BigInteger").getDependencyType()
                        .getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Random").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Arrays").getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.logging.Level").getDependencyType()
                        .getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.Override")
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
    public void testReadDependencyFromFileClassWithExtendsNotInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends net.sourceforge.mazix.cli.program.impl.JavaProgramImpl {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY21,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY21.getFullName()));
        assertEquals(
                ClassDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.impl.JavaProgramImpl")
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
    public void testReadDependencyFromFileClassWithExtendsNotInImportJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends ClassNotFoundException {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY19,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.ClassNotFoundException"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY19.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.ClassNotFoundException")
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
    public void testReadDependencyFromFileClassWithExtendsNotInImportNotJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends TestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY9,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY9.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.TestExtends")
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
    public void testReadDependencyFromFileClassWithGenericDefinitionAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric < A extends AnotherTestExtends > extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY12,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY12.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
                        .getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric")
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
    public void testReadDependencyFromFileClassWithImplementsGenericsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.InterfaceGenericsTest;\r\nimport com.plantuml.train.test.Integer;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY26,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.Integer"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY26.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.InterfaceGenericsTest")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.Integer")
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
    public void testReadDependencyFromFileClassWithImplementsGenericsNotInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplementsGenerics.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplementsGenerics implements InterfaceGenericsTest < Integer > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY14,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY14.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest")
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
    public void testReadDependencyFromFileClassWithImplementsInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements com.plantuml.train.test.AnotherInterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY18,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY18.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest")
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
    public void testReadDependencyFromFileClassWithImplementsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY24,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY24.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY22,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY22.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements Appendable {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY20,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Appendable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY20.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Appendable")
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
    public void testReadDependencyFromFileClassWithImplementsNotInImportNotJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements InterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY13,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY13.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest")
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
    public void testReadDependencyFromFileClassWithInferiorCharInCodeAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\npublic class TestImplements<E extends Enum<E>> implements JavaProgram {\r\n\r\n    public static final int ANNOTATION = 0 < 1 ? 12 : 13;\r\n\r\n\tprotected synchronized native int test();\r\n\r\n  static {if (c == '\\'' || c = '\\\\' || c == '\"' || c == \"\\\\\" || c == '\"') {int i = 0;}} \r\n\r\n /**\r\n   * ' {@inheritDoc}\r\n     * @since 1.0\r\n     * tests >\r\n     */\r\n    public int compareTo(JavaProgram o) {\r\n\t\treturn 0;\r\n    }\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY40,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY40.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithInnerCLassAndDefaultDisplaySet() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestExtendsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\nimport com.plantuml.train.test.TestExtendsGeneric.InnerTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestExtendsWithGeneric extends TestExtendsGeneric < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY38,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(4, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric.InnerTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY12.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
                        .getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric.InnerTest")
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
    public void testReadDependencyFromFileClassWithMultipleImplementsAndExtendsGenericsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.TestExtendsGeneric;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass TestMultipleImplementsAndExtendsGeneric extends TestExtendsGeneric < AnotherTestExtends > implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest < CharacterConstants, java.test.Test > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY17,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(7, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Cloneable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY17.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest")
                        .getDependencyType().getClass());
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
                        .getDependencyType().getClass());
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.TestExtendsGeneric")
                        .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Cloneable").getDependencyType()
                        .getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest")
                        .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest")
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
    public void testReadDependencyFromFileClassWithMultipleImplementsGenericsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestMultipleImplementsGeneric.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherInterfaceTest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestMultipleImplementsGeneric implements Cloneable, InterfaceGenericsTest < Integer >, InterfaceTest, AnotherInterfaceTest {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY16,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(5, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Cloneable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY16.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherInterfaceTest")
                        .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Cloneable").getDependencyType()
                        .getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceGenericsTest")
                        .getDependencyType().getClass());
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.InterfaceTest")
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
    public void testReadDependencyFromFileClassWithNativeMethodAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport net.sourceforge.mazix.cli.program.JavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements implements net.sourceforge.mazix.cli.program.JavaProgram {\r\nstatic native    String   testNative   (    )    ;\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY40,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY40.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithoutPackageWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY7,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY7.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nclass Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithStandardEmptyContextAndInterfaceDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test < AnotherTestExtends > {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET9);
        assertEquals(GENERIC_DEPENDENCY10,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY10.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
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
    public void testReadDependencyFromFileClassWithStaticImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\nimport static net.sourceforge.mazix.cli.program.JavaProgram.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class TestImplements {\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY42,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY42.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithStringContainingKeyWords() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\n Test.java\n Creation date : 20 août 2010\n */\npackage com.plantuml.test;\n\n/**\n * @author Benjamin Croizet\n * \n * @since\n * @version\n */\nclass Test {\n    public String test() {\n        final String javaSourceFileContent = \"package com.plantuml.test;import com.plantuml.train.test.AnotherInterfaceTest;public class TestImplements implements com.plantuml.train.test.AnotherInterfaceTest {}\";\n        return javaSourceFileContent;\n    }\n\n    // import java.lang.Comparable\n\n    public String toto() {\n        final String packageTest = \"import java.lang\" \n    + \".Object;private static native void registerNatives();\";\n        final String javaSourceFileContent = \"/*\\n Test.java\\n Creation date : 20 août 2010\\n */\\npackage com.plantuml.test;\\n\\n/**\\n * @author Benjamin Croizet\\n * \\n * @since\\n * @version\\n */\\nclass Test {\\n    public String test() {\\n        final String javaSourceFileContent = \\\"package com.plantuml.test;import com.plantuml.train.test.AnotherInterfaceTest;public class TestImplements implements com.plantuml.train.test.AnotherInterfaceTest {}\\\";\\n        return javaSourceFileContent;\\n    }\\n\\n    // import java.lang.Comparable\\n\\n    public String toto() {\\n        final String packageTest = \\\"import java.lang\\\" \\n    + \\\".Object;\\nprivate static native void\\nregisterNatives\\n();\\\";\\n        return packageTest;\\n    }\\n}\";\n        return packageTest;\n    }\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileClassWithTabsAsSeparatorAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n TestImplements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.\ttest;\r\n\r\nimport net.sourceforge.mazix.\tcli.program.\tJavaProgram;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class\tTestImplements implements\tnet.sourceforge.mazix.cli.program.\tJavaProgram {\r\nprotected synchronized native int\ttest\t();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY40,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY40.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.program.JavaProgram")
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
    public void testReadDependencyFromFileClassWithUnderscoresAndDefaultDisplaySet() throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test_Implements.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.te_st;\r\n\r\nimport net.sourceforge.mazix.cli.pro_gram.Java_Program;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test_Implements implements net.sourceforge.mazix.cli.pro_gram.Java_Program {\r\nprivate static native void register_Natives();\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY41,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(NATIVE_DEPENDENCY.getFullName()));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.cli.pro_gram.Java_Program"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY41.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("net.sourceforge.mazix.cli.pro_gram.Java_Program")
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
    public void testReadDependencyFromFileClassWithWildcardImportsAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\npackage com.plantuml.test;\r\n\r\nimport com.plantuml.train.test.AnotherTestExtends;\r\nimport com.plantuml.train.test.wildcard.*;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n * \r\n * @since\r\n * @version\r\n */\r\npublic class Test extends AnotherTestExtends {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY10,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY10.getFullName()));
        assertEquals(ClassDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.train.test.AnotherTestExtends")
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
    public void testReadDependencyFromFileEnumWithoutPackageWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public enum TestReadDependencyFromFileEnum {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY48,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY48.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileEnumWithStandardEmptyContextAndAbstractClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public enum TestReadDependencyFromFileEnum {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET3);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY48,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY48.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileEnumWithStandardEmptyContextAndClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public enum TestReadDependencyFromFileEnum {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET4);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY48,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY48.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileEnumWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nenum TestReadDependencyFromFileEnum {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY47,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY47.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileEnumWithStandardEmptyContextAndEnumDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public enum TestReadDependencyFromFileEnum {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET5);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY48,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY48.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileFinalPublicClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\nfinal public class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceGenericNotInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceGenericNotInImport < PlantUMLDependencyBaseDirectoryOptionTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY29,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY29.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithAnnotationsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package com.plantuml.test;\r\n\r\nimport java.lang.annotation.ElementType;\r\n\r\nimport javax.xml.bind.annotation.XmlType;\r\nimport javax.xml.ws.soap.Addressing;\r\n\r\n@    Testabstract\r\n@    Deprecated\r\n@    SuppressWarnings(   {  \"deprecation\"  ,  \"unckeked\"  }   )\r\n@    Addressing   (   enabled  =  true   )\r\n@    Annotationinterface\r\n@    AnotherAnnotation ( {  ElementType.CONSTRUCTOR  , ElementType.METHOD   } )\r\n@    MyAnnotation (  tab  =  {  1  ,  2  ,  3  ,  4  ,  5  }  )\r\n@    XmlType   (   propOrder   =   {   \"street\"   ,   \"city\"  ,   \"state\"  ,   \"zip\"   ,   \"@test\"   }  )\r\n@    MappedSuperclass\r\n@ javax.annotation.Generated(value=\"\")\r\ninterface GenericEndpoint {\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY49,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(12, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY49.getFullName()));
        assertEquals(StubDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.lang.annotation.ElementType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.bind.annotation.XmlType")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.xml.ws.soap.Addressing")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Testabstract")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Deprecated")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.SuppressWarnings")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.Annotationinterface")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.AnotherAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MyAnnotation")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("com.plantuml.test.MappedSuperclass")
                        .getDependencyType().getClass());
        assertEquals(AnnotationDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("javax.annotation.Generated").getDependencyType()
                        .getClass());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithCommentsAsSeparatorAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\n//Hello interface ! my name is brian\r\npublic/*@bgen(jjtree)*/interface/*@bgen(jjtree)*/TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends/**@bgen(jjtree)**/TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY35,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY35.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY30,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY30.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithExtendsGenericsNotInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsNotInImport extends DeepCloneable < Integer > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY31,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY31.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
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
    public void testReadDependencyFromFileInterfaceWithExtendsInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY32,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY32.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency")
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
    public void testReadDependencyFromFileInterfaceWithExtendsInImportWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY32,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY32.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency")
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageNameWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportFullPackageName extends net.sourceforge.plantuml.dependency.generic.GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY33,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY33.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency")
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportJavaLang extends Comparable {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY34,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.Comparable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY34.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.Comparable")
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
    public void testReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLangWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY35,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY35.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithGenericDefinitionAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport < A extends CppProgrammingLanguageTest > extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY30,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(3, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY30.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithInnerClassAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\n\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest.InnerTest;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsGenericsInImport extends DeepCloneable < CppProgrammingLanguageTest > {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY39,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(4, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest.InnerTest"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY30.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithInterfaceWordInCommentsAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\n//Hello interface ! my name is brian\r\npublic interface TestReadDependencyFromFileInterfaceWithExtendsNotInImportNotJavaLang extends TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY35,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY35.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
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
    public void testReadDependencyFromFileInterfaceWithMultipleExtendsGenericsWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport java.util.Map;\n\nimport net.sourceforge.mazix.components.clone.DeepCloneable;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest;\nimport net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest;\n\npublic interface TestReadDependencyFromFileClassWithMultipleExtendsGenerics extends DeepCloneable < CppProgrammingLanguageTest >, Comparable < Integer>, Map < java.io.Serializable, ProgrammingLanguageTest >, Appendable {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY27,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(7, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency("java.util.Map"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.Comparable"));
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.Appendable"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY27.getFullName()));
        assertEquals(InterfaceDependencyTypeImpl.class,
                programmingLanguageContext.getParsedOrSeenDependency("java.util.Map").getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguageTest")
                        .getDependencyType().getClass());
        assertEquals(
                StubDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguageTest")
                        .getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.Comparable")
                        .getDependencyType().getClass());
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency(
                                "net.sourceforge.plantuml.dependency.main.option.programminglanguage.Appendable")
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
    public void testReadDependencyFromFileInterfaceWithoutPackageWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY36.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithStandardEmptyContextAndAbstractClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET3);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY36.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithStandardEmptyContextAndClassDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET4);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY36.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\ninterface TestReadDependencyFromFileInterface {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY28,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY28.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithStandardEmptyContextAndEnumDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "public interface TestReadDependencyFromFileInterfaceWithoutPackage {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET5);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY36,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY36.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileInterfaceWithWildcardImportsAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\nimport net.sourceforge.plantuml.dependency.generic.GenericDependency;\n\nimport net.sourceforge.plantuml.dependency.generic.wildcard.*;\n\npublic interface TestReadDependencyFromFileInterfaceWithExtendsInImport extends GenericDependency {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY32,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(2, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext
                .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency"));
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY32.getFullName()));
        assertEquals(
                InterfaceDependencyTypeImpl.class,
                programmingLanguageContext
                        .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.generic.GenericDependency")
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
    public void testReadDependencyFromFilePublicAbstractClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic abstract class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY8,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY8.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicClassWithStandardEmptyContextAndEmptyDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DISPLAY_SET1);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicFinalClassWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\npackage com.plantuml.test;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\npublic final class Test {\r\n\r\n}";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFilePublicInterfaceWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "package net.sourceforge.plantuml.dependency.main.option.programminglanguage;\n\npublic interface TestReadDependencyFromFilePublicInterface {\n\n}\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY37,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY37.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testReadDependencyFromFileWithBlankContentWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(BLANK_STRING,
                JAVA_PROGRAMMING_LANGUAGE1.createNewContext(DEFAULT_DISPLAY_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testReadDependencyFromFileWithSpacesAndLineSeparatorWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "/*\r\n Test.java\r\n Creation date : 20 août 2010\r\n */\r\n\r\n      package      com.    plantuml.     \r\ntest;\r\n\r\n/**\r\n * @author Benjamin Croizet\r\n *\r\n * @since\r\n * @version\r\n */\r\n       public     class      \r\nTest        {\r\n\r\n}\r\n";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        assertGenericDependencyAreEquals(GENERIC_DEPENDENCY6,
                JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext));
        assertEquals(1, programmingLanguageContext.getParsedDependencies().size());
        assertEquals(1, programmingLanguageContext.getParsedAndSeenDependencies().size());
        assertNotNull(programmingLanguageContext.getParsedOrSeenDependency(GENERIC_DEPENDENCY6.getFullName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.JavaProgrammingLanguage#readDependencyFromFile(String, ProgrammingLanguageContext)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testReadDependencyFromNonJavaFileWithStandardEmptyContextAndDefaultDisplaySet()
            throws PlantUMLDependencyException {
        final String javaSourceFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<testsuite failures=\"0\" time=\"0.306\" errors=\"0\" skipped=\"0\" tests=\"22\" name=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\">\n  <properties>\n    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n    <property name=\"sun.boot.library.path\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/i386\"/>\n    <property name=\"java.vm.version\" value=\"20.1-b02\"/>\n    <property name=\"java.vm.vendor\" value=\"Sun Microsystems Inc.\"/>\n    <property name=\"java.vendor.url\" value=\"http://java.sun.com/\"/>\n    <property name=\"path.separator\" value=\":\"/>\n    <property name=\"java.vm.name\" value=\"Java HotSpot(TM) Server VM\"/>\n    <property name=\"file.encoding.pkg\" value=\"sun.io\"/>\n    <property name=\"user.country\" value=\"FR\"/>\n    <property name=\"sun.java.launcher\" value=\"SUN_STANDARD\"/>\n    <property name=\"sun.os.patch.level\" value=\"unknown\"/>\n    <property name=\"java.vm.specification.name\" value=\"Java Virtual Machine Specification\"/>\n    <property name=\"user.dir\" value=\"/home/graffity/workspace/plantuml-dependency\"/>\n    <property name=\"java.runtime.version\" value=\"1.6.0_26-b03\"/>\n    <property name=\"java.awt.graphicsenv\" value=\"sun.awt.X11GraphicsEnvironment\"/>\n    <property name=\"basedir\" value=\"/home/graffity/workspace/plantuml-dependency\"/>\n    <property name=\"java.endorsed.dirs\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/endorsed\"/>\n    <property name=\"os.arch\" value=\"i386\"/>\n    <property name=\"surefire.real.class.path\" value=\"/home/graffity/workspace/plantuml-dependency/target/surefire/surefirebooter4286092155706823282.jar\"/>\n    <property name=\"java.io.tmpdir\" value=\"/tmp\"/>\n    <property name=\"line.separator\" value=\"\n\"/>\n    <property name=\"java.vm.specification.vendor\" value=\"Sun Microsystems Inc.\"/>\n    <property name=\"os.name\" value=\"Linux\"/>\n    <property name=\"sun.jnu.encoding\" value=\"UTF-8\"/>\n    <property name=\"java.library.path\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/i386/server:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/i386:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/../lib/i386:/usr/java/packages/lib/i386:/lib:/usr/lib\"/>\n    <property name=\"surefire.test.class.path\" value=\"/home/graffity/workspace/plantuml-dependency/target/test-classes:/home/graffity/workspace/plantuml-dependency/target/classes:/home/graffity/.m2/repository/junit/junit/4.7/junit-4.7.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/cli/mazix-cli/1.0.2/mazix-cli-1.0.2.jar:/home/graffity/.m2/repository/org/apache/ant/ant/1.8.2/ant-1.8.2.jar:/home/graffity/.m2/repository/org/apache/ant/ant-launcher/1.8.2/ant-launcher-1.8.2.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/components/mazix-components/1.1.1/mazix-components-1.1.1.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/components/mazix-components/1.1.1/mazix-components-1.1.1-tests.jar:\"/>\n    <property name=\"java.specification.name\" value=\"Java Platform API Specification\"/>\n    <property name=\"java.class.version\" value=\"50.0\"/>\n    <property name=\"sun.management.compiler\" value=\"HotSpot Tiered Compilers\"/>\n    <property name=\"os.version\" value=\"2.6.32-33-generic-pae\"/>\n    <property name=\"user.home\" value=\"/home/graffity\"/>\n    <property name=\"user.timezone\" value=\"\"/>\n    <property name=\"java.awt.printerjob\" value=\"sun.print.PSPrinterJob\"/>\n    <property name=\"file.encoding\" value=\"UTF-8\"/>\n    <property name=\"java.specification.version\" value=\"1.6\"/>\n    <property name=\"user.name\" value=\"graffity\"/>\n    <property name=\"java.class.path\" value=\"/home/graffity/workspace/plantuml-dependency/target/test-classes:/home/graffity/workspace/plantuml-dependency/target/classes:/home/graffity/.m2/repository/junit/junit/4.7/junit-4.7.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/cli/mazix-cli/1.0.2/mazix-cli-1.0.2.jar:/home/graffity/.m2/repository/org/apache/ant/ant/1.8.2/ant-1.8.2.jar:/home/graffity/.m2/repository/org/apache/ant/ant-launcher/1.8.2/ant-launcher-1.8.2.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/components/mazix-components/1.1.1/mazix-components-1.1.1.jar:/home/graffity/.m2/repository/net/sourceforge/mazix/components/mazix-components/1.1.1/mazix-components-1.1.1-tests.jar:\"/>\n    <property name=\"java.vm.specification.version\" value=\"1.0\"/>\n    <property name=\"sun.arch.data.model\" value=\"32\"/>\n    <property name=\"java.home\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre\"/>\n    <property name=\"sun.java.command\" value=\"/home/graffity/workspace/plantuml-dependency/target/surefire/surefirebooter4286092155706823282.jar /home/graffity/workspace/plantuml-dependency/target/surefire/surefire1347948533659098341tmp /home/graffity/workspace/plantuml-dependency/target/surefire/surefire6816175995908075715tmp\"/>\n    <property name=\"java.specification.vendor\" value=\"Sun Microsystems Inc.\"/>\n    <property name=\"user.language\" value=\"fr\"/>\n    <property name=\"java.vm.info\" value=\"mixed mode\"/>\n    <property name=\"java.version\" value=\"1.6.0_26\"/>\n    <property name=\"java.ext.dirs\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/ext:/usr/java/packages/lib/ext\"/>\n    <property name=\"sun.boot.class.path\" value=\"/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/resources.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/rt.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/jsse.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/jce.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/charsets.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/lib/modules/jdk.boot.jar:/usr/lib/jvm/java-6-sun-1.6.0.26/jre/classes\"/>\n    <property name=\"java.vendor\" value=\"Sun Microsystems Inc.\"/>\n    <property name=\"localRepository\" value=\"/home/graffity/.m2/repository\"/>\n    <property name=\"file.separator\" value=\"/\"/>\n    <property name=\"java.vendor.url.bug\" value=\"http://java.sun.com/cgi-bin/bugreport.cgi\"/>\n    <property name=\"sun.cpu.endian\" value=\"little\"/>\n    <property name=\"sun.io.unicode.encoding\" value=\"UnicodeLittle\"/>\n    <property name=\"sun.desktop\" value=\"gnome\"/>\n    <property name=\"sun.cpu.isalist\" value=\"\"/>\n  </properties>\n  <testcase time=\"0.03\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"testGetDependencyType\"/>\n  <testcase time=\"0.011\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"testGetFullName\"/>\n  <testcase time=\"0.003\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"testGetName\"/>\n  <testcase time=\"0.015\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"testGetPackageName\"/>\n  <testcase time=\"0.009\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"testSetDependencyType\"/>\n  <testcase time=\"0.006\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"deepCloneClassAreEquals\"/>\n  <testcase time=\"0.011\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"deepCloneReferencesAreDifferent\"/>\n  <testcase time=\"0.01\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"deepClonesAreEquals\"/>\n  <testcase time=\"0.005\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"compareToIsConsistent\"/>\n  <testcase time=\"0.016\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"compareToIsConsistentWithEquals\"/>\n  <testcase time=\"0.004\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"compareToIsSymmetric\"/>\n  <testcase time=\"0.003\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"compareToIsTransitive\"/>\n  <testcase time=\"0.008\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"compareToWorks\"/>\n  <testcase time=\"0.003\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsIsConsistent\"/>\n  <testcase time=\"0.002\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsIsReflexive\"/>\n  <testcase time=\"0.002\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsIsSymmetric\"/>\n  <testcase time=\"0.002\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsIsTransitive\"/>\n  <testcase time=\"0.01\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsReturnFalseOnNull\"/>\n  <testcase time=\"0.002\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"equalsWorks\"/>\n  <testcase time=\"0.008\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"hashCodeIsConsistentWithEquals\"/>\n  <testcase time=\"0.002\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"hashCodeIsSelfConsistent\"/>\n  <testcase time=\"0.012\" classname=\"net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest\" name=\"toStringContainsClassName\"/>\n</testsuite>";
        final ProgrammingLanguageContext programmingLanguageContext = JAVA_PROGRAMMING_LANGUAGE1
                .createNewContext(DEFAULT_DISPLAY_OPTIONS);
        JAVA_PROGRAMMING_LANGUAGE1.readDependencyFromFile(javaSourceFileContent, programmingLanguageContext);
    }
}
