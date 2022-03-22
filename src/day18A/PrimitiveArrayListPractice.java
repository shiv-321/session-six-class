package day18A;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class PrimitiveArrayListPractice {
    public static void main(String[] args) {

        ArrayList<IntegerWrapper> ints = new ArrayList<IntegerWrapper>(); // not allow to use primitive data types
        ints.add(new IntegerWrapper(2));

        ArrayList<Integer> ints1 = new ArrayList<Integer>(); // not allow to use primitive data types
        ints1.add(2);
        ints1.add(3);
        ints1.add(5);
        ints1.add(6);
        ints1.add(10);
        Logger.getGlobal().info(String.valueOf(ints1));

//        Integer integer = ints1.get(3);
        int integer = ints1.get(3);
        Logger.getGlobal().info(String.valueOf(integer));

        ints1.remove(Integer.valueOf(2));
        Logger.getGlobal().info(String.valueOf(ints1));

        ints1.removeAll(ints1);
        Logger.getGlobal().info(String.valueOf(ints1));

        ArrayList<Employee> employees = new ArrayList<>(20);


        employees.add(new Employee("Shivaraj", LocalDate.now(), 100));
        employees.add(new Employee("Ram", LocalDate.now(), 2000));
        employees.add(new Employee("Hari", LocalDate.now(), 500));

        System.out.println("**********Before removing**********");
        System.out.println(employees);

//        employees.remove(0);
        employees.remove(new Employee("Ram", LocalDate.now(), 200));
        System.out.println("***********After removing*******");
        System.out.println(employees);

        boolean isPresent = employees.contains(new Employee("Shivaraj", LocalDate.now(), 100));
        System.out.println(isPresent);

        // this is returning true value because object is same and we have already done the overriding in the Employee class
        // if we remove the overriding method from the Employee class we will get false result
        // because contains method also need override the equals method











    }
}
/**
 * In case of wrapper classes (Integer) we can just hold the data as primitive data type
 * Although the ArrayList (Integer) is of type Integer which is return object of Integer by using .get but we can store in the int (primitive data type)
 * this is because of autoboxing
 */
