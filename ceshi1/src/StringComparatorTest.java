import java.util.Arrays;
import java.util.Comparator;

class LengthComparator implements Comparator<String>
{
    public int compare(String first,String second){
        return first.length()-second.length();
    }
}
public class StringComparatorTest {
    public static void main(String[] args) {
       String[] friends={"Tony","Stark","Jay"};
        var comp=new LengthComparator();
        Arrays.sort(friends,comp);
        for (String e:friends)
            System.out.println(e);
    }
}
