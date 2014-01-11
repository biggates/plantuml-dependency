/*
 InfoConstants.java
 Creation date : 20/09/2008
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

package net.sourceforge.plantumldependency.common.constants.log;

/**
 * The class which defines all info messages constants which are only written in the log file. The
 * messages also contains the info code.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public final class InfoConstants {

    /** The read file info message. */
    public static final String READ_FILE_INFO = "[info-mazix-components-005] : Reading file content {0}...";

    /** The write file info message. */
    public static final String WRITE_FILE_INFO = "[info-mazix-components-008] : Writing content into file {0}...";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private InfoConstants() {
        super();
    }
}
