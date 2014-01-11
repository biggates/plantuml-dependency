/*
 ErrorConstants.java
 Creation date : 13/05/2007
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
 * The class which defines all error messages constants which are only written in the log file. The
 * messages also contains the error code.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public final class ErrorConstants {

    /** The close file error message. */
    public static final String CLOSE_FILE_ERROR = "[error-mazix-components-007] : An error has occurred while closing file ({0})";

    /** The close stream error message. */
    public static final String CLOSE_STREAM_ERROR = "[error-mazix-components-008] : An error has occurred while closing a stream";

    /** The immutable date error message. */
    public static final String IMMUTABLE_DATE_ERROR = "[error-mazix-components-012] : The date instance {0} is immutable, can't update it";

    /** The malformed error message. */
    public static final String MALFORMED_URL_ERROR = "[error-mazix-components-019] : The URL {0} is malformed, can't parse it as a valid URL";

    /** The missing logging file error message. */
    public static final String MISSING_LOGGING_FILE_ERROR = "[error-mazix-components-020] : The logging file \"{0}\" can't be found";

    /** The read file error message. */
    public static final String READ_FILE_ERROR = "[error-mazix-components-027] : An error has occurred while reading file ({0})";

    /** The unexpected exception error message. */
    public static final String UNEXPECTED_ERROR = "[error-mazix-components-030] : A severe and unexpected error has occurred";

    /** The write file error message. */
    public static final String WRITE_FILE_ERROR = "[error-mazix-components-032] : An error has occurred while writing file ({0})";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private ErrorConstants() {
        super();
    }
}
