/*
 AbstractPlantUMLClassesDiagramRelation.java
 Creation date : 9/12/2011
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

import java.util.logging.Logger;

/**
 * The abstract implementation of the {@link PlantUMLClassesDiagramRelation} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public abstract class AbstractPlantUMLClassesDiagramRelation implements PlantUMLClassesDiagramRelation {

    /** Serial version UID. */
    private static final long serialVersionUID = 2549425584926638370L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractPlantUMLClassesDiagramRelation.class.getName());

    /** The first element name of the relation. For instance, it can be "java.lang.String". */
    private final String firstElementName;

    /** The second element name of the relation. For instance, it can be "java.lang.String". */
    private final String secondElementName;

    /** The relation type used in the plantUML language. */
    private final PlantUMLClassesDiagramRelationType type;

    /**
     * Full constructor.
     * 
     * @param firstName
     *            The first element name of the relation, mustn't be <code>null</code> nor empty.
     * @param secondName
     *            The second element name of the relation, mustn't be <code>null</code> nor empty.
     * @param relationType
     *            The relation type used in the plantUML language, mustn't be <code>null</code>.
     * @since 1.1.1
     */
    protected AbstractPlantUMLClassesDiagramRelation(final String firstName, final String secondName,
            final PlantUMLClassesDiagramRelationType relationType) {
        firstElementName = firstName;
        secondElementName = secondName;
        type = relationType;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public int compareTo(final PlantUMLClassesDiagramRelation o) {
        int comparison;

        if (this == o) {
            comparison = EQUAL.getResult();
        } else {
            comparison = getFirstElementName().compareTo(o.getFirstElementName());
            if (comparison == 0) {
                comparison = getSecondElementName().compareTo(o.getSecondElementName());
                if (comparison == 0) {
                    comparison = getType().compareTo(getType());
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
    public PlantUMLClassesDiagramRelation deepClone() {
        AbstractPlantUMLClassesDiagramRelation a = null;

        try {
            a = (AbstractPlantUMLClassesDiagramRelation) super.clone();
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
        final AbstractPlantUMLClassesDiagramRelation other = (AbstractPlantUMLClassesDiagramRelation) obj;
        if (firstElementName == null) {
            if (other.firstElementName != null) {
                return false;
            }
        } else if (!firstElementName.equals(other.firstElementName)) {
            return false;
        }
        if (secondElementName == null) {
            if (other.secondElementName != null) {
                return false;
            }
        } else if (!secondElementName.equals(other.secondElementName)) {
            return false;
        }
        if (type != other.type) {
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
    public String getFirstElementName() {
        return firstElementName;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public String getPlantUMLTextDescription() {
        return getFirstElementName() + getType().getRightRelationSymbol() + getSecondElementName();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public String getSecondElementName() {
        return secondElementName;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public PlantUMLClassesDiagramRelationType getType() {
        return type;
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
        result = prime * result + ((firstElementName == null) ? 0 : firstElementName.hashCode());
        result = prime * result + ((secondElementName == null) ? 0 : secondElementName.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [firstElementName=" + firstElementName + ", secondElementName="
                + secondElementName + ", type=" + type + "]";
    }
}
