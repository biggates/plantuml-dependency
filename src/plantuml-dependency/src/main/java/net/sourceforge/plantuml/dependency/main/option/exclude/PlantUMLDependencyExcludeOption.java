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

package net.sourceforge.plantuml.dependency.main.option.exclude;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.mazix.cli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;

import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.AbstractOptionWithArgument;
import net.sourceforge.mazix.cli.option.argument.impl.filepattern.ExcludeFilePatternOptionArgumentImpl;

import org.apache.tools.ant.types.FileSet;

/**
 * The exclude option, allowing to specify an exclude file pattern, like ANT. <i>Note : no option
 * should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyExcludeOption extends AbstractOptionWithArgument < FileSet > {

    /** Serial version UID. */
    private static final long serialVersionUID = -4187623575754105884L;

    /**
     * Default constructor.
     *
     * @since 1.0
     */
    public PlantUMLDependencyExcludeOption() {
        super("-e", unmodifiableSet(new TreeSet < String >(asList(new String[] {"--exclude"}))),
                new ExcludeFilePatternOptionArgumentImpl(true), new StringBuffer(
                        "To exclude files that match the provided pattern. If not specified, no file is excluded."),
                SPACE_CHAR, ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return "**/*~";
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return "**/*~";
    }
}
