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

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType;

/**
 * The Java raw dependency, extracted from a Java source file, without any business control nor
 * checking.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaRawDependency implements Comparable < JavaRawDependency >, Serializable,
        DeepCloneable < JavaRawDependency > {

    /** Serial version UID. */
    private static final long serialVersionUID = -8047630217535429852L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaRawDependency.class.getName());

    /** The boolean telling if the java dependency is abstract or not. */
    private boolean isAbstract;

    /** The dependency package name, such as "java.lang". */
    private String packageName;

    /** The dependency java type, such as "class" or "interface". */
    private JavaType type;

    /** The dependency name, such as "String". */
    private String name;

    /** The boolean indicating if the dependency has native methods inside. */
    private boolean nativeMethods;

    /**
     * The {@link Set} of all dependency extensions full names (package + class), i.e. classes or
     * interfaces the dependency "extends".
     */
    private Set < String > parentExtentions;

    /**
     * The {@link Set} dependency implementations full names (package + class), i.e. interfaces the
     * dependency "implements".
     */
    private Set < String > parentImplementations;

    /**
     * Empty constructor.
     * 
     * @since 1.0
     */
    public JavaRawDependency() {
        super();
    }

    /**
     * Default constructor.
     * 
     * @param isAbs
     *            the boolean telling if the java dependency is abstract or not.
     * @param dependencyPackageName
     *            the dependency package name, such as "java.lang".
     * @param javaType
     *            the dependency java type, such as "class" or "interface".
     * @param dependencyName
     *            the dependency name, such as "String".
     * @param extentions
     *            the {@link Set} of all dependency extensions full names (package + class), i.e.
     *            classes or interfaces the dependency "extends".
     * @param implementations
     *            the {@link Set} dependency implementations full names (package + class), i.e.
     *            interfaces the dependency "implements".
     * @param nativeMth
     *            the boolean indicating if the dependency has native methods inside.
     * @since 1.0
     */
    public JavaRawDependency(final boolean isAbs, final String dependencyPackageName, final JavaType javaType,
            final String dependencyName, final Set < String > extentions, final Set < String > implementations,
            final boolean nativeMth) {
        setAbstract(isAbs);
        setPackageName(dependencyPackageName);
        setType(javaType);
        setName(dependencyName);
        setParentExtentions(extentions);
        setParentImplementations(implementations);
        setNativeMethods(nativeMth);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int compareTo(final JavaRawDependency j) {
        if (this == j) {
            return EQUAL.getResult();
        } else {
            final int comparison = packageName.compareTo(j.packageName);
            if (comparison == EQUAL.getResult()) {
                return name.compareTo(j.name);
            } else {
                return comparison;
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public JavaRawDependency deepClone() {
        JavaRawDependency j = null;

        try {
            j = (JavaRawDependency) super.clone();
            j.parentExtentions = new TreeSet < String >(getParentExtentions());
            j.parentImplementations = new TreeSet < String >(getParentImplementations());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return j;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
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
        final JavaRawDependency other = (JavaRawDependency) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (packageName == null) {
            if (other.packageName != null) {
                return false;
            }
        } else if (!packageName.equals(other.packageName)) {
            return false;
        }
        return true;
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
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
        return result;
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
     * Gets the value of <code>nativeMethods</code>.
     * 
     * @return the value of <code>nativeMethods</code>.
     * @see #setNativeMethods(boolean)
     * @since 1.0
     */
    public boolean hasNativeMethods() {
        return nativeMethods;
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
     * Sets the value of <code>nativeMethods</code>.
     * 
     * @param value
     *            the <code>nativeMethods</code> to set, can be <code>null</code>.
     * @see #hasNativeMethods()
     * @since 1.0
     */
    public void setNativeMethods(final boolean value) {
        nativeMethods = value;
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

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [isAbstract=" + isAbstract + ", packageName=" + packageName + ", type="
                + type + ", name=" + name + ", nativeMethods=" + nativeMethods + ", parentExtentions="
                + parentExtentions + ", parentImplementations=" + parentImplementations + "]";
    }
}
