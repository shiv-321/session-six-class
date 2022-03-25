package day21A;
// Java program to demonstrate lambda expressions to implement a user defined functional interface.
// A sample functional interface(An interface with single abstract method)

interface FuncInterface{
    void abstractFun(int x);

    default void normalFun(){
        System.out.println("Hello");
    }
}

public class Test {
    public static void main(String[] args) {
        // lambda expression to implement above functional interface. This interface by default implements abstractFun()

        FuncInterface fobj = (int x) -> System.out.println(2*x);
        fobj.abstractFun(5);


    }
}
