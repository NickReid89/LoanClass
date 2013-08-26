/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanclass;

/**
 *
 * @author Nickolas Reid
 */
public class NegativeLoanFieldException extends Exception {

    /**
     * Creates a new instance of
     * <code>NegativeLoanFieldException</code> without detail message.
     */
    public NegativeLoanFieldException() {
    }

    /**
     * Constructs an instance of
     * <code>NegativeLoanFieldException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public NegativeLoanFieldException(String msg) {
        super(msg);
    }
}
