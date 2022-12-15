import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        var planets=new String[]{"Mercury","Venus","Earth","Mars"};
        for (String e:planets)
            System.out.print(e+" ");
        Arrays.sort(planets,(first,second)->
                first.length()-second.length());//按长度排序
        System.out.println();
        for (String e:planets)
            System.out.print(e+" ");
        System.out.println();

        var timer=new Timer(1000,events->//设置时间间隔和事件
                System.out.println("This time is "+new Date()));
        timer.start();//启动计时器

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);//结束程序
    }
}
