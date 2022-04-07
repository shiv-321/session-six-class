package day25ReentrantLock1;

public class ReentrantMain1 {
    public static void main(String[] args) {

        Car1 c = new Car1();
        ChildThread1 ct1 = new ChildThread1(c, "Fast");
        ct1.start();
        ChildThread1 ct2 = new ChildThread1(c, "Slow");
        ct2.start();
    }

}
