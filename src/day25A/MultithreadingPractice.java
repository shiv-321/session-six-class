package day25A;

/**
 * creating a thread by extending Thread class
 */

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Thread 1 is Running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
            System.out.println("Thread 2 is running");
            System.out.println("I am good");
        }
    }
}
public class MultithreadingPractice {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


    }
}
