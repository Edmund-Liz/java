public class EnumTest {
    public static void main(String[] args) {
        Size s=Enum.valueOf(Size.class,"SMALL");
        System.out.println(s);
        Size[] a=Size.values();
        for (Enum e:a)
            System.out.println(e);
    }
}
