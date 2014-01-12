/*
 CommandLine.java
 Creation date : 11/06/2010
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

package net.sourceforge.plantumldependency.commoncli.command;

import java.io.Serializable;
import java.util.List;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.Option;
import net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument;

/**
 * The interface which describes a command line, gathering the list of all arguments passed to a
 * program.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface CommandLine extends Comparable < CommandLine >, Serializable, DeepCloneable < CommandLine > {

    /**
     * Find and returns the option argument if specified on the command line.
     *
     * @param option
     *            the option to look for, mustn't be <code>null</code>.
     * @return the option argument as a {@link String} if found, the
     *         {@link net.sourceforge.plantumldependency.common.constants.CommonConstants#BLANK_STRING}
     *         if the option is specified on the command line without any argument behind, or
     *         <code>null</code> if the option hasn't been specified.
     * @throws CommandLineException
     *             if any error occurs when finding the option in the command line, for instance
     *             when the option is specified several times in the command line.
     * @since 1.3.0
     */
    String findOptionArgument(OptionWithArgument < ? > option) throws CommandLineException;

    /**
     * Gets all command line arguments, without program information.
     * <p>
     * For instance it can be :<br>
     * <i>-a</i><br>
     * <i>-h</i><br>
     * <i>-v</i>
     * </p>
     *
     * @return all command line arguments as a {@link List} of {@link String}.
     * @since 1.3.0
     */
    List < String > getCommandLineArguments();

    /**
     * Gets the full command line as a single {@link StringBuilder}, without program information.
     * <p>
     * For instance it can be :<br>
     * <i>-a -h -v</i>
     * </p>
     *
     * @return the {@link StringBuilder} representing the full command line argument.
     * @since 1.3.0
     */
    StringBuilder getCommandLineArgumentsAsString();

    /**
     * Tells if one of the passed option names is active or hidden and is specified in the command
     * line.
     *
     * @param option
     *            the option to look for, mustn't be <code>null</code>.
     * @return <code>true</code> if one of the option names has been found in the command line and
     *         is active or hidden, <code>false</code> otherwise.
     * @throws CommandLineException
     *             if any error occurs when reading or parsing the command line, for instance when
     *             the option is specified several times in the command line or if the option isn't
     *             specified while it is mandatory.
     * @since 1.3.0
     */
    boolean isOptionActiveAndSpecified(Option option) throws CommandLineException;

    /**
     * Tells if one of the passed option names is specified in the command line, whatever its status
     * is.
     *
     * @param option
     *            the option to look for, mustn't be <code>null</code>.
     * @return <code>true</code> if one of the option names has been found in the command line,
     *         <code>false</code> otherwise.
     * @throws CommandLineException
     *             if any error occurs when reading or parsing the command line, for instance when
     *             the option is specified several times in the command line or if the option isn't
     *             specified while it is mandatory.
     * @since 1.3.0
     */
    boolean isOptionSpecified(Option option) throws CommandLineException;
}
