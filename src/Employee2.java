public class Employee2 {
    private String firstName, lastName;
    private static int count = 0;

    public Employee2(String fName, String lName) {
        firstName = fName;
        lastName = lName;

        count++;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public static int getCount() {
        return count;
    }
}
