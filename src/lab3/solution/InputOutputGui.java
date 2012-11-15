package lab3.solution;

import lab2.solution.*;
import lab2.*;
import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {

        boolean error = true;

        do {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = "";
            try {
                lastName = nameService.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
                error = false;
            } catch (NullPointerException npe) {
                System.out.println("Cancelled...");
                System.exit(0);
            } catch (InvalidNameException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (error == true);
    }
}
