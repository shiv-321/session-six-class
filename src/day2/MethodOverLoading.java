package day2;

public class MethodOverLoading {
    //On the basis of number of parameters
    public static int addition(int a, int b){
        System.out.println("The sum of two integers: ");
        return a + b;
    }
    public static int addition(int a, int b, int c){
        System.out.println("The sum of three integers: ");
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
/**
 * Multiple methods with same name but different parameters is called method overloading.
 * Because of the static methods we can access the method directly otherwise we have to create object
 * to access those methods
 */
