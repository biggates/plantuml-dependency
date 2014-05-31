/*
 PlantUMLDependencyDisplayPackageNameOptionArgument.java
 Creation date : 31 mai 2014
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

import static java.util.regex.Pattern.compile;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.BAD_PATTERN_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The display name option argument, telling the program what to display in the generated file.
 * <i>Note : no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.4.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayPackageNameOptionArgument extends AbstractOptionArgument < Pattern > {

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "DISPLAY_PACKAGE_NAME_PATTERN";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies display package name pattern when generating the plantUML output file, it is regular expression following the Java pattern (see http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html for description).";

    /** Serial version UID. */
    private static final long serialVersionUID = -6205492935149580240L;

    /**
     * Default constructor.
     *
     * @since 1.4.0
     */
    public PlantUMLDependencyDisplayPackageNameOptionArgument() {
        super(true, new StringBuilder(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.4.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.4.0
     */
    @Override
    public Pattern parseArgument(final String argument) throws CommandLineException {
        Pattern displayPackageNameArgument = null;

        if (isNotEmpty(argument)) {
            try {
                displayPackageNameArgument = compile(argument);
            } catch (final PatternSyntaxException e) {
                throw new CommandLineException(buildLogString(BAD_PATTERN_ARGUMENT_ERROR, argument), e);
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return displayPackageNameArgument;
    }
}
