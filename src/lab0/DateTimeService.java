/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author aholloway
 */
public class DateTimeService {

    private Map<String, String> formatMap;

//    public DateTimeService() {
//        formatMap = new HashMap<>();
//        formatMap.put("SHORT", "M/d/yy");
//        formatMap.put("MEDIUM", "M/d/yyyy hh:mm a");
//    }
    //convert date to formatted string
    public String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    //type safety issue can be fixed with enum.  
    public Date formatString(String dateString, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateString);
    }
}
