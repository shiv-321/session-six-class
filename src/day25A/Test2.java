package day25A;

public class Test2 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i<n; i++){
            Thread thread = new Thread(new MultithreadingDemo2());
            thread.start();
        }
    }
}
