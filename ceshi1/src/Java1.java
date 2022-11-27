import java.util.Scanner;

class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int addition(int a) {
        return (a + number);
    }

    public int subtration(int a) {
        return (number - a);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int multiplication(int a) {
        return (number * a);
    }

    public int division(int a) {
        return (number / a);
    }

    public int getNumber() {
        return number;
    }
}


public class Java1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入n1：");
        int x = in.nextInt();
        System.out.print("输入n2");
        int y = in.nextInt();
        Number n1 = new Number(x);
        Number n2 = new Number(y);
        System.out.println("n1=" + n1 + " n2=" + n2);
        System.out.println("n1+n2=" + n1.addition(n2.getNumber()));
        System.out.println("n1-n2=" + n1.subtration(n2.getNumber()));
        System.out.println("n1*n2=" + n1.multiplication(n2.getNumber()));
        System.out.println("n1/n2=" + n1.division(n2.getNumber()));
    }
}
