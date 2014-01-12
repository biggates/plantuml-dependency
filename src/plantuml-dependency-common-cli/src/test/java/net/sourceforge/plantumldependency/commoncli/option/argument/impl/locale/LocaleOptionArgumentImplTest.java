/*
 LocaleOptionArgumentImplTest.java
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.locale;

import static java.util.Locale.FRENCH;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;

import java.util.Locale;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link LocaleOptionArgumentImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class LocaleOptionArgumentImplTest extends ComparableAndDeepCloneableObjectTest < LocaleOptionArgumentImpl > {

    /** Locale option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < Locale > LOCALE_OPTION_ARGUMENT1 = new LocaleOptionArgumentImpl(true);

    /** Locale option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < Locale > LOCALE_OPTION_ARGUMENT2 = new LocaleOptionArgumentImpl(false);

    /** Locale option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Locale > LOCALE_OPTION_ARGUMENT3 = new LocaleOptionArgumentImpl(true);

    /** Locale option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Locale > LOCALE_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals("LOCALE specifies a locale, with the form \"fr\", \"en\"", LOCALE_OPTION_ARGUMENT1
                .getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("LOCALE", LOCALE_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[LOCALE]", LOCALE_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.locale.LocaleOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        LOCALE_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.locale.LocaleOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        LOCALE_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.impl.locale.LocaleOptionArgumentImpl#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithFrenchLocale() throws CommandLineException {
        final Locale argument = LOCALE_OPTION_ARGUMENT1.parseArgument(FRENCH.getLanguage());
        assertEquals(FRENCH, argument);
    }
}
