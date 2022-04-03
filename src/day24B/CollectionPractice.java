package day24B;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Set<String> stringList = new HashSet<>();

        stringList.add("Shiv");
        stringList.add("Shiv");
        stringList.add("Shiv");
        stringList.add("Shiv");
        stringList.add("Shiv");
        stringList.add("Shiv");
        System.out.println(stringList);

        //no duplication as well as sorted in ascending or descending
        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Ahiv");
        stringTreeSet.add("Shiv");
        stringTreeSet.add("Bhiv");
        stringTreeSet.add("Dhiv");
        stringTreeSet.add("Chiv");
        stringTreeSet.add("Shiv");
        System.out.println(stringTreeSet);

        //searching fast but not sorted
        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Ahiv");
        stringHashSet.add("Shiv");
        stringHashSet.add("Bhiv");
        stringHashSet.add("Dhiv");
        stringHashSet.add("Chiv");
        stringHashSet.add("Shiv");
        System.out.println(stringHashSet);

        // for insertion order and fast searching need to use LinkedHash


    }
}
