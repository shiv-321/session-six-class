package day13A;

import java.util.Scanner;

public class ArrayRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 5, 12, 7, 3, 8};

        System.out.println("Enter the element to be deleted: ");
        int element = sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                for (int j = i; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println("Elements -- ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
