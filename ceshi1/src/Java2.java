import javax.xml.namespace.QName;
class Person {
    private String name;
    private int age;

    public Person(String a, int b) {
        name = a;
        age = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }
}

public class Java2 {
    public static void main(String[] args) {
        Person a = new Person("liz", 18);
        System.out.println("name=" + a.getName() + " age=" + a.getAge());
    }
}
