/*
 Option.java
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

import java.io.Serializable;
import java.util.Set;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * The interface which describes a command line option.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface Option extends Comparable < Option >, Serializable, DeepCloneable < Option > {

    /**
     * Gets all option names, i.e. the main name and all secondary option names.
     *
     * @return the {@link Set} of option names. Can't be empty.
     * @since 1.3.0
     */
    Set < String > getAllNames();

    /**
     * Gets the full option usage, i.e. the full synopsis of how the option is used, with all
     * secondary names and the full option's description.
     * <p>
     * For instance it can be :<br>
     * "<i>-about, --author, --authors<br>
     * To display information about the program and its authors."</i>
     * </p>
     *
     * @return the main option usage as a {@link StringBuilder}.
     * @since 1.3.0
     */
    StringBuilder getFullUsage();

    /**
     * Gets the main option usage, i.e. the summary synopsis of how the option is used with only its
     * main name.
     * <p>
     * For instance it can be :<br>
     * "<i>-output FILE</i>".
     * </p>
     *
     * @return the main option usage as a {@link StringBuilder}.
     * @since 1.3.0
     */
    StringBuilder getMainUsage();

    /**
     * Gets the main option name, such as "-v", "-o", or "-version".
     *
     * @return the main option name as a {@link String}.
     * @since 1.3.0
     */
    String getName();

    /**
     * Gets all secondary option names, which may be used as synonyms, such as "--verbose" or
     * "--author".
     *
     * @return the {@link Set} of option secondary names. May be empty.
     * @since 1.3.0
     */
    Set < String > getSecondaryNames();

    /**
     * Gets the option status, telling if the option is active, inactive or hidden.
     *
     * @return the {@link OptionStatus} instance.
     * @since 1.3.0
     */
    OptionStatus getStatus();

    /**
     * Gets the boolean which tells if the option is mandatory.
     *
     * @return <code>true</code> if the option is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    boolean isMandatory();
}
