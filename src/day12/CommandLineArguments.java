package day12;

import java.util.logging.Logger;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args.length);
//        for (String arg : args) {
//            Logger.getGlobal().info(arg);
            String url = "http://dev.facebook.com";

            if (args.length != 0) {
                switch (args[0]) {
                    case "dev" -> url = "http://dev.facebook.com";
                    case "staging" -> url = "http://staging.facebook.com";
                    case "prod" -> url = "http://facebook.com";
                    default -> url = "http://dev.facebook.com";
                }
            } else {
                url = "http://dev.facebook.com";
            }
            System.out.println(url);
        }

    }

