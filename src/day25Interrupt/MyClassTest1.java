package day25Interrupt;

public class MyClassTest1 {
    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1();
        t1.start();
        try{
            t1.interrupt();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
    }
}
