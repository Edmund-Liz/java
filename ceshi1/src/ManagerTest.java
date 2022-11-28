class Manager extends Employee {//Employee类已在EmployeeTest.java声明
    private int bonus;

    public Manager(String aName, int aSalary, int year, int month, int day) {
        super(aName, aSalary, year, month, day);
    }

    public void setBonus(int aBonus) {
        bonus = aBonus;
    }

    public int getSalary() {
        int baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}


public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl", 8000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 4000, 1990, 3, 15);
        for (Employee e : staff)
            System.out.println(e.getName() + " " + e.getSalary());
    }
}
