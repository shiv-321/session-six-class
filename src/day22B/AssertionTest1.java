package day22B;
// Java program to demonstrate syntax of assertion

public class AssertionTest1 {
    public static void main(String[] args) {

        int value = 15;
        assert value >= 20 : "Underweight";
        System.out.println("Value is " + value);

    }
}
/**
 * An assertion is a useful mechanism for effectively identifying/detecting and correcting logical errors in a program.
 */
