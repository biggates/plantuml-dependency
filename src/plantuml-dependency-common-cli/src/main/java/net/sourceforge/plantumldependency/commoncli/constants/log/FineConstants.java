/*
 FineConstants.java
 Creation date : 30/10/2010
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

package net.sourceforge.plantumldependency.commoncli.constants.log;

/**
 * The class which defines all fine messages constants which are only written in the log file. The
 * messages also contains the fine code.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public final class FineConstants {

    /** The analyzing command line fine message. */
    public static final String ANALYSING_COMMAND_LINE_FINE = "[fine-plantuml-dependency-commoncli-001] : Analyzing command line \"{0}\"";

    /** The directory argument specified fine message. */
    public static final String DIRECTORY_ARGUMENT_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-002] : Directory \"{0}\" has been specified";

    /** The file argument specified fine message. */
    public static final String FILE_ARGUMENT_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-003] : File \"{0}\" has been specified";

    /** The file argument not specified fine message. */
    public static final String FILE_ARGUMENT_NOT_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-004] : File \"{0}\" not specified";

    /** The option specified fine message. */
    public static final String OPTION_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-005] : Option \"{0}\" has been specified";

    /** The no command line arguments fine message. */
    public static final String NO_COMMAND_LINE_ARGUMENTS_FINE = "[fine-plantuml-dependency-commoncli-006] : No command line arguments have been specified";

    /** The no example command lines fine message. */
    public static final String NO_COMMAND_LINE_EXAMPLES_FINE = "[fine-plantuml-dependency-commoncli-007] : The program doesn't have an example command lines";

    /** The no known bugs or limitations fine message. */
    public static final String NO_KNOWN_BUGS_OR_LIMITATIONS_FINE = "[fine-plantuml-dependency-commoncli-008] : The program doesn't have any known bugs nor limitations";

    /** The no mandatory options fine message. */
    public static final String NO_MANDATORY_OPTIONS_FINE = "[fine-plantuml-dependency-commoncli-009] : The program doesn't have any mandatory options";

    /** The no optional options fine message. */
    public static final String NO_OPTIONAL_OPTIONS_FINE = "[fine-plantuml-dependency-commoncli-010] : The program doesn't have any optional options";

    /** The option not specified fine message. */
    public static final String OPTION_NOT_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-012] : Option \"{0}\" is not specified, it won't be executed";

    /** The property specified info message. */
    public static final String PROPERTY_SPECIFIED_FINE = "[info-mazix-cli-013] : The property \"{0}\" has been specified in the property file, its value is \"{0}\"";

    /** The skipping argument fine message. */
    public static final String SKIPPING_ARGUMENT_FINE = "[fine-plantuml-dependency-commoncli-014] : Command line argument \"{0}\" does not match with the option \"{1}\"... skipping argument";

    /** The snapshot version specified info message. */
    public static final String SNAPSHOT_VERSION_SPECIFIED_FINE = "[fine-plantuml-dependency-commoncli-015] : A snapshot version has been specified in the string \"{0}\"";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private FineConstants() {
        super();
    }
}
