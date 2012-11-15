package lab0.solution;

import java.util.Calendar;
import java.util.Date;


/**
 * This class is a simulation of a real world employee that manages
 * information about that employee.  (Not every class is a simulation - like
 * a primary number generator would not be a simulation).  Add any information
 * about the class that other programmers might want to know.  
 * 
 * CAUTION: this is a first draft and is likely to change.
 * author tag and version
 * @author Drew Holloway aholloway@mywctc.edu
 * @version 1.01
 */

/**
 * Employee stores information about an employee including 
 * firstName - employee's first name
 * lastName - employee's last name
 * ssn - employee's social security number
 * hireDate - employee's date of hire
 * daysVacation - integer value that holds number of vacation days that the
 *  employee gets per year.
 * 
 * @author aholloway
 * @version 1.01
 */
public class Employee {

    /** Global constant for maximum allowed vacation days */
    public static final int MAX_VACATION_DAYS = 28;
    
    public static final int MIN_VACATION_DAYS = 0;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private String[] badSsn = {
        "000000000", "111111111", "222222222", "333333333", 
        "444444444", "555555555", "666666666", "777777777",
        "888888888", "999999999", "123456789", "987654321"
    };

    /**
     * Default constructor.
     * 
     * Don't explain the how, just what it does.
     */
    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    /**
     * Custom, convenience constructor that accepts all properties
     * @param firstName - cannot be null or empty
     * @param lastName - cannot be null or empty
     * @param ssn - must be valid
     * @param hireDate - must be within acceptable range
     * @param daysVacation - must be within acceptable range
     */
    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        try {
            setFirstName(firstName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            setLastName(lastName);
            } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            setSsn(ssn);
            } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            setHireDate(hireDate);
            } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            setDaysVacation(daysVacation);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    /**
     * Sets vacation days allowed.
     * 
     * @param daysVacation
     * @throws IllegalArgumentException if value not in proper range
     */
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (daysVacation<MIN_VACATION_DAYS){
            throw new IllegalArgumentException("Vacation days may not be less than "
                    + MIN_VACATION_DAYS );
        }
        if (daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException("Vacation days may not be "
                    + "greater than " + MAX_VACATION_DAYS );
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     * @throws IllegalArgumentException 
     */
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (firstName==null){
            throw new IllegalArgumentException("firstName may not be null");
        }
        if (firstName.equals("")){
            throw new IllegalArgumentException("firstName may not be empty");
        }
        
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) throws IllegalArgumentException {
        // if null throw illegal argument exception
        if (hireDate==null){
            throw new IllegalArgumentException("Hire date may not be null.");
        }
        Date today = new Date();
        if (hireDate.after(today)){
             throw new IllegalArgumentException("Hire date may not be after "
                     + "today.");
        }
        
        Calendar cal = Calendar.getInstance();
                
        cal.set(1900, Calendar.JANUARY, 1);
        
        Date date = cal.getTime();
                
        if (hireDate.before(date)){
            throw new IllegalArgumentException("Hire date may not be prior to "
                    + "1900.");
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (lastName==null){
            throw new IllegalArgumentException("lastName may not be null");
        }
        if (lastName.equals("")){
            throw new IllegalArgumentException("lastName may not be empty");
        }
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (ssn==null){
            throw new IllegalArgumentException("ssn may not be null");
        }
        if (ssn.length()!=9){
            throw new IllegalArgumentException("ssn must be of lenght nine.");
        }
        
        for (String value : badSsn){
            if (value.equals(ssn)){
                throw new IllegalArgumentException("Illegal SSN value");
            }
        }
        
        char[] chars = ssn.toCharArray();
        for (char c : chars){
            if(!(Character.isDigit(c))){
                throw new IllegalArgumentException("must be all digits");
            }
        }
        
        this.ssn = ssn;
    }
}
