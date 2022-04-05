package day25A;
//Java code for thread creation by implementing the runnable interface

public class MultithreadingDemo2 implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
