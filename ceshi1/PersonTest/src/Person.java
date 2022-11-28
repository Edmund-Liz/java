public abstract class Person {
    private String name;

    public Person(String aName) {
        name = aName;
    }

    public abstract String getDescription();

    public String getName(){
        return name;
    }
}
