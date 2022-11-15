import java.util.Scanner;
public class Main1
{
    public static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("每年利息是：");
        int jin=in.nextInt();
        int yue=0;
        int a=1;
        do
        {
            yue+=jin;
            System.out.println("现在你余额为："+yue);
            System.out.println("是否退休？");
            String input;
            input=in.nextLine();
            if (input.equals("Y"))
                break;
        }while(a==1);
        System.out.println("你的退休金为："+yue);
    }
}
