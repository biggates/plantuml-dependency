/*
 IntegerIntervalOptionArgumentImplTest.java
 Creation date : 20/10/2012
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer;

import static java.lang.Integer.valueOf;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link IntegerOptionArgumentImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class IntegerIntervalOptionArgumentImplTest extends
        ComparableAndDeepCloneableObjectTest < IntegerIntervalOptionArgumentImpl > {

    /** Integer option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < Integer > INTEGER_INTERVAL_OPTION_ARGUMENT1 = new IntegerIntervalOptionArgumentImpl(
            -5, -1, true);

    /** Integer option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < Integer > INTEGER_INTERVAL_OPTION_ARGUMENT2 = new IntegerIntervalOptionArgumentImpl(
            -5, 18, false);

    /** Integer option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Integer > INTEGER_INTERVAL_OPTION_ARGUMENT3 = new IntegerIntervalOptionArgumentImpl(
            0, 18, false);

    /** Integer option argument test 4 instance. */
    @DataPoint
    public static final OptionArgument < Integer > INTEGER_INTERVAL_OPTION_ARGUMENT4 = new IntegerIntervalOptionArgumentImpl(
            0, 0, false);

    /** Integer option argument test 5 instance. */
    @DataPoint
    public static final OptionArgument < Integer > INTEGER_INTERVAL_OPTION_ARGUMENT5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals("INTEGER specifies an integer within an interval, between -5 and -1.",
                INTEGER_INTERVAL_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("INTEGER", INTEGER_INTERVAL_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[INTEGER]", INTEGER_INTERVAL_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadString() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument("hello");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithFloatNumber() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument("2.5");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithNegativeOutsideTheIntervalInteger() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument("-999");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithNegativeWithinTheIntervalInteger() throws CommandLineException {
        final Integer argument = INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument("-2");
        assertEquals(valueOf(-2), argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithPositiveInsideTheIntervalInteger() throws CommandLineException {
        final Integer argument = INTEGER_INTERVAL_OPTION_ARGUMENT2.parseArgument("16");
        assertEquals(valueOf(16), argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithPositiveOutsideTheIntervalInteger() throws CommandLineException {
        INTEGER_INTERVAL_OPTION_ARGUMENT1.parseArgument("1");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer.IntegerOptionArgumentImpl#parseArgument(java.lang.String)}
     * . .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithPositiveUponTheIntervalLimitsInteger() throws CommandLineException {
        final Integer argument = INTEGER_INTERVAL_OPTION_ARGUMENT4.parseArgument("0");
        assertEquals(valueOf(0), argument);
    }
}
