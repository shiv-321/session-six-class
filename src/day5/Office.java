package day5;

import java.util.logging.Logger;

public class Office {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//
//        Logger.getGlobal().info(employee.toString());
//
//        employee.setName("Subina");
//        employee.setSalary(5000);
//        employee.setPhoneNumber("123456789");
//        Logger.getGlobal().info(employee.toString());

        Employee employee1 = new Employee("Subina", 5000.0f, "123456789");

//        Logger.getGlobal().info(employee1.toString());

        Employee employee2 = new Employee("Subina", 5000.0f, "123456789", "11112223333");
        Logger.getGlobal().info(employee2.toString());




    }
}
