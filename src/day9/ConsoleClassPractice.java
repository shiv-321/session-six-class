package day9;

import java.io.Console;

public class ConsoleClassPractice {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println("Enter username: ");
        String username = con.readLine();

        System.out.println("Enter password: ");
        char[] password = con.readPassword();

        System.out.println("Username: " + username);
        System.out.println("Password: " + String.valueOf(password));
    }
}

//  this can be done only form command prompt so copy this file in the desktop and run the following command in the command prompt
// javac ConsoleClassPractice.java
// java ConsoleClassPractice

