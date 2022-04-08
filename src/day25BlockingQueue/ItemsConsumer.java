package day25BlockingQueue;

import day3.Item;

import java.util.concurrent.BlockingQueue;

public class ItemsConsumer implements Runnable{
    private BlockingQueue<String> queue;
    public ItemsConsumer(BlockingQueue<String> q){
        this.queue =q;

    }
    @Override
    public void run() {
        try{
            String msg;
            // consuming message until exit message is recieved
            while (!((msg = queue.take()).equals("finished"))){
                //Thread.sleep(3000);
                System.out.println("Consumed Item" + msg);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
