/*
 HelpOptionTest.java
 Creation date : 9/07/2010
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

package net.sourceforge.plantumldependency.commoncli.option.impl.help;

import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE5;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.INACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImplTest.JAVA_PROGRAM1;
import static net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImplTest.JAVA_PROGRAM8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link HelpOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class HelpOptionTest extends ComparableAndDeepCloneableObjectTest < HelpOption > {

    /** Help option test 1 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION1 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 1, ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 2 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION2 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 1, ACTIVE_MANDATORY_OPTION_STATUS);

    /** Help option test 3 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION3 = new HelpOption(new StringBuilder(
            "To display log information while program is executing."), JAVA_PROGRAM1, 1, ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 4 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION4 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM8, 1, ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 5 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION5 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 2, ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 6 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION6 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 1, ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 7 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION7 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 1, INACTIVE_OPTIONAL_OPTION_STATUS);

    /** Help option test 8 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION8 = new HelpOption(new StringBuilder("To display log information."),
            JAVA_PROGRAM1, 1, HIDDEN_OPTIONAL_OPTION_STATUS);

    /** Help option test 9 instance. */
    @DataPoint
    public static final HelpOption HELP_OPTION9 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals("-h, --help, -?\n\t\tTo display log information.", HELP_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-h", HELP_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = NullPointerException.class)
    public void testParseCommandLineNull() throws CommandLineException {
        HELP_OPTION1.parseCommandLine(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithExistingHiddenOption() throws CommandLineException {
        final OptionExecution optionExecution = HELP_OPTION8.parseCommandLine(COMMAND_LINE1);
        assertNotNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithExistingInactiveOption() throws CommandLineException {
        final OptionExecution optionExecution = HELP_OPTION7.parseCommandLine(COMMAND_LINE1);
        assertNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithExistingOption() throws CommandLineException {
        final OptionExecution optionExecution = HELP_OPTION1.parseCommandLine(COMMAND_LINE1);
        assertNotNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseCommandLineWithNotExistingMandatoryOption() throws CommandLineException {
        HELP_OPTION2.parseCommandLine(COMMAND_LINE5);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithNotExistingNotMandatoryOption() throws CommandLineException {
        final OptionExecution optionExecution = HELP_OPTION1.parseCommandLine(COMMAND_LINE5);
        assertNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseCommandLineWithTwoExistingOption() throws CommandLineException {
        HELP_OPTION1.parseCommandLine(COMMAND_LINE3);
    }
}
