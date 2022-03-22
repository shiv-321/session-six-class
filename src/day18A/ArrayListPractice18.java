package day18A;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListPractice18 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>(20);

        employees.add(new Employee("Shivaraj", LocalDate.now(), 100));
        employees.add(new Employee("Ram", LocalDate.now(), 200));
        employees.add(new Employee("Hari", LocalDate.now(), 500));

        System.out.println(employees);

        System.out.println("**************After removing*************");
//        employees.remove(1);
//        System.out.println(employees);

        employees.remove(new Employee("Ram", LocalDate.now(), 200));
        System.out.println(employees);


    }
}
