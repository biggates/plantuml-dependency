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

package net.sourceforge.plantuml.dependency.main.option.output;

import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.DISPLAY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.DISPLAY_SET3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.FILE_SET2;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertTrue;

import java.io.File;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
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
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET3, 1);

    /** Output option execution test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION2 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE2, JAVA, FILE_SET1, DISPLAY_SET3, 1);

    /** Output option execution test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION3 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, CPP, FILE_SET2, DISPLAY_SET3, 1);

    /** Output option execution test 4 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION4 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET3, 1);

    /** Output option execution test 5 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION5 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET2, 1);

    /** Output option execution test 6 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION6 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET3, 2);

    /** Output option execution test 7 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION7 = new PlantUMLDependencyOutputOptionExecution(
            TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET3, 1);

    /** Output option execution test 8 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOptionExecution OUTPUT_OPTION_EXECUTION8 = null;

    /**
     * This method is called before each test to reset the create a test file.
     *
     * @since 1.0
     */
    @Before
    public void initializeFiles() {
        writeIntoFile("Test", TEST_FILE2);
    }

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.0
     */
    @After
    public void removeFile() {
        TEST_FILE1.delete();
        TEST_FILE2.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteDifferentInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION1.execute();
        // TODO test the plantuml file
        assertTrue(true);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteJavaInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION1.execute();
        // TODO test the plantuml file
        assertTrue(true);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteJavaOutputFileAlreadyExist() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION2.execute();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteWithInputFilesWithExclusion() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION1.execute();
        // TODO test the plantuml file
        assertTrue(true);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecuteWithNoInputFiles() throws CommandLineException {
        OUTPUT_OPTION_EXECUTION1.execute();
        // TODO test the plantuml file
        assertTrue(true);
    }
}
