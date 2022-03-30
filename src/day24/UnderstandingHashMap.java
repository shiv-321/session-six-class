package day24;
// java program to demonstrate the working of a HashMap

import java.util.HashMap;
import java.util.Map;

public class UnderstandingHashMap {
    public static void main(String[] args) {

        // creating HashMap and adding elements
        HashMap<Integer, String > hm = new HashMap<>();
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        //Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
