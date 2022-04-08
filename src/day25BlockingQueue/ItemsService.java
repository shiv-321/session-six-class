package day25BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ItemsService {
    public static void main(String[] args) {

        //creating BlockingQueue of size 3
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        ItemsProducer producer = new ItemsProducer(queue);
        ItemsConsumer consumer = new ItemsConsumer(queue);

        // new Thread(consumer).start();
        //starting producer to produce items in queue
        new Thread(producer).start();

        // starting consumer to consume items from queue
        // new Thread(consumer).start();
        System.out.println("Items Producer and Items Consumer has been started");
    }
}
