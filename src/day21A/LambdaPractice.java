package day21A;
// Java program to demonstrate working of lambda expressions
interface FuncInter1{
    int operation(int a, int b);
}
interface FuncInter2{
    void sayMessage(String message);
}

public class LambdaPractice {
    private int operate(int a, int b, FuncInter1 fobj){
        return fobj.operation(a,b);
    }

    public static void main(String[] args) {
        // lambda expression for addition for two parameters data type for x and y is optional.
        // This expression implements FuncInter1 interface

        FuncInter1 add = (int x, int y) -> x + y;

        // lambda expression multiplication for two parameters
        // This expression also implements 'FuncInter1' interface

        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of LambdaPractice to call operate using
        // different implementations using lambda Expressions

        LambdaPractice obj = new LambdaPractice();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + obj.operate(6, 3, add));

        //Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + obj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements FuncInter2 interface
        FuncInter2 obj2 = message -> System.out.println("Hello " + message);
                obj2.sayMessage("Greek");




    }

}
/**
 * https://www.geeksforgeeks.org/lambda-expressions-java-8/?ref=gcse
 * The body of a lambda expression can contain zero, one or more statements.
 *
 * When there is a single statement curly brackets are not mandatory and the return type of the anonymous function
 * is the same as that of the body expression.
 *
 * When there are more than one statements, then these must be enclosed in curly brackets (a code block) and
 * the return type of the anonymous function is the same as the type of the value returned within the code block, or
 * void if nothing is returned.
 */