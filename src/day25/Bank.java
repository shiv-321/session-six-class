package day25;

public class Bank {
    public static void main(String[] args) {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner);
        thread1.setDaemon(true);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("Thread-1");
        thread1.start();

        thread1.interrupt();

        Thread thread2 = new Thread(runner);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("Thread-2");
        thread2.start();
    }



}
