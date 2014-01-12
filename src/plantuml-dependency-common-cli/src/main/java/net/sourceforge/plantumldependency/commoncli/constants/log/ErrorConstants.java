/*
 ErrorConstants.java
 Creation date : 2/07/2010
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
 * The class which defines all error messages constants which are written in the log file. The
 * messages also contains the error code.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public final class ErrorConstants {

    /** The argument not found but mandatory error message. */
    public static final String ARGUMENT_NOT_FOUND_BUT_MANDATORY_ERROR = "[error-mazix-cli-000] : Argument of the option \"{0}\" not found but mandatory";

    /** The command line arguments null error message. */
    public static final String COMMAND_LINE_ARGUMENTS_NULL_ERROR = "[error-mazix-cli-001] : The command line arguments are null";

    /** The command line null error message. */
    public static final String COMMAND_LINE_NULL_ERROR = "[error-mazix-cli-002] : The command line is null";

    /** The compilation time null error message. */
    public static final String COMPILATION_TIME_NULL_ERROR = "[error-mazix-cli-003] : The program compilation time is null";

    /** The duplicate options error message. */
    public static final String DATE_FORMAT_ERROR = "[error-mazix-cli-004] : The date format pattern \"{0}\" is invalid";

    /** The duplicate options error message. */
    public static final String DUPLICATE_OPTION_ERROR = "[error-mazix-cli-005] : The following option has been found several times in the command line : \"{0}\"";

    /** The duplicate option name error message. */
    public static final String DUPLICATE_OPTION_NAME_ERROR = "[error-mazix-cli-006] : Duplicate option name \"{0}\" have been found";

    /** The duplicate option priority error message. */
    public static final String DUPLICATE_OPTION_PRIORITY_ERROR = "[error-mazix-cli-007] : Duplicate option priority \"{0}\" have been found";

    /** The empty argument error message. */
    public static final String EMPTY_ARGUMENT_ERROR = "[error-mazix-cli-008] : \"{0}\" argument is empty";

    /** The empty argument error message. */
    public static final String EMPTY_OPTION_ARGUMENT_ERROR = "[error-mazix-cli-009] : Can't parse option argument, it is empty";

    /** The existing file argument error message. */
    public static final String EXISTING_FILE_ARGUMENT_ERROR = "[error-mazix-cli-010] : Can't parse option argument \"{0}\", it must be a non existing file and mustn't be a directory";

    /** The full usage description null error message. */
    public static final String FULL_USAGE_DESCRIPTION_NULL_ERROR = "[error-mazix-cli-011] : The full usage description is null";

    /** The full usage examples null error message. */
    public static final String FULL_USAGE_EXAMPLES_NULL_ERROR = "[error-mazix-cli-012] : The full usage examples is null";

    /** The integer out of range error message. */
    public static final String INTEGER_OUT_OF_RANGE_ARGUMENT_ERROR = "[error-mazix-cli-013] : Can't parse option argument \"{0}\", it must be an integer between \"{1}\" and \"{2}\"";

    /** The java program null error message. */
    public static final String JAVA_PROGRAM_NULL_ERROR = "[error-mazix-cli-014] : The java program is null";

    /** The known bug or limitation null or empty error message. */
    public static final String KNOWN_BUG_OR_LIMITATION_NULL_ERROR = "[error-mazix-cli-015] : The known bug or limitation is null or empty";

    /** The mandatory option error message. */
    public static final String MANDATORY_OPTION_ERROR = "[error-mazix-cli-016] : The option \"{0}\" is missing, it is mandatory to specify it";

    /** The mandatory options null error message. */
    public static final String MANDATORY_OPTIONS_NULL_ERROR = "[error-mazix-cli-017] : The mandatory options are null";

    /** The missing property error message. */
    public static final String MISSING_PROPERTY_ERROR = "[error-mazix-cli-018] : The property \"{0}\" is missing in the property file";

    /** The missing property file error message. */
    public static final String MISSING_PROPERTY_FILE_ERROR = "[error-mazix-cli-019] : The property file \"{0}\" can't be found";

    /** The no option executions error message. */
    public static final String NO_OPTION_EXECUTIONS_ERROR = "[error-mazix-cli-020] : No option executions have been found, nothing to execute, nothing to do";

    /** The not existing file argument error message. */
    public static final String NON_DIRECTORY_FILE_ARGUMENT_ERROR = "[error-mazix-cli-021] : Can't parse option argument \"{0}\", it mustn't be a directory";

    /** The non existing file argument error message. */
    public static final String NON_EXISTING_FILE_ARGUMENT_ERROR = "[error-mazix-cli-022] : Can't parse option argument \"{0}\", it must be an existing file";

    /** The not boolean argument error message. */
    public static final String NOT_BOOLEAN_ARGUMENT_ERROR = "[error-mazix-cli-023] : Can't parse option argument \"{0}\", it isn't a boolean";

    /** The not existing directory argument error message. */
    public static final String NOT_EXISTING_DIRECTORY_ARGUMENT_ERROR = "[error-mazix-cli-024] : Can't parse option argument \"{0}\", it isn't an existing directory";

    /** The not integer argument error message. */
    public static final String NOT_INTEGER_ARGUMENT_ERROR = "[error-mazix-cli-025] : Can't parse option argument \"{0}\", it must be an integer";

    /** The not level argument error message. */
    public static final String NOT_LEVEL_ARGUMENT_ERROR = "[error-mazix-cli-026] : Can't parse option argument \"{0}\", it must be a valid verbose level";

    /** The not level argument error message. */
    public static final String NOT_LOG_LEVEL_ARGUMENT_ERROR = "[error-mazix-cli-027] : Can't parse option argument \"{0}\", it must be a valid log level";

    /** The not positive version number error message. */
    public static final String NOT_POSITIVE_VERSION_NUMBER_ERROR = "[error-mazix-cli-028] : The program version number \"{0}\" must be positive";

    /** The option argument null error message. */
    public static final String OPTION_ARGUMENT_NULL_ERROR = "[error-mazix-cli-029] : The option argument is null";

    /** The option argument separator null error message. */
    public static final String OPTION_ARGUMENT_SEPARATOR_NULL_ERROR = "[error-mazix-cli-030] : The option argument separator is null";

    /** The option executions null error message. */
    public static final String OPTION_EXECUTIONS_NULL_ERROR = "[error-mazix-cli-031] : The option executions are null";

    /** The option name null error message. */
    public static final String OPTION_NAME_NULL_ERROR = "[error-mazix-cli-032] : The option name is null";

    /** The option null error message. */
    public static final String OPTION_NULL_ERROR = "[error-mazix-cli-033] : The option is null";

    /** The option secondary names null error message. */
    public static final String OPTION_SECONDARY_NAMES_NULL_ERROR = "[error-mazix-cli-034] : The option secondary names are null";

    /** The option status null error message. */
    public static final String OPTION_STATUS_NULL_ERROR = "[error-mazix-cli-35] : The option status are null";

    /** The option status set null error message. */
    public static final String OPTION_STATUS_SET_NULL_ERROR = "[error-mazix-cli-036] : The option status set is null";

    /** The optional options null error message. */
    public static final String OPTIONAL_OPTION_NULL_ERROR = "[error-mazix-cli-037] : The optional options are null";

    /** The options null error message. */
    public static final String OPTIONS_NULL_ERROR = "[error-mazix-cli-038] : The options are null";

    /** The program authors null error message. */
    public static final String PROGRAM_AUTHORS_NULL_ERROR = "[error-mazix-cli-039] : The program authors are null";

    /** The program jar name null error message. */
    public static final String PROGRAM_JAR_NAME_NULL_ERROR = "[error-mazix-cli-040] : The program jar name is null";

    /** The program licenses null error message. */
    public static final String PROGRAM_LICENSES_NULL_ERROR = "[error-mazix-cli-041] : The program licenses are null";

    /** The program name null error message. */
    public static final String PROGRAM_NAME_NULL_ERROR = "[error-mazix-cli-042] : The program name is null";

    /** The program title description null error message. */
    public static final String PROGRAM_TITLE_DESCRIPTION_NULL_ERROR = "[error-mazix-cli-043] : The program title description is null";

    /** The program URL null error message. */
    public static final String PROGRAM_URL_NULL_ERROR = "[error-mazix-cli-044] : The program URL is null";

    /** The program version null error message. */
    public static final String PROGRAM_VERSION_NULL_ERROR = "[error-mazix-cli-045] : The program version is null";

    /** The program version parsing error message. */
    public static final String PROGRAM_VERSION_PARSING_ERROR = "[error-mazix-cli-046] : The program version can't be parsed (\"{0}\")";

    /** The program version parsing error message. */
    public static final String PROGRAM_VERSION_PARSING2_ERROR = "[error-mazix-cli-047] : The program version can't be parsed (too many numbers in the string)";

    /** The verbose option null error message. */
    public static final String VERBOSE_OPTION_NULL_ERROR = "[error-mazix-cli-048] : The verbose option is null";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private ErrorConstants() {
        super();
    }
}
