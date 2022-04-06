package day25A;

public class ThreadConstructor1 implements Runnable{
//    public ThreadConstructor1(Runnable r, String name){
//        super(r, name);
//    }
    @Override
    public void run() {
        System.out.println("task performed");
    }
}

class ThreadExample extends Thread{
    public static void main(String[] args) {
        ThreadConstructor1 t1 = new ThreadConstructor1();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t1, "Special Thread");
        thread.start();
        thread1.start();
        System.out.println("The thread  has been created with name " + thread.getName());
        System.out.println("The thread  has been created with name " + thread1.getName());
    }
}

