package day25ReentrantLock;

public class ChildThread extends Thread{
    Car c;
    String name;
    ChildThread(Car c, String name){
        this.c = c;
        this.name = name;
    }
    public void run(){
        try{
            c.Drive(name);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
