/*
 SystemUtils.java
 Creation date : 16/01/2010
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

package net.sourceforge.plantumldependency.common.utils.system;

import static java.lang.System.getProperties;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.INFO;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COLON_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.log.FineConstants.SYSTEM_PROPERTY_NOT_TO_DISPLAY_FINE;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.convertObjectSetIntoStringSet;

import java.io.PrintStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class utilities simplifying some system tasks.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class SystemUtils {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(SystemUtils.class.getName());

    /**
     * Gets the string description of the system properties in order to be displayed.
     *
     * @return the {@link Set} of all {@link String} representing system properties.
     * @since 1.3.0
     */
    public static Set < String > getSystemPropertiesSetToDisplay() {
        return getSystemPropertiesSetToDisplay(convertObjectSetIntoStringSet(getProperties().keySet()));
    }

    /**
     * Gets the string description of the passed properties keys in order to be displayed.
     *
     * @param propertiesSet
     *            the {@link Set} containing system properties keys to get the string from, mustn't
     *            be <code>null</code>.
     * @return the {@link Set} of all {@link String} representing system properties.
     * @since 1.3.0
     */
    public static Set < String > getSystemPropertiesSetToDisplay(final Set < String > propertiesSet) {
        final Set < String > systemPropertiesSetToDisplay = new TreeSet < String >();

        for (final Map.Entry < Object, Object > property : getProperties().entrySet()) {
            if (propertiesSet.contains(property.getKey())) {
                final String propertyStr = property.getKey() + SPACE_CHAR + COLON_CHAR + SPACE_CHAR
                        + property.getValue();
                systemPropertiesSetToDisplay.add(propertyStr);
            } else {
                LOGGER.log(FINE, buildLogString(SYSTEM_PROPERTY_NOT_TO_DISPLAY_FINE, property));
            }
        }

        return systemPropertiesSetToDisplay;
    }

    /**
     * This method displays all system properties, operating system, java version etc... in the
     * default logger with the info level.
     *
     * @see System
     * @since 1.3.0
     */
    public static void printSystemProperties() {
        printSystemProperties(LOGGER, INFO, convertObjectSetIntoStringSet(getProperties().keySet()));
    }

    /**
     * This method displays all system properties, operating system, java version etc...
     *
     * @param logger
     *            the {@link Logger} to print the properties, info level is used, mustn't be
     *            <code>null</code>.
     * @see System
     * @since 1.3.0
     */
    public static void printSystemProperties(final Logger logger) {
        printSystemProperties(logger, INFO, convertObjectSetIntoStringSet(getProperties().keySet()));
    }

    /**
     * This method displays all system properties, operating system, java version etc...
     *
     * @param logger
     *            the {@link Logger} to print the properties, info level is used, mustn't be
     *            <code>null</code>.
     * @param level
     *            the {@link Level} to log the system properties, mustn't be <code>null</code>.
     * @param propertiesSet
     *            the {@link Set} containing system properties keys to get the string from, mustn't
     *            be <code>null</code>.
     * @see System
     * @since 1.3.0
     */
    public static void printSystemProperties(final Logger logger, final Level level, final Set < String > propertiesSet) {
        final Set < String > systemPropertiesSetToDisplay = getSystemPropertiesSetToDisplay(propertiesSet);

        for (final String propertyStr : systemPropertiesSetToDisplay) {
            logger.log(level, propertyStr);
        }
    }

    /**
     * This method displays all system properties where the keys are passed.
     *
     * @param logger
     *            the {@link Logger} to print the properties, info level is used, mustn't be
     *            <code>null</code>.
     * @param propertiesSet
     *            the {@link Set} containing system properties keys to get the string from, mustn't
     *            be <code>null</code>.
     * @see System
     * @since 1.3.0
     */
    public static void printSystemProperties(final Logger logger, final Set < String > propertiesSet) {
        printSystemProperties(logger, INFO, propertiesSet);
    }

    /**
     * This method displays all system properties, operating system, java version etc...
     *
     * @param printStream
     *            the {@link PrintStream} where to log system properties, mustn't be
     *            <code>null</code>.
     * @see System
     * @since 0.7
     */
    public static void printSystemProperties(final PrintStream printStream) {
        printSystemProperties(printStream, convertObjectSetIntoStringSet(getProperties().keySet()));
    }

    /**
     * This method displays all system properties, operating system, java version etc...
     *
     * @param printStream
     *            the {@link PrintStream} where to log system properties, mustn't be
     *            <code>null</code>.
     * @param propertiesSet
     *            the {@link Set} containing system properties keys to get the string from, mustn't
     *            be <code>null</code>.
     * @see System
     * @since 0.7
     */
    public static void printSystemProperties(final PrintStream printStream, final Set < String > propertiesSet) {
        final Set < String > systemPropertiesSetToDisplay = getSystemPropertiesSetToDisplay(propertiesSet);

        for (final String propertyStr : systemPropertiesSetToDisplay) {
            printStream.println(propertyStr);
        }
    }

    /**
     * This method displays all system properties, operating system, java version etc...
     *
     * @param propertiesSet
     *            the {@link Set} containing system properties keys to get the string from, mustn't
     *            be <code>null</code>.
     * @see System
     * @since 1.3.0
     */
    public static void printSystemProperties(final Set < String > propertiesSet) {
        printSystemProperties(LOGGER, INFO, propertiesSet);
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private SystemUtils() {
        super();
    }
}
