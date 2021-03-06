package day18;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        // creating an ArrayList from another collection
        ArrayList<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);


        ArrayList<Integer> usingCollection = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println(usingCollection);

        ArrayList<Integer>nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // adding an entire collection to an ArrayList
        usingCollection.addAll(nextFivePrimeNumbers);
//        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(usingCollection);
    }
}
/**
 * to create ArrayList form another collection it uses ArrayList(collection c ) constructor.
 */
