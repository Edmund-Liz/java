import java.time.DayOfWeek;
import java.time.LocalDate;
public class Calendar {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int today=date.getDayOfMonth();//得到今天的日期
        int month= date.getMonthValue();//得到此月天数；
        date=date.minusDays(today-1);//使date变为此月第一天
        DayOfWeek a=date.getDayOfWeek();//此月第一天星期数
        int value=a.getValue();//得到此月第一天星期值
        System.out.println("Mon Tue Wed Thu Fri Sta Sun");
        for(int i=1;i<value;i++)
        {
            System.out.print("    ");   //日历第一天的缩进
        }
        while(date.getMonthValue()==month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            if(date.getDayOfWeek().getValue()==7)
            System.out.println();
            date=date.plusDays(1);
    }
}
}
