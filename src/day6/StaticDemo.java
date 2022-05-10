package day6;

import java.util.logging.Logger;

public class StaticDemo {
    private static int a = 10;

    public static void display(){
        Logger.getGlobal().info("Static Method");
    }

    public static int getA() {

        return a;
    }

    public static void setA(int a) {

        StaticDemo.a = a;
    }
    public static void main(String[] args) {
        Logger.getGlobal().info(String.valueOf(a));
        display();

        getA();
        setA(20);
    }

}

