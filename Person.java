public class Person {

    private String name;

    public Person(String name) {
        this.setName(name);
    }

    public Person() {
        this.setName("N/A");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
