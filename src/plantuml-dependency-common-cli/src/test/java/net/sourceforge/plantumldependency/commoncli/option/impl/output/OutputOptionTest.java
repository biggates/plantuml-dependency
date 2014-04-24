/*
 OutputOptionTest.java
 Creation date : 6/07/2010
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

package net.sourceforge.plantumldependency.commoncli.option.impl.output;

import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.EQUAL_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonFileConstants.TXT_EXTENSION;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE2;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE4;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE5;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE6;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.INACTIVE_OPTIONAL_OPTION_STATUS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.file.ExistingOrNotFileOptionArgumentImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link OutputOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class OutputOptionTest extends ComparableAndDeepCloneableObjectTest < OutputOption > {

    /** Output option test 1 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION1 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Output option test 2 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION2 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), SPACE_CHAR,
            ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Output option test 3 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION3 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(false), new StringBuilder("To output file path"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Output option test 4 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION4 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder(
                    "To output file path where to generate the file"), SPACE_CHAR, ACTIVE_MANDATORY_OPTION_STATUS);

    /** Output option test 5 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION5 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), EQUAL_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Output option test 6 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION6 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), SPACE_CHAR,
            ACTIVE_MANDATORY_OPTION_STATUS);

    /** Output option test 7 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION7 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), SPACE_CHAR,
            INACTIVE_OPTIONAL_OPTION_STATUS);

    /** Output option test 8 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION8 = new OutputOption(
            new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder("To output file path"), SPACE_CHAR,
            HIDDEN_OPTIONAL_OPTION_STATUS);

    /** Output option test 9 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < File > OUTPUT_OPTION9 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = OUTPUT_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals("./log.txt", argument);
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
        OUTPUT_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE6);
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
        final String argument = OUTPUT_OPTION3.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE6);
        assertTrue(argument.contains(TXT_EXTENSION));
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
        OUTPUT_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE2);
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
        final String argument = OUTPUT_OPTION2.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE4);
        assertTrue(argument.contains(TXT_EXTENSION));
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
        OUTPUT_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE5);
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
        final File argument = OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals("log.txt", argument.getName());
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
        OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
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
        final File argument = OUTPUT_OPTION3.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
        assertTrue(argument.getName().contains(TXT_EXTENSION));
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
        OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE2);
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
        final File argument = OUTPUT_OPTION2.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE4);
        assertTrue(argument.getName().contains(TXT_EXTENSION));
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
        OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE5);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption#getDefaultArgumentAsStringIfOptionNotSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionNotSpecified() throws CommandLineException {
        final String defaultArgument = OUTPUT_OPTION1.getDefaultArgumentAsStringIfOptionNotSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.contains(TXT_EXTENSION));
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
        final String defaultArgument = OUTPUT_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.contains(TXT_EXTENSION));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getDefaultArgumentIfOptionNotSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentIfOptionNotSpecified() throws CommandLineException {
        final File defaultArgument = OUTPUT_OPTION1.getDefaultArgumentIfOptionNotSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.getName().contains(TXT_EXTENSION));
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
        final File defaultArgument = OUTPUT_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.getName().contains(TXT_EXTENSION));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-o, --output FILE\n\t\tTo output file path\n\t\tFILE specifies a valid file path, where the file can exist or not and is not a directory. It can be absolute or relative. If the file already exists, it overrides it.",
                OUTPUT_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()} .
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-o FILE", OUTPUT_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, OUTPUT_OPTION1.getValueSeparator());
    }
}
