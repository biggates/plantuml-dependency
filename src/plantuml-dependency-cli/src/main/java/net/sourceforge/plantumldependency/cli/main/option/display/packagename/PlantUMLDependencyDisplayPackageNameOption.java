/*
 PlantUMLDependencyDisplayPackageNameOption.java
 Creation date : 31/05/2014
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

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY_PACKAGE_NAME;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.cli.main.option.display.packagename.argument.PlantUMLDependencyDisplayPackageNameOptionArgument;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;

/**
 * The display package name option, telling the program what to display in the generated file.
 * <i>Note : no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.4.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayPackageNameOption extends AbstractOptionWithArgument < Pattern > {

    /** Serial version UID. */
    private static final long serialVersionUID = 6636249105521044787L;

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-dp";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >(
            asList(new String[] {"--display-package-name"})));

    /**
     * Default constructor.
     *
     * @since 1.4.0
     */
    public PlantUMLDependencyDisplayPackageNameOption() {
        super(
                OPTION_MAIN_SYNOPSIS,
                OPTION_SYNOPSIS,
                new PlantUMLDependencyDisplayPackageNameOptionArgument(),
                new StringBuilder(
                        "To specify class diagram objects to display following their package name. If not specified, the default is \""
                                + DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING
                                + "\". Note : native calls which are represented by the \""
                                + NATIVE_DEPENDENCY_PACKAGE_NAME
                                + "\" package name can also be matched by this regular expression even if it is a fictive dependency."),
                SPACE_CHAR, ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.4.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.4.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_STRING;
    }
}
