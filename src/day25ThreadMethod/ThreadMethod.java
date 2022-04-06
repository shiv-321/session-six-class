package day25ThreadMethod;
// Java program for thread method

class MyNewThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<4000){
            System.out.println("thank you");
            i++;
        }
    }
}
class MyNewThread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Hello! thank you");
        }
    }
}
public class ThreadMethod {
    public static void main(String[] args) {

        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        t2.start();
    }
}
