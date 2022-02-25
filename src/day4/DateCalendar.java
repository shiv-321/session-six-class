package day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

public class DateCalendar {
    public static void main(String[] args) throws ParseException {
        //convert Date to String
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
//        String date = sdf.format(new Date());
//        Logger.getGlobal().info(String.valueOf(date));
//
//        //Converting String to Date
//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//        String dateInString = "31-08-1982 10:20:56";
//        Date date1 = sdf1.parse(dateInString);
//        System.out.println(date1);
//
//
//        //Get current date time
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Logger.getGlobal().info(String.valueOf("Current date and time: " + localDateTime));
//
//        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("M/dd/yyyy hh:mm:ss a");
//        String formattedDateTime = format1.format(localDateTime);
//        Logger.getGlobal().info(String.valueOf(formattedDateTime));

        //Convert calendar to Date
        Calendar calendar = Calendar.getInstance();
        Date date2 = calendar.getTime();

        //Get current date time using Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH: mm:ss a");
        Calendar calendar1 = new GregorianCalendar(2013,0,31);
        System.out.println(sdf.format(calendar1.getTime()));


    }
}
