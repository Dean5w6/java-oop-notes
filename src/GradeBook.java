import java.util.Scanner;

public class GradeBook {
    private String courseName;

    // This is the constructor
    public GradeBook(String name) {
        courseName = name;
    }
    // End of the constructor

    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void determineClassAverage() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int totalUnits = 0;
        int gradeCounter = 0;

        System.out.print("Enter a grade (Type 0 or less to end): ");
        double grade = scanner.nextDouble();

        while (grade > 0) {
            System.out.print("Enter the number of units for that grade: ");
            int units = scanner.nextInt();

            if (units > 0) {
                totalUnits += units;
                total += (grade * units);
                gradeCounter++;
            } else {
                System.out.println("Invalid units. Entry skipped.");
            }

            System.out.print("\nEnter a grade (Type 0 or less to end): ");
            grade = scanner.nextDouble();
        }

        if (gradeCounter > 0) {
            double GPA = total / totalUnits;
            System.out.printf("\nYour GPA is: %.2f\n", GPA);
        } else {
            System.out.println("\nNo valid grades were entered.");
        }
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + getCourseName() + "!");
    }
}