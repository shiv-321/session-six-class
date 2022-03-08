package day12;

import java.util.logging.Logger;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args.length);
//        for(String arg: args){
//            Logger.getGlobal().info(arg);
        String URL = "http://dev.facebook.com";

        if(args.length != 0){
            switch (args[0]){
                case "dev" -> URL = "http://dev.facebook.com";
                case "staging" -> URL = "http://staging.facebook.com";
                case "prod" -> URL = "http://facebook.com";
                default -> URL = "http://dev.facebook.com";
            }
        }
        else{
            URL = "http://dev.facebook.com";
        }
        System.out.println(URL);
    }

}
