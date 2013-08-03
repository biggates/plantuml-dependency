/*
 PlantUMLCLassesDiagramElementTag.java
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.tag;

/**
 * The enumeration which lists all plantUML element tags available in the plantUML classes diagram
 * language.
 *
 * @see <a href="http://plantuml.sourceforge.net/classes.html#Abstract">PlantUML classes diagram
 *      page</a>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.2.0
 */
public enum PlantUMLClassesDiagramElementTag {

    /** The "abstract class" tag. */
    ABSTRACT_CLASS_TAG("abstract class "),

    /** The "annotation" tag. */
    ANNOTATION_TAG("annotation "),

    /** The "class" tag. */
    CLASS_TAG("class "),

    /** The "enum" tag. */
    ENUM_TAG("enum "),

    /** The "interface" tag. */
    INTERFACE_TAG("interface ");

    /** The tag name representing the element in the plantUML classes diagram language. */
    private String tagName;

    /**
     * Full constructor.
     *
     * @param name
     *            the tag name representing the element in the plantUML classes diagram language.
     * @since 1.1.1
     */
    private PlantUMLClassesDiagramElementTag(final String name) {
        tagName = name;
    }

    /**
     * Gets the value of <code>tagName</code>.
     *
     * @return the value of <code>tagName</code>.
     * @since 1.1.1
     */
    public String getTagName() {
        return tagName;
    }
}
