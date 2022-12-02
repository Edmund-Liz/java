abstract class Person {
    private String name;

    public Person(String aName) {
        name = aName;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
class Employee2 extends Person{
    private int salary;
    public Employee2(String aName,int aSalary){
        super(aName);
        salary=aSalary;
    }
    public String getDescription(){
        return "a Employee with a salary of "+salary;
    }
}
class Student2 extends Person{
    private String major;
    public Student2(String aName,String aMajor){
        super(aName);
        major=aMajor;
    }
    public String getMajor(){
        return major;
    }
    public String getDescription(){
        return "a Student majoring in "+major;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] a=new Person[2];
        a[0]=new Employee2("Harry",5000);
        a[1]=new Student2("Tony","computer");
        System.out.println(a[0].getName()+" "+a[0].getDescription());
        System.out.println(a[1].getName()+" "+a[1].getDescription());
    }
}
