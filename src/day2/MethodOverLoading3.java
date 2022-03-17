package day2;

import java.util.logging.Logger;

public class MethodOverLoading3 {
    public int multiply(int a, int b){
        Logger.getGlobal().info("The multiplication of two integers: ");
        return a*b;
    }
    public float multiply(float a, float b){
        Logger.getGlobal().info("The multiplication of two floats: ");
        return a*b;
    }
    public float multiply(int a, float b){
        Logger.getGlobal().info("The multiplication 1 integers and 1 float: ");
        return a*b;
    }
    public float multiply(int a, float b, int c){
        Logger.getGlobal().info("The multiplication of some numbers: ");
        return a*b*c;
    }
}
