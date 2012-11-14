package lab1.solution;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques. <p> Your challenge is to consider all the
 * possible things that can go wrong with this program and use exception
 * handling where appropriate to prevent the program from crashing. In addition
 * you must display a friendly error message in a JOptionPane and ask the user
 * to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    //not needed.  Occasionally the last name will not be the second 
    // entry in the name.
    //private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        
        String lastName = "";
        boolean error = true;
        do {
            try {
                String fullName = JOptionPane.showInputDialog("Enter full name:");
                if (fullName==null){
                    System.out.println("Cancelled...");
                    break;
                }

                lastName = app.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
                error = false;
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null,
                        "Name cannot be null and must have a space", "Error",
                        JOptionPane.ERROR_MESSAGE);
                
            }
        } while (error == true);

    }

    public String extractLastName(String fullName) throws IndexOutOfBoundsException{
        String[] nameParts = fullName.split(" ");
        int lastNameIndex=nameParts.length-1;
        if (lastNameIndex==0){
            throw new IndexOutOfBoundsException("");
        }
        return nameParts[lastNameIndex];
    }
}
