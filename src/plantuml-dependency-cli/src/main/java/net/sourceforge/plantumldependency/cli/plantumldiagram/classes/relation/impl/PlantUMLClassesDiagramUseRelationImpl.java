/*
 PlantUMLClassesDiagramUseRelationImpl.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl;

import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelationType.USE_RELATION_TYPE;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramUseRelation;

/**
 * The default {@link PlantUMLClassesDiagramUseRelation} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramUseRelationImpl extends AbstractPlantUMLClassesDiagramRelation implements
        PlantUMLClassesDiagramUseRelation {

    /** Serial version UID. */
    private static final long serialVersionUID = -8771385906634491398L;

    /**
     * Full constructor.
     *
     * @param firstElt
     *            The first element of the relation, mustn't be <code>null</code> nor empty.
     * @param secondElt
     *            The second element of the relation, mustn't be <code>null</code> nor empty.
     * @since 1.1.1
     */
    public PlantUMLClassesDiagramUseRelationImpl(final PlantUMLClassesDiagramElement firstElt,
            final PlantUMLClassesDiagramElement secondElt) {
        super(firstElt, secondElt, USE_RELATION_TYPE);
    }
}
