/*
 StringUtils.java
 Creation date : 04/05/2010
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

package net.sourceforge.plantumldependency.common.utils.string;

import java.util.Set;
import java.util.TreeSet;

/**
 * The class utilities simplifying some {@link String} tasks.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class StringUtils {

    /**
     * Convert a {@link Set} of object into a {@link Set} of their string representation.
     *
     * @param objects
     *            the {@link Set} of object to get the strings from, mustn't be <code>null</code>.
     * @return a {@link Set} containing all string representation of the objects.
     * @since 1.3.0
     */
    public static Set < String > convertObjectSetIntoStringSet(final Set < Object > objects) {
        final Set < String > objectsString = new TreeSet < String >();

        for (final Object object : objects) {
            objectsString.add(object.toString());
        }

        return objectsString;
    }

    /**
     * Checks if a String is empty ("") or null.
     *
     * @param str
     *            the string to check.
     * @return <code>true</code> if the {@link String} is empty, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean isEmpty(final String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * Checks if a String is not empty ("") and not null.
     *
     * @param str
     *            the string to check.
     * @return <code>true</code> if the {@link String} isn't empty, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean isNotEmpty(final String str) {
        return str != null && str.trim().length() != 0;
    }

    /**
     * Replaces all strings of the set in the original string by a unique replacement string.
     * <i>Note : this method is case sensitive</i>
     *
     * @param str
     *            the original string where to replace strings, mustn't be <code>null</code>.
     * @param setOfStringsToReplace
     *            the {@link Set} of string to be replaced, mustn't be <code>null</code>.
     * @param replacementString
     *            the replacement string, mustn't be <code>null</code>.
     * @return the new string after replacements.
     * @since 1.3.0
     */
    public static String replaceASetOfString(final String str, final Set < String > setOfStringsToReplace,
            final String replacementString) {
        String result = str;

        for (final String stringToReplace : setOfStringsToReplace) {
            result = result.replaceAll(stringToReplace, replacementString);
        }

        return result;
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private StringUtils() {
        super();
    }
}
