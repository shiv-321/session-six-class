package day21A;
// A Java program to demonstrate simple lambda expressions


import java.util.ArrayList;

public class LambdaTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);

        // Using lambda expression to print all elements of arrayList
        arrayList.forEach(n -> System.out.println(n));

        // Using lambda expression to print all elements of arrayList
        arrayList.forEach(n -> {if (n%2 == 0) System.out.println(n);});
    }

}
/**
 * Note that lambda expression can only be used to implement functional interfaces.
 * In the above example also, the lambda expression implements Consumer Functional Interface.
 */