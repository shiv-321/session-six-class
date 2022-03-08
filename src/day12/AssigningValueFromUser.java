package day12;

import java.util.Scanner;

public class AssigningValueFromUser {
    public static void main(String[] args) {
        int[] myArrays = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i =0; i<myArrays.length; i++){
            System.out.println("Enter the value" + i + "position element");
            myArrays[i] = sc.nextInt();
        }
        for (int i =0; i<myArrays.length; i++){
            System.out.println("The value of array is: " + myArrays[i]);
        }




    }




}

