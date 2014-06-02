/*
 VerboseLevelOptionTest.java
 Creation date : 1/11/2010
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

package net.sourceforge.plantumldependency.commoncli.option.impl.verbose;

import static java.util.logging.Level.FINE;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.EQUAL_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE12;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE2;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE5;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE6;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.INACTIVE_OPTIONAL_OPTION_STATUS;
import static org.junit.Assert.assertEquals;

import java.util.logging.Level;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.log.LevelOptionArgumentImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link VerboseLevelOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VerboseLevelOptionTest extends ComparableAndDeepCloneableObjectTest < VerboseLevelOption > {

    /** Verbose level option test 1 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION1 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 2 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION2 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), SPACE_CHAR,
            ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose level option test 3 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION3 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(false), new StringBuilder("To log display information"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 4 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION4 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder(
                    "To log display information where to generate the file"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 5 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION5 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), EQUAL_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 6 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION6 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose level option test 7 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION7 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), SPACE_CHAR,
            INACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose level option test 8 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION8 = new VerboseLevelOption(
            new LevelOptionArgumentImpl(true), new StringBuilder("To log display information"), SPACE_CHAR,
            HIDDEN_OPTIONAL_OPTION_STATUS);

    /** Verbose level option test 9 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION9 = new VerboseLevelOption();

    /** Verbose level option test 10 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < Level > VERBOSE_LEVEL_OPTION10 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = VERBOSE_LEVEL_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE12);
        assertEquals(FINE.getName().toString(), argument);
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
        VERBOSE_LEVEL_OPTION2.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE6);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOptionWithNotExistingNotMandatoryArgument()
            throws CommandLineException {
        final String argument = VERBOSE_LEVEL_OPTION3.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE6);
        assertEquals(INFO.getName().toString(), argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithNotExistingMandatoryOption()
            throws CommandLineException {
        VERBOSE_LEVEL_OPTION3.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE2);
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
        final String argument = VERBOSE_LEVEL_OPTION2.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(WARNING.getName().toString(), argument);
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
        VERBOSE_LEVEL_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE5);
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
        final Level argument = VERBOSE_LEVEL_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE12);
        assertEquals(FINE.getName(), argument.getName());
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
        VERBOSE_LEVEL_OPTION2.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOptionWithNotExistingNotMandatoryArgument()
            throws CommandLineException {
        final Level argument = VERBOSE_LEVEL_OPTION3.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
        assertEquals(INFO.getName(), argument.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithNotExistingMandatoryOption()
            throws CommandLineException {
        VERBOSE_LEVEL_OPTION3.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE2);
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
        final Level argument = VERBOSE_LEVEL_OPTION2.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(WARNING.getName(), argument.getName());
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
        VERBOSE_LEVEL_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE5);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionNotSpecified() throws CommandLineException {
        final String defaultArgument = VERBOSE_LEVEL_OPTION1
                .getDefaultArgumentAsStringIfOptionNotSpecified(COMMAND_LINE1);
        assertEquals(WARNING.getName(), defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = VERBOSE_LEVEL_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(INFO.getName(), defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getDefaultArgumentIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentIfOptionNotSpecified() throws CommandLineException {
        final Level defaultArgument = VERBOSE_LEVEL_OPTION1.getDefaultArgumentIfOptionNotSpecified(COMMAND_LINE2);
        assertEquals(WARNING, defaultArgument);
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
        final Level defaultArgument = VERBOSE_LEVEL_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertEquals(INFO, defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-v, --verbose VERBOSE_LEVEL\n\t\tTo log display information\n\t\tVERBOSE_LEVEL specifies the verbose level. The argument may consist of either a level name or an integer value. Classical values are : \"SEVERE\":1000, \"WARNING\":900, \"INFO\":800, \"CONFIG\":700, \"FINE\":500, \"FINER\":400, \"FINEST\":300. By default, if the verbose option is specified but the level is not set, the value \"INFO\":800 is taken. If not specified, the default value is \"WARNING\":900.",
                VERBOSE_LEVEL_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()} .
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-v VERBOSE_LEVEL", VERBOSE_LEVEL_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, VERBOSE_LEVEL_OPTION1.getValueSeparator());
    }
}
