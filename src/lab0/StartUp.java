
package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aholloway
 */
public class StartUp {
    public static void main(String[] args) {
        
        String firstName="";
        String lastName= null;
        String ssn=null;
               
        Calendar cal = Calendar.getInstance();
                
        cal.set(1899, Calendar.DECEMBER, 31);
        
        Date date = cal.getTime();
        
        int daysVacation=-2;
        
        
        Employee emp = new Employee(firstName,lastName,ssn,date,daysVacation);
    }
}
