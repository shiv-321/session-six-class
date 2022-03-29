package day23A;

public class GenericMethodPractice {
    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 4, 5};
        Float[] fvalues = {1.0f, 2f, 3f, 4f, 5f};
        String [] svalues = {"a", "b", "c"};
        printArray(values);
        printArray(svalues);
        printArray(fvalues);

    }
        // this is called with integer and float array
    public static <T extends Number>void printArray(T[] values){
        for (T val :values){
            System.out.println(val);
        }
        System.out.println("It is of type number");
    }
    // this is called with string array
    public static <T>void printArray(T[] values){
        for (T val :values){
            System.out.println(val);
        }
    }
}
