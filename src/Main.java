import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.printf("Type your name: ");
        String employeeName = scanner.nextLine();
        employee.name = employeeName;

        System.out.printf("Type your job title: ");
        String employeeJobTitle = scanner.nextLine();
        employee.setJobTitle(employeeJobTitle);

        System.out.println("\n");
        employee.introduce();
    }
}