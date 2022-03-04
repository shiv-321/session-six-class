package day12;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Logger;

public class LargeNumberPractice {
    public static void main(String[] args) {
        long anyNumber = 1234567890;
        anyNumber = anyNumber + 1;

        BigInteger anyLargeNumber = new BigInteger("33334444442222");
        anyLargeNumber.add(BigInteger.ONE);

        Logger.getGlobal().info(String.valueOf(anyLargeNumber));


        BigDecimal b1 = new BigDecimal("2.1");
        BigDecimal b2 = new BigDecimal("2.2");
        BigDecimal b3 = b1.add(b2);
        System.out.println("Addition: " + b3);

        BigDecimal b4 = new BigDecimal("1.123456789123456789123456789");
        System.out.println("check big number: " + b4);
    }



}
