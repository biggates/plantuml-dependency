/*
 PlantUMLDependencyProgramTaskTest.java
 Creation date : 3/07/2011
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

package net.sourceforge.plantumldependency.cli.main.ant;

import static java.util.logging.Level.INFO;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS_STRING;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_EXCLUDE_OPTIONS;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_INCLUDE_OPTIONS;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonFileConstants.TXT_EXTENSION;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyProgramTask}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.0
 * @version 1.3.0
 */
public class PlantUMLDependencyProgramTaskTest {

    /** PlantUML Dependency test 1 instance. */
    public static final PlantUMLDependencyProgramTask PLANTUML_DEPENDENCY_TASK1 = new PlantUMLDependencyProgramTask();

    /** PlantUML Dependency test 1 instance. */
    public static final PlantUMLDependencyProgramTask PLANTUML_DEPENDENCY_TASK2 = createPlantUMLDependencyTask1();

    /**
     * Creates a {@link PlantUMLDependencyProgramTask} test instance.
     *
     * @return a {@link PlantUMLDependencyProgramTask} test instance.
     * @since 1.1.0
     */
    private static PlantUMLDependencyProgramTask createPlantUMLDependencyTask1() {
        final PlantUMLDependencyProgramTask task = new PlantUMLDependencyProgramTask();
        task.setBaseDir(DOT_CHAR);
        task.setDisplay(DEFAULT_DISPLAY_OPTIONS_STRING);
        task.setExcludes(DEFAULT_EXCLUDE_OPTIONS);
        task.setIncludes(DEFAULT_INCLUDE_OPTIONS + DEFAULT_PROGRAMMING_LANGUAGE.getName());
        task.setOutput("plantuml" + TXT_EXTENSION);
        task.setProgrammingLanguage(DEFAULT_PROGRAMMING_LANGUAGE.getName());
        task.setVerboseLevel(INFO.getName());
        return task;
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#execute()}
     * .
     */
    @Test
    public void testExecute() {
        // TODO finish with all options and compare generated files such as the Program
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getBaseDir()}
     * .
     */
    @Test
    public void testGetBaseDir() {
        assertEquals(DOT_CHAR, PLANTUML_DEPENDENCY_TASK2.getBaseDir());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getDisplay()}
     * .
     */
    @Test
    public void testGetDisplay() {
        assertEquals(DEFAULT_DISPLAY_OPTIONS_STRING, PLANTUML_DEPENDENCY_TASK2.getDisplay());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getExcludes()}
     * .
     */
    @Test
    public void testGetExcludes() {
        assertEquals(DEFAULT_EXCLUDE_OPTIONS, PLANTUML_DEPENDENCY_TASK2.getExcludes());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getIncludes()}
     * .
     */
    @Test
    public void testGetIncludes() {
        assertEquals(DEFAULT_INCLUDE_OPTIONS + DEFAULT_PROGRAMMING_LANGUAGE.getName(),
                PLANTUML_DEPENDENCY_TASK2.getIncludes());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getOutput()}
     * .
     */
    @Test
    public void testGetOutput() {
        assertEquals("plantuml" + TXT_EXTENSION, PLANTUML_DEPENDENCY_TASK2.getOutput());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getProgrammingLanguage()}
     * .
     */
    @Test
    public void testGetProgrammingLanguage() {
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE.getName(), PLANTUML_DEPENDENCY_TASK2.getProgrammingLanguage());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#getVerboseLevel()}
     * .
     */
    @Test
    public void testGetVerboseLevel() {
        assertEquals(INFO.getName(), PLANTUML_DEPENDENCY_TASK2.getVerboseLevel());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setBaseDir(java.lang.String)}
     * .
     */
    @Test
    public void testSetBaseDir() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setBaseDir(DOT_CHAR);
        assertEquals(DOT_CHAR, testTask.getBaseDir());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setDisplay(java.lang.String)}
     * .
     */
    @Test
    public void testSetDisplay() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setDisplay(DEFAULT_DISPLAY_OPTIONS_STRING);
        assertEquals(DEFAULT_DISPLAY_OPTIONS_STRING, testTask.getDisplay());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setExcludes(java.lang.String)}
     * .
     */
    @Test
    public void testSetExcludes() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setExcludes(DEFAULT_EXCLUDE_OPTIONS);
        assertEquals(DEFAULT_EXCLUDE_OPTIONS, testTask.getExcludes());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setIncludes(java.lang.String)}
     * .
     */
    @Test
    public void testSetIncludes() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setIncludes(DEFAULT_INCLUDE_OPTIONS + DEFAULT_PROGRAMMING_LANGUAGE.getName());
        assertEquals(DEFAULT_INCLUDE_OPTIONS + DEFAULT_PROGRAMMING_LANGUAGE.getName(), testTask.getIncludes());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setOutput(java.lang.String)}
     * .
     */
    @Test
    public void testSetOutput() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setOutput("plantuml" + TXT_EXTENSION);
        assertEquals("plantuml" + TXT_EXTENSION, testTask.getOutput());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setProgrammingLanguage(java.lang.String)}
     * .
     */
    @Test
    public void testSetProgrammingLanguage() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setProgrammingLanguage(DEFAULT_PROGRAMMING_LANGUAGE.getName());
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE.getName(), testTask.getProgrammingLanguage());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#setVerboseLevel(java.lang.String)}
     * .
     */
    @Test
    public void testSetVerboseLevel() {
        final PlantUMLDependencyProgramTask testTask = new PlantUMLDependencyProgramTask();
        testTask.setVerboseLevel(INFO.getName());
        assertEquals(INFO.getName(), testTask.getVerboseLevel());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.ant.PlantUMLDependencyProgramTask#toString()}
     * .
     */
    @Test
    public void testToString() {
        assertEquals(
                "PlantUMLDependencyProgramTask [output=plantuml.txt, verboseLevel=INFO, programmingLanguage=java, includes=**/*.java, excludes=**/*~, display=abstract_classes,annotations,classes,enums,extensions,implementations,imports,interfaces,native_methods,static_imports, baseDir=.]",
                PLANTUML_DEPENDENCY_TASK2.toString());
    }
}
