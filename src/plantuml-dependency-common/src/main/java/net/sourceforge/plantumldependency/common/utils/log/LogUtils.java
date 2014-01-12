/*
 LogUtils.java
 Creation date : 29/10/2008
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

package net.sourceforge.plantumldependency.common.utils.log;

import static java.util.logging.LogManager.getLogManager;
import static java.util.regex.Matcher.quoteReplacement;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.BACK_SLASH_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LEFT_BRACES_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.RIGHT_BRACES_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.MISSING_LOGGING_FILE_ERROR;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.closeCloseable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * This class utilities containing useful methods which can be used with log message. For example,
 * it can be used with log message where arguments are needed by building the string to log
 * following passed arguments.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class LogUtils {

    /**
     * This method is the same of the {code String buildLogString(String logMessage, String[] args)}
     * except that there is only one argument.
     *
     * @param logMessage
     *            the generic log message as a {code String}. Arguments are described as {0}. Can't
     *            be {code null}.
     * @param args
     *            the arguments as {code String} to replace in the log message. Can't be {code
     *            null}.
     * @return the final log message where generic argument have been replaced. For instance :<br>
     *         - Log message : "Initializing {0} file...."<br>
     *         - Arguments : "options.xml"<br>
     *         will return "Initializing options.xml file...."
     * @since 1.3.0
     * @see #buildLogString(String, String[])
     */
    public static String buildLogString(final String logMessage, final Object args) {
        assert logMessage != null : "logMessage is null";
        assert args != null : "args is null";

        return buildLogString(logMessage, new String[] {args.toString()});
    }

    /**
     * This method is used to build the log string following the generic log message with passed
     * arguments.
     *
     * @param logMessage
     *            the generic log message as a {code String}. Arguments are described as {0}, {1},
     *            {2} etc.... Can't be {code null}.
     * @param args
     *            the arguments as {code Object} to replace as {code String} in the log message. If
     *            the arguments aren't enough, the arguments will be considered as empty and the log
     *            message will be fill with a blank string instead. If the arguments are higher that
     *            the number contained in the log message, the latest are ignored. Can be {null}, in
     *            this case arguments will be filled with empty {code String}.
     * @return the final log message where generic argument have been replaced. For instance :<br>
     *         - Log message : "Initializing {0} file.... {1}"<br>
     *         - Arguments : new String[] {"options.xml", "OK"}<br>
     *         will return "Initializing options.xml file.... OK"
     * @since 1.3.0
     * @see #buildLogString(String, String[])
     */
    public static String buildLogString(final String logMessage, final Object[] args) {
        assert logMessage != null : "logMessage is null";

        String[] str = null;

        if (args != null) {
            str = new String[args.length];

            for (int i = 0; i < args.length; i++) {
                str[i] = args[i].toString();
            }
        }

        return buildLogString(logMessage, str);
    }

    /**
     * This method is the same of the {code String buildLogString(String logMessage, String[] args)}
     * except that there is only one argument.
     *
     * @param logMessage
     *            the generic log message as a {code String}. Arguments are described as {0}. Can't
     *            be {code null}.
     * @param args
     *            the arguments as {code String} to replace in the log message. Can't be {null}.
     * @return the final log message where generic argument have been replaced. For instance :<br>
     *         - Log message : "Initializing {0} file...."<br>
     *         - Arguments : "options.xml"<br>
     *         will return "Initializing options.xml file...."
     * @since 1.3.0
     * @see #buildLogString(String, String[])
     */
    public static String buildLogString(final String logMessage, final String args) {
        assert logMessage != null : "logMessage is null";
        assert args != null : "args is null";

        return buildLogString(logMessage, new String[] {args});
    }

    /**
     * This method is used to build the log string following the generic log message with passed
     * arguments.
     *
     * @param logMessage
     *            the generic log message as a {code String}. Arguments are described as {0}, {1},
     *            {2} etc.... Can't be {code null}.
     * @param args
     *            the arguments as {code String} to replace in the log message. If the arguments
     *            aren't enough, the arguments will be considered as empty and the log message will
     *            be fill with a blank string instead. If the arguments are higher that the number
     *            contained in the log message, the latest are ignored. Can be {null}, in this case
     *            arguments will be filled with empty {code String}.
     * @return the final log message where generic argument have been replaced. For instance :<br>
     *         - Log message : "Initializing {0} file.... {1}"<br>
     *         - Arguments : new String[] {"options.xml", "OK"}<br>
     *         will return "Initializing options.xml file.... OK"
     * @since 1.3.0
     */
    public static String buildLogString(final String logMessage, final String[] args) {
        assert logMessage != null : "logMessage is null";

        String result = logMessage;

        if (args == null || args.length == 0) {
            int i = 0;
            String tmp = result.replaceAll(
                    BACK_SLASH_CHAR + LEFT_BRACES_CHAR + i + BACK_SLASH_CHAR + RIGHT_BRACES_CHAR, BLANK_STRING);
            while (!tmp.equals(result)) {
                i++;
                result = tmp;
                tmp = result.replaceAll(BACK_SLASH_CHAR + LEFT_BRACES_CHAR + i + BACK_SLASH_CHAR + RIGHT_BRACES_CHAR,
                        BLANK_STRING);
            }
        } else {
            int i = 0;
            String tmp = result.replaceAll(
                    BACK_SLASH_CHAR + LEFT_BRACES_CHAR + i + BACK_SLASH_CHAR + RIGHT_BRACES_CHAR,
                    quoteReplacement(args[i]));
            while (!tmp.equals(result)) {
                i++;
                result = tmp;
                if (i >= args.length) {
                    tmp = result.replaceAll(BACK_SLASH_CHAR + LEFT_BRACES_CHAR + i + BACK_SLASH_CHAR
                            + RIGHT_BRACES_CHAR, BLANK_STRING);
                } else {
                    tmp = result.replaceAll(BACK_SLASH_CHAR + LEFT_BRACES_CHAR + i + BACK_SLASH_CHAR
                            + RIGHT_BRACES_CHAR, quoteReplacement(args[i]));
                }
            }
        }

        return result;
    }

    /**
     * Load logging properties from a resource present from the classloader of the specified class.
     *
     * @param fullResourcePath
     *            the full resource path within classloader of the specified class to load logging
     *            properties, mustn't be <code>null</code>.
     * @param clazz
     *            the {@link Class} to get the classloader from, mustn't be <code>null</code>.
     * @throws IOException
     *             if any exception occurs while reading the logging properties resource.
     * @see ClassLoader#getResourceAsStream(String)
     * @since 1.3.0
     */
    public static void readLoggerConfigurationFromResourceFromClassClassLoader(final String fullResourcePath,
            final Class < ? > clazz) throws IOException {
        readLoggerConfigurationFromResourceFromClassLoader(fullResourcePath, clazz.getClassLoader());
    }

    /**
     * Load logging properties from a resource present in the class path.
     *
     * @param fullResourcePath
     *            the full resource path within the classloader to load logging properties, mustn't
     *            be <code>null</code>.
     * @param classLoader
     *            the {@link ClassLoader} to load the resource from, mustn't be <code>null</code>.
     * @throws IOException
     *             if any exception occurs while reading the logging properties resource.
     * @see ClassLoader#getResourceAsStream(String)
     * @since 1.3.0
     */
    public static void readLoggerConfigurationFromResourceFromClassLoader(final String fullResourcePath,
            final ClassLoader classLoader) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = classLoader.getResourceAsStream(fullResourcePath);
            if (inputStream != null) {
                readLoggerConfigurationFromResourceFromInputStream(inputStream);
            } else {
                throw new IOException(buildLogString(MISSING_LOGGING_FILE_ERROR, fullResourcePath));
            }
        } finally {
            closeCloseable(inputStream, fullResourcePath);
        }
    }

    /**
     * Load logging properties from a resource present from the specified file.
     *
     * @param file
     *            the {@link File} linked to the logging properties file, mustn't be
     *            <code>null</code>.
     * @throws IOException
     *             if any exception occurs while reading the logging properties resource.
     * @since 1.3.0
     */
    public static void readLoggerConfigurationFromResourceFromFile(final File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            readLoggerConfigurationFromResourceFromInputStream(inputStream);
        } finally {
            closeCloseable(inputStream, file);
        }
    }

    /**
     * Load logging properties from a resource contained in the specified input stream.
     *
     * @param inputStream
     *            the {@link InputStream} containing the properties logging file, mustn't be
     *            <code>null</code>.
     * @throws IOException
     *             if any exception occurs while reading the logging properties input stream.
     * @since 1.3.0
     */
    public static void readLoggerConfigurationFromResourceFromInputStream(final InputStream inputStream)
            throws IOException {
        final LogManager rootLogManager = getLogManager();
        rootLogManager.readConfiguration(inputStream);
    }

    /**
     * Sets the specified log level to all log handlers.
     *
     * @param logLevel
     *            the log {@link Level} to apply, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public static void setLevelOfAllHandlers(final Level logLevel) {
        final LogManager rootLogManager = getLogManager();
        final Enumeration < String > loggerNames = rootLogManager.getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            final String loggerName = loggerNames.nextElement();
            final Logger logger = rootLogManager.getLogger(loggerName);
            setLevelOfAllHandlers(logLevel, logger.getHandlers());
        }
    }

    /**
     * Sets the specified log level to all log handlers.
     *
     * @param logLevel
     *            the log {@link Level} to apply, mustn't be <code>null</code>.
     * @param handlers
     *            the array of {@link Handler} to apply the level, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    private static void setLevelOfAllHandlers(final Level logLevel, final Handler[] handlers) {
        for (final Handler handler : handlers) {
            handler.setLevel(logLevel);
        }
    }

    /**
     * Sets the specified log level to all loggers.
     *
     * @param logLevel
     *            the log {@link Level} to apply, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public static void setLevelOfAllLoggers(final Level logLevel) {
        final LogManager rootLogManager = getLogManager();
        final Enumeration < String > loggerNames = rootLogManager.getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            final String loggerName = loggerNames.nextElement();
            final Logger logger = rootLogManager.getLogger(loggerName);
            logger.setLevel(logLevel);
        }
    }

    /**
     * Sets the specified log level to all loggers.
     *
     * @param logLevel
     *            the log {@link Level} to apply, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public static void setLevelOfAllLoggersAndHandlers(final Level logLevel) {
        final LogManager rootLogManager = getLogManager();
        final Enumeration < String > loggerNames = rootLogManager.getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            final String loggerName = loggerNames.nextElement();
            final Logger logger = rootLogManager.getLogger(loggerName);
            logger.setLevel(logLevel);
            setLevelOfAllHandlers(logLevel, logger.getHandlers());
        }
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private LogUtils() {
        super();
    }
}
