package day25A;

public class Test1 {
    public static void main(String[] args) {

        int n = 8;
        for (int i = 0; i<n; i++){
            MultithreadingDemo1 obj = new MultithreadingDemo1();
            obj.start();
        }
    }
}
