package day18;

import java.util.ArrayList;

public class ArrayListPractice4 {
    public static void main(String[] args) {
        // Removing elements form an ArrayList
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("R");
        programmingLanguages.add("Stata");
        programmingLanguages.add("SAS");
        System.out.println("Initial List: " + programmingLanguages);

        //Remove the element at index 5
        programmingLanguages.remove(5);
        System.out.println("After remove 5: "+ programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)

        boolean removed = programmingLanguages.remove("R");
        System.out.println("After remove R: " + removed);
        System.out.println(programmingLanguages);

        // remove all the elements that exist in a given collection

        ArrayList<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Nepali");
        languages.add("Hindi");
        languages.add("Spanish");
        System.out.println("Before removing: " + languages);
        languages.removeAll(languages);
        System.out.println("removing all the list: ");

        //remove all the elements form the Arraylist
        programmingLanguages.clear();
        System.out.println("After clear (): "+ programmingLanguages);

    }
}
/**
 * How to remove the element at a given index in an ArrayList | remove(int index)
 *
 * How to remove an element from an ArrayList | remove(Object o)
 *
 * How to remove all the elements from an ArrayList that exist in a given collection | removeAll()
 *
 * How to remove all the elements matching a given predicate | removeIf()
 *
 * How to clear an ArrayList | clear()
 */
