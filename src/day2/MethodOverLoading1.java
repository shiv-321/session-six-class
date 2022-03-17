package day2;

public class MethodOverLoading1 {
    public static void main(String[] args) {
        System.out.println(MethodOverLoading.addition(5,6));
        System.out.println(MethodOverLoading.addition(5,6, 5));
    }
}

/**
 * In this case, we can get accessed the methods with the help of class name because
 * to access static method from different class we can use class name we don't have to create object.
 */
