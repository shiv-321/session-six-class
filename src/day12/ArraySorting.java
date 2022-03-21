package day12;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
//        int[] integers = {3, 1, 8, 5, 6};

//        System.out.println(Arrays.toString(integers));

//        System.out.println("*********Before sorting********");
//        for (int element : integers) {
//            System.out.println(element);
//        }
//        //Sorting
//        Arrays.sort(integers);

//        System.out.println("*********After sorting********");
//        for (int element : integers) {
//            System.out.println(element);
//        }

        boolean isSorted = true;
        int[] integers = {3, 1, 8, 5, 6};
        for (int i = 0; i < integers.length-1; i++){
            if (integers[i]>integers[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted");
        }

    }
}
