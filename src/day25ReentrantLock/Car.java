package day25ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Car {
    ReentrantLock l = new ReentrantLock();

    public void Drive(String name) throws InterruptedException {
        l.lock();
        for(int i =0; i<3; i++){
            System.out.println("I am driving " + name);
            Thread.sleep(2000);
        }
        l.unlock();

    }
}
