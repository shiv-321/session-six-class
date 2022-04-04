package day24;

import java.util.EnumSet;

public enum Weekdays {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {


        EnumSet<Weekdays> always = EnumSet.allOf(Weekdays.class);
        EnumSet<Weekdays> never = EnumSet.noneOf(Weekdays.class);
        EnumSet<Weekdays> workday = EnumSet.range(Weekdays.MONDAY,
                Weekdays.FRIDAY);
        EnumSet<Weekdays> mwf = EnumSet.of(Weekdays.MONDAY, Weekdays.WEDNESDAY,
                Weekdays.FRIDAY);

        System.out.println(always);
        System.out.println(never);
        System.out.println(workday);
        System.out.println(mwf);
    }
}
