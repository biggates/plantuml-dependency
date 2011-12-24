/*
 ImportType.java
 Creation date : 6/11/2011
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

import static java.util.Arrays.asList;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

/**
 * This enumerations represents all kind of import types which can be used following the programming language, for
 * instance, in Java, two types can be used : standard imports and static imports. These types are naturally combined
 * with a display options to know if they have to appear in the generated plantUML description file. This is be used to
 * filter imports following their types.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public enum ImportType implements Displayable {
	/** The native import type. */
	NATIVE(NATIVE_METHODS),
	/** The standard import type. */
	STANDARD(IMPORTS),
	/** The static import type. */
	STATIC(STATIC_IMPORTS);

	/** The Set containing all import types which are available. */
	public static final Set<ImportType> IMPORT_TYPES = new TreeSet<ImportType>(asList(values()));

	/**
	 * The display options which filter the import type to be generated in the plantUML description file.
	 */
	private Display displayOption;

	/**
	 * Full constructor.
	 * 
	 * @param displayOpt
	 *            the display options which filter the import type to be generated in the plantUML description file,
	 *            mustn't be <code>null</code>.
	 * @since 1.1.1
	 */
	private ImportType(final Display displayOpt) {
		setDisplayOption(displayOpt);
	}

	/**
	 * Gets the value of <code>displayOption</code>.
	 * 
	 * @return the value of <code>displayOption</code>.
	 * @since 1.1.1
	 */
	public Display getDisplayOption() {
		return displayOption;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @since 1.1.1
	 */
	@Override
	public boolean isDisplayable(final Set<Display> displayOptions) {
		return displayOptions.contains(getDisplayOption());
	}

	/**
	 * Sets the value of <code>displayOption</code>.
	 * 
	 * @param value
	 *            the <code>displayOption</code> to set, can be <code>null</code>.
	 * @since 1.1.1
	 */
	private void setDisplayOption(final Display value) {
		displayOption = value;
	}
}
