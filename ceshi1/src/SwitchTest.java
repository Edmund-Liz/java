import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("输入选择：");
        int a=in.nextInt();
        System.out.print("你的选择是：");
        switch (a)
        {
            case 1:System.out.println("1"); break;
            case 2:System.out.println("2"); break;
            case 3:System.out.println("3"); break;
            case 4:System.out.println("4"); break;
            default:System.out.println("一个错误输入！");
        }
    }
}
