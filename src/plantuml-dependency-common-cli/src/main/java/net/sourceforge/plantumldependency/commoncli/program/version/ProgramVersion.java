/*
 ProgramVersion.java
 Creation date : 8/06/2010
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

package net.sourceforge.plantumldependency.commoncli.program.version;

import java.io.Serializable;
import java.util.Date;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;

/**
 * The interface which describes a program version, major, minor and revision number.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface ProgramVersion extends Comparable < ProgramVersion >, Serializable, DeepCloneable < ProgramVersion > {

    /**
     * Gets the program compilation time.
     *
     * @return the program revision version number as an {@link Date}.
     * @since 1.3.0
     */
    Date getCompilationTime();

    /**
     * Gets the program full version number, i.e. major.minor.revision numbers.
     *
     * @return the program full version number as an {@link String}.
     * @since 1.3.0
     */
    String getFullVersionNumber();

    /**
     * Gets the program major version number.
     *
     * @return the program major version number as an <code>integer</code>.
     * @since 1.3.0
     */
    int getMajorVersionNumber();

    /**
     * Gets the program minor version number.
     *
     * @return the program minor version number as an <code>integer</code>.
     * @since 1.3.0
     */
    int getMinorVersionNumber();

    /**
     * Gets the program revision version number.
     *
     * @return the program revision version number as an <code>integer</code>.
     * @since 1.3.0
     */
    int getRevisionVersionNumber();

    /**
     * Tells if the program version is a snapshot.
     *
     * @return <code>true</code> if the program version is a snapshot, false otherwise.
     * @since 1.3.0
     */
    boolean isSnapshot();
}
