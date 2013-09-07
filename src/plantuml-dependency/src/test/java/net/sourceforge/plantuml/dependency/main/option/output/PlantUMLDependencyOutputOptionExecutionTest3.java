/*
 PlantUMLDependencyOutputOptionExecutionTest3.java
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
public class PlantUMLDependencyOutputOptionExecutionTest3 {

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
    public void testExecute100() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET100, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute101() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET101, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute102() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET102, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute103() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET103, 1);
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
    public void testExecute104() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET104, 1);
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
    public void testExecute105() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET105, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute106() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET106, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute107() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET107, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute108() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET108, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute109() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET109, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute110() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET110, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute111() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET111, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute112() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET112, 1);
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
    public void testExecute113() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET113, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute114() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET114, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute115() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET115, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute116() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET116, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute117() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET117, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute118() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET118, 1);
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
    public void testExecute119() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET119, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute120() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET120, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute121() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET121, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute122() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET122, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute123() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET123, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute124() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET124, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute125() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET125, 1);
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
    public void testExecute126() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET126, 1);
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
    public void testExecute127() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET127, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute128() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET128, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute129() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET129, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute130() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET130, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute131() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET131, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute132() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET132, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute133() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET133, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute134() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET134, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute135() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET135, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute136() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET136, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute137() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET137, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute138() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET138, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute139() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET139, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute140() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET140, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute141() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET141, 1);
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
    public void testExecute142() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET142, 1);
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
    public void testExecute143() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET143, 1);
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
    public void testExecute144() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET144, 1);
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
    public void testExecute145() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET145, 1);
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
    public void testExecute146() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET146, 1);
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
    public void testExecute147() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET147, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute148() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET148, 1);
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
    public void testExecute149() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET149, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute150() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET150, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute151() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET151, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute152() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET152, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute153() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET153, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute154() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET154, 1);
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
    public void testExecute155() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET155, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute156() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET156, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute157() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET157, 1);
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
    public void testExecute158() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET158, 1);
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
    public void testExecute159() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET159, 1);
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
    public void testExecute160() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET160, 1);
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
    public void testExecute161() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET161, 1);
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
    public void testExecute162() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET162, 1);
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
    public void testExecute163() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET163, 1);
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
    public void testExecute164() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET164, 1);
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
    public void testExecute165() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET165, 1);
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
    public void testExecute166() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET166, 1);
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
    public void testExecute167() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET167, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute168() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET168, 1);
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
    public void testExecute169() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET169, 1);
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
    public void testExecute170() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET170, 1);
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
    public void testExecute171() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET171, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.TeaaTest --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute172() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET172, 1);
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
    public void testExecute173() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET173, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute174() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET174, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute175() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET175, 1);
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
    public void testExecute176() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET176, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute57() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET57, 1);
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
    public void testExecute58() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET58, 1);
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
    public void testExecute59() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET59, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute60() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET60, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\n@enduml",
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
    public void testExecute61() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET61, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\n@enduml",
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
    public void testExecute62() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET62, 1);
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
    public void testExecute63() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET63, 1);
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
    public void testExecute64() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET64, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute65() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET65, 1);
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
    public void testExecute66() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET66, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 --|> net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\n@enduml",
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
    public void testExecute67() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET67, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute68() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET68, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute69() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET69, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute70() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET70, 1);
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
    public void testExecute71() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET71, 1);
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
    public void testExecute72() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET72, 1);
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
    public void testExecute73() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET73, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute74() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET74, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute75() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET75, 1);
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
    public void testExecute76() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET76, 1);
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
    public void testExecute77() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET77, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum1\r\nenum net.sourceforge.plantuml.dependency.main.option.output.Enum6\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Enum6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute78() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET78, 1);
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
    public void testExecute79() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET79, 1);
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
    public void testExecute80() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET80, 1);
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
    public void testExecute81() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET81, 1);
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
    public void testExecute82() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET82, 1);
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
    public void testExecute83() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET83, 1);
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
    public void testExecute84() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET84, 1);
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
    public void testExecute85() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET85, 1);
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
    public void testExecute86() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET86, 1);
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
    public void testExecute87() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET87, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute88() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET88, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nnet.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation ..> java.lang.annotation.ElementType\r\n@enduml",
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
    public void testExecute89() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET89, 1);
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
    public void testExecute90() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET90, 1);
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
    public void testExecute91() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET91, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantuml.dependency.main.option.output.Testabstract\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantuml.dependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute92() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET92, 1);
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
    public void testExecute93() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET93, 1);
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
    public void testExecute94() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET94, 1);
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
    public void testExecute95() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET95, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 --|> net.sourceforge.plantuml.dependency.main.option.output.Readable\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 --|> net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute96() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET96, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute97() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET97, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.Readable\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantuml.dependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute98() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET98, 1);
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
    public void testExecute99() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET99, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantuml.dependency.generic.GenericDependency\r\nclass net.sourceforge.plantuml.dependency.generic.type.DependencyType\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class1\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class2\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class5\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class6\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class7\r\nclass net.sourceforge.plantuml.dependency.main.option.output.Class8\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantuml.dependency.main.option.output.test.Class4\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantuml.dependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
