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

/**
 * The enumeration which specifies display options.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public enum Display {
    /** The display only packages argument. */
    ONLY_PACKAGES,
    /** The display classes argument. */
    CLASSES,
    /** The display interfaces argument. */
    INTERFACES,
    /** The display abstract classes argument. */
    ABSTRACT_CLASSES,
    /** The display static imports argument. */
    STATIC_IMPORTS,
    /** The display imports argument. */
    IMPORTS,
    /** The display enumerations argument. */
    ENUMS,
    /** The display methods argument. */
    METHODS,
    /** The display attributes argument. */
    ATTRIBUTES,
    /** The display parsed objects argument. */
    ONLY_PARSED_OBJECTS,
    /** The display native methods argument. */
    NATIVE_METHODS,
    /** The display implementations argument. */
    IMPLEMENTATIONS,
    /** The display extensions argument. */
    EXTENSIONS;

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
