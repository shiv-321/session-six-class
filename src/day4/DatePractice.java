package day4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {
    public static void main(String[] args) {

        Date date = new Date();
        Logger.getGlobal().info(String.valueOf("Today is: " + date));

        //current
        LocalDate localDate = LocalDate.now();
        Logger.getGlobal().info(String.valueOf("Current date is: " + localDate));

        //current
        LocalTime localTime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf("Given time: " + localTime));

        //Current
        LocalDateTime localDateTime = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf("Current date and time: " + localDateTime));

        //Formatting
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String formattedDate = dateTimeFormatter.format(localDateTime);
        Logger.getGlobal().info(formattedDate);

        //current
        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));
        Logger.getGlobal().info(String.valueOf("The current date is: " + calendar.getTime()));

        //Specific
        Calendar specificCalendar = Calendar.getInstance();
        specificCalendar.set(Calendar.YEAR, 1993);
        specificCalendar.set(Calendar.MONTH, 03);
        specificCalendar.set(Calendar.DAY_OF_MONTH, 03);
        Logger.getGlobal().info(String.valueOf(specificCalendar));
    }
}
