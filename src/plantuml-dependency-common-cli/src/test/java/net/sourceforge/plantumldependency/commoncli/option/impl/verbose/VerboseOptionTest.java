/*
 VerboseOptionTest.java
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

package net.sourceforge.plantumldependency.commoncli.option.impl.verbose;

import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE2;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE4;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.INACTIVE_OPTIONAL_OPTION_STATUS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link VerboseOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VerboseOptionTest extends ComparableAndDeepCloneableObjectTest < VerboseOption > {

    /** Verbose option test 1 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION1 = new VerboseOption(new StringBuilder(
            "To display log information."), ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 2 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION2 = new VerboseOption(new StringBuilder(
            "To display log information."), ACTIVE_MANDATORY_OPTION_STATUS);

    /** Verbose option test 3 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION3 = new VerboseOption(new StringBuilder(
            "To display log information while program is executing."), ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 4 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION4 = new VerboseOption(new StringBuilder(
            "To display log information."), ACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 5 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION5 = new VerboseOption(new StringBuilder(
            "To display log information."), INACTIVE_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 6 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION6 = new VerboseOption(new StringBuilder(
            "To display log information."), HIDDEN_OPTIONAL_OPTION_STATUS);

    /** Verbose option test 7 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION7 = new VerboseOption();

    /** Verbose option test 8 instance. */
    @DataPoint
    public static final VerboseOption VERBOSE_OPTION8 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals("-v, --verbose\n\t\tTo display log information.", VERBOSE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()} .
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-v", VERBOSE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsVerboseModeActiveWithExistingHiddenOption() throws CommandLineException {
        final boolean isVerboseModeActive = VERBOSE_OPTION6.isVerboseModeActive(COMMAND_LINE1);
        assertTrue(isVerboseModeActive);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsVerboseModeActiveWithExistingInactiveOption() throws CommandLineException {
        final boolean isVerboseModeActive = VERBOSE_OPTION5.isVerboseModeActive(COMMAND_LINE1);
        assertFalse(isVerboseModeActive);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsVerboseModeActiveWithExistingOption() throws CommandLineException {
        final boolean isVerboseModeActive = VERBOSE_OPTION1.isVerboseModeActive(COMMAND_LINE1);
        assertTrue(isVerboseModeActive);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsVerboseModeActiveWithNotExistingMandatoryOption() throws CommandLineException {
        VERBOSE_OPTION2.isVerboseModeActive(COMMAND_LINE2);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testIsVerboseModeActiveWithNotExistingNotMandatoryOption() throws CommandLineException {
        final boolean isVerboseModeActive = VERBOSE_OPTION3.isVerboseModeActive(COMMAND_LINE2);
        assertFalse(isVerboseModeActive);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption#isVerboseModeActive(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testIsVerboseModeActiveWithTwoExistingOption() throws CommandLineException {
        VERBOSE_OPTION1.isVerboseModeActive(COMMAND_LINE4);
    }
}
