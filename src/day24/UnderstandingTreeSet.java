package day24;
// java program to demonstrate the working of a TreeSet

import java.util.Iterator;
import java.util.TreeSet;

public class UnderstandingTreeSet {
    public static void main(String[] args) {
        //creating TreeSet and adding elements
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        // traversing elements
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String item:ts){
            System.out.println(item);
        }
    }
}
