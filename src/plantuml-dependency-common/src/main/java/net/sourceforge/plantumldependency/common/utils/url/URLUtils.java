/*
 URLUtils.java
 Creation date : 6/07/2010
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

package net.sourceforge.plantumldependency.common.utils.url;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.MALFORMED_URL_ERROR;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * The utility class to manage URL without taking care of the {@link MalformedURLException}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class URLUtils {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(URLUtils.class.getName());

    /**
     * Creates an URL instance from a {@link String}. Don't throw {@link MalformedURLException}.
     *
     * @param urlStr
     *            the URL string to get the {@link URL} instance from, mustn't be <code>null</code>.
     * @return the {@link URL} instance if it has been correctly parsed, <code>null</code>
     *         otherwise.
     * @since 1.3.0
     */
    public static URL createURL(final String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (final MalformedURLException e) {
            LOGGER.log(SEVERE, buildLogString(MALFORMED_URL_ERROR, urlStr));
        }

        return url;
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private URLUtils() {
        super();
    }
}
