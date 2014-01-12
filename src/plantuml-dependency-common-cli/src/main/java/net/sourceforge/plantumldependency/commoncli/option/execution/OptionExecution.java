/*
 OptionExecution.java
 Creation date : 9/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.execution;

import java.io.Serializable;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

/**
 * The interface which describes an option execution, i.e. which executes the option.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface OptionExecution extends Comparable < OptionExecution >, Serializable, DeepCloneable < OptionExecution > {

    /**
     * Executes the option.
     *
     * @throws CommandLineException
     *             if any exception occurs during the execution.
     * @since 1.3.0
     */
    void execute() throws CommandLineException;

    /**
     * Gets the option execution priority, which is used to order the executions.
     *
     * @return the option priority as an integer.
     * @since 1.3.0
     */
    int getPriority();
}
