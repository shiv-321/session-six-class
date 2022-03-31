package day19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.EnumSet;

public class EnumPractice {
    public static void main(String[] args) {

        System.out.println(WeekDay.FRIDAY.getAbbr());



        // if I don't know about the enum class
        ArrayList<WeekDay> allDayList = new ArrayList<>();
        allDayList.add(WeekDay.SUNDAY);
        allDayList.add(WeekDay.MONDAY);
        allDayList.add(WeekDay.TUESDAY);
        allDayList.add(WeekDay.WEDNESDAY);
        allDayList.add(WeekDay.THURSDAY);
        allDayList.add(WeekDay.FRIDAY);
        allDayList.add(WeekDay.SATURDAY);

        System.out.println(allDayList);


        // create enum list -> also called converting enum class to array
        EnumSet<WeekDay> allDays = EnumSet.allOf(WeekDay.class);
        System.out.println(allDays);

        // removing everything from the enum list
        EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class);
        System.out.println(never);

        //creating sub list
        EnumSet<WeekDay> workDay = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println(workDay);

        //getting random day
        EnumSet<WeekDay> randoms = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY );
        System.out.println(randoms);



    }
}
