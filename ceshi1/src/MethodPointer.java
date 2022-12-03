import java.lang.reflect.Method;

public class MethodPointer {
    public static void main(String[] args)
        throws ReflectiveOperationException
    {
        Method a=Employee.class.getMethod("getName");
        Employee harry=new Employee("Harry",5000,2022,12,2);
        System.out.println(a.invoke(harry));
    }
}
