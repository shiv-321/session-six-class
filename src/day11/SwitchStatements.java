package day11;

import java.util.logging.Logger;

public class SwitchStatements {
    public static void main(String[] args) {
        String today = "tuesday";
        /*
        if(today.equals("sunday")){
            System.out.println("sunday");
        }
        else if(today.equals("monday")){
            System.out.println("monday");
        }
        else if(today.equals("tuesday")){
            System.out.println("tuesday");
        }
        else if(today.equals("wednesday")){
            System.out.println("wednesday");
        }
        else if(today.equals("thursday")){
            System.out.println("thursday");
        }
        else if(today.equals("friday")){
            System.out.println("friday");
        }
        else if(today.equals("saturday")){
            System.out.println("saturday");
        }
        else{
            System.out.println("nothing");
        }

        // old method for switch statements
        switch (today){
            case "sunday":
                Logger.getGlobal().info("sunday");
                break;
            case "monday":
                Logger.getGlobal().info("monday");
                break;
            case "tuesday":
                Logger.getGlobal().info("tuesday");
                break;
            case "wednesday":
                Logger.getGlobal().info("wednesday");
                break;
            case "thursday":
                Logger.getGlobal().info("thursday");
                break;
            case "friday":
                Logger.getGlobal().info("friday");
                break;
            case "saturday":
                Logger.getGlobal().info("saturday");
                break;
            default:
                Logger.getGlobal().info("Match not found");
                break;
        }

         */

        // New method for switch method
        switch(today){
            case "sunday", "saturday"-> Logger.getGlobal().info("sunday");
            case "monday"-> Logger.getGlobal().info("monday");
            case "tuesday"-> Logger.getGlobal().info("tuesday");
            case "wednesday"-> Logger.getGlobal().info("wednesday");
            case "thursday"-> Logger.getGlobal().info("thursday");
            case "friday"-> Logger.getGlobal().info("friday");
            //case "saturday"-> Logger.getGlobal().info("saturday");
            default -> Logger.getGlobal().info("No any match");
        }


    }
}
