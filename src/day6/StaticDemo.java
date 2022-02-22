package day6;

import java.util.logging.Logger;

public class StaticDemo {
    static int a = 10;
    static void display(){
        Logger.getGlobal().info("Static Method");
    }

    public static void main(String[] args) {
        Logger.getGlobal().info(String.valueOf(a));
        display();
    }
}

