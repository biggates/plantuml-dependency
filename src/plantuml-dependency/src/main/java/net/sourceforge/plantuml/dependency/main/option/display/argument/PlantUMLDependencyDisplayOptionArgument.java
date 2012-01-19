/*
 PlantUMLDependencyDisplayOptionArgument.java
 Creation date : 18/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.display.argument;

import static java.util.Arrays.asList;
import static net.sourceforge.mazix.cli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.utils.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.NOT_DISPLAY_ARGUMENT_ERROR;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.getAllDisplayOptionsFullUsageDescriptions;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.valueOf;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.values;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument;

/**
 * The display option argument, telling the program what to display in the generated file. <i>Note :
 * no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public class PlantUMLDependencyDisplayOptionArgument extends AbstractOptionArgument < Set < Display > > {

    /** Serial version UID. */
    private static final long serialVersionUID = 4078671176887334895L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "DISPLAY_OPTIONS";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies display options when generating the plantuml output file, it is a separated comma list with these possible values : "
            + asList(values())
            + ". "
            + getAllDisplayOptionsFullUsageDescriptions()
            + ". Note : These arguments implementations may not be taken into account following the chosen PROGRAMMING_LANGUAGE.";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.0
     */
    public PlantUMLDependencyDisplayOptionArgument(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuffer(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public Set < Display > parseArgument(final String argument) throws CommandLineException {
        Set < Display > displayArguments = null;

        if (isNotEmpty(argument)) {
            displayArguments = new TreeSet < Display >();
            final StringTokenizer tokenizer = new StringTokenizer(argument, COMMA_CHAR);
            while (tokenizer.hasMoreTokens()) {
                final String token = tokenizer.nextToken();

                try {
                    displayArguments.add(valueOf(token.toUpperCase()));
                } catch (final IllegalArgumentException e) {
                    throw new CommandLineException(buildLogString(NOT_DISPLAY_ARGUMENT_ERROR, argument), e);
                }
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return displayArguments;
    }
}
