package day25ReentrantLock1;

import java.util.concurrent.locks.ReentrantLock;

public class Car1 {
    ReentrantLock l = new ReentrantLock();
    public void Drive(String name) throws InterruptedException {
        if (l.tryLock()){
            for (int i =1; i<3; i++){
                System.out.println("I am driving " + name);
                Thread.sleep(1500);
            }
            l.unlock();
        }
        else{
            System.out.println("Perform some other operations....");
        }
    }
}
