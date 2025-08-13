import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Type your name: ");
        String employeeName = scanner.nextLine();

        System.out.printf("Type your job title: ");
        String employeeJobTitle = scanner.nextLine();

        Employee employee = new Employee(employeeName, employeeJobTitle);

        System.out.println("\n");

        employee.introduce();
    }
}