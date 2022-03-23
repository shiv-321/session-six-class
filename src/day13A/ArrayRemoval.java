package day13A;

import java.util.Scanner;

public class ArrayRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 5, 12, 7, 3, 8};
        int[] newArray = new int[arr.length-1];

        System.out.println("Enter the element to be deleted: ");
        int element = sc.nextInt();
        int j =0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != element){
                newArray[j]=arr[i];
                j++;
            }
        }
        System.out.println("Elements -- ");
        for (int i = 0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
