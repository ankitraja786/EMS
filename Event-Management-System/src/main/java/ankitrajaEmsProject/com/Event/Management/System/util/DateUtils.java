package ankitrajaEmsProject.com.Event.Management.System.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtils  {
private  static  final String DATE_FORMAT = "yyyy - MM-DD HH:mm:ss";

public static String formatDate(Date date){
    SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
     return formatter.format(date);
}
public  static Date parseDate(String dateStr) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
    return formatter.parse(dateStr);

}
public  static  boolean isPast(Date date){
    return date.before(new Date());
}

public  static boolean isFuture(Date date){
    return date.after(new Date());
}
}