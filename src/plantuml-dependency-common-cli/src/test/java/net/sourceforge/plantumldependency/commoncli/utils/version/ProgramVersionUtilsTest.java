/*
 ProgramVersionUtilsTest.java
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

import static net.sourceforge.plantumldependency.common.constants.CommonFileConstants.PROPERTIES_EXTENSION;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.PROTECTED_DOT_REGEXP;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.BUILD_TIMESTAMP_FORMAT_PROPERTY;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.BUILD_TIMESTAMP_PROPERTY;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.VERSION_PROPERTY;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromProperties;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFile;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFileInputStream;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFileWithinClassClassloader;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFileWithinSystemClassloader;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFileWithinThreadClassloader;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromString;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromStringAndDate;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;

import net.sourceforge.plantumldependency.commoncli.exception.MissingPropertyException;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;
import net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test classes for {@link ProgramVersionUtils}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ProgramVersionUtilsTest {

    /** The string representing the properties test file 0 full path. */
    private static final String PROPERTIES_FILE_PATH0 = "classloaderVersionTest" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 1 full path. */
    private static final String PROPERTIES_FILE_PATH1 = "x" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 2 full path. */
    private static final String PROPERTIES_FILE_PATH2 = "versionTest1" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 3 full path. */
    private static final String PROPERTIES_FILE_PATH3 = "versionTest2" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 4 full path. */
    private static final String PROPERTIES_FILE_PATH4 = "versionTest3" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 5 full path. */
    private static final String PROPERTIES_FILE_PATH5 = "versionTest4" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 6 full path. */
    private static final String PROPERTIES_FILE_PATH6 = "versionTest5" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 7 full path. */
    private static final String PROPERTIES_FILE_PATH7 = "versionTest6" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 8 full path. */
    private static final String PROPERTIES_FILE_PATH8 = "versionTest7" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 9 full path. */
    private static final String PROPERTIES_FILE_PATH9 = "versionTest8" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 10 full path. */
    private static final String PROPERTIES_FILE_PATH10 = "versionTest9" + PROPERTIES_EXTENSION;

    /** The string representing the properties test file 11 full path. */
    private static final String PROPERTIES_FILE_PATH11 = "versionTest10" + PROPERTIES_EXTENSION;

    /** The test properties representing. */
    private static final Properties PROPERTIES_TEST = createTestProperties();

    /**
     * Create a correct test properties instance.
     *
     * @return a correct test properties instance.
     * @since 1.1.1
     */
    private static Properties createTestProperties() {
        final Properties properties = new Properties();
        properties.setProperty(BUILD_TIMESTAMP_PROPERTY, "20110101-173145 CET");
        properties.setProperty(BUILD_TIMESTAMP_FORMAT_PROPERTY, "yyyyMMdd-HHmmss z");
        properties.setProperty(VERSION_PROPERTY, "2.4.2-SNAPSHOT");
        return properties;
    }

    /**
     * This method is called before each test to reset the level series temporary XML file content.
     *
     * @since 1.1.1
     */
    @Before
    public void initializePropertiesFile() {
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH2);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH3);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z",
                PROPERTIES_FILE_PATH4);
        writeIntoFile(
                "java.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH5);
        writeIntoFile(
                "version=2.4.f-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH6);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=toto\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH7);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=173145-20110101 CET",
                PROPERTIES_FILE_PATH8);
        writeIntoFile(
                "version=\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH9);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=\r\nbuild.timestamp=20110101-173145 CET",
                PROPERTIES_FILE_PATH10);
        writeIntoFile(
                "version=2.4.2-SNAPSHOT\r\njava.version=1.6.0_24\r\nproject.build.sourceEncoding=UTF-8\r\nmaven.build.timestamp.format=yyyyMMdd-HHmmss z\r\nbuild.timestamp=",
                PROPERTIES_FILE_PATH11);
    }

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.1.1
     */
    @After
    public void removeLevelSeriesTestFile() {
        final File propertiesTestFile1 = new File(PROPERTIES_FILE_PATH2);
        propertiesTestFile1.delete();
        final File propertiesTestFile2 = new File(PROPERTIES_FILE_PATH3);
        propertiesTestFile2.delete();
        final File propertiesTestFile3 = new File(PROPERTIES_FILE_PATH4);
        propertiesTestFile3.delete();
        final File propertiesTestFile4 = new File(PROPERTIES_FILE_PATH5);
        propertiesTestFile4.delete();
        final File propertiesTestFile5 = new File(PROPERTIES_FILE_PATH6);
        propertiesTestFile5.delete();
        final File propertiesTestFile6 = new File(PROPERTIES_FILE_PATH7);
        propertiesTestFile6.delete();
        final File propertiesTestFile7 = new File(PROPERTIES_FILE_PATH8);
        propertiesTestFile7.delete();
        final File propertiesTestFile8 = new File(PROPERTIES_FILE_PATH9);
        propertiesTestFile8.delete();
        final File propertiesTestFile9 = new File(PROPERTIES_FILE_PATH10);
        propertiesTestFile9.delete();
        final File propertiesTestFile10 = new File(PROPERTIES_FILE_PATH11);
        propertiesTestFile10.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromProperties(java.util.Properties)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateProgramVersionFromPropertiesFileInputStreamNull() throws IOException, ParseException,
            MissingPropertyException {
        createProgramVersionFromPropertiesFileInputStream(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesFileNull() throws IOException, ParseException,
            MissingPropertyException {
        createProgramVersionFromPropertiesFile(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromPropertiesFileWithBadBuildStampFormatProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH7);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromPropertiesFileWithBadVersionProperty() throws IOException, ParseException,
            MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH6);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromPropertiesFileWithBuildStampNotMatchingFormatProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH8);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test
    public void testCreateProgramVersionFromPropertiesFileWithCorrectExistingFile() throws IOException, ParseException,
            MissingPropertyException {
        final ProgramVersion programVersion = createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH2);
        assertEquals(new ProgramVersionImpl(2, 4, 2, new Date(1293899505000L), true), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithEmptyBuildStampFormatProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH10);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithEmptyBuildStampProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH11);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithEmptyVersionProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH9);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFileWithinClassClassloader(String, Class)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesFileWithinClassClassloaderNull() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFileWithinClassClassloader(null, null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFileWithinSystemClassloader(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesFileWithinSystemClassloaderNull() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFileWithinSystemClassloader(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFileWithinSystemClassloader(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test
    public void testCreateProgramVersionFromPropertiesFileWithinSystemClassloaderWithCorrectExistingFile()
            throws IOException, ParseException, MissingPropertyException {
        final ProgramVersion programVersion = createProgramVersionFromPropertiesFileWithinSystemClassloader(PROPERTIES_FILE_PATH0);
        assertEquals(new ProgramVersionImpl(1, 0, 2, new Date(1307791567000L)), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFileWithinSystemClassloader(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = IOException.class)
    public void testCreateProgramVersionFromPropertiesFileWithinSystemClassloaderWithNotExistingFile()
            throws ParseException, IOException, MissingPropertyException {
        createProgramVersionFromPropertiesFileWithinSystemClassloader(PROPERTIES_FILE_PATH1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFileWithinThreadClassloader(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesFileWithinThreadClassloaderNull() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFileWithinThreadClassloader(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithMissingBuildStampFormatProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH3);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithMissingBuildStampProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH4);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = MissingPropertyException.class)
    public void testCreateProgramVersionFromPropertiesFileWithMissingVersionProperty() throws IOException,
            ParseException, MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH5);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromPropertiesFile(java.lang.String)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = IOException.class)
    public void testCreateProgramVersionFromPropertiesFileWithNotExistingFile() throws ParseException, IOException,
            MissingPropertyException {
        createProgramVersionFromPropertiesFile(PROPERTIES_FILE_PATH1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromProperties(java.util.Properties)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesNull() throws IOException, ParseException,
            MissingPropertyException {
        createProgramVersionFromProperties(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromProperties(java.util.Properties)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test
    public void testCreateProgramVersionFromPropertiesWithCorrectProperties() throws IOException, ParseException,
            MissingPropertyException {
        final ProgramVersion programVersion = createProgramVersionFromProperties(PROPERTIES_TEST);
        assertEquals(new ProgramVersionImpl(2, 4, 2, new Date(1293899505000L), true), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromProperties(java.util.Properties)}
     * .
     *
     * @throws MissingPropertyException
     * @throws ParseException
     * @throws IOException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromPropertiesWithNullSeparator() throws IOException, ParseException,
            MissingPropertyException {
        createProgramVersionFromProperties(PROPERTIES_TEST, null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromString(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
     * .
     *
     * @throws ParseException
     */
    @Test
    public void testCreateProgramVersionFromString() throws ParseException {
        final ProgramVersion programVersion = createProgramVersionFromString("1.0.0", PROTECTED_DOT_REGEXP,
                "20131027-1915", "yyyyMMdd-HHmm");
        assertEquals(new ProgramVersionImpl(1, 0, 0, new Date(1382897700000L), false), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test
    public void testCreateProgramVersionFromStringAndDate() throws ParseException {
        final Date now = new Date();
        final ProgramVersion programVersion = createProgramVersionFromStringAndDate("1.0.0", PROTECTED_DOT_REGEXP, now);
        assertEquals(new ProgramVersionImpl(1, 0, 0, now), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromStringAndDateWithBadSeparator() throws ParseException {
        createProgramVersionFromStringAndDate("1-0-0", PROTECTED_DOT_REGEXP, new Date());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test
    public void testCreateProgramVersionFromStringAndDateWithComplexSeparator() throws ParseException {
        final Date now = new Date();
        final ProgramVersion programVersion = createProgramVersionFromStringAndDate("1812---2089---56", "---", now);
        assertEquals(new ProgramVersionImpl(1812, 2089, 56, now), programVersion);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromStringAndDateWithEmptySeparator() throws ParseException {
        createProgramVersionFromStringAndDate("1-0-0", null, new Date());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .VersionFromStringWithComp
     *
     * @throws ParseException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromStringAndDateWithEmptyString() throws ParseException {
        createProgramVersionFromStringAndDate(null, PROTECTED_DOT_REGEXP, new Date());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromStringAndDateWithLetters() throws ParseException {
        createProgramVersionFromStringAndDate("a-b-c", "-", new Date());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromStringAndDate(java.lang.String, java.lang.String, java.util.Date)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = ParseException.class)
    public void testCreateProgramVersionFromStringAndDateWithMoreNumbers() throws ParseException {
        createProgramVersionFromStringAndDate("1-0-0-0", "-", new Date());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromString(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromStringWithEmptyDate() throws ParseException {
        createProgramVersionFromString("1.0.0", ".", "", "yyyyMMdd-HHmmss z");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils#createProgramVersionFromString(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
     * .
     *
     * @throws ParseException
     */
    @Test(expected = NullPointerException.class)
    public void testCreateProgramVersionFromStringWithEmptyDatePattern() throws ParseException {
        createProgramVersionFromString("1.0.0", ".", "20120120-232210 GMT", "");
    }
}
