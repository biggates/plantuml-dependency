/*
 CommonConstants.java
 Creation date : 23/11/2009
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

package net.sourceforge.plantumldependency.common.constants;

import static java.lang.System.getProperty;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static java.util.logging.Level.CONFIG;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.FINER;
import static java.util.logging.Level.FINEST;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Level.WARNING;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

import net.sourceforge.plantumldependency.common.utils.date.UnmodifiableDate;

/**
 * The class which stores all useful constants as Strings.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public final class CommonConstants {

    /** The blank string. */
    public static final String BLANK_STRING = "";

    /** The current directory. */
    public static final File CURRENT_DIRECTORY = new File(DOT_CHAR);

    /** The first prime number used by Eclipse for implementing the hashcode() method. */
    public static final int HASHCODE_PRIME_NUMBER1 = 1231;

    /** The second prime number used by Eclipse for implementing the hashcode() method. */
    public static final int HASHCODE_PRIME_NUMBER2 = 1237;

    /** The system line separator. */
    public static final String LINE_SEPARATOR = getProperty("line.separator");

    /** The {@link Set} containing all log levels of the java logging API. */
    public static final Set < Level > LOG_LEVELS_SET = unmodifiableSet(new HashSet < Level >(asList(new Level[] {
            SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST})));

    /**
     * The -1 code which is often used when returning a method (for error, or end of file for
     * instance).
     */
    public static final int MINUS_ONE_RETURN_CODE = -1;

    /** The date which represents the current instant time (at the loading time). */
    public static final Date NOW = new UnmodifiableDate();

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private CommonConstants() {
        super();
    }
}
