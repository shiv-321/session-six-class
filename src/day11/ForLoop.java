package day11;

import java.util.logging.Logger;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Logger.getGlobal().info(String.valueOf(i));
        }

        //sum of first n even number

        int sum = 0;
        int n = 4;
        for (int j = 0; j <= n; j++) {
            sum = sum + (2 * j);
        }
        Logger.getGlobal().info(String.valueOf("The sum of n even number is " + sum));

    }
}