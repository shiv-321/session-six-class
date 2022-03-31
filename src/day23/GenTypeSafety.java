package day23;
// Java program to demonstrate that NOT using generics can cause run time exceptions

import java.util.ArrayList;

public class GenTypeSafety {
    public static void main(String[] args) {

        // creating an ArrayList without any type specified
        ArrayList al = new ArrayList();
        al.add("Suchin");
        al.add("Eahul");
        al.add(10); // compiler allows this

        String s1 = (String) al.get(0);
        String s2 = (String) al.get(1);
        Integer s3 = (int) al.get(2); // causes runtime exception


    }
}
