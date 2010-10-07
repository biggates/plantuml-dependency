/*
 PlantUMLDependencyBaseDirectoryOption.java
 Creation date : 5/07/2010
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

package net.sourceforge.plantuml.dependency.main.option.basedirectory;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.mazix.cli.option.status.OptionStatus.ACTIVE_OPTION_STATUS;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;

import java.io.File;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.AbstractOptionWithArgument;
import net.sourceforge.mazix.cli.option.argument.impl.directory.ExistingDirectoryOptionArgumentImpl;

/**
 * The base directory option, telling the program where to look for source files. <i>Note : no
 * option should have the same main or secondary names</i>.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyBaseDirectoryOption extends AbstractOptionWithArgument < File > {

    /** Serial version UID. */
    private static final long serialVersionUID = 2742023948261611955L;

    /**
     * Default constructor.
     * 
     * @param optionName
     *            the option main name (for instance "-v" or "-o"), mustn't be <code>null</code>.
     * @param optionSecondaryNames
     *            the {@link java.util.Set} containing all option secondary names, mustn't be
     *            <code>null</code> but may be empty. <i>Note : a new {@link java.util.Set} is
     *            created.</i>
     * @param optionIsMandatory
     *            <code>true</code> if the option is mandatory, <code>false</code> otherwise.
     * @param argument
     *            the option argument, mustn't be <code>null</code>.
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuffer} is created.</i>
     * @param valSepararator
     *            the option - argument separator. Most of the time, it is a single space " " but it
     *            may be "=" or "-", mustn't be <code>null</code>.
     * @since 1.0
     */
    public PlantUMLDependencyBaseDirectoryOption() {
        super(
                "-b",
                unmodifiableSet(new TreeSet < String >(asList(new String[] {"--basedir"}))),
                false,
                new ExistingDirectoryOptionArgumentImpl(true),
                new StringBuffer(
                        "The base directory where to look for source files. If not specified, the default pattern is \".\" i.e. the directory where the program is launched from."),
                SPACE_CHAR, ACTIVE_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getDefaultArgumentAsString(final CommandLine commandLine) throws CommandLineException {
        return DOT_CHAR;
    }
}
