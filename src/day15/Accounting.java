package day15;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Accounting {
    public static void main(String[] args) {

        Manager boss = new Manager("Rabina", 50, LocalDate.now(), 5000, 2000);

        Employee employee1 = new Employee("Subina", 28, LocalDate.now(), 4000);


        Logger.getGlobal().info(String.valueOf(boss.getSalary()));

        Logger.getGlobal().info(String.valueOf(employee1.getSalary()));
    }
}
