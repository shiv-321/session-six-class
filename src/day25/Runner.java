package day25;

public class Runner implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName() + " is interrupted " + Thread.currentThread().isInterrupted());

    }
}
