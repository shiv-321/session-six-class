package day25ThreadMethod;
class MyNewThread3 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<4000){
            System.out.println("thank you");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyNewThread4 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<4000){
            System.out.println("Hello! thank you");
            i++;
        }
    }
}

public class ThreadInterrupt {
    public static void main(String[] args) {

        MyNewThread3 t1 = new MyNewThread3();
        MyNewThread4 t2 = new MyNewThread4();
        t1.start();
        t1.interrupt();

        t2.start();
    }
}
