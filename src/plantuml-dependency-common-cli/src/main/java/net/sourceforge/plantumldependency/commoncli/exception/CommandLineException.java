/*
 CommandLineException.java
 Creation date : 27/04/2010
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

package net.sourceforge.plantumldependency.commoncli.exception;

/**
 * The exception which is thrown when an error occurs while reading / executing a command line.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class CommandLineException extends Exception {

    /** Serial version UID. */
    private static final long serialVersionUID = 4349247857238395018L;

    /**
     * Constructs a new exception with the specified detail message. The cause is not initialized,
     * and may subsequently be initialized by a call to {@link #initCause}.
     *
     * @param messageKey
     *            the detail message key, ready to be translated. The detail message key is saved
     *            for later retrieval by the {@link #getMessage()} method.
     * @since 1.3.0
     */
    public CommandLineException(final String messageKey) {
        super(messageKey);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * <p>
     * Note that the detail message associated with <code>cause</code> is <i>not</i> automatically
     * incorporated in this exception's detail message.
     *
     * @param messageKey
     *            the detail message key, ready to be translated. The detail message key is saved
     *            for later retrieval by the {@link #getMessage()} method.
     * @param cause
     *            the cause (which is saved for later retrieval by the {@link #getCause()} method).
     *            (A <tt>null</tt> value is permitted, and indicates that the cause is nonexistent
     *            or unknown.)
     * @since 1.3.0
     */
    public CommandLineException(final String messageKey, final Throwable cause) {
        super(messageKey, cause);
    }
}
