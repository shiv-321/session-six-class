package day2;

public class MethodOverLoading {
    //On the basis of number of parameters
    public static int addition(int a, int b){
        return a + b;
    }
    public static int addition(int a, int b, int c){
        return a + b +c;
    }
    //on the basis of type of data
    public static int multiply(int a, int b){
        return a*b;
    }
    public static float multiply(float a, float b){
        return a*b;
    }


    public static void main(String[] args) {
        System.out.println(addition(5,6));
        System.out.println(addition(5,6,5));

        System.out.println(multiply(2, 5));
        System.out.println(multiply(2.2f, 5.2f));
    }
}
