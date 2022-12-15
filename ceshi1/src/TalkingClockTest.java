import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.beep = beep;
        this.interval = interval;
    }

    public void start() {
        var listener = new ActionListener()//匿名内部类
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone,the time is "
                        + Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        //或删掉这个匿名内部类，采用下面的lambda表达式
        var timer = new Timer(interval, listener);
        /**
         * var timer=new Timer(interval,event->{
         * System.out.println("At the tone,the time is "
         * + Instant.ofEpochMilli(e.getWhen()));
         * if (beep) Toolkit.getDefaultToolkit().beep();
         * 此处使用lambda表达式
         */
        timer.start();
    }

}

public class TalkingClockTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
