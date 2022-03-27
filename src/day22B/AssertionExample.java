package day22B;
// Java program to demonstrate assertion in java

public class AssertionExample {
    public static void main(String[] args) {
        int age = 19;
        assert  age <= 18 : "Cannot vote";
        System.out.println("The voter's age is " + age);
    }

}
/**
 * when I print without enabling assertion it gives --The voter's age is 14 as a result.
 * after enabling assertion it throws AssertionError if the condition is false
 * checking assertion takes less time than checking if condition
 * generally tester use assertion and programmer use if condition even it takes time more than assertion
 */
