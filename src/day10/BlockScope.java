package day10;

import java.util.logging.Logger;

public class BlockScope {
    static int a = 2;

    public static void main(String[] args) {
        int c = 4;
        Logger.getGlobal().info(String.valueOf(a));

        {
            int b = 3;
            Logger.getGlobal().info(String.valueOf(c));
        }

        Logger.getGlobal().info(String.valueOf(a));
        Logger.getGlobal().info(String.valueOf(c));

    }
}
//variables can only be accessed within the blocks.
// It cannot be accessed outside the block
