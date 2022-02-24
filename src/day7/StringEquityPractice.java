package day7;


import java.util.logging.Logger;

public class StringEquityPractice {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hell";

        String s3 = s1.substring(0, 4);
        System.out.println(s3);

        String address = "Texas";
        Logger.getGlobal().info(String.valueOf(address.equals("Texas")));
        Logger.getGlobal().info(String.valueOf(address.equals("texas")));

//    equalsIgnoreCase --> Returns true if two strings are equal ignoring the case of character
        String address1 = "Texas";
        Logger.getGlobal().info(String.valueOf(address1.equalsIgnoreCase("texas")));
        Logger.getGlobal().info(String.valueOf(address1.equalsIgnoreCase("Alabama")));
    }





}
