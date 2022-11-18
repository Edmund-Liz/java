import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date a=new Date();
        System.out.println(a);
        System.out.println(new Date());
        System.out.println(new Date().toString());
        Date b=null;
        if(b==null)
            System.out.println("b是空的。");
    }
}
