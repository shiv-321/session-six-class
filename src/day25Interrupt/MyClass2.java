package day25Interrupt;

public class MyClass2 extends Thread{
    public void run(){
        for (int i=0; i<5; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        MyClass2 t1 = new MyClass2();
        t1.start();
        t1.interrupt();
    }

}
