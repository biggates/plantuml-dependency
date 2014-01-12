/*
 OptionArgument.java
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

package net.sourceforge.plantumldependency.commoncli.option.argument;

import java.io.Serializable;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

/**
 * The interface which describes an option argument, which has the template type.
 *
 * @param <A>
 *            the argument type to parse.
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface OptionArgument < A > extends Comparable < OptionArgument < A > >, Serializable,
        DeepCloneable < OptionArgument < A > > {

    /**
     * Gets the full argument usage description, i.e. the full synopsis of how the argument is used
     * and the argument's description.
     * <p>
     * For instance it can be :<br>
     * - <i>"FILE specifies a valid file path, not a directory. It can be absolute or relative."</i>
     * <br>
     * - <i>"INTEGER specifies an integer, positive or negative."</i>
     * </p>
     *
     * @return the main option usage as a {@link StringBuilder}.
     * @since 1.3.0
     */
    StringBuilder getFullUsageDescription();

    /**
     * Gets the main argument usage, i.e. the summary synopsis of how the argument is used.
     * <p>
     * For instance it can be :<br>
     * - <i>"FILE"</i><br>
     * - <i>"[INTEGER]"</i>
     * </p>
     *
     * @return the main option usage as a {@link StringBuilder}.
     * @since 1.3.0
     */
    StringBuilder getMainUsage();

    /**
     * Gets the boolean which tells if the argument is mandatory.
     *
     * @return <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    boolean isMandatory();

    /**
     * Reads and parses the {@link String} argument.
     *
     * @param argument
     *            the argument to parse, mustn't be <code>null</code>.
     * @return the argument instance following the template type.
     * @throws CommandLineException
     *             if any error occurs while parsing the argument.
     * @since 1.3.0
     */
    A parseArgument(String argument) throws CommandLineException;
}
