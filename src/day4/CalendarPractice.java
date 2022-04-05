package day4;

import day19.Day;

import java.time.Month;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarPractice {
    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();   //Factory method
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        System.out.println(c.getTime()); // this gives current time
        System.out.println("Output: " + c);
        System.out.println("Today's date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Year: " + c.get(Calendar.YEAR));

        System.out.println("Day of the year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of the month: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the week: " + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("Week of the year: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of the month: " + c.get(Calendar.WEEK_OF_MONTH));

        for (Month m: Month.values())
            if (m.ordinal()==c.get(Calendar.MONTH))
                System.out.println(m);

        for (Day d: Day.values())
            if (d.ordinal()+1==c.get(Calendar.DAY_OF_WEEK))
                System.out.println(d);

        // creating different timezone id

        String [] tz = TimeZone.getAvailableIDs();
        for (String zone: tz){
            System.out.println(zone);
        }
        TimeZone tz1 = TimeZone.getTimeZone("US/Central");
        TimeZone.setDefault(tz1);
        c = Calendar.getInstance(tz1);
        System.out.println(c.getTime());


    }
}
