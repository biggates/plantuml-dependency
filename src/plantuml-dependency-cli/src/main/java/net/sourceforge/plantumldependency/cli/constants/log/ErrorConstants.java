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

package net.sourceforge.plantumldependency.cli.constants.log;

/**
 * The class which defines all error messages constants which are written in the log file. The
 * messages also contains the error code.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public final class ErrorConstants {

    /** The base directory option null error message. */
    public static final String BASE_DIRECTORY_OPTION_NULL_ERROR = "[error-plantuml-dependency-cli-000] : The base directory option is null";

    /** The C++ not implemented yet error message. */
    public static final String CPP_NOT_IMPLEMENTED_YET_ERROR = "[error-plantuml-dependency-cli-001] : CPP isn't implemented yet, should come in a next release ;-)";

    /** The dependency name null error message. */
    public static final String DEPENDENCY_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-002] : The dependency name is null";

    /** The dependency null error message. */
    public static final String DEPENDENCY_NULL_ERROR = "[error-plantuml-dependency-cli-003] : The dependency is null";

    /** The dependency type null error message. */
    public static final String DEPENDENCY_TYPE_NULL_ERROR = "[error-plantuml-dependency-cli-004] : The dependency type is null";

    /** The display type option null error message. */
    public static final String DISPLAY_TYPE_OPTION_NULL_ERROR = "[error-plantuml-dependency-cli-005] : The display type option is null";

    /** The exclude option null error message. */
    public static final String EXCLUDE_OPTION_NULL_ERROR = "[error-plantuml-dependency-cli-006] : The exclude option is null";

    /** The impossible java parent type null error message. */
    public static final String IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR = "[error-plantuml-dependency-cli-007] : The java parent type \"{0}\" is not available for this java type \"{1}\"";

    /** The include option null error message. */
    public static final String INCLUDE_OPTION_NULL_ERROR = "[error-plantuml-dependency-cli-008] : The include option is null";

    /** The java annotation type name null error message. */
    public static final String JAVA_ANNOTATION_TYPE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-009] : The java annotation type name is null";

    /** The java annotation type null error message. */
    public static final String JAVA_ANNOTATION_TYPE_PACKAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-010] :  The java annotation type package name is null";

    /** The java parent type name null error message. */
    public static final String JAVA_PARENT_TYPE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-011] : The java parent type name is null";

    /** The java parent type null error message. */
    public static final String JAVA_PARENT_TYPE_NULL_ERROR = "[error-plantuml-dependency-cli-012] : The java parent type is null";

    /** The java parent type package name null error message. */
    public static final String JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-013] : The java parent type package name is null";

    /** The parent type string not empty error message. */
    public static final String JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR = "[error-plantuml-dependency-cli-014] : The java parent type string \"{0}\" should be null for this java type \"{1}\"";

    /** The unknown java parent type error message. */
    public static final String JAVA_PARENT_TYPE_UNKNOWN_ERROR = "[error-plantuml-dependency-cli-015] : The java parent type \"{0}\" is unknown";

    /** The java type annotations dependencies null error message. */
    public static final String JAVA_TYPE_ANNOTATIONS_NULL_ERROR = "[error-plantuml-dependency-cli-016] : The java type annotations dependencies is null";

    /** The java type can't be extracted error message. */
    public static final String JAVA_TYPE_CANT_BE_EXTRACTED_ERROR = "[error-plantuml-dependency-cli-017] : The java type can't be extracted from the content \"{0}\"";

    /** The java type extensions dependencies null error message. */
    public static final String JAVA_TYPE_EXTENTIONS_NULL_ERROR = "[error-plantuml-dependency-cli-018] : The java type extensions dependencies is null";

    /** The java type extensions too many elements error message. */
    public static final String JAVA_TYPE_EXTENTIONS_TOO_MANY_ELEMENTS_ERROR = "[error-plantuml-dependency-cli-019] : The java type extensions dependencies has too many elements";

    /** The java type implementations dependencies null error message. */
    public static final String JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR = "[error-plantuml-dependency-cli-020] : The java type implementations dependencies is null";

    /** The java type import dependencies null error message. */
    public static final String JAVA_TYPE_IMPORTS_NULL_ERROR = "[error-plantuml-dependency-cli-021] : The java type import dependencies is null";

    /** The java type language keyword null error message. */
    public static final String JAVA_TYPE_LANGUAGE_KEYWORD_NULL_ERROR = "[error-plantuml-dependency-cli-022] : The java type language keyword is null";

    /** The java type name null error message. */
    public static final String JAVA_TYPE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-023] : The java type name is null";

    /** The java type package name null error message. */
    public static final String JAVA_TYPE_PACKAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-024] : The java type package name is null";

    /** The not display type argument error message. */
    public static final String NOT_DISPLAY_TYPE_ARGUMENT_ERROR = "[error-plantuml-dependency-cli-025] : Can't parse option argument \"{0}\", it isn't a valid display type argument";

    /** The several display type arguments error message. */
    public static final String SEVERAL_DISPLAY_TYPE_ARGUMENTS_ERROR = "[error-plantuml-dependency-cli-026] : The display type argument \"{0}\" is defined several times";

    /** The plantUML dependency error message. */
    public static final String PLANTUML_DEPENDENCY_ERROR = "[error-plantuml-dependency-cli-027] : An error has occured while running PlantUML Dependency, please check the log for more information";

    /** The programming language name null error message. */
    public static final String PROGRAMMING_LANGUAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-cli-028] : The programming language name is null";

    /** The programming language option null error message. */
    public static final String PROGRAMMING_LANGUAGE_OPTION_NULL_ERROR = "[error-plantuml-dependency-cli-029] : The programming language option is null";

    /** The reading source file error message. */
    public static final String READING_SOURCE_FILE_ERROR = "[error-plantuml-dependency-cli-030] : Severe parsing errors have occurred while reading the source file \"{0}\", the file will be ignored";

    /** The unknown programming language error message. */
    public static final String UNKNOWN_JAVA_TYPE_ERROR = "[error-plantuml-dependency-cli-031] : The java type \"{0}\" is unknown";

    /** The unknown programming language error message. */
    public static final String UNKNOWN_PROGRAMMING_LANGUAGE_ERROR = "[error-plantuml-dependency-cli-032] : The programming language \"{0}\" is unknown";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.0.0
     */
    private ErrorConstants() {
        super();
    }
}
