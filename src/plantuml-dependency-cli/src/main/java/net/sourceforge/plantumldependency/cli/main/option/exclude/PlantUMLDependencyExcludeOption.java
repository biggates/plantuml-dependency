/*
 PlantUMLDependencyExcludeOption.java
 Creation date : 2/06/2010
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

package net.sourceforge.plantumldependency.cli.main.option.exclude;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_EXCLUDE_OPTIONS;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern.ExcludeFilePatternOptionArgumentImpl;

import org.apache.tools.ant.types.FileSet;

/**
 * The exclude option, allowing to specify an exclude file pattern, like ANT. <i>Note : no option
 * should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyExcludeOption extends AbstractOptionWithArgument < FileSet > {

    /** Serial version UID. */
    private static final long serialVersionUID = -4187623575754105884L;

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-e";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >(
            asList(new String[] {"--exclude"})));

    /**
     * Default constructor.
     *
     * @since 1.0.0
     */
    public PlantUMLDependencyExcludeOption() {
        super(OPTION_MAIN_SYNOPSIS, OPTION_SYNOPSIS, new ExcludeFilePatternOptionArgumentImpl(true), new StringBuilder(
                "To exclude files that match the provided pattern. If not specified, the default pattern is \""
                        + DEFAULT_EXCLUDE_OPTIONS + "\"."), SPACE_CHAR, ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_EXCLUDE_OPTIONS;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_EXCLUDE_OPTIONS;
    }
}
