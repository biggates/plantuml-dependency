/*
 AboutOptionExecution.java
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

package net.sourceforge.plantumldependency.commoncli.option.impl.about;

import static java.util.logging.Level.INFO;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.HYPHEN_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.TAB_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.JAVA_PROGRAM_NULL_ERROR;

import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.AbstractOptionExecution;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;

/**
 * The default option execution associated to the "-about" option, displaying the program authors
 * information.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class AboutOptionExecution extends AbstractOptionExecution {

    /** Serial version UID. */
    private static final long serialVersionUID = 5829000495584908599L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AboutOptionExecution.class.getName());

    /** The java program to display authors information. */
    private JavaProgram javaProgram;

    /**
     * Default constructor.
     *
     * @param program
     *            the java program to display authors information, mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options executions</i>.
     * @since 1.3.0
     */
    public AboutOptionExecution(final JavaProgram program, final int optionPriority) {
        super(optionPriority);
        setJavaProgram(program);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public AboutOptionExecution deepClone() {
        final AboutOptionExecution a = (AboutOptionExecution) super.deepClone();
        a.javaProgram = getJavaProgram().deepClone();
        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void execute() throws CommandLineException {
        final StringBuilder buffer = new StringBuilder(getJavaProgram().getName());
        buffer.append(" authors :");
        buffer.append(LINE_CHAR);

        for (final String author : getJavaProgram().getAuthors()) {
            buffer.append(LINE_CHAR);
            buffer.append(TAB_CHAR);
            buffer.append(HYPHEN_CHAR);
            buffer.append(SPACE_CHAR);
            buffer.append(author);
        }

        buffer.append(LINE_CHAR);
        buffer.append(LINE_CHAR);
        buffer.append(getJavaProgram().getName());
        buffer.append(" licenses :");
        buffer.append(LINE_CHAR);

        for (final String license : getJavaProgram().getLicenseNames()) {
            buffer.append(LINE_CHAR);
            buffer.append(TAB_CHAR);
            buffer.append(HYPHEN_CHAR);
            buffer.append(SPACE_CHAR);
            buffer.append(license);
        }

        final String bufferStr = buffer.toString();
        System.out.println(bufferStr);
        LOGGER.log(INFO, bufferStr);
    }

    /**
     * Gets the value of <code>javaProgram</code>.
     *
     * @return the value of <code>javaProgram</code>.
     * @see #setJavaProgram(JavaProgram)
     * @since 1.3.0
     */
    private JavaProgram getJavaProgram() {
        return javaProgram;
    }

    /**
     * Sets the value of <code>javaProgram</code>.
     *
     * @param value
     *            the <code>javaProgram</code> to set, can be <code>null</code>.
     * @see #getJavaProgram()
     * @since 1.3.0
     */
    private void setJavaProgram(final JavaProgram value) {
        checkNull(value, JAVA_PROGRAM_NULL_ERROR);

        javaProgram = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + ",javaProgram=" + javaProgram + "]";
    }
}
