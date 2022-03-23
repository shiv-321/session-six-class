package day19;

import java.util.logging.Logger;

public class EclipseMethod {
    public static void main(String[] args) {
      add(2,3);
      add(2,3, 4);

    }
//    public static void add(int a, int b){
//        int c = a+b;
//        System.out.println(c);
//    }
//    public static void add(int a, int b, int c) {
//        int temp = a + b + c;
//        System.out.println(temp);
//    }
    public static void add(int... values){
//        Logger.getGlobal().info("Add method called");
//        Logger.getGlobal().info(String.valueOf(values));
        // we need to work with them just like we'd work with a normal array
        Logger.getGlobal().info(String.valueOf(values.length));
        // we send multiple values using int... it is store in the form of Array
        int temp = 0;
        for (int value :values){
            System.out.print(value + " ");
            temp += value;
        }
        System.out.println();
        System.out.println(temp);

        //we can also do by this
        System.out.printf("%d, %d, %d", 3, 5, 7);
    }
}
