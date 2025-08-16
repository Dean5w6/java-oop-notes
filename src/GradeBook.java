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
        double total = 0, grade = 0.0;
        int units = 0, totalUnits = 0;

        while (true) {
            System.out.printf("Enter a grade (Type '0' to end): ");
            grade = scanner.nextDouble();
            if (grade < 1.0) {
                System.out.println("Invalid grade.");
                grade = 0.0;
            }

            System.out.printf("Enter the number of units for that grade (Type '0' to end): ");
            units = scanner.nextInt();
            if (units < 1) {
                System.out.println("Invalid units.");
                units = 0;
            }

            if (grade >= 1.0 && units >= 1) {
                totalUnits += units;
                total += (grade * units);
            } else if (grade < 1.0 || units < 1) {
                break;
            }
        }

        double GPA = (total / totalUnits);
        System.out.println("\nTotal grades: " + total + "\nTotal units: " + totalUnits);
        System.out.println("Your GPA is: " + GPA);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + getCourseName() + "!");
    }
}