package day10;

import java.util.Scanner;
import java.util.logging.Logger;

public class IfAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Logger.getGlobal().info("Enter the value of i: ");
        int i = sc.nextInt();
        Logger.getGlobal().info("Enter the value of j: ");
        int j = sc.nextInt();
        Logger.getGlobal().info("Enter the value of k: ");
        int k = sc.nextInt();

        if(i>j && i>k){
            Logger.getGlobal().info(String.format("Greatest number(i) is %d", i));
        }
        else if(j>i && j>k){
            Logger.getGlobal().info(String.format("Greatest number(j) is %d", j));
        }
        else{
            Logger.getGlobal().info(String.format("Greatest number(k) is %d", k));
        }
    }
}
