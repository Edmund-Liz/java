import java.time.LocalDate;
import java.util.Scanner;

class Employee {
    private static int NextId = 1;
    private final String name;
    private final LocalDate hireDay;
    private final int Id;
    private int salary;


    public Employee(String aName, int aSalary, int year, int month, int day) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year, month, day);
        Id = NextId++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return Id;
    }
    public int getNextId(){
        return NextId;
    }

    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }

}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner ru = new Scanner(System.in);
        String name = ru.nextLine();
        int salary = ru.nextInt();
        int year = ru.nextInt();
        int month = ru.nextInt();
        int day = ru.nextInt();
        Employee a = new Employee(name, salary, year, month, day);
        System.out.println(a.getName() + " " + a.getSalary() + " " + a.getHireDay());
        System.out.println("加薪百分之多少？");
        double percent;
        percent = ru.nextDouble();
        a.raiseSalary(percent);
        System.out.println(a.getName() + " " + a.getSalary() + " " + a.getHireDay());
        System.out.println(a.getId());
        System.out.println(a.getNextId());
    }
}
