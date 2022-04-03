package day24C;

import java.util.*;

public class SmallCollection {
    public static void main(String[] args) {

        List<String> stringArrayList = List.of("ABC", "DEF");

        System.out.println(stringArrayList);

        //We can not add data and it does not give error at compile time, gives error in run time
//        stringArrayList.add("CDF");

        List<String> arrayListCopy = new ArrayList<>(stringArrayList);

        arrayListCopy.add("CDF");
        System.out.println(arrayListCopy);

        //throws an exception because of duplicate elements
//        Set<String> stringSet = Set.of("ABC", "ABC");
//        System.out.println(stringSet);

        // if we are using other than string class we need to override equal method on that class
        Set<String> stringSet1 = new TreeSet<>();
        stringSet1.add("Shiv");
        stringSet1.add("Shiv");
        System.out.println(stringSet1);

        //to get n number of copies
        List<String> settings = Collections.nCopies(5, "Default");
        System.out.println(settings);

        // Immutable
        List<Boolean> settings1 = Collections.nCopies(10, false);
        System.out.println(settings1);

        //subranges
        List<String> staff = new ArrayList<>();
        staff.add("Shiv1");
        staff.add("Shiv2");
        staff.add("Shiv3");
        staff.add("Shiv4");
        staff.add("Shiv5");
        staff.add("Shiv6");
        staff.add("Shiv7");
        staff.add("Shiv8");
        staff.add("Shiv9");
        staff.add("Shiv10");
        List<String> stringList = staff.subList(2, 9);
        System.out.println(stringList);

        stringList.clear();
        System.out.println(stringList);

        //Unmodifiable
        List<String> staff1 = new ArrayList<>();
        staff.add("Shiv1");
        staff.add("Shiv2");
        staff.add("Shiv3");
        staff.add("Shiv4");
        staff.add("Shiv5");
        staff.add("Shiv6");
        staff.add("Shiv7");
        staff.add("Shiv8");
        staff.add("Shiv9");
        staff.add("Shiv10");
        List<String> unmodifiableList = Collections.unmodifiableList(staff1);
        //unmodifiableList.add("Shiv11"); // throws an error




    }
}
