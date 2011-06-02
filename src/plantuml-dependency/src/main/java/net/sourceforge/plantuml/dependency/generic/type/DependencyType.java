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

package net.sourceforge.plantuml.dependency.generic.type;

import java.io.Serializable;
import java.util.Set;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;

/**
 * The interface which describes a generic dependency type, no matter the programming language is. A
 * dependency type might be a class, an interface or an enumeration.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public interface DependencyType extends Comparable < DependencyType >, Serializable, DeepCloneable < DependencyType > {

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
     * @since 1.0
     */
    String getFullName();

    /**
     * Gets the {@link Set} of all {@link GenericDependency} which are needed by the current
     * dependency type to work. If no dependencies are needed, it returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>import</i> keyword.
     * </p>
     *
     * @return the {@link Set} of all {@link GenericDependency} which are needed by the current
     *         dependency type to work.
     * @since 1.0
     */
    Set < GenericDependency > getImportDependencies();

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
     * @since 1.0
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
     * @since 1.0
     */
    String getPackageName();

    /**
     * Gets the {@link Set} of all interface as {@link GenericDependency} which are used by the
     * current dependency type, i.e. extended or implemented. If no dependencies interfaces are
     * implemented nor extended, it returns an empty {@link Set}.
     * <p>
     * For instance, in java it is represented by the <i>implements</i> keyword.
     * </p>
     *
     * @return the {@link Set} of all interfaces as {@link GenericDependency} which are used by the
     *         current dependency type.
     * @since 1.0
     */
    Set < GenericDependency > getParentInterfaces();

    /**
     * Gets the PlantUML declaration describing the current dependency type. See the <a href=
     * "http://sourceforge.net/projects/plantuml/files/PlantUML%20Language%20Reference%20Guide.pdf/download"
     * >PlantUML Language Reference Guide.pdf</a> or <a
     * href="http://plantuml.sourceforge.net/classes.html"
     * >http://plantuml.sourceforge.net/classes.html</a> page.
     *
     * @return the plantUML declaration as a {@link StringBuffer} describing the current dependency
     *         type.
     * @since 1.0
     */
    StringBuffer getPlantUMLDeclaration();

    /**
     * Gets the PlantUML links description, following the imports and the dependency type parents.
     *
     * @return the plantUML description as a {@link StringBuffer} describing links to imports and
     *         the dependency type parents.
     * @since 1.0
     */
    StringBuffer getPlantUMLLinksDescription();

    /**
     * Tells if the dependency contains native methods or not.
     *
     * @return <code>true</code> if the dependency has native methods inside, <code>false</code>
     *         otherwise. Be careful, this property is <code>false</code> by default, i.e. as long
     *         as the dependency hasn't been parsed yet.
     * @since 1.0
     */
    boolean hasNativeMethods();
}
