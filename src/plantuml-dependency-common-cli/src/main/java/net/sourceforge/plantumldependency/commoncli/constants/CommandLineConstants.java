/*
 CommandLineConstants.java
 Creation date : 24/03/2007
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

package net.sourceforge.plantumldependency.commoncli.constants;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * The class which stores all necessary char constants as Strings.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public final class CommandLineConstants {

    /** The string displayed to show command line examples. */
    public static final String EXAMPLES_OPTIONS_CMD = "Examples:";

    /** The {@link Set} containing all important system properties as {@link String}. */
    public static final Set < String > IMPORTANT_SYSTEM_PROPERTIES = unmodifiableSet(new TreeSet < String >(
            asList(new String[] {"java.runtime.name", "java.version", "java.vm.name", "os.name", "os.arch",
                    "os.version"})));

    /** The string displayed to show java command. */
    public static final String JAVA_JAR_CMD = "java -jar ";

    /** The string displayed to show known bugs or limitations. */
    public static final String KNOWN_BUGS_OR_LIMITATIONS_CMD = "Known bugs or program limitations:";

    /** The string displayed to show mandatory options. */
    public static final String MANDATORY_OPTIONS_CMD = "where mandatory options are:";

    /** Set of all active option status. */
    public static final Set < OptionStatus > OPTION_STATUS_ACTIVE_SET = createOptionStatusActiveSet(asList(OptionStatus
            .values()));

    /** Set of all mandatory option status. */
    public static final Set < OptionStatus > OPTION_STATUS_MANDATORY_SET = createOptionStatusMandatorySet(asList(OptionStatus
            .values()));

    /** Set of all managed option status. */
    public static final Set < OptionStatus > OPTION_STATUS_SET = unmodifiableSet(new TreeSet < OptionStatus >(
            asList(OptionStatus.values())));

    /** The string displayed to show optional options. */
    public static final String OPTIONAL_OPTIONS_CMD = "where optional options are:";

    /** The string displayed to show options main usage. */
    public static final String OPTIONS_CMD = "[OPTIONS]";

    /** The string representing the protected dot char. */
    public static final String PROTECTED_DOT_REGEXP = "\\.";

    /** The string displayed to show command line usage. */
    public static final String USAGE_CMD = "Usage:";

    /**
     * Creates the list of all option status which are considered active, meaning they have to be
     * taken in the command line when parsing it.
     *
     * @param optionStatusList
     *            the list of all {@link OptionStatus} to look for, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link OptionStatus} which are considered active.
     * @since 1.3.0
     */
    private static Set < OptionStatus > createOptionStatusActiveSet(final List < OptionStatus > optionStatusList) {
        final Set < OptionStatus > optionStatusActiveSet = new TreeSet < OptionStatus >();

        for (final OptionStatus optionStatus : optionStatusList) {
            if (optionStatus.isActive()) {
                optionStatusActiveSet.add(optionStatus);
            }
        }

        return unmodifiableSet(optionStatusActiveSet);
    }

    /**
     * Creates the list of all option status which are mandatory.
     *
     * @param optionStatusList
     *            the list of all {@link OptionStatus} to look for, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link OptionStatus} which are mandatory.
     * @since 1.3.0
     */
    private static Set < OptionStatus > createOptionStatusMandatorySet(final List < OptionStatus > optionStatusList) {
        final Set < OptionStatus > optionStatuMandatorySet = new TreeSet < OptionStatus >();

        for (final OptionStatus optionStatus : optionStatusList) {
            if (optionStatus.isMandatory()) {
                optionStatuMandatorySet.add(optionStatus);
            }
        }

        return unmodifiableSet(optionStatuMandatorySet);
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private CommandLineConstants() {
        super();
    }
}
