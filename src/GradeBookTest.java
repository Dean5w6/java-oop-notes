import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Initial course name is: " + gradeBook.getCourseName());
        // would return "null"

        System.out.printf("Enter the course name: ");
        String newCourseName = scanner.nextLine();

        gradeBook.setCourseName(newCourseName);
        gradeBook.displayMessage();
    }
}
