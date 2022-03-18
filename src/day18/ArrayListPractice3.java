package day18;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        //Accessing elements form an ArrayList
        ArrayList<String> topCompanies = new ArrayList<>();

        //check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        // adding new elements in the ArrayList
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        topCompanies.add("Instagram");
        System.out.println("The available top companies in the list are: " + topCompanies);

        //Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size());
        System.out.println(topCompanies);

        //retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(3);
        System.out.println("the top two companies are: " + bestCompany + " and " + secondBestCompany);

        //modifying the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified list: " + topCompanies);
    }
}

/**
 * How to check if an ArrayList is empty using the isEmpty() method.
 * How to find the size of an ArrayList using the size() method.
 * How to access the element at a particular index in an ArrayList using the get() method.
 * How to modify the element at a particular index in an ArrayList using the set() method.
 */
