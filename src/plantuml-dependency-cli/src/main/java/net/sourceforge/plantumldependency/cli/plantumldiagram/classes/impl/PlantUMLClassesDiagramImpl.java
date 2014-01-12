/*
 PlantUMLClassesDiagramImpl.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLConstants.END_PLANTUML;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLConstants.START_PLANTUML;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.plantumldiagram.PlantUMLDiagram;
import net.sourceforge.plantumldependency.cli.plantumldiagram.WithDescription;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.PlantUMLClassesDiagram;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

/**
 * The default {@link PlantUMLClassesDiagram} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public class PlantUMLClassesDiagramImpl implements PlantUMLClassesDiagram {

    /** Serial version UID. */
    private static final long serialVersionUID = -5603953525431054169L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLClassesDiagramImpl.class.getName());

    /**
     * The {@link Set} of all {@link PlantUMLClassesDiagramElement} contained in the plantUML
     * classes diagram.
     */
    private Set < PlantUMLClassesDiagramElement > plantUMLClassesDiagramElements;

    /**
     * The {@link Set} of all {@link PlantUMLClassesDiagramRelation} contained in the plantUML
     * classes diagram.
     */
    private Set < PlantUMLClassesDiagramRelation > plantUMLClassesDiagramRelations;

    /**
     * Default constructor. Elements and relations are empty.
     *
     * @since 1.1.1
     */
    public PlantUMLClassesDiagramImpl() {
        this(new TreeSet < PlantUMLClassesDiagramElement >(), new TreeSet < PlantUMLClassesDiagramRelation >());
    }

    /**
     * Full constructor.
     *
     * @param classesDiagramElements
     *            the {@link Set} of all {@link PlantUMLClassesDiagramElement} contained in the
     *            plantUML classes diagram, mustn't be <code>null</code>.
     * @param classesDiagramRelations
     *            the {@link Set} of all {@link PlantUMLClassesDiagramRelation} contained in the
     *            plantUML classes diagram, mustn't be <code>null</code>.
     * @since 1.1.1
     */
    public PlantUMLClassesDiagramImpl(final Set < PlantUMLClassesDiagramElement > classesDiagramElements,
            final Set < PlantUMLClassesDiagramRelation > classesDiagramRelations) {
        plantUMLClassesDiagramElements = new TreeSet < PlantUMLClassesDiagramElement >(classesDiagramElements);
        plantUMLClassesDiagramRelations = new TreeSet < PlantUMLClassesDiagramRelation >(classesDiagramRelations);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLDiagram deepClone() {
        PlantUMLClassesDiagramImpl p = null;

        try {
            p = (PlantUMLClassesDiagramImpl) super.clone();
            p.plantUMLClassesDiagramElements = new TreeSet < PlantUMLClassesDiagramElement >();
            for (final PlantUMLClassesDiagramElement element : getPlantUMLClassesDiagramElements()) {
                p.plantUMLClassesDiagramElements.add(element.deepClone());
            }
            p.plantUMLClassesDiagramRelations = new TreeSet < PlantUMLClassesDiagramRelation >();
            for (final PlantUMLClassesDiagramRelation relation : getPlantUMLClassesDiagramRelations()) {
                p.plantUMLClassesDiagramRelations.add(relation.deepClone());
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
        final PlantUMLClassesDiagramImpl other = (PlantUMLClassesDiagramImpl) obj;
        if (plantUMLClassesDiagramElements == null) {
            if (other.plantUMLClassesDiagramElements != null) {
                return false;
            }
        } else if (!plantUMLClassesDiagramElements.equals(other.plantUMLClassesDiagramElements)) {
            return false;
        }
        if (plantUMLClassesDiagramRelations == null) {
            if (other.plantUMLClassesDiagramRelations != null) {
                return false;
            }
        } else if (!plantUMLClassesDiagramRelations.equals(other.plantUMLClassesDiagramRelations)) {
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
    public Set < PlantUMLClassesDiagramElement > getPlantUMLClassesDiagramElements() {
        return new TreeSet < PlantUMLClassesDiagramElement >(plantUMLClassesDiagramElements);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations() {
        return new TreeSet < PlantUMLClassesDiagramRelation >(plantUMLClassesDiagramRelations);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String getPlantUMLTextDescription() {
        final StringBuilder plantUMLDeclaractionBuffer = new StringBuilder(START_PLANTUML);

        for (final WithDescription plantUMLElement : getPlantUMLClassesDiagramElements()) {
            plantUMLDeclaractionBuffer.append(LINE_SEPARATOR);
            plantUMLDeclaractionBuffer.append(plantUMLElement.getPlantUMLTextDescription());
        }

        for (final WithDescription plantUMLClassesDiagramRelation : getPlantUMLClassesDiagramRelations()) {
            plantUMLDeclaractionBuffer.append(LINE_SEPARATOR);
            plantUMLDeclaractionBuffer.append(plantUMLClassesDiagramRelation.getPlantUMLTextDescription());
        }

        plantUMLDeclaractionBuffer.append(LINE_SEPARATOR);
        plantUMLDeclaractionBuffer.append(END_PLANTUML);

        return plantUMLDeclaractionBuffer.toString();
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
        result = prime * result
                + ((plantUMLClassesDiagramElements == null) ? 0 : plantUMLClassesDiagramElements.hashCode());
        result = prime * result
                + ((plantUMLClassesDiagramRelations == null) ? 0 : plantUMLClassesDiagramRelations.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [plantUMLClassesDiagramElements=" + plantUMLClassesDiagramElements
                + ", plantUMLClassesDiagramRelations=" + plantUMLClassesDiagramRelations + "]";
    }
}
