package day24;
// java program to demonstrate the ArrayDeque class in java

import java.util.ArrayDeque;

public class UnderstandingArrayDeque {
    public static void main(String[] args) {

        // Initializing deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // add () method to insert
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        System.out.println(deque);

        // clear() method
        deque.clear();
        System.out.println(deque);

        // addFirst() method to insert the elements at the head
        deque.addFirst(564);
        deque.addFirst(291);

        // addLast() method to insert the elements at the tail
        deque.addLast(24);
        deque.addLast(14);
        System.out.println(deque);


    }
}
