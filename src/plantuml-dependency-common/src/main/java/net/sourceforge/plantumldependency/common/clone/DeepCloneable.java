/*
 DeepCloneable.java
 Creation date : 14/04/2010
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

package net.sourceforge.plantumldependency.common.clone;

/**
 * Interface which defines object which are able to be deep cloned.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @param <T>
 * @see java.lang.Cloneable
 * @since 1.3.0
 * @version 1.3.0
 */
public interface DeepCloneable < T > extends Cloneable {

    /**
     * Object which implements this method are able to be safely deep cloned, without any border
     * side effects.
     *
     * @return a deep clone of the current object.
     * @since 1.3.0
     */
    T deepClone();
}
