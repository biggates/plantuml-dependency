/*
 PlantUMLEnumElementImpl.java
 Creation date : 6/12/2011
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl;

import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.ENUM_TAG;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramEnumElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.PlantUMLStereotype;

/**
 * The default {@link PlantUMLClassesDiagramEnumElement} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public class PlantUMLClassesDiagramEnumElementImpl extends AbstractPlantUMLClassesDiagramElement implements
        PlantUMLClassesDiagramEnumElement {

    /** Serial version UID. */
    private static final long serialVersionUID = -880278043290474038L;

    /** The element stereotype, if any. */
    private PlantUMLStereotype stereotype;

    /**
     * Medium constructor.
     *
     * @param fullName
     *            the element full name, mustn't be <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLClassesDiagramEnumElementImpl(final String fullName) {
        this(fullName, null);
    }

    /**
     * Full constructor.
     *
     * @param fullName
     *            the element full name, mustn't be <code>null</code>.
     * @param stereotyp
     *            the element stereotype, if any, may be <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLClassesDiagramEnumElementImpl(final String fullName, final PlantUMLStereotype stereotyp) {
        super(fullName, ENUM_TAG);
        stereotype = stereotyp;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLClassesDiagramElement deepClone() {
        final PlantUMLClassesDiagramEnumElementImpl p = (PlantUMLClassesDiagramEnumElementImpl) super.deepClone();
        p.stereotype = getStereotype() == null ? null : getStereotype().deepClone();
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
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlantUMLClassesDiagramEnumElementImpl other = (PlantUMLClassesDiagramEnumElementImpl) obj;
        if (stereotype == null) {
            if (other.stereotype != null) {
                return false;
            }
        } else if (!stereotype.equals(other.stereotype)) {
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
    protected String getAdditionalPlantUMLTextDescription() {
        return getStereotype() != null ? getStereotype().getPlantUMLTextDescription() : BLANK_STRING;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLStereotype getStereotype() {
        return stereotype;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + ",stereotype=" + stereotype + "]";
    }
}
