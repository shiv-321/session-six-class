package day25Synchronization;
// synchronized static block

class Example3{
    synchronized static void dispay(){
        Thread g = Thread.currentThread();
        for (int i = 0; i<5; i++){
            try{
                Thread.sleep(2000);
                System.out.println(g.getName() + " " + i);
            }catch (Exception e){

            }
        }
    }
}
class T3 extends Thread{
    public void run(){
        Example3.dispay();
    }
}

public class SynchronizePractice3 {
    public static void main(String[] args) {

        T3 t1 = new T3();
        T3 t2 = new T3();
        T3 t3 = new T3();
        t1.start();
        t2.start();
        t3.start();
    }
}
