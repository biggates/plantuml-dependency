/*
 PlantUMLStereotype.java
 Creation date : 10/12/2011
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
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.STEREOTYPE_LEFT_SEPARATOR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.STEREOTYPE_RIGHT_SEPARATOR;

import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.PlantUMLSpottedCharacter;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.PlantUMLStereotype;

/**
 * The default {@link PlantUMLStereotype} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLStereotypeImpl implements PlantUMLStereotype {

    /** Serial version UID. */
    private static final long serialVersionUID = 756579310547044314L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLStereotypeImpl.class.getName());

    /** The stereotype inner text. */
    private final String text;

    /** The spotted character as a {@link PlantUMLSpottedCharacter}, if any. */
    private PlantUMLSpottedCharacter plantUMLSpottedCharacter;

    /**
     * Medium constructor.
     *
     * @param spottedCharacter
     *            The spotted character as a {@link PlantUMLSpottedCharacter}, if any. May be
     *            <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLStereotypeImpl(final PlantUMLSpottedCharacter spottedCharacter) {
        this(BLANK_STRING, spottedCharacter);
    }

    /**
     * Medium constructor.
     *
     * @param txt
     *            the stereotype inner text, may be empty but not <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLStereotypeImpl(final String txt) {
        this(txt, null);
    }

    /**
     * Full constructor.
     *
     * @param txt
     *            the stereotype inner text, may be empty but not <code>null</code>.
     * @param spottedCharacter
     *            The spotted character as a {@link PlantUMLSpottedCharacter}, if any. May be
     *            <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLStereotypeImpl(final String txt, final PlantUMLSpottedCharacter spottedCharacter) {
        text = txt;
        plantUMLSpottedCharacter = spottedCharacter;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public int compareTo(final PlantUMLStereotype o) {
        int comparison;

        if (this == o) {
            comparison = EQUAL.getResult();
        } else {
            if (getPlantUMLSpottedCharacter() == null || o.getPlantUMLSpottedCharacter() == null) {
                comparison = getText().compareTo(o.getText());
            } else {
                comparison = getPlantUMLSpottedCharacter().compareTo(o.getPlantUMLSpottedCharacter());
                if (comparison == EQUAL.getResult()) {
                    comparison = getText().compareTo(o.getText());
                }
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
    public PlantUMLStereotype deepClone() {
        PlantUMLStereotypeImpl p = null;

        try {
            p = (PlantUMLStereotypeImpl) super.clone();
            if (getPlantUMLSpottedCharacter() != null) {
                p.plantUMLSpottedCharacter = getPlantUMLSpottedCharacter().deepClone();
            }
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
        final PlantUMLStereotypeImpl other = (PlantUMLStereotypeImpl) obj;
        if (plantUMLSpottedCharacter == null) {
            if (other.plantUMLSpottedCharacter != null) {
                return false;
            }
        } else if (!plantUMLSpottedCharacter.equals(other.plantUMLSpottedCharacter)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
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
    public PlantUMLSpottedCharacter getPlantUMLSpottedCharacter() {
        return plantUMLSpottedCharacter;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String getPlantUMLTextDescription() {
        return STEREOTYPE_LEFT_SEPARATOR
                + (getPlantUMLSpottedCharacter() == null ? BLANK_STRING : getPlantUMLSpottedCharacter()
                        .getPlantUMLTextDescription() + (isEmpty(getText()) ? BLANK_STRING : SPACE_CHAR)) + getText()
                + STEREOTYPE_RIGHT_SEPARATOR;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String getText() {
        return text;
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
        result = prime * result + ((plantUMLSpottedCharacter == null) ? 0 : plantUMLSpottedCharacter.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [plantUMLSpottedCharacter=" + plantUMLSpottedCharacter + ", text=" + text
                + "]";
    }
}
