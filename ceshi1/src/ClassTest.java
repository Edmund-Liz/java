import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) {
        Manager a = new Manager("Harry", 5000, 2022, 11, 2);
        Employee b = new Employee("Tony", 4000, 2002, 1, 25);
        int[] x = new int[]{2, 1};
        Class cl1 = b.getClass();
        System.out.println(cl1);
        System.out.println(a.getClass() + " " + b.getClass());
        System.out.println();
        Field[] field = cl1.getDeclaredFields();
        for (Field e : field)
            System.out.println(e);
        System.out.println();
        Method[] method = cl1.getDeclaredMethods();
        for (Method e : method)
            System.out.println(e);
        System.out.println();
        Constructor[] constructors = cl1.getDeclaredConstructors();
        for (Constructor e : constructors)
            System.out.println(e);
    }
}
