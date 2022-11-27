import java.util.IdentityHashMap;

class Employees {
    private static int NextId=1;
    private String Name;
    private int Id;

    {
        Id = NextId++;
        System.out.println("启动了"+Id+"次初始化块");
    }

    Employees(String aName) {
        Name = aName;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Employees a = new Employees("A");
        Employees b = new Employees("B");
        System.out.println(a.getId() + "号:" + a.getName());
        System.out.println(b.getId() + "号:" + b.getName());
    }


}
