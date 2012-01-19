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

package net.sourceforge.plantuml.dependency.constants.log;

/**
 * The class which defines all fine messages constants which are only written in the log file. The
 * messages also contains the fine code.
 *
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public final class FineConstants {

    /** The creating dependency fine message. */
    public static final String CREATING_DEPENDENCY_FINE = "[fine-plantuml-dependency-000] : Creating the dependency \"{0}\" with the type \"{1}\"";

    /** The dependency already seen info message. */
    public static final String DEPENDENCY_ALREADY_SEEN_FINE = "[fine-plantuml-dependency-001] : The dependency \"{0}\" has already been seen, don't have to add it to the seen object Map";

    /** The dependency not seen with default type info message. */
    public static final String DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_FINE = "[fine-plantuml-dependency-002] : The dependency \"{0}\" has not been seen yet, creating it with default type";

    /** The dependency not seen info message. */
    public static final String DEPENDENCY_NOT_SEEN_FINE = "[fine-plantuml-dependency-003] : The dependency \"{0}\" has not been seen yet, creating it with type \"{1}\"";

    /** The dependency not treated info message. */
    public static final String DEPENDENCY_NOT_TREATED_FINE = "[fine-plantuml-dependency-004] : No dependency to treat in the source file";

    /** The display mode doesn't managed the dependency type fine message. */
    public static final String DISPLAY_MODE_DOESNT_MANAGED_DEPENDENCY_TYPE_FINE = "[fine-plantuml-dependency-005] : Display mode in the context \"{0}\" doesn't managed the type of the dependency \"{1}\"";

    /** The display mode doesn't managed the import type fine message. */
    public static final String DISPLAY_MODE_DOESNT_MANAGED_IMPORT_TYPE_FINE = "[fine-plantuml-dependency-006] : Display mode in the context \"{0}\" doesn't managed the type of the import \"{1}\"";

    /** The display mode isn't managed fine message. */
    public static final String DISPLAY_MODE_ISNT_MANAGED_FINE = "[fine-plantuml-dependency-007] : Display mode \"{0}\" doesn't have to be managed";

    /** The import is an interface fine message. */
    public static final String IMPORT_IS_AN_INTERFACE_FINE = "[fine-plantuml-dependency-008] : Import \"{0}\" is an interface, UML link don't have to be generated";

    /** The import is an interface fine message. */
    public static final String IMPORT_TYPE_NOT_FOUND = "[fine-plantuml-dependency-009] : Import type \"{0}\" not found in the import collection, skipping it...";

    /** The parent type string empty fine message. */
    public static final String JAVA_PARENT_TYPE_STRING_EMPTY_FINE = "[fine-plantuml-dependency-010] : The java parent type string to parse is empty, no parent to extract";

    /** The java type found fine message. */
    public static final String JAVA_TYPE_FOUND_FINE = "[fine-plantuml-dependency-011] : Java type \"{0}\" has been found";

    /** The no package found fine message. */
    public static final String NO_PACKAGE_FOUND_FINE = "[fine-plantuml-dependency-012] : No package name has been found";

    /** The programming language found fine message. */
    public static final String PROGRAMMING_LANGUAGE_FOUND_FINE = "[fine-plantuml-dependency-013] : Programming language \"{0}\" has been found";

    /** The updating dependency fine message. */
    public static final String UPDATING_DEPENDENCY_FINE = "[fine-plantuml-dependency-014] : Updating the dependency \"{0}\" with the type \"{1}\"";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 0.7
     */
    private FineConstants() {
        super();
    }
}
