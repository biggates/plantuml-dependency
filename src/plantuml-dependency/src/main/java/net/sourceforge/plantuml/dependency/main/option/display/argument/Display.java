/*
 Display.java
 Creation date : 18/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.display.argument;

import static java.util.Arrays.asList;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COLON_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.QUOTATION_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;

import java.util.Set;
import java.util.TreeSet;

/**
 * The enumeration which specifies display options.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.1.1
 */
public enum Display {
    /** The display abstract classes argument. */
    ABSTRACT_CLASSES("displays parsed source files which are abstract classes"),
    /** The display attributes argument. */
    ATTRIBUTES("displays parsed source files attributes"),
    /** The display classes argument. */
    CLASSES("displays parsed source files which are classes (not abstract)"),
    /** The display enumerations argument. */
    ENUMS("displays parsed source files which are enums"),
    /** The display extensions argument. */
    EXTENSIONS("displays dependencies which are extended by parsed source files"),
    /** The display implementations argument. */
    IMPLEMENTATIONS("displays dependencies which are implemented by parsed source files"),
    /** The display imports argument. */
    IMPORTS("displays import (not static) of all parsed source files"),
    /** The display interfaces argument. */
    INTERFACES("displays parsed source files which are interfaces"),
    /** The display methods argument. */
    METHODS("displays parsed source files methods"),
    /** The display native methods argument. */
    NATIVE_METHODS("displays links to the native dependency"),
    /** The display only packages argument. */
    ONLY_PACKAGES("displays only packages of all parsed source files"),
    /** The display static imports argument. */
    STATIC_IMPORTS("displays static imports of all parsed source files");

    /**
     * Build the string which contains the usage descriptions of all displays options which are
     * available.
     * 
     * @param displayOptions
     *            the Set of all displays options to get the full usage description from.
     * @return the full usage description of all displays options.
     * @since 1.1.1
     */
    public static String getFullUsageDescriptions(Set < Display > displayOptions) {
        final StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < values().length - 1; i++) {

            final Display display = values()[i];
            buffer.append(display.getFullUsageDescription());
            buffer.append(COMMA_CHAR);
            buffer.append(SPACE_CHAR);
        }

        final Display lastDisplay = values()[values().length - 1];
        buffer.append(lastDisplay.getFullUsageDescription());

        return buffer.toString();
    }
    
    public static String getSetAsSeparataredCommaString(Set < Display > displayOptions) {
        final StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < values().length - 1; i++) {

            final Display display = values()[i];
            buffer.append(display.getFullUsageDescription());
            buffer.append(COMMA_CHAR);
            buffer.append(SPACE_CHAR);
        }

        final Display lastDisplay = values()[values().length - 1];
        buffer.append(lastDisplay.getFullUsageDescription());

        return buffer.toString();
    }

    /** The Set containing all displays options which are available. */
    public static final Set < Display > DISPLAY_OPTIONS = new TreeSet < Display >(asList(values()));

    /** The string containing the display usage description. */
    private String usageDescription;

    /**
     * Default constructor.
     * 
     * @param usageDesc
     *            the display usage description.
     * @since 1.1.1
     */
    private Display(final String usageDesc) {
        setUsageDescription(usageDesc);
    }

    /**
     * Gets the string containing the full display usage description.
     * 
     * @return the full display usage description.
     * @since 1.1.1
     */
    public String getFullUsageDescription() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(QUOTATION_CHAR);
        buffer.append(toString());
        buffer.append(QUOTATION_CHAR);
        buffer.append(SPACE_CHAR);
        buffer.append(COLON_CHAR);
        buffer.append(SPACE_CHAR);
        buffer.append(getUsageDescription());
        return buffer.toString();
    }

    /**
     * Gets the string containing the display usage description.
     * 
     * @return the display usage description.
     * @since 1.1.1
     */
    public String getUsageDescription() {
        return usageDescription;
    }

    /**
     * Sets the value of usageDescription.
     * 
     * @param value
     *            the usageDescription to set.
     * @see #getUsageDescription()
     * @since 1.1.1
     */
    private void setUsageDescription(final String value) {
        usageDescription = value;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        final String str = super.toString();
        return str.toLowerCase();
    }
}
