import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        var staff=new ArrayList<Employee>();
        staff.add(0,new Employee("Harry",5000,2002,11,1));
        staff.add(1,new Employee("Tony",2000,2011,12,1));
        System.out.println(staff.get(0).getName());
        System.out.println(staff.get(1).getName());
        System.out.println(staff.size());
        staff.set(0,new Employee("Point",1000,2022,7,15));
        System.out.println(staff.get(0).getName());
    }
}
