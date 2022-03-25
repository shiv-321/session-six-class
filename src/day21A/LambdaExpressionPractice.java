package day21A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class LambdaExpressionPractice {
    public static void main(String[] args) {

//        ActionListener actionListener = e -> {
//            System.out.println("At the tone, the time is "
//                    + Instant.ofEpochMilli(e.getWhen()));
//            Toolkit.getDefaultToolkit().beep();
//
//        };

        Timer timer = new Timer(1000, e -> {
            System.out.println("At the tone, the time is "
                    + Instant.ofEpochMilli(e.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });

        timer.start();

        JOptionPane.showConfirmDialog(null, "Quit program?");
        System.exit(0); // this hold the program could not let quit


    }
}
