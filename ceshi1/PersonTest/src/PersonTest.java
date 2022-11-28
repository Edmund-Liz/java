public class PersonTest {
    public static void main(String[] args) {
       var a=new Person[2];
       a[0]=new Employee("Harry",5000);
       a[1]=new Student("Tony","computer");
       for (Person e:a)
           System.out.println(e.getDescription());
    }
}