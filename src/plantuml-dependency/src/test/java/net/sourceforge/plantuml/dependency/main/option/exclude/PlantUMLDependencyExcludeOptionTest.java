/*
 PlantUMLDependencyExcludeOptionTest.java
 Creation date : 10/07/2010
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

package net.sourceforge.plantuml.dependency.main.option.exclude;

import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE10;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.AbstractOptionWithArgument;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOption;

import org.apache.tools.ant.types.FileSet;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayOption}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyExcludeOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyExcludeOption > {

    /** Exclude option test 1 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < FileSet > EXCLUDE_OPTION1 = new PlantUMLDependencyExcludeOption();

    /** Exclude option test 2 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < FileSet > EXCLUDE_OPTION2 = new PlantUMLDependencyExcludeOption();

    /** Exclude option test 3 instance. */
    @DataPoint
    public static final AbstractOptionWithArgument < FileSet > EXCLUDE_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final FileSet argument = EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE12);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE10);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final FileSet argument = EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertNotNull(argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        EXCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE8);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgument() throws CommandLineException {
        final FileSet defaultArgument = EXCLUDE_OPTION1.getDefaultArgument(COMMAND_LINE1);
        assertNotNull(defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.exclude.PlantUMLDependencyExcludeOption#getDefaultArgumentAsString(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsString() throws CommandLineException {
        final String defaultArgument = EXCLUDE_OPTION1.getDefaultArgumentAsString(COMMAND_LINE1);
        assertEquals("**/*~", defaultArgument);
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-e, --exclude FILE_PATTERN\n\t\tTo exclude files that match the provided pattern. If not specified, no file is excluded.\n\t\tFILE_PATTERN specifies a file pattern, with the same syntax as ANT patterns. It means that \"**\", \"*\" or \"?\" special characters can be used. For more information, please consult http://ant.apache.org/manual/dirtasks.html.",
                EXCLUDE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-e FILE_PATTERN", EXCLUDE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getValueSeparator()}.
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, EXCLUDE_OPTION1.getValueSeparator());
    }
}
