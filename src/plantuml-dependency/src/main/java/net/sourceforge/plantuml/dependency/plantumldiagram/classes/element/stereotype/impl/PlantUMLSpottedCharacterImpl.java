/*
 PlantUMLSpottedCharacterImpl.java
 Creation date : 8/12/2011
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.LEFT_PARENTHESIS_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.RIGHT_PARENTHESIS_CHAR;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

import java.util.logging.Logger;

import net.sourceforge.mazix.components.color.HTMLColor;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.PlantUMLSpottedCharacter;

/**
 * The default {@link PlantUMLSpottedCharacter} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLSpottedCharacterImpl implements PlantUMLSpottedCharacter {

    /** Serial version UID. */
    private static final long serialVersionUID = 881922222125914220L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLSpottedCharacterImpl.class.getName());

    /** The spotted character. */
    private final char character;

    /** The spotted color */
    private final HTMLColor color;

    /**
     * Full constructor.
     * 
     * @param charact
     *            the spotted character, mustn't be empty.
     * @param col
     *            the spotted color, mustn't be <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLSpottedCharacterImpl(final char charact, final HTMLColor col) {
        character = charact;
        color = col;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public int compareTo(final PlantUMLSpottedCharacter o) {
        int comparison;

        if (this == o) {
            comparison = EQUAL.getResult();
        } else {
            comparison = Character.valueOf(getCharacter()).compareTo(Character.valueOf(o.getCharacter()));
            if (comparison == EQUAL.getResult()) {
                comparison = getColor().toString().compareTo(o.getColor().toString());
            }
        }

        return comparison;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public PlantUMLSpottedCharacter deepClone() {
        PlantUMLSpottedCharacterImpl p = null;

        try {
            p = (PlantUMLSpottedCharacterImpl) super.clone();
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return p;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlantUMLSpottedCharacterImpl other = (PlantUMLSpottedCharacterImpl) obj;
        if (character != other.character) {
            return false;
        }
        if (color == null) {
            if (other.color != null) {
                return false;
            }
        } else if (!color.equals(other.color)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public char getCharacter() {
        return character;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public HTMLColor getColor() {
        return color;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public String getPlantUMLTextDescription() {
        return LEFT_PARENTHESIS_CHAR + getCharacter() + COMMA_CHAR + getColor().toHTMLHexString()
                + RIGHT_PARENTHESIS_CHAR;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + character;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [character=" + character + ", color=" + color + "]";
    }
}
