/*
 PlantUMLClassesDiagramElement.java
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.element;

import java.io.Serializable;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.plantumldiagram.WithDescription;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public interface PlantUMLClassesDiagramElement extends WithDescription,
        DeepCloneable < PlantUMLClassesDiagramElement >, Serializable, Comparable < PlantUMLClassesDiagramElement > {

    /**
     * @return
     * @since 1.1.1
     */
    PlantUMLClassesDiagramElementTag getElementTag();

    /**
     * @return
     * @since 1.1.1
     */
    String getName();
}
