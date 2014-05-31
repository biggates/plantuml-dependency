/*
 DependencyType.java
 Creation date : 20/06/2010
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

package net.sourceforge.plantumldependency.cli.generic.type;

import java.io.Serializable;
import java.util.Set;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;
import net.sourceforge.plantumldependency.common.clone.DeepCloneable;

/**
 * The interface which describes a generic dependency type, no matter the programming language is. A
 * dependency type might be a class, an interface, an enumeration or an annotation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public interface DependencyType extends Comparable < DependencyType >, Serializable, DeepCloneable < DependencyType >,
        Displayable {

    /**
     * Gets the {@link Set} of all annotations as {@link GenericDependency} which are used by the
     * current dependency type. If no dependencies annotations are used, it returns an empty
     * {@link Set}.
     *
     * @return the {@link Set} of all annotations as {@link GenericDependency} which are used by the
     *         current dependency type.
     * @since 1.2.0
     */
    Set < GenericDependency > getAnnotationsDependencies();

    /**
     * Gets the dependency full name, usually the package and the dependency name.
     * <p>
     * For instance, in java it can be :<br>
     * <i>java.lang.String</i><br>
     * <i>java.io.Serializable</i><br>
     * <i>sun.font.Decoration</i>
     * </p>
     *
     * @return the dependency full name.
     * @since 1.0.0
     */
    String getFullName();

    /**
     * Gets the {@link ImportDependenciesCollection} containing all {@link GenericDependency} which
     * are needed by the current dependency type to work.
     * <p>
     * For instance, in java it is represented by the <i>import</i> keyword.
     * </p>
     *
     * @return the {@link ImportDependenciesCollection} instance containing all
     *         {@link GenericDependency} which are needed by the current dependency type to work.
     * @since 1.0.0
     */
    ImportDependenciesCollection getImportDependenciesCollection();

    /**
     * Gets the dependency name, usually the class name.
     * <p>
     * For instance, in java it can be :<br>
     * <i>String</i><br>
     * <i>Serializable</i><br>
     * <i>Decoration</i>
     * </p>
     *
     * @return the dependency name.
     * @see #setFullName(String, String)
     * @since 1.0.0
     */
    String getName();

    /**
     * Gets the dependency package name.
     * <p>
     * For instance, in java it can be :<br>
     * <i>java.lang</i><br>
     * <i>java.io</i><br>
     * <i>sun.font</i>
     * </p>
     *
     * @return the dependency package name.
     * @see #setFullName(String, String)
     * @since 1.0.0
     */
    String getPackageName();

    /**
     * Gets the {@link Set} of all parent extensions as {@link GenericDependency} which are used by
     * the current dependency type, i.e. extended. If no dependencies are extended, it returns an
     * empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>extends</i> keyword.
     * </p>
     *
     * @return the {@link Set} of all parent extensions as {@link GenericDependency} which are used
     *         by the current dependency type.
     * @since 1.2.0
     */
    Set < GenericDependency > getParentExtensionsDependencies();

    /**
     * Gets the {@link Set} of all parent interfaces as {@link GenericDependency} which are used by
     * the current dependency type, i.e. implemented. If no dependencies interfaces are implemented,
     * it returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>implements</i> keyword.
     * </p>
     *
     * @return the {@link Set} of all parent interfaces as {@link GenericDependency} which are used
     *         by the current dependency type.
     * @since 1.0.0
     */
    Set < GenericDependency > getParentImplementationsDependencies();

    /**
     * Gets the PlantUML classes diagram element describing the current dependency type in the
     * plantUML language. See the <a href=
     * "http://sourceforge.net/projects/plantuml/files/PlantUML%20Language%20Reference%20Guide.pdf/download"
     * >PlantUML Language Reference Guide.pdf</a> or <a
     * href="http://plantuml.sourceforge.net/classes.html"
     * >http://plantuml.sourceforge.net/classes.html</a> page.
     *
     * @return the plantUML classes diagram element as a {@link PlantUMLClassesDiagramElement}
     *         instance describing the current dependency type.
     * @since 1.1.1
     */
    PlantUMLClassesDiagramElement getPlantUMLClassesDiagramElement();

    /**
     * Gets the whole PlantUML classes diagram relations.
     *
     * @return the set of all PlantUML classes diagram relations as a {@link Set} of
     *         {@link PlantUMLClassesDiagramRelation} instances describing relations to imports and
     *         the dependency type parents.
     * @since 1.2.0
     */
    Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations();

    /**
     * Gets the PlantUML classes diagram relations, following the imports and the dependency type
     * parents.
     *
     * @param displayTypesOptions
     *            the {@link Set} of all display types options to display the PlantUML classes diagram
     *            relations, mustn't be <code>null</code>.
     * @return the set of all PlantUML classes diagram relations as a {@link Set} of
     *         {@link PlantUMLClassesDiagramRelation} instances describing relations to imports and
     *         the dependency type parents.
     * @since 1.1.1
     */
    Set < PlantUMLClassesDiagramRelation > getPlantUMLClassesDiagramRelations(Set < DisplayType > displayTypesOptions);

    /**
     * Sets the dependency full name, i.e. the package name and the class name.
     * <p>
     * For instance, in java it can be :<br>
     * <i>String</i><br>
     * <i>Serializable</i><br>
     * <i>Decoration</i>
     * </p>
     *
     * @param dependencyPackageName
     *            the new package name to set, may be <code>null</code>.
     * @param dependencyName
     *            the dependency name to set, mustn't be <code>null</code>.
     * @see #getName()
     * @see #getPackageName()
     * @since 1.2.0
     */
    void setFullName(String dependencyPackageName, String dependencyName);
}
