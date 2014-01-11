/*
 FineConstants.java
 Creation date : 30/10/2010
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
 * The class which defines all fine messages constants which are only written in the log file. The
 * messages also contains the fine code.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public final class FineConstants {

    /** The ignoring map key fine message. */
    public static final String IGNORING_MAP_KEY_FINE = "[fine-mazix-components-001] : Ignoring the key to put in the map because it is null...";

    /** The ignoring map value fine message. */
    public static final String IGNORING_MAP_VALUE_FINE = "[fine-mazix-components-002] : Ignoring the value to put in the map because it is null...";

    /** The system property not to display fine message. */
    public static final String SYSTEM_PROPERTY_NOT_TO_DISPLAY_FINE = "[fine-mazix-components-007] : The system property \"{0}\" doesn't have to be displayed, ignoring it";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private FineConstants() {
        super();
    }
}
