package day8;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.Logger;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer value: ");

        int integer = scanner.nextInt();
//        String character = scanner.next();
//        String sentences = scanner.nextLine();
//        double doubleValue = scanner.nextDouble();
//        float floatValue = scanner.nextFloat();
        Logger.getGlobal().info(String.valueOf(integer));

        // will not work here need to run from command prompt
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char[] password = cons.readPassword("Password: ");





    }

}
