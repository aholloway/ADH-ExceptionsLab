package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid. <p> For example, String
 * arguments may be null or empty; other objects may be null; or primitive
 * numbers may be out of acceptable range. <p> You need to validate ALL method
 * parameters to make sure any and all arguments are valid. The only exception
 * is when any argument is acceptable based on requirements. Fix the code below
 * using if logic to validate method arguments and throw
 * IllegalArgumentException or a custom exception if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

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
     * self documenting when you put in throws
     * @param daysVacation
     * @throws IllegalArgumentException if value not in proper range
     */
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
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

    public void setFirstName(String firstName) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (firstName==""){
            throw new IllegalArgumentException("firstName may not be empty");
        }
        if (firstName==null){
            throw new IllegalArgumentException("firstName may not be null");
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
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

    public void setLastName(String lastName) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (lastName==""){
            throw new IllegalArgumentException("lastName may not be empty");
        }
        if (lastName==null){
            throw new IllegalArgumentException("lastName may not be null");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) throws IllegalArgumentException {
        // if null or empty, throw illegal argument exception
        if (ssn==""){
            throw new IllegalArgumentException("ssn may not be empty");
        }
        if (ssn==null){
            throw new IllegalArgumentException("ssn may not be null");
        }
        this.ssn = ssn;
    }
}
