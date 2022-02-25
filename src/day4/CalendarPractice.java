package day4;

import java.util.Calendar;

public class CalendarPractice {
    public static void main(String[] args) {
//      b

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        System.out.println("Output: " + c);
        System.out.println("Today's date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Year: " + c.get(Calendar.YEAR));

        System.out.println("Day of the year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of the month: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the week: " + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("Week of the year: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of the month: " + c.get(Calendar.WEEK_OF_MONTH));


    }
}
