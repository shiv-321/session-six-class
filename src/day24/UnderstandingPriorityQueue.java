package day24;
// java program to demonstrate the working of priority queue in java

import java.util.PriorityQueue;
import java.util.Stack;

public class UnderstandingPriorityQueue {
    public static void main(String[] args) {
        //creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        //printing the top element of PriorityQueue
//        System.out.println(pQueue.peek());

        // printing the top element and removing it from the priorityQueue container
        System.out.println(pQueue.poll());

        //printing the top element again
        System.out.println(pQueue.peek());
    }

}
