/*
 InfoConstants.java
 Creation date : 2/07/2010
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

package net.sourceforge.plantumldependency.commoncli.constants.log;

/**
 * The class which defines all info messages constants which are written in the log file. The
 * messages also contains the info code.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public final class InfoConstants {

    /** The argument not specified info message. */
    public static final String ARGUMENT_NOT_SPECIFIED_INFO = "[info-mazix-cli-000] : Argument of the option \"{0}\" not specified";

    /** The option specified info message. */
    public static final String OPTION_SPECIFIED_INFO = "[info-mazix-cli-001] : Option \"{0}\" has been specified";

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.3.0
     */
    private InfoConstants() {
        super();
    }
}
