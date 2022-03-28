package day23;
// Java program to show multiple type parameters in java Generics
// we use <> to specify parameter type

import org.w3c.dom.ls.LSOutput;

public class GenericTest2<T,U> {
    T obj1; // An object of type T
    U obj2; // An object of type U

    // Constructor
    public GenericTest2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
        // to print objects of T and U
    public void print() {
            System.out.println(obj1);
            System.out.println(obj2);

    }

    public static void main(String[] args) {
        GenericTest2<String, Integer> obj = new GenericTest2<>("GfG", 15);
        obj.print();
    }
}
