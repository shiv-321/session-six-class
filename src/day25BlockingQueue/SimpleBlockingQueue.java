package day25BlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SimpleBlockingQueue {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(3);
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("List size after three insertion: " + list.size());

        list.add("Four");
        System.out.println("List size after four insertion: " + list.size());

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        try {
            queue.put("One");
            queue.put("Two");
            queue.put("Three");
            System.out.println("queue size after three insertion: " + queue.size());
            queue.take();
            queue.put("Four");
            System.out.println("Queue size after four insertion: " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
