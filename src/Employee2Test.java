public class Employee2Test {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n", Employee2.getCount());

        Employee2 e1 = new Employee2("Susan", "Baker");
        Employee2 e2 = new Employee2("Bob", "Blue");

        System.out.printf("%nEmployees after instantiation: %d%n", Employee2.getCount());
    }
}
