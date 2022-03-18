package day13;

import java.time.LocalDate;

public class InheritancePractice1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Shivaraj", LocalDate.now(), 1000);
        System.out.println(employee);
        System.out.println(employee.getSalary());
//        System.out.println(employee.toString()); // both is same


        Manager manager = new Manager("Subina", LocalDate.now(), 2000, 500);
        System.out.println(manager);
        System.out.println(manager.getSalary());


        Executive executive = new Executive("Aman", LocalDate.now(), 3000, 1000);
        System.out.println(executive);
        System.out.println(executive.getSalary());

        Employee employee1 = new Manager("Ashim", LocalDate.now(), 4000, 2000);
        System.out.println(employee1);
        System.out.println(employee1.getName());
        System.out.println(employee1.getLocalDate());
        System.out.println(employee1.getSalary());
//        System.out.println(employee1.getBonus); Not allowed
        System.out.println(((Manager)employee1).getBonus()); // can do typecasting

        Employee employee2 = new Executive("Runny", LocalDate.now(), 5000, 3000);
        System.out.println(employee2);


        Manager manager1 = new Manager();
        System.out.println(manager1);


    }
}
