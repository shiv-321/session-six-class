package day23;
// Using java generics converts run time exceptions into compile time exception.

import java.util.ArrayList;

public class GenTypeSafetyTest {
    public static void main(String[] args) {

        // creating an ArrayList with String specified
        ArrayList<String> al = new ArrayList<>();
        al.add("Sachin");
        al.add("Rahul");

        //al.add(10); // Now compiler does not allow this like before in the previous example
        String s1 = al.get(0);  // typecasting is not needed
        String s2 = (String) al.get(1);
//        String s3 = (String) al.get(2);

    }
}
