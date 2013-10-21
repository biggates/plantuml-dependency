/*
 PlantUMLDependencyOutputOptionExecution4Test.java
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
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.*;
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
public class PlantUMLDependencyOutputOptionExecution4Test {

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
    public void testExecute177() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET177, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute178() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET178, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute179() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET179, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute180() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET180, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute181() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET181, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute182() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET182, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute183() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET183, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute184() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET184, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute185() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET185, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute186() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET186, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute187() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET187, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute188() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET188, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute189() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET189, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute190() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET190, 1);
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
    public void testExecute191() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET191, 1);
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
    public void testExecute192() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET192, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute193() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET193, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute194() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET194, 1);
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
    public void testExecute195() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET195, 1);
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
    public void testExecute196() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET196, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute197() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET197, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute198() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET198, 1);
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
    public void testExecute199() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET199, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute200() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET200, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute201() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET201, 1);
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
    public void testExecute202() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET202, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute203() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET203, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute204() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET204, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute205() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET205, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute206() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET206, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute207() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET207, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute208() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET208, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute209() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET209, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute210() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET210, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute211() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET211, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute212() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET212, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute213() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET213, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute214() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET214, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute215() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET215, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute216() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET216, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute217() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET217, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute218() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET218, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute219() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET219, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute220() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET220, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute221() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET221, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute222() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET222, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute223() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET223, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute224() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET224, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute225() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET225, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute226() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET226, 1);
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
    public void testExecute227() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET227, 1);
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
    public void testExecute228() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET228, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute229() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET229, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute230() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET230, 1);
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
    public void testExecute231() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET231, 1);
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
    public void testExecute232() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET232, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute233() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET233, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute234() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET234, 1);
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
    public void testExecute235() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET235, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute236() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET236, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute237() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET237, 1);
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
    public void testExecute238() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET238, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute239() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET239, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute240() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET240, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute241() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET241, 1);
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
    public void testExecute242() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET242, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute243() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET243, 1);
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
    public void testExecute244() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET244, 1);
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
    public void testExecute245() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET245, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute246() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET246, 1);
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
    public void testExecute247() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET247, 1);
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
    public void testExecute248() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET248, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute249() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET249, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute250() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET250, 1);
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
    public void testExecute251() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET251, 1);
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
    public void testExecute252() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET252, 1);
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
    public void testExecute253() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET253, 1);
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
    public void testExecute254() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET254, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute255() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET255, 1);
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
    public void testExecute256() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET256, 1);
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
    public void testExecute257() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET257, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute258() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET258, 1);
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
    public void testExecute259() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET259, 1);
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
    public void testExecute260() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET260, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute261() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET261, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute262() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET262, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute263() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET263, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute264() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET264, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute265() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET265, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute266() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET266, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute267() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET267, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute268() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET268, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute269() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET269, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute270() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET270, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute271() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET271, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute272() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET272, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute273() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET273, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute274() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET274, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute275() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET275, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute276() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET276, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute277() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET277, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute278() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET278, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute279() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET279, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute280() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET280, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute281() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET281, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute282() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET282, 1);
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
    public void testExecute283() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET283, 1);
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
    public void testExecute284() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET284, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute285() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET285, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute286() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET286, 1);
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
    public void testExecute287() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET287, 1);
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
    public void testExecute288() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET288, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute289() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET289, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute290() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET290, 1);
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
    public void testExecute291() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET291, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute292() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET292, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute293() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET293, 1);
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
    public void testExecute294() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET294, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute295() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET295, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute296() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET296, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute297() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET297, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\n@enduml",
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
    public void testExecute298() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET298, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute299() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET299, 1);
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
    public void testExecute300() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET300, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\n@enduml",
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
    public void testExecute301() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET301, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute302() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET302, 1);
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
    public void testExecute303() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET303, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\n@enduml",
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
    public void testExecute304() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET304, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute305() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET305, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute306() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET306, 1);
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
    public void testExecute307() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET307, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute308() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET308, 1);
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
    public void testExecute309() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET309, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\n@enduml",
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
    public void testExecute310() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET310, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute311() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET311, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute312() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET312, 1);
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
    public void testExecute313() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET313, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute314() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET314, 1);
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
    public void testExecute315() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET315, 1);
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
    public void testExecute316() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET316, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute317() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET317, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute318() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET318, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute319() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET319, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute320() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET320, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute321() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET321, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute322() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET322, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute323() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET323, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute324() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET324, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute325() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET325, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute326() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET326, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute327() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET327, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute328() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET328, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute329() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET329, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute330() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET330, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute331() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET331, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute332() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET332, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute333() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET333, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute334() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET334, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute335() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET335, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute336() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET336, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute337() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET337, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute338() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET338, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute339() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET339, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute340() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET340, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute341() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET341, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute342() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET342, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute343() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET343, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute344() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET344, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute345() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET345, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute346() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET346, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute347() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET347, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute348() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET348, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute349() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET349, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute350() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET350, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute351() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET351, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute352() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET352, 1);
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
    public void testExecute353() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET353, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute354() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET354, 1);
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
    public void testExecute355() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET355, 1);
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
    public void testExecute356() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET356, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute357() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET357, 1);
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
    public void testExecute358() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET358, 1);
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
    public void testExecute359() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET359, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute360() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET360, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute361() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET361, 1);
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
    public void testExecute362() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET362, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute363() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET363, 1);
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
    public void testExecute364() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET364, 1);
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
    public void testExecute365() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET365, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute366() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET366, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute367() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET367, 1);
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
    public void testExecute368() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET368, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute369() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET369, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute370() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET370, 1);
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
    public void testExecute371() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET371, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute372() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET372, 1);
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
    public void testExecute373() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET373, 1);
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
    public void testExecute374() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET374, 1);
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
    public void testExecute375() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET375, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute376() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET376, 1);
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
    public void testExecute377() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET377, 1);
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
    public void testExecute378() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET378, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute379() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET379, 1);
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
    public void testExecute380() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET380, 1);
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
    public void testExecute381() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET381, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute382() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET382, 1);
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
    public void testExecute383() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET383, 1);
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
    public void testExecute384() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET384, 1);
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
    public void testExecute385() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET385, 1);
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
    public void testExecute386() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET386, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
