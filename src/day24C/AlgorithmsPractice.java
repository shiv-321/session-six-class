package day24C;
// Implementation of different methods available in the collections framework

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithmsPractice {
    public static void main(String[] args) {

        // Sorting using sort()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        //Using the sort() method
        Collections.sort(numbers);
        System.out.println(numbers);

        //2. Shuffling using shuffle()
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        System.out.println("Sorted ArrayList: " + numbers1);

        //using shuffle(numbers1) method
        Collections.shuffle(numbers1);
        System.out.println(numbers1);

        // using reverse()
        Collections.reverse(numbers1);
        System.out.println("Reversed ArrayList: " + numbers1);

        // using swap()
        Collections.swap(numbers1, 1,2);
        System.out.println("ArrayList using swap(): "+ numbers1);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        // Using addAll
        newNumbers.addAll(numbers1);
        System.out.println("ArrayList using addAll(): " + newNumbers);

        // using fill()
        Collections.fill(numbers1, 0);
        System.out.println("ArrayList using fill(): " + numbers1);

        //using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList using copy(): " + newNumbers);
//: While performing the copy() method both the lists should be of the same size.


        // The binarySearch() method of the Java collections framework searches for the specified element.
        // It returns the position of the element in the specified collections.

        // Using binarySearch
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);

        int pos = Collections.binarySearch(items, 3);
        System.out.println("The position of 3 is " + pos);

        // 5. Composition
        int count = Collections.frequency(items, 2);
        System.out.println("Count of 1: " + count);

        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(5);
        items1.add(6);
        System.out.println(items1);

        boolean value = Collections.disjoint(items, items1);
        System.out.println("Two lists are disjoint: " + value);

        // 6. Finding Extreme values
        // Using min()
        int min = Collections.min(items);
        System.out.println("Minimum element: " + min);

        int max = Collections.max(items);
        System.out.println("Maximum number: " + max);





    }
}
