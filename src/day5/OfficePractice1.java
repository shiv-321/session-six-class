package day5;

import java.time.LocalDate;
import java.util.logging.Logger;

public class OfficePractice1 {
    public static void main(String[] args) {
        EmployeePractice1 employee1 = new EmployeePractice1(null, 500, null);

        EmployeePractice1 employee2 = new EmployeePractice1("Bob", 1000, LocalDate.now());
        employee2.setAge(30);

        Logger.getGlobal().info(employee1.getName());
        Logger.getGlobal().info(String.valueOf(employee1.getName().length()));
        Logger.getGlobal().info(String.valueOf(employee1.getJoiningDate()));


//        Logger.getGlobal().info(employee2.getName());
    }
}
