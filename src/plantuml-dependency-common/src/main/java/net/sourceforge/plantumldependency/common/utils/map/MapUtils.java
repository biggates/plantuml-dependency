/*
 MapUtils.java
 Creation date : 29/06/2011
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

package net.sourceforge.plantumldependency.common.utils.map;

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.log.FineConstants.IGNORING_MAP_KEY_FINE;
import static net.sourceforge.plantumldependency.common.constants.log.FineConstants.IGNORING_MAP_VALUE_FINE;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;

import java.util.Map;
import java.util.logging.Logger;

/**
 * The class utilities simplifying some {@link Map} tasks.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class MapUtils {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(MapUtils.class.getName());

    /**
     * Put the key and the value in the {@link Map} only if both of them are not <code>null</code>
     * and not empty.
     *
     * @param map
     *            the {@link Map} to put the {@link String} into, mustn't be <code>null</code>.
     * @param key
     *            the {@link String} key, can be <code>null</code>.
     * @param value
     *            the associated {@link String} value, can be <code>null</code>.
     * @since 1.3.0
     */
    public static void putNonEmptyStringToMap(final Map < String, String > map, final String key, final String value) {
        if (isNotEmpty(key)) {
            if (isNotEmpty(value)) {
                map.put(key, value);
            } else {
                LOGGER.log(FINE, IGNORING_MAP_VALUE_FINE);
            }
        } else {
            LOGGER.log(FINE, IGNORING_MAP_KEY_FINE);
        }
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private MapUtils() {
        super();
    }
}
