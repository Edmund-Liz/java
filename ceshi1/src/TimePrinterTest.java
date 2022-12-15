import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone,the time is"
                + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}

public class TimePrinterTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        var t = new Timer(1000, listener);//间隔delay之后调用一次listener
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
