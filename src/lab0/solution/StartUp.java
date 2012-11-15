
package lab0.solution;

import lab0.*;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aholloway
 */
public class StartUp {
    public static void main(String[] args) {
        
        //int x= 0044404;
        //System.out.println(x);
        
        String firstName="";
        String lastName= null;
        String ssn="111111111";
               
        Calendar cal = Calendar.getInstance();
                
        cal.set(2012, Calendar.DECEMBER, 31);
        
        Date date = cal.getTime();
        
        int daysVacation=-2;
        
        
        Employee emp = new Employee(firstName,lastName,ssn,date,daysVacation);
    }
}
