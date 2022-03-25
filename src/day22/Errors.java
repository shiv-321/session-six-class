package day22;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
// Syntax error
        //int a = 5  // no semicolon
        // b = 8; // no declaration


//        Logical Errors
        // write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=0; i<5; i++){
            System.out.println(2*i+1);
        }
            // provided logic to calculate odd numbers

            //Runtime Errors
            int k;
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            System.out.println("Integer part of 1000 divided by k is " + 1000/k);



    }

}
