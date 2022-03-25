package day21;


import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new TimePrinter());
        timer.start();

        JOptionPane.showConfirmDialog(null, "Quit program?");
        System.exit(0); // this hold the program could not let quit



    }
}
