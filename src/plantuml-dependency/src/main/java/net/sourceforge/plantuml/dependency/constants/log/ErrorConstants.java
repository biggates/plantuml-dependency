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

package net.sourceforge.plantuml.dependency.constants.log;


/**
 * The class which defines all error messages constants which are written in the log file. The
 * messages also contains the error code.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0
 * @version 1.0
 */
public final class ErrorConstants {

    /** The base directory option null error message. */
    public static final String BASE_DIRECTORY_OPTION_NULL_ERROR = "[error-plantuml-dependency-001] : The base directory option is null";

    /** The C++ not implemented yet error message. */
    public static final String CPP_NOT_IMPLEMENTED_YET_ERROR = "[error-plantuml-dependency-002] : CPP isn't implemented yet, should come in a next release ;-)";

    /** The display option null error message. */
    public static final String DISPLAY_OPTION_NULL_ERROR = "[error-plantuml-dependency-003] : The display option is null";

    /** The exclude option null error message. */
    public static final String EXCLUDE_OPTION_NULL_ERROR = "[error-plantuml-dependency-004] : The exclude option is null";

    /** The include option null error message. */
    public static final String INCLUDE_OPTION_NULL_ERROR = "[error-plantuml-dependency-005] : The include option is null";

    /** The not display argument error message. */
    public static final String NOT_DISPLAY_ARGUMENT_ERROR = "[error-plantuml-dependency-006] : Can't parse option argument \"{0}\", it isn't a valid display argument";

    /** The programming language name null error message. */
    public static final String PROGRAMMING_LANGUAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-007] : The programming language name is null";

    /** The programming language option null error message. */
    public static final String PROGRAMMING_LANGUAGE_OPTION_NULL_ERROR = "[error-plantuml-dependency-008] : The programming language option is null";

    /** The unknown programming language error message. */
    public static final String UNKNOWN_PROGRAMMING_LANGUAGE_ERROR = "[error-plantuml-dependency-009] : The programming language \"{0}\" is unknown";

    /** The java type language keyword null error message. */
    public static final String JAVA_TYPE_LANGUAGE_KEYWORD_NULL_ERROR = "[error-plantuml-dependency-010] : The java type language keyword is null";

    /** The unknown programming language error message. */
    public static final String UNKNOWN_JAVA_TYPE_ERROR = "[error-plantuml-dependency-011] : The java type \"{0}\" is unknown";

    /** The dependency type null error message. */
    public static final String DEPENDENCY_TYPE_NULL_ERROR = "[error-plantuml-dependency-012] : The dependency type is null";

    /** The java parent type null error message. */
    public static final String JAVA_PARENT_TYPE_NULL_ERROR = "[error-plantuml-dependency-013] : The java parent type is null";

    /** The java parent type name null error message. */
    public static final String JAVA_PARENT_TYPE_NAME_NULL_ERROR = "[error-plantuml-dependency-014] : The java parent type name is null";

    /** The java parent type package name null error message. */
    public static final String JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-015] : The java parent type package name is null";

    /** The impossible java parent type null error message. */
    public static final String IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR = "[error-plantuml-dependency-016] : The java parent type \"{0}\" is not available for this java type \"{1}\"";
    
    /** The parent type string not empty error message. */
    public static final String JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR = "[error-plantuml-dependency-018] : The java parent type string \"{0}\" should be null for this java type \"{1}\"";

    /** The reading source file error message. */
    public static final String READING_SOURCE_FILE_ERROR = "[error-plantuml-dependency-019] : Severe parsing errors have occurred while reading the source file \"{0}\", the file will be ignored";

    /** The java type name null error message. */
    public static final String JAVA_TYPE_NAME_NULL_ERROR = "[error-plantuml-dependency-020] : The java type name is null";

    /** The java type package name null error message. */
    public static final String JAVA_TYPE_PACKAGE_NAME_NULL_ERROR = "[error-plantuml-dependency-021] : The java type package name is null";

    /** The java type import dependencies null error message. */
    public static final String JAVA_TYPE_IMPORTS_NULL_ERROR = "[error-plantuml-dependency-022] : The java type import dependencies is null";

    /** The java type implementations dependencies null error message. */
    public static final String JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR = "[error-plantuml-dependency-023] : The java type implementations dependencies is null";

    /** The java type extensions dependencies null error message. */
    public static final String JAVA_TYPE_EXTENTIONS_NULL_ERROR = "[error-plantuml-dependency-024] : The java type extensions dependencies is null";
    
    /** The unknown java parent type error message. */
    public static final String JAVA_PARENT_TYPE_UNKNOWN_ERROR = "[error-plantuml-dependency-015] : The java parent type \"{0}\" is unknown";
    
    /** The dependency name error message. */
    public static final String DEPENDENCY_NAME_ERROR = "[error-plantuml-dependency-016] : The dependency name is null";

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private ErrorConstants() {
        super();
    }
}
