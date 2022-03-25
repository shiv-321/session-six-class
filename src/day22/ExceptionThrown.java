package day22;
// Java program to demonstrate exception is thrown how the runTime system
// searches the call stack to find appropriate exception handler

public class ExceptionThrown {
    // It throws the Exception(ArithmeticException).
    // Appropriate Exception handler is not found within this method.
    static int divideByZero(int a, int b){
        return a/b;  // this statement will cause ArithmeticException(/ by zero)
    }
    // The runTime System searches the appropriate Exception handler
    // in this method also but couldn't have found. So looking forward
    // on the call stack.

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        }
        catch (NumberFormatException ex){
            System.out.println("NumberFormatException is occurred");
        }
        return res;

        }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try{
            int i = computeDivision(a, b);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }


}
