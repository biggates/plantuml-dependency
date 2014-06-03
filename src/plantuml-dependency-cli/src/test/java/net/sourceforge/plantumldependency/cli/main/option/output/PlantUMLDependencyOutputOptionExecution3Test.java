/*
 PlantUMLDependencyOutputOptionExecution3Test.java
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
public class PlantUMLDependencyOutputOptionExecution3Test {

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
    public void testExecute100() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET100, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute101() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET101, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute102() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET102, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute103() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET103, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute104() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET104, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute105() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET105, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute106() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET106, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute107() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET107, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute108() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET108, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute109() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET109, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute110() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET110, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute111() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET111, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute112() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET112, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute113() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET113, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute114() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET114, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute115() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET115, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute116() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET116, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute117() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET117, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute118() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET118, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute119() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET119, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute120() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET120, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute121() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET121, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute122() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET122, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
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
    public void testExecute123() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET123, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute124() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET124, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute125() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET125, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute126() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET126, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute127() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET127, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\n@enduml",
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
    public void testExecute128() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET128, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute129() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET129, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 --|> net.sourceforge.plantumldependency.main.option.output.Class1\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 --|> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.Interface2\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.TeaaTest --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 --|> java.lang.Readable\r\n@enduml",
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
    public void testExecute130() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET130, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute131() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET131, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute132() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET132, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute133() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET133, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 --|> net.sourceforge.plantumldependency.main.option.output.Readable\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.Interface1\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 --|> net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\n@enduml",
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
    public void testExecute134() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET134, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute135() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET135, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute136() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET136, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.GenericDependency\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> net.sourceforge.plantumldependency.generic.type.DependencyType\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.TreeSet\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Iterator\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Set\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.TreeSet\r\n@enduml",
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
    public void testExecute137() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET137, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute138() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET138, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute139() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET139, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> javax.native.NativeCall\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> javax.native.NativeCall\r\n@enduml",
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
    public void testExecute140() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET140, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Interface6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Level\r\nnet.sourceforge.plantumldependency.main.option.output.Readable ..> java.util.logging.Logger\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Interface4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
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
    public void testExecute141() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET141, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute142() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET142, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute143() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET143, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute144() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET144, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute145() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET145, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute146() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET146, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute147() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET147, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute148() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET148, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute149() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET149, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute150() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET150, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute151() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET151, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute152() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET152, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute153() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET153, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute154() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET154, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute155() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET155, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute156() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET156, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute157() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET157, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute158() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET158, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute159() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET159, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute160() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET160, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute161() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET161, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute162() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET162, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute163() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET163, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute164() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET164, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute165() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET165, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute166() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET166, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute167() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET167, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute168() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET168, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute169() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET169, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute170() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET170, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute171() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET171, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute172() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET172, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute173() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET173, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute174() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET174, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute175() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET175, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute176() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET176, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute57() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET57, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute58() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET58, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute59() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET59, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute60() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET60, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute61() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET61, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute62() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET62, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute63() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET63, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute64() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET64, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute65() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET65, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute66() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET66, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute67() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET67, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute68() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET68, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute69() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET69, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Deprecated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.Override\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.SuppressWarnings\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.annotation.Generated\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.bind.annotation.XmlType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> javax.xml.ws.soap.Addressing\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
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
    public void testExecute70() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET70, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute71() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET71, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute72() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET72, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute73() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET73, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute74() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET74, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute75() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET75, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute76() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET76, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute77() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET77, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute78() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET78, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute79() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET79, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute80() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET80, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute81() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET81, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute82() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET82, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute83() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET83, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute84() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET84, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute85() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET85, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute86() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET86, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute87() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET87, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute88() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET88, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute89() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET89, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute90() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET90, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute91() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET91, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute92() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET92, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute93() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET93, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute94() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET94, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute95() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET95, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\n@enduml",
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
    public void testExecute96() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET96, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute97() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET97, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
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
    public void testExecute98() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET98, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
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
    public void testExecute99() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET99, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass1 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.AbstractClass6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.AbstractClass4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.lang.annotation.ElementType\r\nnet.sourceforge.plantumldependency.main.option.output.Class1 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class2 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class5 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class6 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class7 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.Class8 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class3 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> java.util.Arrays\r\nnet.sourceforge.plantumldependency.main.option.output.test.Class4 ..> net.sourceforge.mazix.components.constants.CharacterConstants\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
