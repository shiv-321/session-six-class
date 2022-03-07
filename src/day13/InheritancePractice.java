package day13;

import java.time.LocalDate;
import java.util.logging.Logger;

public class InheritancePractice {
    public static void main(String[] args) {
        Employee employee = new Employee("Shivaraj", LocalDate.now(), 5000);

//        Logger.getGlobal().info(String.valueOf(employee));

        Logger.getGlobal().info(String.valueOf(employee.getSalary()));


        Manager manager = new Manager("Man", LocalDate.now(), 10000, 1000);


//        Employee manager1 = new Manager("Man", LocalDate.now(), 10000, 1000);
//        ((Manager) manager1).getBonus();

        // Here variable form employee class is holding the object of manager class
        // and if we want to call getBonus field which is not in employee we need to do type casting
        // for that we can write ((Manager) manager1).getBonus();

        Logger.getGlobal().info(String.valueOf(manager));

        Logger.getGlobal().info(String.valueOf(manager.getSalary()));

        Executive executive = new Executive("Exe", LocalDate.now(), 50000, 5000);
//        Employee executive1 = new Executive("Exe", LocalDate.now(), 50000, 5000);
        Logger.getGlobal().info(String.valueOf(executive));
    }
}
