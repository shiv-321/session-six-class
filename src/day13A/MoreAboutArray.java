package day13A;

import day5.Gender;

import java.util.Arrays;

public class MoreAboutArray {
    public static void main(String[] args) {

//        Employee[] employees = new Employee[5];
/**
 * we don't have index value so we cannot do any operation specific to index
 * we will never face a problem of index out bound in for each loop
 */
        /* employees[3] = new Employee("Shivaraj", 2000f, "6823464682", Gender.MALE, "111222333");

        int index = 0;

        for (Employee employee:employees) {
            if (index == 3) {
                    System.out.println(employee);
                    break;
                }
            else{
                    System.out.println("Not interested");
                }
            index++;
            }

         */

        // copying array
        Employee[] employees = new Employee[5];
        employees[3] = new Employee("Shivaraj", 2000f, "6823464682", Gender.MALE, "111222333");

        /*
        System.out.println("*****Before copying data****");
        for (Employee employee:employees) {
            System.out.println(employee);
        }
        Employee[] employeesCopy = employees;
        employeesCopy[4] =  new Employee("Subina", 5000f, "6823464692", Gender.FEMALE, "111222444");

        System.out.println("*****After copying*******");
        for (Employee employee:employees){
            System.out.println(employee);
        }
        */
        Employee[] employeesCopy = Arrays.copyOf(employees, employees.length);
        employeesCopy[4] = new Employee("Subina", 5000f, "6823464692", Gender.FEMALE, "111222444");
        for (Employee employee:employees){
            System.out.println(employee);
        }


    }
}


