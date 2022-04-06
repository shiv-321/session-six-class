package day25Interrupt;
// Java program to illustrate the concept of interrupt() method while a thread does not stop working

public class MyClass extends Thread{
    public void run(){
        try{
            for (int i=0; i<5; i++){
                System.out.println("Child Thread executing");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("InterruptedException occur");
        }

    }
}
