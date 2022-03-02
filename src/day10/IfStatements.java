package day10;

import java.util.logging.Logger;

public class IfStatements {
    public static void main(String[] args) {
        int target = 10;
        int sales = 9;
        int bonus = 0;
        //If only
        /* if(sales >= target){
            Logger.getGlobal().info(String.valueOf("Target met"));
            bonus = 100;
        }
        Logger.getGlobal().info(String.valueOf("Bonus: " + bonus));

        // if and else statement
        if (sales >= target) {
            Logger.getGlobal().info(String.valueOf("Target met"));
            bonus = 100;
        } else {
            Logger.getGlobal().info(String.valueOf("Target not met"));
            bonus = 0;
        }
            Logger.getGlobal().info(String.valueOf("Bonus: " + bonus));
            */
        if(sales>= 2*target){
            Logger.getGlobal().info("2 times of target met: ");
            bonus = 1000;
        }
        else if(sales >= 1.5*target){
            Logger.getGlobal().info("1.5 times of target met: ");
            bonus = 500;
        }
        else if(sales>=target){
            Logger.getGlobal().info("Exact target met: ");
            bonus = 100;
        }
        else{
            Logger.getGlobal().info("Target did not meet, you are fired");
            bonus = 0;
        }
        Logger.getGlobal().info(String.valueOf(bonus));

    }
}
