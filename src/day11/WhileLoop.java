package day11;

import java.util.logging.Logger;

public class WhileLoop {
    public static void main(String[] args) {
        int i =1;
        while(i<=10){
            Logger.getGlobal().info(String.valueOf(i));
            i++;
        }

        //Do-while loop
        do{
            Logger.getGlobal().info(String.valueOf(i));
            i++;
        } while(i<=10);
    }
}
