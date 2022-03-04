package day12;

import day1.Account;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArraysPractice {
    public static void main(String[] args) {
//        int[] marks = {80, 90, 60, 70, 48};
//        String[] names = {"Bob", "Rob", "Carl"};

        // other than primitive type of data have null in default value
        String[] names = new String[3];
        for(int index = 0; index<3; index++){
            System.out.println(names[index]);
        }

        System.out.println("******************");

        // Accessing data from string array
        String[] studentNames = new String[3];
        studentNames[1] = "Shivaraj";

        for(int index = 0; index<3; index++){
            System.out.println(studentNames[index]);
        }

//        int[] studentMarks = new int[5];

        // Accessing the element in arrays
        int[] marks = new int[5];
        int[] updatedMarks = new int[4];

        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;

        // Accessing single element form the array
        int position = marks[1];
        Logger.getGlobal().info(String.valueOf(position));

        // Array length
        System.out.println(marks.length);

        // Array display using for loop
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Displaying array using enhanced for loop. Also called for-each loop
        System.out.println("Using enhanced for loop: ");
        for(int i: marks){

            System.out.println(i);
        }
        System.out.println("***********************");

        // eliminating one element from array (not clear)
        for(int i =0; i<marks.length; i++){
            if(i == 4) {
                updatedMarks[3] = marks[i];
            }
            else if(i != 3){
                updatedMarks[i] = marks[i];
            }
        }

        for(int i =0; i<updatedMarks.length; i++){
            System.out.println(updatedMarks[i]);
        }
        //Enhanced for loop
        for(int i : updatedMarks){
            System.out.println(i);
        } // can only display the value

        // array for object class
       Account[] accounts = {new Account(), new Account(), new Account()};
       Account[] savingAccounts = new Account[5];

        savingAccounts[0] = new Account();
        savingAccounts[1] = new Account();
        savingAccounts[2] = new Account();
        savingAccounts[3] = new Account();
        savingAccounts[4] = new Account();

        //Accessing single elements from array
        Account zeroPosition = savingAccounts[0];
        Account firstPosition = savingAccounts[1];
        Account secondPosition = savingAccounts[2];
        Account thirdPosition = savingAccounts[3];
        Account forthPosition = savingAccounts[4];

        Logger.getGlobal().info(String.valueOf(zeroPosition));
        Logger.getGlobal().info(String.valueOf(firstPosition));
        Logger.getGlobal().info(String.valueOf(forthPosition));

        //Displaying all elements from array
        for(int i = 0; i<savingAccounts.length; i++){
            System.out.println(savingAccounts[i]);
        }
        /**
         * If we need logic which is related to index then we should go with normal for loop.
         * If we don't need index and we just need value inside that array then we should go with
         * enhanced or for each loop.
         */
        System.out.println("using enhance for loop");
        //Displaying array elements using enhanced for loop
        for(Account i: savingAccounts){
            System.out.println(i);
        }

        //Accessing length
        System.out.println("Length: " + savingAccounts.length);

        //Copying array
        int[] primeNumbers = {2,3,5,7,11,13};
//        int[]copyOfPrimeNumbers = primeNumbers; // in this way copy will be exactly same with the previous
        //If you want to copy all values of one array into new array, use the copyOf method in the Arrays class
        int[]copyOfPrimeNumbers = Arrays.copyOf(primeNumbers, primeNumbers.length); // created diff prime number

        copyOfPrimeNumbers[0]=100;

        System.out.println(primeNumbers[0]);


    }
}
