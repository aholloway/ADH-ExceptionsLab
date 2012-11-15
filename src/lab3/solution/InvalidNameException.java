/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.solution;

import lab1.solution.*;

/**
 * added based on class question.  Not really part of lab1 solution.
 * @author aholloway
 */
public class InvalidNameException extends IllegalArgumentException {
    //Exception is a checked exception
    //runtime exceptions like Illegal Argument Exception are unchecked.

    //need to create a message property
    private String message = "field is required";

    public InvalidNameException() {
    }
    
    
    public String getMessage() {
        return message;
    }
}
