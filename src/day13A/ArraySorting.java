package day13A;
import day5.Gender;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Shivaraj", 1000f, "1111111", Gender.MALE, "22222222");
        employees[1] = new Employee("Mahesh", 2000f, "3333333", Gender.FEMALE, "44444444");
        employees[2] = new Employee("Subash", 3000f, "5555555", Gender.MALE, "6666666666");


        System.out.println("**************Before sorting*************");
        for (Employee employee:employees){
            System.out.println(employee);
        }
        Arrays.sort(employees);

        System.out.println("*************After sorting************");
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
