package day25Interrupt;
// Java program to illustrate the concept of interrupt() method while a thread stops working

public class MyClass1 extends Thread{
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Geeksforgeeks");
        }catch (InterruptedException e){
            throw new RuntimeException("Thread " + "interrupted");
        }
    }
}
