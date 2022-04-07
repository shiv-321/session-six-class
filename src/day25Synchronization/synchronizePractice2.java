package day25Synchronization;
//synchronized block

class Example1{
    void display(){
        Thread g = Thread.currentThread();
        for (int i =0; i<=5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(g.getName() + " " + i);
            } catch (Exception e) {
            }
        }
        synchronized (this){
        for (int i =0; i<=5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(g.getName() + " " + i);
            } catch (Exception e) {
            }
        }
        }
    }
}
class T1 extends Thread{
    Example1 e;
    T1(Example1 e){
        this.e =e;
    }
    public void run(){
        e.display();
    }
}
public class synchronizePractice2 {
    public static void main(String[] args) {

        Example1 ex1 = new Example1();
        T1 t1 = new T1(ex1);
        T1 t2 = new T1(ex1);
        T1 t3 = new T1(ex1);
        t1.start();
        t2.start();
        t3.start();
    }
}
