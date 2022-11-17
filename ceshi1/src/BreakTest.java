import java.util.Scanner;

public class BreakTest
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a;
        int b=1;
        read_data:
        while(b==1)
        {
           System.out.println("第一次循环：");
           while(b==1)
           {
               a=in.nextInt();
               if(a==1)
               {
                   break read_data;
               }
               if (a==0)
               {
                   break ;
               }
           }
        }
    }
}
