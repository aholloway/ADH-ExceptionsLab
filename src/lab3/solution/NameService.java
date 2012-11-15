package lab3.solution;

import lab2.solution.*;
import lab2.*;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
   // not used.  not useful in the event of more than two names.
    // private static final int LAST_NAME_IDX = 1;

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws NullPointerException,
            InvalidNameException {
        // check that name is not null
        if (fullName == null) {
            throw new NullPointerException("Full name was null.");
        }
        if (fullName.length()==0||fullName.charAt(0)==' '){
            throw new IndexOutOfBoundsException("Name cannot be empty or "
                    + "begin with a space.");
        }
        String[] nameParts = fullName.split(" ");
        int namePartsIndex = nameParts.length - 1;
        // if nameParts has length 0 throw an exception 
        if (namePartsIndex == 0) {
            throw new InvalidNameException("Name must have a space.");
        }
        
        return nameParts[namePartsIndex];
    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws NullPointerException,
            InvalidNameException {
        // check that name is not null
        if (fullName == null) {
            throw new NullPointerException("Full name was null.");
        }
        if (fullName.length()==0||fullName.charAt(0)==' '){
            throw new IndexOutOfBoundsException("Name cannot be empty or "
                    + "begin with a space.");
        }
        String[] nameParts = fullName.split(" ");
        int namePartsIndex = nameParts.length - 1;
        // if nameParts has length 0 throw an exception 
        if (namePartsIndex == 0) {
            throw new InvalidNameException("Name must have a space.");
        }
        

        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException();
        }
        return name.length();
    }
}
