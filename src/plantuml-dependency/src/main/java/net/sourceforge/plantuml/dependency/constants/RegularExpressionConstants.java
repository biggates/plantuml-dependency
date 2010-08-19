/*
 RegularExpressionConstants.java
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

package net.sourceforge.plantuml.dependency.constants;

import static java.util.regex.Pattern.compile;
import static net.sourceforge.mazix.components.constants.CharacterConstants.CARRIAGE_RETURN_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.PIPE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.TAB_CHAR;

import java.util.regex.Pattern;

/**
 * The class which stores all necessary regular expressions constants.
 * 
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public final class RegularExpressionConstants {

    /** The pattern representing the ampersand character. */
    public static final Pattern LINE_OR_CARRIAGE_RETURN_REGEXP = compile(LINE_CHAR + PIPE_CHAR + CARRIAGE_RETURN_CHAR);

    /** The pattern representing the ampersand character. */
    public static final Pattern TAB_REGEXP = compile(TAB_CHAR);

    /** The pattern representing the ampersand character. */
    public static final Pattern COMMENT_REGEXP = compile("/\\*\\**.*?\\*/");

    /** The pattern representing the ampersand character. */
    public static final Pattern JAVA_TYPE_REGEXP = compile(".*?(abstract|) *(class|interface|enum) +(.*?)( +extends +(.*?)|)( +implements +(.*?)|) *\\{");

    /** The pattern representing the ampersand character. */
    public static final Pattern PACKAGE_REGEXP = compile("package +(.*?) *;");

    /** The pattern representing the ampersand character. */
    public static final Pattern NORMAL_IMPORT_REGEXP = compile(".*?import +([A-Za-z0-9.]+)\\.(.*?) *;");

    /** The pattern representing the ampersand character. */
    public static final Pattern STATIC_IMPORT_REGEXP = compile(".*?import +static +([A-Za-z0-9.]+)\\.([A-Za-z0-9.]+?)\\.(.*?) *;");

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private RegularExpressionConstants() {
        super();
    }
}
