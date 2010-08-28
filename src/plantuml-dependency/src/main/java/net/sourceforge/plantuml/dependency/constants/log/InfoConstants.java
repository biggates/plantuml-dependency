/*
 InfoConstants.java
 Creation date : 13/07/2010
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
 * The class which defines all info messages constants which are written in the log file. The
 * messages also contains the info code.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0
 * @version 1.0
 */
public final class InfoConstants {

    /** The programming language found info message. */
    public static final String PROGRAMMING_LANGUAGE_FOUND_INFO = "[info-plantuml-dependency-001] : Programming language \"{0}\" has been found";

    /** The java type found info message. */
    public static final String JAVA_TYPE_FOUND_INFO = "[info-plantuml-dependency-002] : Java type \"{0}\" has been found";

    /** The parent type string empty info message. */
    public static final String JAVA_PARENT_TYPE_STRING_EMPTY_INFO = "[info-plantuml-dependency-003] : The java parent type string to parse is empty, no parent to extract";

    /** The import is an interface info message. */
    public static final String IMPORT_IS_AN_INTERFACE_INFO = "[info-plantuml-004] : Import \"{0}\" is an interface, UML link don't have to be generated";

    /** The creating dependency info message. */
    public static final String CREATING_DEPENDENCY_INFO = "[info-plantuml-005] : Creating the dependency \"{0}\" with the type \"{1}\"";

    /** The updating dependency info message. */
    public static final String UPDATING_DEPENDENCY_INFO = "[info-plantuml-006] : Updating the dependency \"{0}\" with the type \"{1}\"";

    /** The dependency already seen info message. */
    public static final String DEPENDENCY_ALREADY_SEEN_INFO = "[info-plantuml-007] : The dependency \"{0}\" has already been seen, don't have to add it to the seen object Map";

    /** The no package found info message. */
    public static final String NO_PACKAGE_FOUND_INFO = "[info-plantuml-008] : No package name has been found";

    /** The dependency not seen with default type info message. */
    public static final String DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_INFO = "[info-plantuml-009] : The dependency \"{0}\" has not been seen yet, creating it with default type";

    /** The dependency not seen info message. */
    public static final String DEPENDENCY_NOT_SEEN_INFO = "[info-plantuml-010] : The dependency \"{0}\" has not been seen yet, creating it with type \"{1}\"";

    /** The execution time info message. */
    public static final String EXECUTION_TIME_INFO = "[info-plantuml-011] : Executed in \"{0}\" ms";

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private InfoConstants() {
        super();
    }
}
