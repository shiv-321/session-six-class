package day24;
// java program to demonstrate the working of ArrayList

import java.util.ArrayList;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        // appending new elements at the end of the list

        for (int i = 1; i<=5; i++)
            al.add(i);
        System.out.println(al);

        al.remove(3);
        System.out.println(al);

        //printing element one by one
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i) + " ");


    }

}
