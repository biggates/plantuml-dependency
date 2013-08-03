/*
 PlantUMLClassesDiagramRelationType.java
 Creation date : 2/01/2012
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

/**
 * The enumeration which lists all plantUML relation types available in the plantUML classes diagram
 * language.
 *
 * @see <a href="http://plantuml.sourceforge.net/classes.html#Relations">PlantUML classes diagram
 *      page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public enum PlantUMLClassesDiagramRelationType {

    /** The extend relation type. */
    EXTEND_RELATION_TYPE(" --|> "),

    /** The implement relation type. */
    IMPLEMENT_RELATION_TYPE(" --|> "),

    /** The use relation type. */
    USE_RELATION_TYPE(" ..> ");

    /** The right relation symbol used in the plantUML classes diagram language. */
    private String rightRelationSymbol;

    /**
     * Full constructor.
     *
     * @param rightSymbol
     *            the right relation symbol used in the plantUML classes diagram language.
     * @since 1.1.1
     */
    private PlantUMLClassesDiagramRelationType(final String rightSymbol) {
        rightRelationSymbol = rightSymbol;
    }

    /**
     * Gets the value of <code>rightRelationSymbol</code>.
     *
     * @return the value of <code>rightRelationSymbol</code>.
     * @since 1.1.1
     */
    public String getRightRelationSymbol() {
        return rightRelationSymbol;
    }
}
