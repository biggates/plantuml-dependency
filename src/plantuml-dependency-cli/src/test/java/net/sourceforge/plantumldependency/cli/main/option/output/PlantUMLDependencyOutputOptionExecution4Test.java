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

package net.sourceforge.plantumldependency.cli.main.option.output;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.*;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.readFileIntoString;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.After;
import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.2.0
 * @version 1.4.0
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute177() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET177, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute178() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET178, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute179() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET179, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute180() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET180, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute181() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET181, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute182() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET182, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute183() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET183, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute184() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET184, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute185() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET185, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute186() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET186, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute187() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET187, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute188() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET188, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute189() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET189, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute190() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET190, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute191() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET191, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute192() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET192, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute193() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET193, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute194() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET194, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute195() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET195, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute196() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET196, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute197() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET197, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute198() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET198, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute199() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET199, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute200() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET200, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute201() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET201, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute202() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET202, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute203() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET203, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute204() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET204, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute205() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET205, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute206() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET206, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute207() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET207, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute208() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET208, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute209() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET209, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute210() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET210, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute211() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET211, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute212() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET212, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute213() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET213, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute214() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET214, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute215() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET215, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute216() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET216, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute217() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET217, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute218() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET218, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute219() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET219, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute220() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET220, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute221() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET221, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute222() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET222, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute223() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET223, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute224() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET224, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute225() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET225, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute226() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET226, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute227() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET227, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute228() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET228, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute229() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET229, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute230() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET230, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute231() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET231, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute232() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET232, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute233() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET233, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute234() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET234, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute235() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET235, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute236() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET236, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute237() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET237, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute238() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET238, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute239() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET239, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute240() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET240, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute241() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET241, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute242() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET242, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute243() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET243, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute244() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET244, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute245() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET245, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute246() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET246, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute247() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET247, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute248() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET248, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute249() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET249, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute250() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET250, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute251() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET251, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute252() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET252, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute253() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET253, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute254() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET254, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute255() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET255, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute256() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET256, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute257() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET257, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute258() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET258, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute259() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET259, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute260() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET260, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute261() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET261, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute262() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET262, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute263() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET263, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute264() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET264, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute265() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET265, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute266() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET266, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute267() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET267, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute268() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET268, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute269() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET269, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute270() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET270, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute271() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET271, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute272() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET272, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute273() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET273, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute274() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET274, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute275() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET275, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute276() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET276, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute277() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET277, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute278() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET278, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute279() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET279, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute280() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET280, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute281() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET281, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute282() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET282, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute283() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET283, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute284() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET284, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute285() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET285, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute286() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET286, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute287() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET287, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute288() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET288, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute289() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET289, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute290() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET290, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute291() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET291, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute292() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET292, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute293() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET293, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute294() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET294, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute295() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET295, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute296() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET296, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute297() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET297, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute298() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET298, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute299() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET299, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute300() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET300, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute301() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET301, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute302() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET302, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute303() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET303, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute304() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET304, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute305() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET305, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute306() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET306, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute307() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET307, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute308() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET308, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute309() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET309, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute310() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET310, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute311() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET311, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute312() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET312, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute313() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET313, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute314() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET314, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute315() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET315, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute316() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET316, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute317() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET317, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute318() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET318, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute319() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET319, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute320() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET320, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute321() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET321, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute322() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET322, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute323() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET323, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute324() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET324, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute325() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET325, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute326() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET326, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute327() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET327, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute328() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET328, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute329() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET329, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute330() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET330, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute331() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET331, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute332() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET332, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute333() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET333, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute334() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET334, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute335() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET335, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute336() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET336, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute337() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET337, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute338() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET338, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute339() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET339, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute340() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET340, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute341() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET341, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute342() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET342, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute343() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET343, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute344() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET344, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute345() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET345, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute346() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET346, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute347() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET347, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute348() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET348, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute349() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET349, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute350() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET350, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute351() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET351, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute352() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET352, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute353() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET353, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute354() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET354, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute355() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET355, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute356() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET356, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute357() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET357, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute358() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET358, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute359() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET359, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute360() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET360, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute361() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET361, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute362() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET362, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute363() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET363, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute364() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET364, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute365() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET365, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute366() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET366, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute367() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET367, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute368() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET368, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute369() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET369, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute370() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET370, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute371() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET371, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute372() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET372, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute373() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET373, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute374() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET374, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute375() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET375, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute376() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET376, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute377() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET377, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute378() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET378, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute379() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET379, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute380() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET380, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute381() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET381, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute382() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET382, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute383() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET383, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute384() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET384, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute385() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET385, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute386() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET386, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
