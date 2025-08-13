public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.printf("Hello, my name is " + this.name);
    }
}
