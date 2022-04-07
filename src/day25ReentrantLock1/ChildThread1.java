package day25ReentrantLock1;

public class ChildThread1 extends Thread{
    Car1 c;
    String name;
    ChildThread1(Car1 c, String name){
        this.c = c;
        this.name=name;
    }
    public void run(){
        try{
            c.Drive(name);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
