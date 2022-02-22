package day6;

import java.util.logging.Logger;

public class StaticPracticeMethod {
    public static void main(String[] args) {
        Logger.getGlobal().info(String.valueOf(StaticDemo.a));
        StaticDemo.display();
    }
}

//If we write static variables, static method and main method in same class we can have a direcr access for the variables
// But if we write static variables and static method in one class and main method in another class then we need to
// use class name instead of object.
