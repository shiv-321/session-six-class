package day24;
// java program to demonstrate the working of a HashSet

import java.util.HashSet;
import java.util.Iterator;

public class UnderstandingHashSet {
    public static void main(String[] args) {

        // creating HashSet and adding elements
        HashSet<String> hs = new HashSet<>();
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // traversing elements
        for (String item:hs){
            System.out.println(item);
        }
        // traversing elements
        Iterator<String > itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
