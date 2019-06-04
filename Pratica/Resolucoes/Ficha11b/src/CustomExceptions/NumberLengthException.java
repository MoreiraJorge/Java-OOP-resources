/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomExceptions;

/**
 *
 * @author Jorge Moreira
 */
public class NumberLengthException extends Exception {

    /**
     *
     * @param message
     */
    public NumberLengthException(String message) {
        super(message);
    }
}
