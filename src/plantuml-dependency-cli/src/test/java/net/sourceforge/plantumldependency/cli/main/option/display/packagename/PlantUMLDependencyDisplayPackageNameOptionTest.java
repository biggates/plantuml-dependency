/*
 PlantUMLDependencyDisplayPackageNameOptionTest.java
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

package net.sourceforge.plantumldependency.cli.main.option.display.packagename;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE24;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE25;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE26;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayPackageNameOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.4.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayPackageNameOptionTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLDependencyDisplayPackageNameOption > {

    /** Display package name option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayPackageNameOption DISPLAY_PACKAGE_NAME_OPTION1 = new PlantUMLDependencyDisplayPackageNameOption();

    /** Display package name option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayPackageNameOption DISPLAY_PACKAGE_NAME_OPTION2 = new PlantUMLDependencyDisplayPackageNameOption();

    /** Display package name option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayPackageNameOption DISPLAY_PACKAGE_NAME_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = DISPLAY_PACKAGE_NAME_OPTION1
                .findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE24);
        assertEquals(".*able.*", argument);
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
        DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE25);
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
        final String argument = DISPLAY_PACKAGE_NAME_OPTION1
                .findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, argument);
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
        DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE26);
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
        final Pattern argument = DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE24);
        assertEquals(".*able.*", argument.pattern());
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
        DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE26);
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
        final Pattern argument = DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, argument.pattern());
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
        DISPLAY_PACKAGE_NAME_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE26);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.PlantUMLDependencyDisplayTypeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionNotSpecified() throws CommandLineException {
        final String defaultArgument = DISPLAY_PACKAGE_NAME_OPTION1
                .getDefaultArgumentAsStringIfOptionNotSpecified(COMMAND_LINE1);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.PlantUMLDependencyDisplayTypeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = DISPLAY_PACKAGE_NAME_OPTION1
                .getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE26);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, defaultArgument);
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
        final Pattern defaultArgument = DISPLAY_PACKAGE_NAME_OPTION1
                .getDefaultArgumentIfOptionNotSpecified(COMMAND_LINE1);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, defaultArgument.pattern());
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
        final Pattern defaultArgument = DISPLAY_PACKAGE_NAME_OPTION1
                .getDefaultArgumentIfOptionSpecified(COMMAND_LINE26);
        assertEquals(DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING, defaultArgument.pattern());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-dp, --display-package-name DISPLAY_PACKAGE_NAME_PATTERN\n\t\tTo specify class diagram objects to display following their package name. If not specified, the default is \".*\". Note : native calls which are represented by the \"javax.native\" package name can also be matched by this regular expression even if it is a fictive dependency.\n\t\tDISPLAY_PACKAGE_NAME_PATTERN specifies display package name pattern when generating the plantUML output file, it is a regular expression following the Java pattern (see http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html for description).",
                DISPLAY_PACKAGE_NAME_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-dp DISPLAY_PACKAGE_NAME_PATTERN", DISPLAY_PACKAGE_NAME_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, DISPLAY_PACKAGE_NAME_OPTION1.getValueSeparator());
    }
}
