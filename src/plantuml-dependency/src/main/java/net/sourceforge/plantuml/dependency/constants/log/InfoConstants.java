/*
 InfoConstants.java
 Creation date : 13/07/2010
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

package net.sourceforge.plantuml.dependency.constants.log;

/**
 * The class which defines all info messages constants which are written in the log file. The
 * messages also contains the info code.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0
 * @version 1.1.0
 */
public final class InfoConstants {

    /** The execution time info message. */
    public static final String EXECUTION_TIME_INFO = "[info-plantuml-dependency-000] : Executed in \"{0}\" ms";

    /** The PlantUML dependency arguments info message. */
    public static final String PLANTUML_DEPENDENCY_ARGUMENTS_INFO = "[info-plantuml-dependency-001] : PlantUML Dependency arguments : \"{0}\"";

    /** The starting PlantUML dependency info message. */
    public static final String STARTING_PLANTUML_DEPENDENCY_INFO = "[info-plantuml-dependency-002] : Starting PlantUML Dependency";

    /** The treated dependencies info message. */
    public static final String TREATED_DEPENDENCY_INFO = "[info-plantuml-dependency-003] : Number of processed dependencies : \"{0}\"";

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private InfoConstants() {
        super();
    }
}
