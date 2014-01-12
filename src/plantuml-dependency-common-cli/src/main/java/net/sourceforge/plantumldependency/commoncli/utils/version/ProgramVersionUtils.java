/*
 ProgramVersionUtils.java
 Creation date : 18/11/2010
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

package net.sourceforge.plantumldependency.commoncli.utils.version;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.Thread.currentThread;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.MINUS_ONE_RETURN_CODE;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNullOrEmpty;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.closeCloseable;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.PROTECTED_DOT_REGEXP;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.DATE_FORMAT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.MISSING_PROPERTY_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.MISSING_PROPERTY_FILE_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_VERSION_PARSING2_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_VERSION_PARSING_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.PROPERTY_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.SNAPSHOT_VERSION_SPECIFIED_FINE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.exception.MissingPropertyException;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;
import net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl;

/**
 * The class utilities simplifying some {@link ProgramVersion} tasks.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class ProgramVersionUtils {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(ProgramVersionUtils.class.getName());

    /** Build time stamp property constant. */
    public static final String BUILD_TIMESTAMP_PROPERTY = "build.timestamp";

    /** Build time stamp format property constant. */
    public static final String BUILD_TIMESTAMP_FORMAT_PROPERTY = "maven.build.timestamp.format";

    /** Version property constant. */
    public static final String VERSION_PROPERTY = "version";

    /** The string representing a snapshot version. */
    public static final String SNAPSHOT_VERSION = "-SNAPSHOT";

    /**
     * The integer representing the number of digit expected while parsing a program version string.
     */
    private static final int VERSION_NUMBER = 3;

    /**
     * Creates a {@link ProgramVersion} instance from a properties {@link Properties}.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param properties
     *            the properties {@link Properties} instance to read the program version from,
     *            mustn't be <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromProperties(final Properties properties) throws ParseException,
            MissingPropertyException {
        return createProgramVersionFromProperties(properties, PROTECTED_DOT_REGEXP);
    }

    /**
     * Creates a {@link ProgramVersion} instance from a properties {@link Properties}.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param properties
     *            the properties {@link Properties} instance to read the program version from,
     *            mustn't be <code>null</code>.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the
     *            {@link ProgramVersionUtils#VERSION_PROPERTY} property, mustn't be
     *            <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromProperties(final Properties properties,
            final String versionSeparatorRegexp) throws ParseException, MissingPropertyException {
        checkNull(properties, buildLogString(EMPTY_ARGUMENT_ERROR, "properties"));
        checkNullOrEmpty(versionSeparatorRegexp, buildLogString(EMPTY_ARGUMENT_ERROR, "versionSeparatorRegexp"));

        ProgramVersion programVersion = null;

        final String buildTimestamp = getPropertyValue(properties, BUILD_TIMESTAMP_PROPERTY);
        final String buildTimestampFormat = getPropertyValue(properties, BUILD_TIMESTAMP_FORMAT_PROPERTY);

        try {
            final DateFormat dateFormat = new SimpleDateFormat(buildTimestampFormat);
            final Date buildDate = dateFormat.parse(buildTimestamp);

            final String version = getPropertyValue(properties, VERSION_PROPERTY);
            programVersion = createProgramVersionFromStringAndDate(version, versionSeparatorRegexp, buildDate);
        } catch (final IllegalArgumentException e) {
            LOGGER.log(SEVERE, buildLogString(DATE_FORMAT_ERROR, buildTimestampFormat), e);
            throw new ParseException(buildLogString(DATE_FORMAT_ERROR, buildTimestampFormat), MINUS_ONE_RETURN_CODE);
        } catch (final ParseException e) {
            LOGGER.log(SEVERE, buildLogString(DATE_FORMAT_ERROR, buildTimestampFormat), e);
            throw new ParseException(buildLogString(DATE_FORMAT_ERROR, buildTimestampFormat), MINUS_ONE_RETURN_CODE);
        }

        return programVersion;
    }

    /**
     * Creates a {@link ProgramVersion} instance from a file properties path.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path following the current OS of the property file, mustn't be
     *            <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFile(final String propertiesFullPath)
            throws IOException, ParseException, MissingPropertyException {
        return createProgramVersionFromPropertiesFile(propertiesFullPath, PROTECTED_DOT_REGEXP);
    }

    /**
     * Creates a {@link ProgramVersion} instance from a file properties path.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path following the current OS of the property file, mustn't be
     *            <code>null</code>.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the
     *            {@link ProgramVersionUtils#VERSION_PROPERTY} property, mustn't be
     *            <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFile(final String propertiesFullPath,
            final String versionSeparatorRegexp) throws IOException, ParseException, MissingPropertyException {
        checkNullOrEmpty(propertiesFullPath, buildLogString(EMPTY_ARGUMENT_ERROR, "propertiesFullPath"));
        checkNullOrEmpty(versionSeparatorRegexp, buildLogString(EMPTY_ARGUMENT_ERROR, "versionSeparatorRegexp"));

        ProgramVersion programVersion = null;

        InputStream inputStream = null;
        try {
            final File propertyFile = new File(propertiesFullPath);
            inputStream = new FileInputStream(propertyFile);
            programVersion = createProgramVersionFromPropertiesFileInputStream(inputStream, versionSeparatorRegexp);
        } finally {
            closeCloseable(inputStream, propertiesFullPath);
        }

        return programVersion;
    }

    /**
     * Creates a {@link ProgramVersion} instance from an {@link InputStream} which must be a
     * property file.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFileInputStream
     *            the {@link InputStream} instance to read the program version properties from,
     *            mustn't be <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileInputStream(
            final InputStream propertiesFileInputStream) throws IOException, ParseException, MissingPropertyException {
        return createProgramVersionFromPropertiesFileInputStream(propertiesFileInputStream, PROTECTED_DOT_REGEXP);
    }

    /**
     * Creates a {@link ProgramVersion} instance from an {@link InputStream} which must be a
     * property file.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFileInputStream
     *            the {@link InputStream} instance to read the program version properties from,
     *            mustn't be <code>null</code>.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the
     *            {@link ProgramVersionUtils#VERSION_PROPERTY} property, mustn't be
     *            <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileInputStream(
            final InputStream propertiesFileInputStream, final String versionSeparatorRegexp) throws IOException,
            ParseException, MissingPropertyException {
        ProgramVersion programVersion = null;

        if (propertiesFileInputStream != null) {
            final Properties properties = new Properties();
            properties.load(propertiesFileInputStream);
            programVersion = createProgramVersionFromProperties(properties, versionSeparatorRegexp);
        } else {
            throw new IllegalArgumentException(buildLogString(EMPTY_ARGUMENT_ERROR, "propertiesFileInputStream"));
        }

        return programVersion;
    }

    /**
     * Creates a {@link ProgramVersion} instance from a properties path which can be read by the
     * specified class classloader.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path of the property file within the specified class classloader.
     * @param clazz
     *            the {@link Class} to get the classloader from, mustn't be <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileWithinClassClassloader(
            final String propertiesFullPath, final Class < ? > clazz) throws IOException, ParseException,
            MissingPropertyException {
        return createProgramVersionFromPropertiesFileWithinClassloader(propertiesFullPath, PROTECTED_DOT_REGEXP,
                clazz.getClassLoader());
    }

    /**
     * Creates a {@link ProgramVersion} instance from a properties path which can be read by the
     * classloader.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path of the property file within the classloader.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the
     *            {@link ProgramVersionUtils#VERSION_PROPERTY} property, mustn't be
     *            <code>null</code>.
     * @param classloader
     *            the {@link ClassLoader} to load the resource from, mustn't be <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileWithinClassloader(
            final String propertiesFullPath, final String versionSeparatorRegexp, final ClassLoader classloader)
            throws IOException, ParseException, MissingPropertyException {
        checkNullOrEmpty(propertiesFullPath, buildLogString(EMPTY_ARGUMENT_ERROR, "propertiesFullPath"));
        checkNullOrEmpty(versionSeparatorRegexp, buildLogString(EMPTY_ARGUMENT_ERROR, "versionSeparatorRegexp"));
        checkNull(classloader, buildLogString(EMPTY_ARGUMENT_ERROR, "classloader"));

        ProgramVersion programVersion = null;

        InputStream inputStream = null;
        try {
            inputStream = classloader.getResourceAsStream(propertiesFullPath);
            if (inputStream != null) {
                programVersion = createProgramVersionFromPropertiesFileInputStream(inputStream, versionSeparatorRegexp);
            } else {
                throw new IOException(buildLogString(MISSING_PROPERTY_FILE_ERROR, propertiesFullPath));
            }
        } finally {
            closeCloseable(inputStream, propertiesFullPath);
        }

        return programVersion;
    }

    /**
     * Creates a {@link ProgramVersion} instance from a properties path which can be read by the
     * system classloader.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path of the property file within the system classloader.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileWithinSystemClassloader(
            final String propertiesFullPath) throws IOException, ParseException, MissingPropertyException {
        return createProgramVersionFromPropertiesFileWithinClassloader(propertiesFullPath, PROTECTED_DOT_REGEXP,
                getSystemClassLoader());
    }

    /**
     * Creates a {@link ProgramVersion} instance from a properties path which can be read by the
     * thread classloader.
     * <p>
     * The following properties must exist in the properties in order to correctly create the
     * {@link ProgramVersion} instance :<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_PROPERTY}</i> where the value should have a
     * form matching the build time stamp format property value.<br>
     * <i>{@link ProgramVersionUtils#BUILD_TIMESTAMP_FORMAT_PROPERTY}</i> where the value should
     * have a form matching the {@link java.text.DateFormat}.<br>
     * <i>{@link ProgramVersionUtils#VERSION_PROPERTY} where the value should have a form matching
     * "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     * "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.</i>
     * </p>
     *
     * @param propertiesFullPath
     *            the full path of the property file within the thread classloader.
     * @return the {@link ProgramVersion} instance created from the property file attributes.
     * @throws IOException
     *             if any occurs when reading the property file.
     * @throws ParseException
     *             if a property value can't be parsed.
     * @throws MissingPropertyException
     *             if one of the three needed property is missing.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromPropertiesFileWithinThreadClassloader(
            final String propertiesFullPath) throws IOException, ParseException, MissingPropertyException {
        return createProgramVersionFromPropertiesFileWithinClassloader(propertiesFullPath, PROTECTED_DOT_REGEXP,
                currentThread().getContextClassLoader());
    }

    /**
     * Creates a {@link ProgramVersion} instance from a {@link String}.
     *
     * @param programVersionString
     *            the program version as a {@link String} to parse, mustn't be <code>null</code> nor
     *            empty. Must have the form of "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)"
     *            or "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the <code>programVersionString</code>
     *            , mustn't be <code>null</code>.
     * @param programVersionDate
     *            the compilation date version to pass to the {@link ProgramVersion} instance as a
     *            {@link String}.
     * @param programVersionDatePattern
     *            the program version date pattern to read the <code>programVersionDate</code>
     *            parameter, mustn't be <code>null</code>.
     * @return the {@link ProgramVersion} instance created from the string.
     * @throws ParseException
     *             if any exception occurs while reading or parsing the input string.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromString(final String programVersionString,
            final String versionSeparatorRegexp, final String programVersionDate, final String programVersionDatePattern)
            throws ParseException {
        checkNullOrEmpty(programVersionDate, buildLogString(EMPTY_ARGUMENT_ERROR, "programVersionDate"));
        checkNullOrEmpty(programVersionDatePattern, buildLogString(EMPTY_ARGUMENT_ERROR, "programVersionDatePattern"));

        final DateFormat dateFormat = new SimpleDateFormat(programVersionDatePattern);
        final Date buildDate = dateFormat.parse(programVersionDate);

        return createProgramVersionFromStringAndDate(programVersionString, versionSeparatorRegexp, buildDate);
    }

    /**
     * Creates a {@link ProgramVersion} instance from a {@link String}.
     *
     * @param programVersionString
     *            the program version as a {@link String} to parse, mustn't be <code>null</code> nor
     *            empty. Must have the form of "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)"
     *            or "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the <code>programVersionString</code>
     *            , mustn't be <code>null</code>.
     * @param programVersionDate
     *            the compilation date version to pass to the {@link ProgramVersion} instance.
     * @return the {@link ProgramVersion} instance created from the string.
     * @throws ParseException
     *             if any exception occurs while reading or parsing the input string.
     * @since 1.3.0
     */
    public static ProgramVersion createProgramVersionFromStringAndDate(final String programVersionString,
            final String versionSeparatorRegexp, final Date programVersionDate) throws ParseException {
        checkNullOrEmpty(programVersionString, buildLogString(EMPTY_ARGUMENT_ERROR, "programVersionString"));
        checkNullOrEmpty(versionSeparatorRegexp, buildLogString(EMPTY_ARGUMENT_ERROR, "versionSeparatorRegexp"));

        final String version = removeSnapshot(programVersionString);

        final boolean isSnapshot = !version.equals(programVersionString);
        return createProgramVersionFromStringDateAndSnapshot(programVersionDate, version, versionSeparatorRegexp,
                isSnapshot);
    }

    /**
     * Creates a {@link ProgramVersion} instance from a {@link String}, a {@link Date} and a
     * snapshot parameter.
     *
     * @param programVersionDate
     *            the program version {@link Date}, mustn't be <code>null</code>
     * @param programVersionString
     *            the program version as a {@link String} to parse, mustn't be <code>null</code> nor
     *            empty. Must have the form of "majorNumber.minorNumber.revisionNumber" or
     *            "majorNumber-minorNumber-revisionNumber", following the separator.
     * @param versionSeparatorRegexp
     *            the version separator to be used for parsing the <code>programVersionString</code>
     *            , mustn't be <code>null</code>.
     * @param isSnapshot
     *            the <code>boolean</code> telling if the program version is a snapshot.
     * @return the {@link ProgramVersion} instance created from the string and the passed parameter.
     * @throws ParseException
     *             if any exception occurs while reading or parsing the input string.
     * @since 1.3.0
     */
    private static ProgramVersion createProgramVersionFromStringDateAndSnapshot(final Date programVersionDate,
            final String programVersionString, final String versionSeparatorRegexp, final boolean isSnapshot)
            throws ParseException {
        ProgramVersion programVersion = null;

        final String[] versionNumbers = programVersionString.split(versionSeparatorRegexp);
        if (versionNumbers.length == VERSION_NUMBER) {
            try {
                final Integer majorVersionNumber = Integer.valueOf(versionNumbers[0]);
                final Integer minorVersionNumber = Integer.valueOf(versionNumbers[1]);
                final Integer revisionVersionNumber = Integer.valueOf(versionNumbers[2]);
                programVersion = new ProgramVersionImpl(majorVersionNumber.intValue(), minorVersionNumber.intValue(),
                        revisionVersionNumber.intValue(), programVersionDate, isSnapshot);
            } catch (final NumberFormatException e) {
                throw new ParseException(buildLogString(PROGRAM_VERSION_PARSING_ERROR, e.getMessage()), 0);
            }
        } else {
            throw new ParseException(PROGRAM_VERSION_PARSING2_ERROR, 0);
        }
        return programVersion;
    }

    /**
     * Gets the value of the property key in the properties instance, and throw an exception if not
     * found.
     *
     * @param properties
     *            the {@link Properties} instance where to look into, mustn't be <code>null</code>.
     * @param propertyKey
     *            the property key to look for, mustn't be empty.
     * @return the value matching the <code>propertyKey</code> if found.
     * @throws MissingPropertyException
     *             if the property value can't be found within the <code>properties</code> instance.
     * @since 1.3.0
     */
    private static String getPropertyValue(final Properties properties, final String propertyKey)
            throws MissingPropertyException {
        final String propertyValue = (String) properties.get(propertyKey);
        if (isNotEmpty(propertyValue)) {
            LOGGER.log(FINE, buildLogString(PROPERTY_SPECIFIED_FINE, new String[] {propertyKey, propertyValue}));
        } else {
            throw new MissingPropertyException(buildLogString(MISSING_PROPERTY_ERROR, propertyKey));
        }

        return propertyValue;
    }

    /**
     * Remove the {@link ProgramVersionUtils#SNAPSHOT_VERSION} from the program version string if
     * found.
     *
     * @param programVersionString
     *            the program version string to parse, with a form matching
     *            "majorNumber.minorNumber.revisionNumber(-SNAPSHOT)" or
     *            "majorNumber-minorNumber-revisionNumber(-SNAPSHOT)", following the separator, can
     *            be <code>null</code> of empty.
     * @return the program version string without the {@link ProgramVersionUtils#SNAPSHOT_VERSION}
     *         substring, if found, or the same <code>programVersionString</code> if not found.
     * @since 1.3.0
     */
    private static String removeSnapshot(final String programVersionString) {
        String programVersion = programVersionString;
        final int snapshotIndex = programVersionString.indexOf(SNAPSHOT_VERSION);
        if (snapshotIndex != MINUS_ONE_RETURN_CODE) {
            programVersion = programVersionString.substring(0, snapshotIndex);
        } else {
            LOGGER.log(FINE, buildLogString(SNAPSHOT_VERSION_SPECIFIED_FINE, programVersionString));
        }

        return programVersion;
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private ProgramVersionUtils() {
        super();
    }
}
