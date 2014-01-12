/*
 CommandLineImplTest.java
 Creation date : 1/07/2010
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

package net.sourceforge.plantumldependency.commoncli.command.impl;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOptionTest.OUTPUT_OPTION1;
import static net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOptionTest.OUTPUT_OPTION2;
import static net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOptionTest.OUTPUT_OPTION3;
import static net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOptionTest.VERBOSE_OPTION1;
import static net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOptionTest.VERBOSE_OPTION5;
import static net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOptionTest.VERBOSE_OPTION6;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link CommandLineImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class CommandLineImplTest extends ComparableAndDeepCloneableObjectTest < CommandLineImpl > {

    /** Command line test 1 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE1 = new CommandLineImpl(new String[] {"-about", "-h", "-version", "-v"});

    /** Command line test 2 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE2 = new CommandLineImpl(new String[] {"-i", "**/*Test*.java", "-d",
            "packages,interfaces", "--help"});

    /** Command line test 3 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE3 = new CommandLineImpl(new String[] {"-i", "**/*Test*.java", "-d",
            "packages,interfaces", "--help", "-h", "-o", "./log.txt"});

    /** Command line test 4 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE4 = new CommandLineImpl(new String[] {"-v", "-i", "**/*Test*.java",
            "-d", "packages,interfaces", "--help", "-v"});

    /** Command line test 5 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE5 = new CommandLineImpl(new String[] {"-o", "./log.txt", "--output",
            "-v"});

    /** Command line test 6 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE6 = new CommandLineImpl(new String[] {"--verbose", "-o"});

    /** Command line test 7 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE7 = new CommandLineImpl(new String[] {});

    /** Command line test 8 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE8 = new CommandLineImpl(new String[] {"-about", "-h", "-version", "-v"});

    /** Command line test 9 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE9 = new CommandLineImpl(new String[] {"-about", "-version", "--author"});

    /** Command line test 10 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE10 = new CommandLineImpl(new String[] {"-version", "-version"});

    /** Command line test 11 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE11 = new CommandLineImpl(new String[] {"-about", "-h", "-o", "/", "-v",
            "-version"});

    /** Command line test 12 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE12 = new CommandLineImpl(new String[] {"-about", "-h", "-o", "/", "-v",
            "FINE", "-version"});

    /** Command line test 14 instance. */
    @DataPoint
    public static final CommandLine COMMAND_LINE14 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindOptionArgumentWithExistingOption() throws CommandLineException {
        final String argument = COMMAND_LINE3.findOptionArgument(OUTPUT_OPTION1);
        assertEquals("./log.txt", argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindOptionArgumentWithExistingOptionWithNotExistingMandatoryArgument() throws CommandLineException {
        COMMAND_LINE6.findOptionArgument(OUTPUT_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindOptionArgumentWithExistingOptionWithNotExistingNotMandatoryArgument()
            throws CommandLineException {
        final String argument = COMMAND_LINE6.findOptionArgument(OUTPUT_OPTION3);
        assertEquals(BLANK_STRING, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindOptionArgumentWithNotExistingMandatoryOption() throws CommandLineException {
        COMMAND_LINE2.findOptionArgument(OUTPUT_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindOptionArgumentWithNotExistingNotMandatoryOption() throws CommandLineException {
        final String argument = COMMAND_LINE4.findOptionArgument(OUTPUT_OPTION2);
        assertNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#findOptionArgument(net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindOptionArgumentWithTwoExistingOption() throws CommandLineException {
        COMMAND_LINE5.findOptionArgument(OUTPUT_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#getCommandLineArguments()}
     * .
     */
    @Test
    public void testGetCommandLineArguments() {
        final List < String > arguments = COMMAND_LINE1.getCommandLineArguments();
        assertEquals(4, arguments.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#getCommandLineArgumentsAsString()}
     * .
     */
    @Test
    public void testGetCommandLineArgumentsAsString() {
        final StringBuilder arguments = COMMAND_LINE1.getCommandLineArgumentsAsString();
        assertEquals("-about -h -version -v", arguments.toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionActiveAndSpecifiedWithExistingHiddenOption() throws CommandLineException {
        final boolean isOptionActiveAndSpecified = COMMAND_LINE1.isOptionActiveAndSpecified(VERBOSE_OPTION6);
        assertTrue(isOptionActiveAndSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionActiveAndSpecifiedWithExistingInactiveOption() throws CommandLineException {
        final boolean isOptionActiveAndSpecified = COMMAND_LINE1.isOptionActiveAndSpecified(VERBOSE_OPTION5);
        assertFalse(isOptionActiveAndSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionActiveAndSpecifiedWithExistingOption() throws CommandLineException {
        final boolean isOptionActiveAndSpecified = COMMAND_LINE1.isOptionActiveAndSpecified(VERBOSE_OPTION1);
        assertTrue(isOptionActiveAndSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsOptionActiveAndSpecifiedWithNotExistingMandatoryOption() throws CommandLineException {
        COMMAND_LINE2.isOptionActiveAndSpecified(OUTPUT_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionActiveAndSpecifiedWithNotExistingNotMandatoryOption() throws CommandLineException {
        final boolean isOptionSpecified = COMMAND_LINE2.isOptionActiveAndSpecified(VERBOSE_OPTION1);
        assertFalse(isOptionSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsOptionActiveAndSpecifiedWithTwoExistingOption() throws CommandLineException {
        COMMAND_LINE4.isOptionActiveAndSpecified(VERBOSE_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionSpecifiedWithExistingOption() throws CommandLineException {
        final boolean isOptionSpecified = COMMAND_LINE1.isOptionSpecified(VERBOSE_OPTION1);
        assertTrue(isOptionSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsOptionSpecifiedWithNotExistingMandatoryOption() throws CommandLineException {
        COMMAND_LINE2.isOptionSpecified(OUTPUT_OPTION1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsOptionSpecifiedWithNotExistingNotMandatoryOption() throws CommandLineException {
        final boolean isOptionSpecified = COMMAND_LINE2.isOptionSpecified(VERBOSE_OPTION1);
        assertFalse(isOptionSpecified);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl#isOptionActiveAndSpecified(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsOptionSpecifiedWithTwoExistingOption() throws CommandLineException {
        COMMAND_LINE4.isOptionSpecified(VERBOSE_OPTION1);
    }
}
