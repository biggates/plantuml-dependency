/*
 Displayable.java
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

package net.sourceforge.plantumldependency.cli.generic.type;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.main.option.display.argument.Display;

/**
 * The interface which describes a displayable element, i.e. an element which can be displayed or
 * not in the generated plantUML description file.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public interface Displayable {

    /**
     * Tells if the dependency has to be displayed following the passed display options.
     *
     * @param displayOptions
     *            the {@link Set} of display options, mustn't be <code>null</code>, if empty, this
     *            method always returns <code>false</code>.
     * @return <code>true</code> if the dependency has to be displayed, <code>false</code>
     *         otherwise.
     * @since 1.1.1
     */
    boolean isDisplayable(Set < Display > displayOptions);
}
