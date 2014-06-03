/*
 PlantUMLDependencyDisplayPackageNameOptionArgumentTest.java
 Creation date : 02/06/2014
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

package net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayPackageNameOptionArgument}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.4.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayPackageNameOptionArgumentTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLDependencyDisplayPackageNameOptionArgument > {

    /** Display name option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < Pattern > DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1 = new PlantUMLDependencyDisplayPackageNameOptionArgument();

    /** Display name option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < Pattern > DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT2 = new PlantUMLDependencyDisplayPackageNameOptionArgument();

    /** Display name option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Pattern > DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "DISPLAY_PACKAGE_NAME_PATTERN specifies display package name pattern when generating the plantUML output file, it is a regular expression following the Java pattern (see http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html for description).",
                DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("DISPLAY_PACKAGE_NAME_PATTERN", DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadPattern() throws CommandLineException {
        DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.parseArgument("*.");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentWithGoodPattern() throws CommandLineException {
        final Pattern argument = DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.parseArgument(".*");
        assertEquals(".*", argument.pattern());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        DISPLAY_PACKAGE_NAME_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }
}
