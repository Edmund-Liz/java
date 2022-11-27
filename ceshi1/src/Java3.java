import java.util.Scanner;

class Lei {
    private int shu;

    public Lei(int a) {
        shu = a;
    }

    public int getShu() {
        return shu;
    }

    public void setShu(int a) {
        shu = a;
    }
}

public class Java3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lei a = new Lei(12);
        System.out.println("初始值为：" + a.getShu());
        System.out.println("设定值为：");
        int b = in.nextInt();
        a.setShu(b);
        System.out.println("设定后a=" + a.getShu());
    }
}
