public class Employee extends Person
{
    private int Salary;
    public Employee(String aName,int aSalary){
        super(aName);
        Salary=aSalary;
    }
    public int getSalary(){
        return Salary;
    }
    public String getDescription() {
        return "an employee with a salary of "+Salary;
    }
}
