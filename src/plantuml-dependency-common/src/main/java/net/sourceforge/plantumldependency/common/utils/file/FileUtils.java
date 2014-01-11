/*
 FileUtils.java
 Creation date : 07/03/2009
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

package net.sourceforge.plantumldependency.common.utils.file;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.MINUS_ONE_RETURN_CODE;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.CLOSE_FILE_ERROR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.CLOSE_STREAM_ERROR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.READ_FILE_ERROR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.WRITE_FILE_ERROR;
import static net.sourceforge.plantumldependency.common.constants.log.InfoConstants.READ_FILE_INFO;
import static net.sourceforge.plantumldependency.common.constants.log.InfoConstants.WRITE_FILE_INFO;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * The class utilities managing files.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class FileUtils {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(FileUtils.class.getName());

    /**
     * Properly close a {@link Closeable} object.
     *
     * @param closeable
     *            the {@link Closeable} instance to close, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public static void closeCloseable(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (final IOException e) {
                LOGGER.log(SEVERE, CLOSE_STREAM_ERROR, e);
            }
        }
    }

    /**
     * Properly close a {@link Closeable} object.
     *
     * @param closeable
     *            the {@link Closeable} instance to close, mustn't be <code>null</code>.
     * @param closeableFile
     *            the closeable {@link File} to log if any exception occurs.
     * @since 1.3.0
     */
    public static void closeCloseable(final Closeable closeable, final File closeableFile) {
        closeCloseable(closeable, closeableFile.toString());
    }

    /**
     * Properly close a {@link Closeable} object.
     *
     * @param closeable
     *            the {@link Closeable} instance to close, mustn't be <code>null</code>.
     * @param closeableName
     *            the closeable name to log if any exception occurs.
     * @since 1.3.0
     */
    public static void closeCloseable(final Closeable closeable, final String closeableName) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (final IOException e) {
                LOGGER.log(SEVERE, buildLogString(CLOSE_FILE_ERROR, closeableName), e);
            }
        }
    }

    /**
     * This method reads the following file path as a <code>String</code>. It uses the default
     * encoding when reading the file.
     *
     * @param file
     *            the file to read from, must'nt be <code>null</code>.
     * @return the file content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @since 1.3.0
     */
    public static String readFileIntoString(final File file) {
        return readFileIntoString(file, null);
    }

    /**
     * This method reads the following file path as a <code>String</code>.
     *
     * @param file
     *            the file to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the file content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @since 1.3.0
     */
    public static String readFileIntoString(final File file, final String charsetName) {
        assert file != null : "file is null";

        LOGGER.log(INFO, buildLogString(READ_FILE_INFO, new Object[] {file}));

        FileInputStream fi = null;
        String result = null;

        try {
            fi = new FileInputStream(file);
            result = readStreamIntoString(fi, charsetName);
        } catch (final IOException e) {
            LOGGER.log(SEVERE, buildLogString(READ_FILE_ERROR, file), e);
        } finally {
            closeCloseable(fi, file);
        }

        return result;
    }

    /**
     * This method reads the following file path as a <code>String</code>. It uses the default
     * encoding when reading the file.
     *
     * @param pathName
     *            the file pathname to read from, must'nt be <code>null</code>.
     * @return the file content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @since 1.3.0
     */
    public static String readFileIntoString(final String pathName) {
        return readFileIntoString(pathName, null);
    }

    /**
     * This method reads the following file path as a <code>String</code>.
     *
     * @param pathName
     *            the file pathname to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the file content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @since 1.3.0
     */
    public static String readFileIntoString(final String pathName, final String charsetName) {
        assert pathName != null : "pathName is null";

        return readFileIntoString(new File(pathName), charsetName);
    }

    /**
     * This method reads the following file path as a <code>String</code>. It uses the default
     * encoding when reading the file.
     *
     * @param file
     *            the file to read from, must'nt be <code>null</code>.
     * @return the file content as a <code>StringBuffer</code>, or the <code>null</code> constant if
     *         any error has occurred.
     * @since 1.3.0
     */
    public static StringBuffer readFileIntoStringBuffer(final File file) {
        return readFileIntoStringBuffer(file, null);
    }

    /**
     * This method reads the following file path as a <code>String</code>.
     *
     * @param file
     *            the file to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the file content as a <code>StringBuffer</code>, or the <code>null</code> constant if
     *         any error has occurred.
     * @since 1.3.0
     */
    public static StringBuffer readFileIntoStringBuffer(final File file, final String charsetName) {
        assert file != null : "file is null";

        LOGGER.log(INFO, buildLogString(READ_FILE_INFO, new Object[] {file}));

        FileInputStream fi = null;
        StringBuffer result = null;

        try {
            fi = new FileInputStream(file);
            result = readStreamIntoStringBuffer(fi, charsetName);
        } catch (final IOException e) {
            LOGGER.log(SEVERE, buildLogString(READ_FILE_ERROR, file), e);
        } finally {
            closeCloseable(fi, file);
        }

        return result;
    }

    /**
     * This method reads the following file path as a <code>String</code>. It uses the default
     * encoding when reading the file.
     *
     * @param pathName
     *            the file pathname to read from, must'nt be <code>null</code>.
     * @return the file content as a <code>StringBuffer</code>, or the <code>null</code> constant if
     *         any error has occurred.
     * @since 1.3.0
     */
    public static StringBuffer readFileIntoStringBuffer(final String pathName) {
        return readFileIntoStringBuffer(pathName, null);
    }

    /**
     * This method reads the following file path as a <code>String</code>.
     *
     * @param pathName
     *            the file pathname to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the file content as a <code>StringBuffer</code>, or the <code>null</code> constant if
     *         any error has occurred.
     * @since 1.3.0
     */
    public static StringBuffer readFileIntoStringBuffer(final String pathName, final String charsetName) {
        assert pathName != null : "pathName is null";

        return readFileIntoStringBuffer(new File(pathName), charsetName);
    }

    /**
     * This method reads the following stream as a <code>String</code>. Doesn't close the stream. It
     * uses the default encoding when reading the stream.
     *
     * @param stream
     *            the input stream to read from, must'nt be <code>null</code>.
     * @return the stream content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @throws IOException
     *             if any exception occurs while reading the stream.
     * @since 1.3.0
     */
    public static String readStreamIntoString(final InputStream stream) throws IOException {
        return readStreamIntoString(stream, null);
    }

    /**
     * This method reads the following stream as a <code>String</code>. Doesn't close the stream.
     *
     * @param stream
     *            the input stream to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the stream content as a <code>String</code>, or the <code>null</code> constant if any
     *         error has occurred.
     * @throws IOException
     *             if any exception occurs while reading the stream.
     * @since 1.3.0
     */
    public static String readStreamIntoString(final InputStream stream, final String charsetName) throws IOException {
        return readStreamIntoStringBuffer(stream, charsetName).toString();
    }

    /**
     * This method reads the following stream as a <code>String</code>. Doesn't close the stream. It
     * uses the default encoding when reading the stream.
     *
     * @param stream
     *            the input stream to read from, must'nt be <code>null</code>.
     * @return the stream content as a <code>StringBuffer</code>, or the <code>null</code> constant
     *         if any error has occurred.
     * @throws IOException
     *             if any exception occurs while reading the stream.
     * @since 1.3.0
     */
    public static StringBuffer readStreamIntoStringBuffer(final InputStream stream) throws IOException {
        return readStreamIntoStringBuffer(stream, null);
    }

    /**
     * This method reads the following stream as a <code>String</code>. Doesn't close the stream.
     *
     * @param stream
     *            the input stream to read from, must'nt be <code>null</code>.
     * @param charsetName
     *            The name of a supported {@link java.nio.charset.Charset}.
     * @return the stream content as a <code>StringBuffer</code>, or the <code>null</code> constant
     *         if any error has occurred.
     * @throws IOException
     *             if any exception occurs while reading the stream.
     * @since 1.3.0
     */
    public static StringBuffer readStreamIntoStringBuffer(final InputStream stream, final String charsetName)
            throws IOException {
        assert stream != null : "stream is null";

        Reader streamReader = null;
        if (charsetName == null) {
            streamReader = new InputStreamReader(stream);
        } else {
            streamReader = new InputStreamReader(stream, charsetName);
        }

        final StringWriter out = new StringWriter();
        int b;
        while ((b = streamReader.read()) != MINUS_ONE_RETURN_CODE) {
            out.write(b);
        }

        return out.getBuffer();
    }

    /**
     * This method writes the following <code>String</code> into the file.
     *
     * @param str
     *            the <code>String</code> to write, must'nt be <code>null</code> .
     * @param file
     *            the file to write into, must'nt be <code>null</code>.
     * @return <code>true</code> if no error have occurred while writing the file,
     *         <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean writeIntoFile(final String str, final File file) {
        return writeIntoFile(str, file, false);
    }

    /**
     * This method writes the following <code>String</code> into the file.
     *
     * @param str
     *            the <code>String</code> to write, must'nt be <code>null</code> .
     * @param file
     *            the file to write into, must'nt be <code>null</code>.
     * @param append
     *            if <code>true</code>, then data will be written to the end of the file rather than
     *            the beginning.
     * @return <code>true</code> if no error have occurred while writing the file,
     *         <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean writeIntoFile(final String str, final File file, final boolean append) {
        assert str != null : "str is null";
        assert file != null : "file is null";

        LOGGER.log(INFO, buildLogString(WRITE_FILE_INFO, file));

        boolean error = true;
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, append);
            writer.write(str, 0, str.length());
            error = false;
        } catch (final IOException e) {
            LOGGER.log(SEVERE, buildLogString(WRITE_FILE_ERROR, file), e);
        } finally {
            closeCloseable(writer, file);
        }

        return error;
    }

    /**
     * This method writes the following <code>String</code> into the file.
     *
     * @param str
     *            the <code>String</code> to write, must'nt be <code>null</code> .
     * @param path
     *            the file path to write into, must'nt be <code>null</code>.
     * @return <code>true</code> if no error have occurred while writing the file,
     *         <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean writeIntoFile(final String str, final String path) {
        return writeIntoFile(str, path, false);
    }

    /**
     * This method writes the following <code>String</code> into the file.
     *
     * @param str
     *            the <code>String</code> to write, must'nt be <code>null</code> .
     * @param pathName
     *            the file path to write into, must'nt be <code>null</code>.
     * @param append
     *            if <code>true</code>, then data will be written to the end of the file rather than
     *            the beginning.
     * @return <code>true</code> if no error have occurred while writing the file,
     *         <code>false</code> otherwise.
     * @since 1.3.0
     */
    public static boolean writeIntoFile(final String str, final String pathName, final boolean append) {
        assert pathName != null : "pathName is null";

        return writeIntoFile(str, new File(pathName), append);
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private FileUtils() {
        super();
    }
}
