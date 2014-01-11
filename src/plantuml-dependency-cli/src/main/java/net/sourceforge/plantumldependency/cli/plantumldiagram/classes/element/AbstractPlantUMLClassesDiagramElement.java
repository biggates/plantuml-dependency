/*
 AbstractPlantUMLClassesDiagramElement.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag;

/**
 * The abstract implementation of the {@link PlantUMLClassesDiagramElement} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public abstract class AbstractPlantUMLClassesDiagramElement implements PlantUMLClassesDiagramElement {

    /** Serial version UID. */
    private static final long serialVersionUID = -698646710338667065L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractPlantUMLClassesDiagramElement.class.getName());

    /** The plantUML element full name. */
    private final String name;

    /** The plantUML element tag. */
    private final PlantUMLClassesDiagramElementTag elementTag;

    /**
     * Full constructor.
     *
     * @param fullName
     *            the element full name, mustn't be <code>null</code>.
     * @param tag
     *            plantUML element tag available in the plantUML classes diagram language, mustn't
     *            be <code>null</code>.
     * @since 1.1.1
     */
    protected AbstractPlantUMLClassesDiagramElement(final String fullName, final PlantUMLClassesDiagramElementTag tag) {
        name = fullName;
        elementTag = tag;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public int compareTo(final PlantUMLClassesDiagramElement o) {
        int comparison;

        if (this == o) {
            comparison = EQUAL.getResult();
        } else {
            if (getElementTag().equals(o.getElementTag())) {
                comparison = getName().compareTo(o.getName());
            } else {
                comparison = getElementTag().toString().compareTo(o.getElementTag().toString());
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
    public PlantUMLClassesDiagramElement deepClone() {
        AbstractPlantUMLClassesDiagramElement a = null;

        try {
            a = (AbstractPlantUMLClassesDiagramElement) super.clone();
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return a;
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
        final AbstractPlantUMLClassesDiagramElement other = (AbstractPlantUMLClassesDiagramElement) obj;
        if (elementTag == null) {
            if (other.elementTag != null) {
                return false;
            }
        } else if (!elementTag.equals(other.elementTag)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    /**
     * Gets an additional plantUML description, which may be necessary for some element.
     *
     * @return an additional plantUML description.
     * @since 1.1.1
     */
    protected abstract String getAdditionalPlantUMLTextDescription();

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLClassesDiagramElementTag getElementTag() {
        return elementTag;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String getPlantUMLTextDescription() {
        return getElementTag().getTagName() + getName() + getAdditionalPlantUMLTextDescription();
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
        result = prime * result + ((elementTag == null) ? 0 : elementTag.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return "elementTag=" + elementTag + ", name=" + name;
    }
}
