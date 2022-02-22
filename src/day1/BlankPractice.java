package day1;

public class BlankPractice {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int x = addTwoNumber(a, b);

        int c = 5;
        int d = 5;
        int y = addTwoNumber(c,d);

        int e = 5;
        int f = 10;
        int z = addTwoNumber(e, f);
    }
    public static int addTwoNumber(int a, int b) // function with return type
    {
        int c = a + b;
        System.out.println(c);
        return c;

    }
}
