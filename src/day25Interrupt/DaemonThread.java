package day25Interrupt;
// Java program to demonstrate the usage of setDaemonThread() and isDaemon() method.

public class DaemonThread extends Thread{
    public DaemonThread(String name){
        super(name);
    }

    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread");
        }
        else{
            System.out.println(getName() + " is User thread");
        }
    }
    public static void main(String[] args) {
        DaemonThread thread1 = new DaemonThread("ABC");
        DaemonThread thread2 = new DaemonThread("BCD");
        DaemonThread thread3 = new DaemonThread("CDE");



        thread1.setDaemon(true);

        thread1.start();
        thread2.start();
//        thread2.setDaemon(true);

        thread3.setDaemon(true);
        thread3.start();


    }
}
/**
 * If you call the setDaemon() method after starting the thread, it would throw IllegalThreadStateException.
 */

