package day24;
// java program to demonstrate the working of a LinkedHashSet

import java.util.Iterator;
import java.util.LinkedHashSet;

public class UnderstandingLinledHashSet {
    public static void main(String[] args) {

        // creating LinkedHashSet and adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String item :lhs){
            System.out.println(item);
        }
    }
}
