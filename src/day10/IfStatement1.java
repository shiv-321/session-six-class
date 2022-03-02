package day10;

import java.util.logging.Logger;

public class IfStatement1 {
    public static void main(String[] args) {
        float percentage = 75;

        if(percentage>=80){
            Logger.getGlobal().info("Congratulation you have passed with distinction");
            }
        else if(percentage>=60){
            Logger.getGlobal().info("Congratulation you have passed with first division");
        }
        else if(percentage>=50){
            Logger.getGlobal().info("Congratulation you have passed with second division");
        }
        else if(percentage>=40){
            Logger.getGlobal().info("Congratulation you have passed with third division");
        }
        else{
            Logger.getGlobal().info("Sorry, you are not passed");

        }
    }
}
