import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("请输入你的姓名和年龄：");
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        int age=in.nextInt();
        System.out.println(name+","+"你明年"+(age+1)+"岁");
    }
}