/*
 PlantUMLDependencyProgramTest.java
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

package net.sourceforge.plantumldependency.cli.main.program;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_TYPES_OPTIONS_STRING;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;
import static net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram.main;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;

import java.io.File;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;

import org.junit.After;
import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyProgram}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyProgramTest {

    /** Test file 1 instance. */
    private static final File TEST_FILE = new File("plantuml.txt");

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.3.0
     */
    @After
    public void removeFile() {
        TEST_FILE.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithABadDisplayTypeOption() throws PlantUMLDependencyException {
        main(new String[] {"-o", TEST_FILE.getName(), "-dt", "test"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithoutExecutionOption() throws PlantUMLDependencyException {
        main(new String[] {"-l", DEFAULT_PROGRAMMING_LANGUAGE.getName(), "-i", "**/*.java"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithPrimaryAboutOption() throws PlantUMLDependencyException {
        main(new String[] {"-about"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithPrimaryBasedirOption() throws PlantUMLDependencyException {
        main(new String[] {"-b", DOT_CHAR});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithPrimaryDisplayTypeOption() throws PlantUMLDependencyException {
        main(new String[] {"-dt", DEFAULT_DISPLAY_TYPES_OPTIONS_STRING});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithPrimaryExcludeOption() throws PlantUMLDependencyException {
        main(new String[] {"-e", "**/package-info.java"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithPrimaryHelpOption() throws PlantUMLDependencyException {
        main(new String[] {"-h"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithPrimaryIncludeOption() throws PlantUMLDependencyException {
        main(new String[] {"-i", "**/*.java"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithPrimaryOuputOption() throws PlantUMLDependencyException {
        main(new String[] {"-o", TEST_FILE.getName()});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithPrimaryVerboseOption() throws PlantUMLDependencyException {
        main(new String[] {"-v"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithPrimaryVersionOption() throws PlantUMLDependencyException {
        main(new String[] {"-version"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithSecondaryAboutOption() throws PlantUMLDependencyException {
        main(new String[] {"--author"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithSecondaryBasedirOption() throws PlantUMLDependencyException {
        main(new String[] {"--basedir", DOT_CHAR});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithSecondaryDisplayTypeOption() throws PlantUMLDependencyException {
        main(new String[] {"--display-type", DEFAULT_DISPLAY_TYPES_OPTIONS_STRING});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithSecondaryExcludeOption() throws PlantUMLDependencyException {
        main(new String[] {"--exclude", "**/package-info.java"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithSecondaryHelpOption() throws PlantUMLDependencyException {
        main(new String[] {"--help"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithSecondaryIncludeOption() throws PlantUMLDependencyException {
        main(new String[] {"--include", "**/package-info.java"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithSecondaryOuputOption() throws PlantUMLDependencyException {
        main(new String[] {"--output", TEST_FILE.getName()});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithSecondaryVerboseOption() throws PlantUMLDependencyException {
        main(new String[] {"--verbose"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithTertiaryAboutOption() throws PlantUMLDependencyException {
        main(new String[] {"--authors"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testMainWithTertiaryHelpOption() throws PlantUMLDependencyException {
        main(new String[] {"-?"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithTwoOuputOption() throws PlantUMLDependencyException {
        main(new String[] {"-o", TEST_FILE.getName(), "-v", "--output", "hello.txt"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testMainWithTwoSameDisplayTypeOption() throws PlantUMLDependencyException {
        main(new String[] {"-o", TEST_FILE.getName(), "-dt", "extensions,static_imports,implementations,extensions"});
    }
}
