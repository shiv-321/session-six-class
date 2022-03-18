package day18;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice {
    public static void main(String[] args) {

        //creating an ArrayList (blank)
//        ArrayList<String> names = new ArrayList<>();

        //creating an ArrayList (initialCapacity)
        ArrayList<String> names = new ArrayList<>(10);

        // adding new elements to the ArrayList
        //can add as many elements as you can -> no size limitation
        names.add("Shivaraj");
        names.add("Harry");
        names.add("Rob");
        names.add("Bob");
        names.add("Henry");
        System.out.println(names);
        Logger.getGlobal().info(String.valueOf(names));
        Logger.getGlobal().info(names.toString());

        // Adding an element at a particular index in an ArrayList
        names.add(2,"Aman");
        System.out.println(names);

        // replacing an element at a particular index in an ArrayList
        names.set(2, "Ashim");
        System.out.println(names);

        //creating an ArrayList (withAnotherList)
        ArrayList<String> namesCopy = new ArrayList<>(names);
        System.out.println(namesCopy);

        //Adding all the elements from one ArrayList to another ArrayList
//        ArrayList<String> namesCopy1 = new ArrayList<>();
//        namesCopy.addAll(names);
//        System.out.println("another " + namesCopy);

        //Getting the element of a particular index from the ArrayList
        Logger.getGlobal().info(names.get(2));

        //removing the element from the ArrayList
        //removing the element using direct object
        names.remove("Bob");  // if we are removing the element based on our object then we need to override
        System.out.println(names);                // here String class already override it in the system

        // removing the elelment using the index position
        System.out.println(names.remove(4));
        System.out.println(names);

        //removing all the elements form the ArrayList
        System.out.println(names.removeAll(names));
        System.out.println(names);
    }
}
/**
 * We can not use primitive type of data in <no primitive data type>
 * constructor type in ArrayList (3 ways to create ArrayList)
 * ## blank ArrayList -> public ArrayList()
 * ## initial capacity -> public ArrayList(int initialCapacity)
 * ---> initial capacity by default will be 10
 * ---> if we do not give initial capacity then arraylist will create many objects for each object or string
 * ---> so we avoid such time and space complexity, we can use the ArrayList with initial capacity
 * ---> even though we create an ArrayList with initial capacity it does not mean that we can not add more object than that
 *
 * ## ArrayList with another list -> public ArrayList(collection<?extends E)
 * ---> can pass another list
 */