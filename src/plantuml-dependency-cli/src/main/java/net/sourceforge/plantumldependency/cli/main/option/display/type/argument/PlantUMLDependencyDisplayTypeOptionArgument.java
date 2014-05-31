/*
 PlantUMLDependencyDisplayTypeOptionArgument.java
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

package net.sourceforge.plantumldependency.cli.main.option.display.type.argument;

import static java.util.Arrays.asList;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.NOT_DISPLAY_TYPE_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.SEVERAL_DISPLAY_TYPE_ARGUMENTS_ERROR;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.getAllDisplayTypesOptionsFullUsageDescriptions;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.valueOf;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.values;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.utils.collection.CollectionUtils.collectionToString;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The display type option argument, telling the program what to display in the generated file. <i>Note :
 * no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayTypeOptionArgument extends AbstractOptionArgument < Set < DisplayType > > {

    /** Serial version UID. */
    private static final long serialVersionUID = 4078671176887334895L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "DISPLAY_TYPES_OPTIONS";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies display types options when generating the plantUML output file, it is a separated comma list with these possible values : "
            + collectionToString(asList(values()), COMMA_CHAR) + ". " + getAllDisplayTypesOptionsFullUsageDescriptions()
            + DOT_CHAR;

    // FIXME uncomment if the PlantUMLDependencyProgrammingLanguageOption passes to ACTIVE (not
    // HIDDEN)
    // +
    // ". Note : These arguments implementations may not be taken into account following the chosen PROGRAMMING_LANGUAGE.";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.0.0
     */
    public PlantUMLDependencyDisplayTypeOptionArgument(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuilder(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Set < DisplayType > parseArgument(final String argument) throws CommandLineException {
        Set < DisplayType > displayTypesArguments = null;

        if (isNotEmpty(argument)) {
            displayTypesArguments = new TreeSet < DisplayType >();
            final StringTokenizer tokenizer = new StringTokenizer(argument, COMMA_CHAR);
            while (tokenizer.hasMoreTokens()) {
                final String token = tokenizer.nextToken();

                try {
                    final DisplayType displayTypeArgument = valueOf(token.toUpperCase());
                    if (displayTypesArguments.contains(displayTypeArgument)) {
                        throw new CommandLineException(buildLogString(SEVERAL_DISPLAY_TYPE_ARGUMENTS_ERROR, displayTypeArgument));
                    }
                    displayTypesArguments.add(valueOf(token.toUpperCase()));
                } catch (final IllegalArgumentException e) {
                    throw new CommandLineException(buildLogString(NOT_DISPLAY_TYPE_ARGUMENT_ERROR, argument), e);
                }
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return displayTypesArguments;
    }
}
