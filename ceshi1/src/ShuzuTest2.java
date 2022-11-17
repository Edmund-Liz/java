import java.util.Arrays;

public class ShuzuTest2 {
    public static void main(String[] args)
    {
        int[]a={1,2,3,4,5,6,7,8,9};
        for(int b:a)
        System.out.print(b);
        System.out.println(Arrays.toString(a));
        int[][] x={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] i:x)
            for (int j:i)
                System.out.println(j);
        System.out.println(Arrays.deepToString(x));
    }
}
