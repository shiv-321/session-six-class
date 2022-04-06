package day25ThreadMethod;
class Th extends Thread{
    public void run(){
        Thread t = currentThread(); // if we don't create this we have to write method 2 times for 2 diff object
        System.out.println("Thread status: " + t.isAlive());
        for (int i =0; i<=5; i++){
            try{
                t.sleep(1000);
            }catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
public class ThreadMethod1 {
    public static void main(String[] args) {
        Th t1 = new Th();
        Th t2 = new Th();
        System.out.println("ID = " + t1.getId());
        System.out.println("Name of the thread is " + t1.getName());
        t1.setName("Super");
        System.out.println("New thread name is "+ t1.getName());
        System.out.println("The priority of thread is " + t1.getPriority());
        t1.setPriority(1);
        System.out.println("Changed priority: " + t1.getPriority());
        t1.start();
        try{
            t1.join();
        }catch (Exception e){

        }
        System.out.println("Thread1 status: " + t1.isAlive());
        t2.start();

    }
}
