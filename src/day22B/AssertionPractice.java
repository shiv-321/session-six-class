package day22B;

import java.util.logging.Logger;

public class AssertionPractice {
    public static void main(String[] args) {

        int x = -2;

        // If we don't use assertion we need to give this kind of checking for every place
//        if(x<0) throw new IllegalArgumentException("x<0");
        // If we disable assertion the line below consider to be not there
        assert x>=0: "The value of the x should be greater tha zero";

        double y = Math.sqrt(x);
        Logger.getGlobal().info(String.valueOf(y));

    }
}
