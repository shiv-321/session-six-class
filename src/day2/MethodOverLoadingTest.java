package day2;

import java.util.logging.Logger;

public class MethodOverLoadingTest {
    public static void main(String[] args) {
        MethodOverLoading3 multiplication = new MethodOverLoading3();


        Logger.getGlobal().info(String.valueOf(multiplication.multiply(2,2)));
        Logger.getGlobal().info(String.valueOf(multiplication.multiply(2.2f,2.3f)));
        Logger.getGlobal().info(String.valueOf(multiplication.multiply(2,2.4f)));
        Logger.getGlobal().info(String.valueOf(multiplication.multiply(2,2.5f, 3)));
    }
}
