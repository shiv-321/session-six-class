package day21;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.logging.Logger;

public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();

    }
}

/**
 * this is an example of call back
 */
