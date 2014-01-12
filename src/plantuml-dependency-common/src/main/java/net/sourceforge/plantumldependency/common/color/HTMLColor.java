/*
 HTMLColor.java
 Creation date : 7/03/2011
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

package net.sourceforge.plantumldependency.common.color;

import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.HASH_CHAR;

import java.awt.Color;

/**
 * The enumeration representing HTML colors.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public enum HTMLColor {

    /** The aliceBlue HTML color (#F0F8FF). */
    ALICE_BLUE(new Color(240, 248, 255)),

    /** The antiqueWhite HTML color (#FAEBD7). */
    ANTIQUE_WHITE(new Color(250, 235, 215)),

    /** The yellow HTML color (#FFFF00). */
    YELLOW(Color.YELLOW);

    /** The wrapped color. */
    private Color color;

    /**
     * Default constructor.
     *
     * @param col
     *            the underlying {@link Color} instance.
     * @since 1.3.0
     */
    private HTMLColor(final Color col) {
        color = col;
    }

    /**
     * Gets the value of <code>color</code>.
     *
     * @return the value of <code>color</code>.
     * @since 1.3.0
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the full value of the color as an hexadecimal string (for instance <code>ff9acd32</code>
     * ).
     *
     * @see Integer#toHexString(int)
     * @return the value of <code>color</code>.
     * @since 1.3.0
     */
    public String toHexString() {
        return Integer.toHexString(getColor().getRGB());
    }

    /**
     * Gets the value of the color as an hexadecimal string following the HTML format (i.e. with the
     * <code>hash</code> character (for instance <code>#9acd32</code>).<br>
     * HTML color codes are hexadecimal triplets representing the colors red, green, and blue. For
     * example, in the the color red, the color code is FF0000, which is '255' red, '0' green, and
     * '0' blue.
     *
     * @return the value of <code>color</code>.
     * @since 1.3.0
     */
    public String toHTMLHexString() {
        return HASH_CHAR + toHexString().substring(2);
    }
}
