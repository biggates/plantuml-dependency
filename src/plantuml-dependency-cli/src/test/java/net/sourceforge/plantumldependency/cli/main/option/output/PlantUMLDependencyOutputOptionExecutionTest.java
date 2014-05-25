/*
 PlantUMLDependencyOutputOptionExecutionTest.java
 Creation date : 10/07/2010
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

import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET10;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET11;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET2;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET4;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET5;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET6;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET7;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET8;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET9;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET2;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET4;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET5;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET6;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType.DISPLAY_TYPES_OPTIONS;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyOutputOptionExecutionTest extends
        DeepCloneableObjectTest < PlantUMLDependencyOutputOptionExecution > {

    /** Test file 1 instance. */
    private static final File TEST_FILE1 = new File("plantuml.txt");

    /** Test file 1 instance. */
    private static final File TEST_FILE2 = new File("test.txt");

    /** Output option execution test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION1 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION2 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE2, JAVA, FILE_SET1, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION3 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, CPP, FILE_SET1, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 4 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION4 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET2, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 5 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION5 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET3, 1);

    /** Output option execution test 6 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION6 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPES_OPTIONS, 2);

    /** Output option execution test 7 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION7 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 8 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION8 = null;

    /** Output option execution test 9 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION9 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET3, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 10 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION10 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET4, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 11 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION11 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET2, 1);

    /** Output option execution test 12 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION12 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET4, 1);

    /** Output option execution test 13 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION13 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET5, 1);

    /** Output option execution test 14 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION14 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET6, 1);

    /** Output option execution test 15 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION15 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET7, 1);

    /** Output option execution test 16 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION16 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET8, 1);

    /** Output option execution test 17 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION17 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET9, 1);

    /** Output option execution test 18 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION18 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET10, 1);

    /** Output option execution test 19 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION19 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET11, 1);

    /** Output option execution test 20 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION20 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET5, DISPLAY_TYPES_OPTIONS, 1);

    /** Output option execution test 21 instance. */
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION21 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET6, DISPLAY_TYPES_OPTIONS, 1);

    /**
     * This method is called before each test to reset the create a test file.
     *
     * @since 1.0.0
     */
    @Before
    public void initializeFiles() {
        writeIntoFile("Test", TEST_FILE2);
    }

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.0.0
     */
    @After
    public void removeFile() {
        TEST_FILE1.delete();
        TEST_FILE2.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteJavaInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION1.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecuteJavaOutputFileAlreadyExist() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION2.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Annotationinterface ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum1 ..> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Enum6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
                readFileIntoString(TEST_FILE2));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteNonJavaInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION10.execute();
        assertEquals(
                "@startuml\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecuteWithDependenciesCycle() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION20.execute();
        assertEquals(
                "@startuml\r\nannotation net.sourceforge.plantumldependency.main.option.programminglanguage.argument.SelfAnnotationTest\r\nannotation net.sourceforge.plantumldependency.main.option.programminglanguage.argument.WAnnotationTest\r\nnet.sourceforge.plantumldependency.main.option.programminglanguage.argument.SelfAnnotationTest ..> net.sourceforge.plantumldependency.main.option.programminglanguage.argument.SelfAnnotationTest\r\nnet.sourceforge.plantumldependency.main.option.programminglanguage.argument.WAnnotationTest ..> net.sourceforge.plantumldependency.main.option.programminglanguage.argument.SelfAnnotationTest\r\n@enduml",
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
    public void testExecuteWithInputFilesWithExclusion() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION4.execute();
        assertEquals(
                "@startuml\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecuteWithNoInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION9.execute();
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
    public void testExecuteWithNoPackageAndJavaLangAnnotation() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION21.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Override\r\nclass Clock2\r\nclass java.applet.Applet\r\nclass java.awt.Color\r\nclass java.awt.Font\r\nclass java.awt.Graphics\r\nclass java.text.SimpleDateFormat\r\nclass java.util.Date\r\nclass java.util.Locale\r\ninterface java.lang.Runnable\r\nClock2 ..> java.lang.Override\r\nClock2 --|> java.applet.Applet\r\nClock2 ..> java.awt.Color\r\nClock2 ..> java.awt.Font\r\nClock2 ..> java.awt.Graphics\r\nClock2 ..> java.text.SimpleDateFormat\r\nClock2 ..> java.util.Date\r\nClock2 ..> java.util.Locale\r\nClock2 --|> java.lang.Runnable\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
