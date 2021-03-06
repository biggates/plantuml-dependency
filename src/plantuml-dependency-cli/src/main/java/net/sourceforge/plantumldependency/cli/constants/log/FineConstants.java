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

package net.sourceforge.plantumldependency.cli.constants.log;

/**
 * The class which defines all fine messages constants which are only written in the log file. The
 * messages also contains the fine code.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public final class FineConstants {

    /** The creating dependency fine message. */
    public static final String CREATING_DEPENDENCY_FINE = "[fine-plantuml-dependency-cli-000] : Creating the dependency \"{0}\" with the type \"{1}\"";

    /** The dependency already seen info message. */
    public static final String DEPENDENCY_ALREADY_SEEN_FINE = "[fine-plantuml-dependency-cli-001] : The dependency \"{0}\" has already been seen, don't have to add it to the seen object Map";

    /** The dependency not seen with default type info message. */
    public static final String DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_FINE = "[fine-plantuml-dependency-cli-002] : The dependency \"{0}\" has not been seen yet, creating it with default type";

    /** The dependency not seen info message. */
    public static final String DEPENDENCY_NOT_SEEN_FINE = "[fine-plantuml-dependency-cli-003] : The dependency \"{0}\" has not been seen yet, creating it with type \"{1}\"";

    /** The display type option not managed fine message. */
    public static final String DISPLAY_TYPE_OPTION_NOT_MANAGED_FINE = "[fine-plantuml-dependency-cli-004] : Display type option \"{0}\" isn't managed, UML relations don't have to be generated";

    /** The import is an implementation, an extension or an annotation fine message. */
    public static final String IMPORT_IS_AN_EXTENSION_AN_IMPLEMENTATION_OR_AN_ANNOTATION_FINE = "[fine-plantuml-dependency-cli-005] : Import \"{0}\" is either an implementation, an extension or an annotation, skipping UML use relation generation here";

    /** The dependency is not displayable fine message. */
    public static final String DEPENDENCY_IS_NOT_DISPLAYABLE_FINE = "[fine-plantuml-dependency-cli-006] : Dependency \"{0}\" is not displayable, UML relation doesn't have to be generated";

    /** The import is an interface fine message. */
    public static final String IMPORT_TYPE_NOT_FOUND = "[fine-plantuml-dependency-cli-007] : Import type \"{0}\" not found in the import collection, skipping it...";

    /** The parent type string empty fine message. */
    public static final String JAVA_PARENT_TYPE_STRING_EMPTY_FINE = "[fine-plantuml-dependency-cli-008] : The java parent type string to parse is empty, no parent to extract";

    /** The java type found fine message. */
    public static final String JAVA_TYPE_FOUND_FINE = "[fine-plantuml-dependency-cli-009] : Java type \"{0}\" has been found";

    /** The no package found fine message. */
    public static final String NO_PACKAGE_FOUND_FINE = "[fine-plantuml-dependency-cli-010] : No package name has been found";

    /** The programming language found fine message. */
    public static final String PROGRAMMING_LANGUAGE_FOUND_FINE = "[fine-plantuml-dependency-cli-011] : Programming language \"{0}\" has been found";

    /** The updating dependency fine message. */
    public static final String UPDATING_DEPENDENCY_FINE = "[fine-plantuml-dependency-cli-012] : Updating the dependency \"{0}\" with the type \"{1}\"";

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.0.0
     */
    private FineConstants() {
        super();
    }
}
