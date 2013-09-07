/*
 PlantUMLDependencyOutputOptionExecutionTest2.java
 Creation date : 07/09/2013
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

package net.sourceforge.plantuml.dependency.main.option.output;

import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET13;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET14;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET15;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET16;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET17;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET18;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET19;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET20;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET21;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET22;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET23;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET24;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET25;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET26;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET27;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET28;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET29;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET30;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET31;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET32;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET33;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET34;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET35;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET36;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET37;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET38;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET39;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET40;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET41;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET42;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET43;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET44;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET45;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET46;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET47;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET48;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET49;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET50;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET51;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET52;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET53;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET54;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET55;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET56;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.mazix.cli.exception.CommandLineException;

import org.junit.After;
import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.2.0
 * @version 1.2.0
 */
public class PlantUMLDependencyOutputOptionExecutionTest2 {

    /** Test file 1 instance. */
    private static final File TEST_FILE1 = new File("plantuml.txt");

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.2.0
     */
    @After
    public void removeFile() {
        TEST_FILE1.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute12() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET12, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute13() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET13, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute14() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET14, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute15() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET15, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute16() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET16, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute17() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET17, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute18() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET18, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute19() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET19, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute20() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET20, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute21() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET21, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute22() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET22, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute23() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET23, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute24() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET24, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute25() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET25, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute26() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET26, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute27() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET27, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute28() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET28, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute29() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET29, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute30() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET30, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute31() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET31, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute32() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET32, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute33() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET33, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute34() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET34, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute35() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET35, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute36() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET36, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute37() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET37, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute38() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET38, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute39() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET39, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute40() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET40, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute41() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET41, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute42() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET42, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute43() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET43, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute44() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET44, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute45() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET45, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute46() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET46, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute47() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET47, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute48() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET48, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute49() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET49, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute50() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET50, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute51() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET51, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute52() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET52, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute53() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET53, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute54() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET54, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute55() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET55, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute56() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET56, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
