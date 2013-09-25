/*
 PlantUMLDependencyOutputOptionExecutionTest0.java
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

import static java.util.logging.Level.OFF;
import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SETS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.components.utils.log.LogUtils;

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
public class PlantUMLDependencyOutputOptionExecutionTest0 {

    /** Test file 1 instance. */
    private static final File TEST_FILE1 = new File("plantuml.txt");

    /**
     * A main method to generate the test code for all display sets.
     *
     * @param args
     * @throws CommandLineException
     * @since 1.2.0
     */
    public static void main(final String args[]) throws CommandLineException {
        LogUtils.setLevelOfAllLoggersAndHandlers(OFF);
        writeUnitTest(0, 1, "PlantUMLDependencyOutputOptionExecutionTest0.txt");
        writeUnitTest(1, 11, "PlantUMLDependencyOutputOptionExecutionTest1.txt");
        writeUnitTest(11, 56, "PlantUMLDependencyOutputOptionExecutionTest2.txt");
        writeUnitTest(56, 176, "PlantUMLDependencyOutputOptionExecutionTest3.txt");
        writeUnitTest(176, 386, "PlantUMLDependencyOutputOptionExecutionTest4.txt");
        writeUnitTest(386, 639, "PlantUMLDependencyOutputOptionExecutionTest5.txt");
        writeUnitTest(639, 848, "PlantUMLDependencyOutputOptionExecutionTest6.txt");
        writeUnitTest(848, 968, "PlantUMLDependencyOutputOptionExecutionTest7.txt");
        writeUnitTest(968, 1013, "PlantUMLDependencyOutputOptionExecutionTest8.txt");
        writeUnitTest(1013, 1023, "PlantUMLDependencyOutputOptionExecutionTest9.txt");
        writeUnitTest(1023, 1024, "PlantUMLDependencyOutputOptionExecutionTest10.txt");
    }

    public static void writeUnitTest(int startIndex, int endIndex, String filePath) throws CommandLineException {
        final StringBuilder buffer = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++) {
            buffer.append("import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET");
            buffer.append(i + 1);
            buffer.append(";\n\n");
        }

        for (int i = startIndex; i < endIndex; i++) {
            final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                    TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SETS.get(i), 1);
            outputOptionExecution.execute();
            String plantumlDescriptionStr = readFileIntoString(TEST_FILE1);
            plantumlDescriptionStr = plantumlDescriptionStr.replaceAll("\\r", "\\\\r");
            plantumlDescriptionStr = plantumlDescriptionStr.replaceAll("\\n", "\\\\n");
            buffer.append("/**\n");
            buffer.append("* Test method for\n");
            buffer.append("* {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}\n");
            buffer.append("* .\n");
            buffer.append("*\n");
            buffer.append("* @throws CommandLineException\n");
            buffer.append("*/\n");
            buffer.append("@Test\n");
            buffer.append("public void testExecute");
            buffer.append(i + 1);
            buffer.append("() throws CommandLineException {\n");
            buffer.append("final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET");
            buffer.append(i + 1);
            buffer.append(", 1);\n");
            buffer.append("outputOptionExecution.execute();\n");
            buffer.append("assertEquals(\"");
            buffer.append(plantumlDescriptionStr);
            buffer.append("\", readFileIntoString(TEST_FILE1));\n");
            buffer.append("}");
        }

        writeIntoFile(buffer.toString(), filePath);
    }

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
    public void testExecute1() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_SET1, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }
}
