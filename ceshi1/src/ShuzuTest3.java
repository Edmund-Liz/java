public class ShuzuTest3 {
    public static void main(String[] args) {
        int[][] a=new int[4][];
        for(int i=0;i<4;i++)
        {
            a[i]=new int[i+1];
        }
        int z=0;
        for(int i=0;i<4;i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                a[i][j] = z++;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        }
}
