/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanclass;

/**
 *
 * @author Nickolas Reid
 */
public class InvalidDurationException extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidDurationException</code> without detail message.
     */
    public InvalidDurationException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidDurationException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidDurationException(String msg) {
        super(msg);
    }
}
