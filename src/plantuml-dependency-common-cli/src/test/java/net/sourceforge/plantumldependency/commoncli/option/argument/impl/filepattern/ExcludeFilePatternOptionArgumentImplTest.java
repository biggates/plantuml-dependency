/*
 ExcludeFilePatternOptionArgumentImplTest.java
 Creation date : 2/07/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern;

import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SLASH_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.writeIntoFile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.apache.tools.ant.types.FileSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ExcludeFilePatternOptionArgumentImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ExcludeFilePatternOptionArgumentImplTest extends
        ComparableAndDeepCloneableObjectTest < ExcludeFilePatternOptionArgumentImpl > {

    /** Exclude file pattern option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < FileSet > FILESET_OPTION_ARGUMENT1 = new ExcludeFilePatternOptionArgumentImpl(
            true);

    /** Exclude file pattern option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < FileSet > FILESET_OPTION_ARGUMENT2 = new ExcludeFilePatternOptionArgumentImpl(
            false);

    /** Exclude file pattern option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < FileSet > FILESET_OPTION_ARGUMENT3 = new ExcludeFilePatternOptionArgumentImpl(
            true);

    /** Exclude file pattern option argument test 4 instance. */
    @DataPoint
    public static final OptionArgument < FileSet > FILESET_OPTION_ARGUMENT4 = new ExcludeFilePatternOptionArgumentImpl(
            true, new StringBuilder());

    /** Exclude file pattern option argument test 5 instance. */
    @DataPoint
    public static final OptionArgument < FileSet > FILESET_OPTION_ARGUMENT5 = null;

    /** Test file instance. */
    private static final File TEST_FILE = new File(DOT_CHAR + SLASH_CHAR + "log.txt");

    /**
     * This method is called before each test to reset the create a test file.
     *
     * @since 1.3.0
     */
    @Before
    public void initializeFiles() {
        writeIntoFile("Test", TEST_FILE);
    }

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
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "FILE_PATTERN specifies a file pattern, with the same syntax as ANT patterns. It means that \"**\", \"*\" or \"?\" special characters can be used. For more information, please consult http://ant.apache.org/manual/dirtasks.html.",
                FILESET_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("FILE_PATTERN", FILESET_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[FILE_PATTERN]", FILESET_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern.ExcludeFilePatternOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        FILESET_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern.ExcludeFilePatternOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        FILESET_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern.ExcludeFilePatternOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithGoodPattern() throws CommandLineException {
        FILESET_OPTION_ARGUMENT1.parseArgument("**/*.java");
        assertTrue(true);
    }
}
