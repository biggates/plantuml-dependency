/*
 ParameterCheckerUtils.java
 Creation date : 4/07/2010
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

package net.sourceforge.plantumldependency.common.utils.check;

import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isEmpty;

import java.util.Collection;

/**
 * The class utilities simplifying parameter checking.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class ParameterCheckerUtils {

    /**
     * Checks if an object is null and throw a {@link NullPointerException} if necessary.
     *
     * @param obj
     *            the object to test, mustn't be <code>null</code>.
     * @param message
     *            the message to set in the exception if needed.
     * @since 1.3.0
     */

    public static void checkNull(final Object obj, final String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
    }

    /**
     * Checks if a {@link String} is null and throw a {@link NullPointerException} if necessary.
     *
     * @param str
     *            the {@link String} to test, mustn't be <code>null</code>.
     * @param message
     *            the message to set in the exception if needed.
     * @since 1.3.0
     */
    public static void checkNullOrEmpty(final String str, final String message) {
        if (isEmpty(str)) {
            throw new NullPointerException(message);
        }
    }

    /**
     * Checks if a collection doesn't have no more element than the one specified.
     *
     * @param collection
     *            the collection to test, mustn't be <code>null</code>.
     * @param maximumNumberOfElements
     *            the maximum number of elements which can be in the collection, mustn't be inferior
     *            to 0.
     * @param message
     *            the message to set in the exception if needed.
     * @since 1.3.0
     */
    public static void checkNumberOfElementsInCollection(final Collection < ? > collection,
            final int maximumNumberOfElements, final String message) {
        if (collection.size() > maximumNumberOfElements) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private ParameterCheckerUtils() {
        super();
    }
}
