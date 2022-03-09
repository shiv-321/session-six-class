package day13A;

import day5.Gender;

import java.util.Arrays;

public class PrimitiveArraySorting {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 9, 5, 3};

        //Accessing original elements of array
//        for (int num :numbers){
//            System.out.print(num + " ");
//        }
        //Accessing the elements after sorting
//        Arrays.sort(numbers);
//        for (int num :numbers){
//            System.out.print(num + " ");
//        }
        //checking sorting
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("This array is sorted");
        } else {
            System.out.println("This array is not sorted");
        }
    }
}

        //

//        String[] names = {"A", "D", "C", "B"};
//        Arrays.sort(names);
//        for (String name :names){
//            System.out.print(name + " ");

//        Employee[] emps = new Employee[3];
//
//        emps[0] = new Employee("ABC", 2000, "6823464681", Gender.MALE);
//        emps[1] = new Employee("DEF", 3000, "6823464682", Gender.MALE);
//        emps[2] = new Employee("XYZ", 4000, "6823464683", Gender.FEMALE);
//
//        Arrays.sort(emps);
//
//        for (Employee emp: emps){
//            System.out.println(emp);






