import java.math.BigInteger;

public class BigIntegerTest
{
    public static void main(String[] args)
    {
        BigInteger a=BigInteger.ZERO;
        BigInteger b=BigInteger.ONE;
        BigInteger c;
        c=a.add(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+"+"+b+"="+c);
    }
}
