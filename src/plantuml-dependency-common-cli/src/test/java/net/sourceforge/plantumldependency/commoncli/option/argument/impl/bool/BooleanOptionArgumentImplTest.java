/*
 BooleanOptionArgumentImplTest.java
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.utils.bool.YesNoBoolean.NO;
import static net.sourceforge.plantumldependency.common.utils.bool.YesNoBoolean.YES;
import static org.junit.Assert.assertEquals;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.common.utils.bool.YesNoBoolean;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link BooleanOptionArgumentImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class BooleanOptionArgumentImplTest extends ComparableAndDeepCloneableObjectTest < BooleanOptionArgumentImpl > {

    /** Boolean option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < YesNoBoolean > BOOLEAN_OPTION_ARGUMENT1 = new BooleanOptionArgumentImpl(true);

    /** Boolean option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < YesNoBoolean > BOOLEAN_OPTION_ARGUMENT2 = new BooleanOptionArgumentImpl(false);

    /** Boolean option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < YesNoBoolean > BOOLEAN_OPTION_ARGUMENT3 = new BooleanOptionArgumentImpl(true);

    /** Boolean option argument test 4 instance. */
    @DataPoint
    public static final OptionArgument < YesNoBoolean > BOOLEAN_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals("yes|no specifies a valid file path, not a directory. It can be absolute or relative.",
                BOOLEAN_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("yes|no", BOOLEAN_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[yes|no]", BOOLEAN_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentNoLowerCase() throws CommandLineException {
        final YesNoBoolean argument = BOOLEAN_OPTION_ARGUMENT1.parseArgument("no");
        assertEquals(NO, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentNoUpperCase() throws CommandLineException {
        final YesNoBoolean argument = BOOLEAN_OPTION_ARGUMENT1.parseArgument("NO");
        assertEquals(NO, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        BOOLEAN_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadString() throws CommandLineException {
        BOOLEAN_OPTION_ARGUMENT1.parseArgument("hello");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        BOOLEAN_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentYesLowerCase() throws CommandLineException {
        final YesNoBoolean argument = BOOLEAN_OPTION_ARGUMENT1.parseArgument("yes");
        assertEquals(YES, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.bool.BooleanOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentYesUpperCase() throws CommandLineException {
        final YesNoBoolean argument = BOOLEAN_OPTION_ARGUMENT1.parseArgument("YES");
        assertEquals(YES, argument);
    }
}
