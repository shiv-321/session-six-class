package day25Interrupt;

public class MyClassTest {
    public static void main(String[] args) throws InterruptedException{
        MyClass thread = new MyClass();
        thread.start();

        // main thread calls interrupt() method on child thread
        thread.interrupt();
        System.out.println("Main thread execution completes");
    }
}
