/*
 OptionWithArgument.java
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

package net.sourceforge.plantumldependency.commoncli.option;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

/**
 * The interface which describes a command line option with an argument.
 *
 * @param <A>
 *            the argument type to parse.
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface OptionWithArgument < A > extends Option {

    /**
     * Parses the input {@link CommandLine} and try to find the argument which has been set. If the
     * argument isn't specified or if the option hasn't been specified, it return the default
     * argument, returned by the {@link #getDefaultArgumentIfOptionSpecified(CommandLine)} or
     * {@link #getDefaultArgumentIfOptionNotSpecified(CommandLine)} methods.
     *
     * @param commandLine
     *            the {@link CommandLine} to parse, mustn't be <code>null</code>.
     * @return the parsed option argument or the default one if not found.
     * @throws CommandLineException
     *             if any error occurs when reading or parsing the command line. It can also be
     *             thrown if the option or the argument are not found but mandatory.
     * @since 1.3.0
     */
    A findAndParseArgumentOrGetDefaultArgument(CommandLine commandLine) throws CommandLineException;

    /**
     * Gets the default argument as a {@link String} (like in the command line) associated to the
     * option if the option has not been specified. <i>Note : this method is usually used when both
     * the option and the argument are not mandatory and not specified.</i>
     *
     * @param commandLine
     *            the {@link CommandLine} if needed, may be <code>null</code>. This parameter is
     *            mainly used when the default option argument depends on other command line options
     *            / arguments.
     * @return the default argument as a {@link String} associated to the option.
     * @throws CommandLineException
     *             if any error occurs when reading and parsing the command line (if needed).
     * @see #getDefaultArgumentIfOptionSpecified(CommandLine)
     * @since 1.3.0
     */
    String getDefaultArgumentAsStringIfOptionNotSpecified(CommandLine commandLine) throws CommandLineException;

    /**
     * Gets the default argument as a {@link String} (like in the command line) associated to the
     * option if the option has been specified. <i>Note : this method is usually used when the
     * argument is not mandatory and not specified.</i>
     *
     * @param commandLine
     *            the {@link CommandLine} if needed, may be <code>null</code>. This parameter is
     *            mainly used when the default option argument depends on other command line options
     *            / arguments.
     * @return the default argument as a {@link String} associated to the option.
     * @throws CommandLineException
     *             if any error occurs when reading and parsing the command line (if needed).
     * @see #getDefaultArgumentIfOptionSpecified(CommandLine)
     * @since 1.3.0
     */
    String getDefaultArgumentAsStringIfOptionSpecified(CommandLine commandLine) throws CommandLineException;

    /**
     * Gets the default argument instance associated to the option if the option has not been
     * specified. Most of the time, this method return an instance of the argument which is returned
     * by the {@link #getDefaultArgumentAsStringIfOptionSpecified(CommandLine)} method. <i>Note :
     * this method is usually used when both the option and the argument are not mandatory and not
     * specified.</i>
     *
     * @param commandLine
     *            the {@link CommandLine} if needed, may be <code>null</code>. This parameter is
     *            mainly used when the default option argument depends on other command line options
     *            / arguments.
     * @return the default argument instance associated to the option.
     * @throws CommandLineException
     *             if any error occurs when reading and parsing the command line (if needed).
     * @see #getDefaultArgumentAsStringIfOptionSpecified(CommandLine)
     * @since 1.3.0
     */
    A getDefaultArgumentIfOptionNotSpecified(CommandLine commandLine) throws CommandLineException;

    /**
     * Gets the default argument instance associated to the option if the option has been specified.
     * Most of the time, this method return an instance of the argument which is returned by the
     * {@link #getDefaultArgumentAsStringIfOptionSpecified(CommandLine)} method. <i>Note : this
     * method is usually used when the argument is not mandatory and not specified.</i>
     *
     * @param commandLine
     *            the {@link CommandLine} if needed, may be <code>null</code>. This parameter is
     *            mainly used when the default option argument depends on other command line options
     *            / arguments.
     * @return the default argument instance associated to the option.
     * @throws CommandLineException
     *             if any error occurs when reading and parsing the command line (if needed).
     * @see #getDefaultArgumentAsStringIfOptionSpecified(CommandLine)
     * @since 1.3.0
     */
    A getDefaultArgumentIfOptionSpecified(CommandLine commandLine) throws CommandLineException;

    /**
     * Gets the option argument.
     *
     * @return the {@link OptionArgument} of the option.
     * @since 1.3.0
     */
    OptionArgument < A > getOptionArgument();

    /**
     * Gets the option - argument separator. Most of the time, it is a single space " " but it may
     * be "=" or "-".
     *
     * @return the option - argument separator, as a {@link String}.
     * @since 1.3.0
     */
    String getValueSeparator();
}
