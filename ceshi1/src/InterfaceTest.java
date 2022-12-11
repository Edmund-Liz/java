import java.util.Arrays;
class Employee1 implements Comparable<Employee1> {
    private String name;
    private int salary;
    public Employee1(String aName,int aSalary){
        name=aName;
        salary=aSalary;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Employee1 other){
        return Double.compare(other.getSalary(),this.getSalary());
    }

}
public class InterfaceTest {
    public static void main(String[] args) {
        Employee1[] a=new Employee1[3];
        a[0]=new Employee1("Harry",5000);
        a[1]=new Employee1("Tony",6000);
        a[2]=new Employee1("Point",4000);
        Arrays.sort(a);
        for (Employee1 e:a)
            System.out.println(e.getName()+" "+e.getSalary());
    }
}
