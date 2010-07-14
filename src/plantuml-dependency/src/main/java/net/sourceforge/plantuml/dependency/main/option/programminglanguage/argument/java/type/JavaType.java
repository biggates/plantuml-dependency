/*
 JavaType.java
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type;

import static java.util.Collections.unmodifiableMap;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.TEMPLATE_REGEXP;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.AbstractDependency;
import net.sourceforge.plantuml.dependency.DependencyType;

/**
 * This interface contains all supported meshes types and defines all supported operation on 3D
 * meshes.
 * 
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 1.0
 * @version 1.0
 */
public abstract class JavaType implements Comparable < JavaType > {

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int compareTo(JavaType o) {
        if (this == o) {
            return EQUAL.getResult();
        } else {
            return getName().compareTo(o.getName());
        }
    }

    /** The java programming language. */
    public static final JavaType CLASS = new ClassJavaType("class");

    public static final JavaType ENUM = new EnumJavaType("enum");

    /** The c++ programming language. */
    public static final JavaType INTERFACE = new InterfaceJavaType("interface");

    /** The number of millisecond in one second. */
    private static final Map < String, JavaType > JAVA_TYPE_MAP = createJavaTypeMap();

    /**
     * @return
     * @since 1.0
     */
    private static Map < String, JavaType > createJavaTypeMap() {
        final Map < String, JavaType > javaTypeMap = new TreeMap < String, JavaType >();

        javaTypeMap.put(CLASS.getName(), CLASS);
        javaTypeMap.put(ENUM.getName(), ENUM);
        javaTypeMap.put(INTERFACE.getName(), INTERFACE);

        return unmodifiableMap(javaTypeMap);
    }

    public static Collection < JavaType > getProgrammingLanguageList() {
        return JAVA_TYPE_MAP.values();
    }

    public static JavaType valueOfIgnoringCase(String javaTypeName) {
        JavaType javaType = null;
        if (isEmpty(javaTypeName)) {
            // TODO throw logicexception
        } else {
            javaType = JAVA_TYPE_MAP.get(javaTypeName.toLowerCase());
            if (javaType == null) {
                // TODO throw logicexception
            } else {

            }
        }

        return javaType;
    }

    private String name;

    /**
     * Gets the value of <code>name</code>.
     * 
     * @return the value of <code>name</code>.
     * @see #setname(
     * @since 1.0
     */
    private String getName() {
        return name;
    }

    /**
     * Sets the value of <code>name</code>.
     * 
     * @param value
     *            the <code>name</code> to set, can be <code>null</code>.
     * @see #getname(
     * @since 1.0
     */
    private void setName(String value) {
        name = value;
    }

    protected JavaType(final String programmingLanguageName) {
        setName(programmingLanguageName);
    }

    /**
     * @param group
     * @return
     * @since 1.0
     */
    protected Set < String > extractParents(String group) {
        Set < String > parents = new TreeSet < String >();
        if (isEmpty(group)) {
            // TODO log no parent interface
        } else {
            final String removeTemplateStr = TEMPLATE_REGEXP.matcher(group).replaceAll(BLANK_STRING);
            final StringTokenizer tokenizer = new StringTokenizer(removeTemplateStr, COMMA_CHAR);
            while (tokenizer.hasMoreTokens()) {
                final String interfaceName = tokenizer.nextToken().trim();
                parents.add(interfaceName);
            }
        }
        return parents;
    }

    /**
     * @param group
     * @return
     * @since 1.0
     */
    public abstract Set < String > extractParentImplementations(String group);

    /**
     * @param group
     * @return
     * @since 1.0
     */
    public abstract Set < String > extractParentExtentions(String group);

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param isAbstract
     * @param importDependencies
     * @param parentImplementationsDependencies
     * @param parentExtentionsDependencies
     * @return
     * @since 1.0
     */
    public abstract DependencyType createDependencyType(String dependencyName, String dependencyPackageName,
            boolean isAbstract, Set < AbstractDependency > importDependencies,
            Set < AbstractDependency > parentImplementationsDependencies,
            Set < AbstractDependency > parentExtentionsDependencies);

    /**
     * @param parentType
     * @param parentName
     * @param packageName
     * @return
     * @since 1.0
     */
    public abstract DependencyType createParentDependencyType(ParentType parentType, String parentName,
            String packageName);
}
