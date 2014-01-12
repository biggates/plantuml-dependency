/*
 JavaProgramExecutionImpl.java
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

package net.sourceforge.plantumldependency.commoncli.program.execution.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_EXECUTIONS_NULL_ERROR;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;

/**
 * The default {@link JavaProgramExecution} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class JavaProgramExecutionImpl implements JavaProgramExecution {

    /** Serial version UID. */
    private static final long serialVersionUID = 8850565339062462441L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaProgramExecutionImpl.class.getName());

    /** The {@link Set} of all option executions. */
    private Set < OptionExecution > optionExecutions;

    /**
     * Default constructor.
     *
     * @param executions
     *            the {@link Set} of all option executions, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public JavaProgramExecutionImpl(final Set < OptionExecution > executions) {
        setOptionExecutions(executions);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final JavaProgramExecution o) {
        return EQUAL.getResult();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public JavaProgramExecution deepClone() {
        JavaProgramExecutionImpl j = null;

        try {
            j = (JavaProgramExecutionImpl) super.clone();
            j.optionExecutions = new TreeSet < OptionExecution >();
            for (final OptionExecution optionExecution : getOptionExecutions()) {
                j.optionExecutions.add(optionExecution.deepClone());
            }
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return j;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
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
        final JavaProgramExecutionImpl other = (JavaProgramExecutionImpl) obj;
        if (optionExecutions == null) {
            if (other.optionExecutions != null) {
                return false;
            }
        } else if (!optionExecutions.equals(other.optionExecutions)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void execute() throws CommandLineException {
        for (final OptionExecution optionExecution : getOptionExecutions()) {
            optionExecution.execute();
        }
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < OptionExecution > getOptionExecutions() {
        return optionExecutions;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((optionExecutions == null) ? 0 : optionExecutions.hashCode());
        return result;
    }

    /**
     * Sets the value of <code>optionExecutions</code>.
     *
     * @param value
     *            the <code>optionExecutions</code> to set, can be <code>null</code>.
     * @see #getOptionExecutions()
     * @since 1.3.0
     */
    private void setOptionExecutions(final Set < OptionExecution > value) {
        checkNull(value, OPTION_EXECUTIONS_NULL_ERROR);

        optionExecutions = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [optionExecutions=" + optionExecutions + "]";
    }
}
