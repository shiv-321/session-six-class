package day1;

public class FunctionConcept {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        addition(a,b);

        int d = 2;
        int e = 20;
        addition(d,e);

        int g = 10;
        int h = 11;
        addition(g,h);
    }
    public static void addition(int x, int y){  // function without return type
        int z = x+y;
        System.out.println(z);

    }
}
