/*
 JavaRawDependency.java
 Creation date : 19/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java;

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;

import java.util.Set;

import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaRawDependency {

    private boolean isAbstract;

    private String packageName;

    private JavaType type;

    private String name;

    private Set < String > parentExtentions;

    private Set < String > parentImplementations;

    /**
     * Gets the value of <code>name</code>.
     * 
     * @return the value of <code>name</code>.
     * @see #setName(String)
     * @since 1.0
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the full name of the dependency, i.e. the package name + the class name.
     * 
     * @return the the full name of the dependency.
     * @since 1.0
     */
    public String getFullName() {
        return getPackageName() + DOT_CHAR + getName();
    }

    /**
     * Gets the value of <code>packageName</code>.
     * 
     * @return the value of <code>packageName</code>.
     * @see #setPackageName(String)
     * @since 1.0
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Gets the value of <code>parentExtentions</code>.
     * 
     * @return the value of <code>parentExtentions</code>.
     * @see #setParentExtentions(Set)
     * @since 1.0
     */
    public Set < String > getParentExtentions() {
        return parentExtentions;
    }

    /**
     * Gets the value of <code>parentImplementations</code>.
     * 
     * @return the value of <code>parentImplementations</code>.
     * @see #setParentImplementations(Set)
     * @since 1.0
     */
    public Set < String > getParentImplementations() {
        return parentImplementations;
    }

    /**
     * Gets the value of <code>type</code>.
     * 
     * @return the value of <code>type</code>.
     * @see #setType(JavaType)
     * @since 1.0
     */
    public JavaType getType() {
        return type;
    }

    /**
     * Gets the value of <code>isAbstract</code>.
     * 
     * @return the value of <code>isAbstract</code>.
     * @see #setAbstract(boolean)
     * @since 1.0
     */
    public boolean isAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of <code>isAbstract</code>.
     * 
     * @param value
     *            the <code>isAbstract</code> to set, can be <code>null</code>.
     * @see #isAbstract()
     * @since 1.0
     */
    public void setAbstract(final boolean value) {
        isAbstract = value;
    }

    /**
     * Sets the value of <code>name</code>.
     * 
     * @param value
     *            the <code>name</code> to set, can be <code>null</code>.
     * @see #getName()
     * @since 1.0
     */
    public void setName(final String value) {
        name = value;
    }

    /**
     * Sets the value of <code>packageName</code>.
     * 
     * @param value
     *            the <code>packageName</code> to set, can be <code>null</code>.
     * @see #getPackageName()
     * @since 1.0
     */
    public void setPackageName(final String value) {
        packageName = value;
    }

    /**
     * Sets the value of <code>parentExtentions</code>.
     * 
     * @param value
     *            the <code>parentExtentions</code> to set, can be <code>null</code>.
     * @see #getParentExtentions()
     * @since 1.0
     */
    public void setParentExtentions(final Set < String > value) {
        parentExtentions = value;
    }

    /**
     * Sets the value of <code>parentImplementations</code>.
     * 
     * @param value
     *            the <code>parentImplementations</code> to set, can be <code>null</code>.
     * @see #getParentImplementations()
     * @since 1.0
     */
    public void setParentImplementations(final Set < String > value) {
        parentImplementations = value;
    }

    /**
     * Sets the value of <code>type</code>.
     * 
     * @param value
     *            the <code>type</code> to set, can be <code>null</code>.
     * @see #getType()
     * @since 1.0
     */
    public void setType(final JavaType value) {
        type = value;
    }
}
