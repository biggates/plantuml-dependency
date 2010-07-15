/*
 AbstractDependency.java
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

package net.sourceforge.plantuml.dependency;

/**
 * The interface which describes a generic abstract dependency, no matter the programming language.
 * A dependency might be a class, an interface or an enumeration but it might not be determined when
 * the abstract dependency is created. It is the underlying {@link DependencyType} which concretely
 * determines its real type, such as class, enum or interface. An {@link AbstractDependency} just
 * mean that an object exists, but it only contains the minimum information we can have on this
 * object at the beginning. All details are described by the underlying {@link DependencyType} when
 * it is a concrete instance.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public interface AbstractDependency extends Comparable < AbstractDependency > {

    /**
     * Gets the underlying dependency type, which determines the real nature of the dependency.
     * 
     * @return the {@link DependencyType} instance of the current abstract dependency.
     * @since 1.0
     */
    DependencyType getDependencyType();

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
     * Sets the underlying dependency type, which determines the real nature of the dependency.
     * 
     * @param value
     *            the {@link DependencyType} instance of the current abstract dependency, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    void setDependencyType(DependencyType value);
}
