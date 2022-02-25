package day5;

import java.time.LocalDate;
import java.util.logging.Logger;

public class OfficePractice1 {
    public static void main(String[] args) {
        EmployeePractice1 employee1 = new EmployeePractice1("Shivaraj", 500, LocalDate.now());

        EmployeePractice1 employee2 = new EmployeePractice1("Bob", 1000, LocalDate.now());
        employee2.setAge(30);

        Logger.getGlobal().info(employee1.getName());
        Logger.getGlobal().info(employee2.getName());
    }
}
