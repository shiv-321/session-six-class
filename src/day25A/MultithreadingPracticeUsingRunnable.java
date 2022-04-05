package day25A;
// Java program for creating thread using Runnable interface

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I am a thread:1 not a threat");
        }
    }
}
class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I am a thread:2 not a threat");
        }
    }
}
public class MultithreadingPracticeUsingRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread thread1 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        // when we are implementing runnable interface we cannot apply the start method directly


    }
}
