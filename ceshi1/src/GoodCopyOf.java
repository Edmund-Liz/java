import java.lang.reflect.Array;

public class GoodCopyOf {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int e : a)
            System.out.print(e+" ");
        System.out.println();
        a=(int[]) goodCopyOf(a,10);
        a[5]=6;
        a[6]=7;
        for (int e:a)
            System.out.print(e+" ");
    }
    public static Object goodCopyOf(Object a,int newLength)
    {
        Class cl=a.getClass();
        if (!cl.isArray()) return null;
        Class componentType=cl.componentType();
        int length= Array.getLength(a);
        Object NewArray=Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,NewArray,0,Math.min(length,newLength));
        return NewArray;
    }
}
