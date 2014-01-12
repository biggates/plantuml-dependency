/*
 ExceptionUtils.java
 Creation date : 17/06/2011
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

package net.sourceforge.plantumldependency.common.utils.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * The class utilities for Exception.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class ExceptionUtils {

    /**
     * Gets the stack strace of an exception as a {@link String}.
     *
     * @param throwable
     *            the {@link Throwable} to get the stack trace from, mustn't be <code>null</code>.
     * @return the stack trace of the exception as a {@link String}.
     * @since 1.3.0
     */
    public static String getStackTraceAsString(final Throwable throwable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        throwable.printStackTrace(printWriter);
        return result.toString();
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private ExceptionUtils() {
        super();
    }
}
