/*
 ExecutableOption.java
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

package net.sourceforge.plantumldependency.commoncli.option.execution;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

/**
 * The interface which describes a command line option which is executable (i.e. not a parameter
 * option).
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface ExecutableOption {

    /**
     * Gets the option priority, which is used to order the executions.
     *
     * @return the option priority as an integer.
     * @since 1.3.0
     */
    int getPriority();

    /**
     * Reads and parses a command line to get the option execution.
     *
     * @param commandLine
     *            the {@link CommandLine} instance to read and parse, mustn't be <code>null</code>.
     * @return the {@link OptionExecution} instance needed to execute the option following the
     *         command line.
     * @throws CommandLineException
     *             if any error occurs while reading and parsing the command line.
     * @since 1.3.0
     */
    OptionExecution parseCommandLine(CommandLine commandLine) throws CommandLineException;
}
