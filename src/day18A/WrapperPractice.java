package day18A;

import java.util.ArrayList;
import java.util.logging.Logger;

public class WrapperPractice {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(7);

        Logger.getGlobal().info(String.valueOf(integers));

        int integer = integers.get(0);
        Logger.getGlobal().info(String.valueOf(integer));


        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);

        // no need to create object for object wrapper classes of primitive data types


        // to convert the String data to integer/float/double
        //Type conversion between string to primitive type of data type
        String data = "200";
        int intData = Integer.parseInt(data);
        Logger.getGlobal().info(String.valueOf(intData));

        //typecasting don't work to convert class to primitive data types

        String dataDecimal = "200.50";
        Double decimalData = Double.parseDouble(dataDecimal);
        Logger.getGlobal().info(String.valueOf(decimalData));

        String dataDecimal1 = "200.50";
        Float decimalData1 = Float.parseFloat(dataDecimal1);
        Logger.getGlobal().info(String.valueOf(decimalData1));
    }
}
