package day24;
// java program to demonstrate the working of linkedList

import java.util.LinkedList;

public class UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        //appending new element at the end of the list
        for (int i = 1; i<=5; i++)
            ll.add(i);

        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        //Printing element one by one
        for (int i = 0; i<ll.size(); i++)
            System.out.println(ll.get(i) + " ");
    }
}
