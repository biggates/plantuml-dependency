/*
 PlantUMLDependencyExcludeOptionTest.java
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

package net.sourceforge.plantumldependency.cli.main.option.exclude;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_EXCLUDE_OPTIONS;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE10;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE12;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE8;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sourceforge.plantumldependency.cli.main.option.display.PlantUMLDependencyDisplayOption;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.apache.tools.ant.types.FileSet;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyExcludeOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyExcludeOption > {

    /** Exclude option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyExcludeOption EXCLUDE_OPTION1 = new PlantUMLDependencyExcludeOption();

    /** Exclude option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyExcludeOption EXCLUDE_OPTION2 = new PlantUMLDependencyExcludeOption();

    /** Exclude option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyExcludeOption EXCLUDE_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = EXCLUDE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE12);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE10);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final String argument = EXCLUDE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE8);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final FileSet argument = EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE12);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE10);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final FileSet argument = EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE8);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.exclude.PlantUMLDependencyExcludeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = EXCLUDE_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(DEFAULT_EXCLUDE_OPTIONS, defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getDefaultArgumentIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentIfOptionSpecified() throws CommandLineException {
        final FileSet defaultArgument = EXCLUDE_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertNotNull(defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-e, --exclude FILE_PATTERN\n\t\tTo exclude files that match the provided pattern. If not specified, the default pattern is \"**/package-info.java\".\n\t\tFILE_PATTERN specifies a file pattern, with the same syntax as ANT patterns. It means that \"**\", \"*\" or \"?\" special characters can be used. For more information, please consult http://ant.apache.org/manual/dirtasks.html.",
                EXCLUDE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-e FILE_PATTERN", EXCLUDE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, EXCLUDE_OPTION1.getValueSeparator());
    }
}
