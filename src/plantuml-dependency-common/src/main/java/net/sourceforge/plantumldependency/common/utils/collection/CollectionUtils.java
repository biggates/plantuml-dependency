/*
 CollectionUtils.java
 Creation date : 11/10/2013
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

package net.sourceforge.plantumldependency.common.utils.collection;

import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LEFT_BRACKET_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.RIGHT_BRACKET_CHAR;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The class utilities simplifying collection operations.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class CollectionUtils {

    /**
     * Returns a string representation of this collection.
     *
     * @param collection
     *            the collection to print, mustn't be <code>null</code>.
     * @param separator
     *            the separator to use between objects strings, can be <code>null</code>.
     * @return a string representation of this collection. The string representation consists of a
     *         list of the collection's elements in the order they are returned by its iterator,
     *         enclosed in square brackets (<tt>"[]"</tt>). Adjacent elements are separated by the
     *         characters <tt>","</tt> (comma without space). Elements are converted to strings as
     *         by {@link String#valueOf(Object)}.
     * @since 1.3.0
     */
    public static String collectionToString(final Collection < ? > collection, final String separator) {
        return collectionToString(collection, separator, LEFT_BRACKET_CHAR, RIGHT_BRACKET_CHAR);
    }

    /**
     * Returns a string representation of this collection.
     *
     * @param collection
     *            the collection to print, mustn't be <code>null</code>.
     * @param separator
     *            the separator to use between objects strings, can be <code>null</code>.
     * @param leftLimitString
     *            the left limit {@link String}, can be <code>null</code>.
     * @param rightLimitString
     *            the right limit {@link String}, can be <code>null</code>.
     * @return a string representation of this collection. The string representation consists of a
     *         list of the collection's elements in the order they are returned by its iterator,
     *         enclosed in square brackets (<tt>"[]"</tt>). Adjacent elements are separated by the
     *         characters <tt>","</tt> (comma without space). Elements are converted to strings as
     *         by {@link String#valueOf(Object)}.
     * @since 1.3.0
     */
    public static String collectionToString(final Collection < ? > collection, final String separator,
            final String leftLimitString, final String rightLimitString) {
        final Iterator < ? > it = collection.iterator();
        if (!it.hasNext()) {
            return leftLimitString + rightLimitString;
        }

        final StringBuilder sb = new StringBuilder();
        sb.append(leftLimitString);
        for (;;) {
            final Object e = it.next();
            sb.append(e == collection ? "(this Collection)" : e);
            if (!it.hasNext()) {
                return sb.append(rightLimitString).toString();
            }
            sb.append(separator);
        }
    }

    /**
     * Gets the first element of a collection, if it exist.
     *
     * @param collection
     *            the {@link Collection} where to get the first item from, mustn't be
     *            <code>null</code>.
     * @return the first element of the collection, if it exist, otherwise returns <code>null</code>
     *         .
     * @since 1.3.0
     */
    public static < T > T getCollectionFirstElement(final Collection < T > collection) {
        T result = null;

        if (collection.isEmpty() == false) {
            result = new ArrayList < T >(collection).get(0);
        }

        return result;
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private CollectionUtils() {
        super();
    }
}
