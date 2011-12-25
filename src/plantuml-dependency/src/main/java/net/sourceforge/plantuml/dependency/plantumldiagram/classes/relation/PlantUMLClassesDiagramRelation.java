/*
 PlantUMLClassesDiagramRelation.java
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation;

import java.io.Serializable;

import net.sourceforge.mazix.components.clone.DeepCloneable;

/**
 * The mother interface of all plantUML classes diagram relations. The classic relations used are usually "implements",
 * "extends" and "uses".<br>
 * A relation contains two element and the relation should always be read as follows :<br>
 * "First Element -> Second Element"
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public interface PlantUMLClassesDiagramRelation extends DeepCloneable<PlantUMLClassesDiagramRelation>, Serializable,
		Comparable<PlantUMLClassesDiagramRelation> {

	/**
	 * Gets the first element name of the relation. For instance, it can be "java.lang.String".
	 * 
	 * @return the first element name of the relation.
	 * @since 1.1.1
	 */
	String getFirstElementName();

	/**
	 * Gets the second element name of the relation. For instance, it can be "java.lang.String".
	 * 
	 * @return the second element name of the relation.
	 * @since 1.1.1
	 */
	String getSecondElementName();
}
