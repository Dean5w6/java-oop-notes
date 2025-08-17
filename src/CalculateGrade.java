import java.util.Scanner;

public class CalculateGrade {
    private int total = 0;
    private int grade = 0;
    int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0;
    int totalCount = 0;
    double average = 0;

    Scanner scanner = new Scanner(System.in);

    public void getGrades() {
        while (true) {
            System.out.printf("Enter a grade: ");
            grade = scanner.nextInt();

            if (grade > 0) {
                switch (grade / 10) {
                    case 10:
                    case 9:
                        countA++;
                        break;
                    case 8:
                        countB++;
                        break;
                    case 7:
                        countC++;
                        break;
                    case 6:
                        countD++;
                        break;
                    case 5:
                        countE++;
                        break;
                    default:
                        countF++;
                        break;
                }
                total += grade;
                totalCount++;
            } else {
                System.out.println("Invalid grade.");
                break;
            }
        }
        average = (double) total / totalCount;
    }

    public void getResults() {
        System.out.println("Number of students with A grade: " + countA);
        System.out.println("Number of students with B grade: " + countB);
        System.out.println("Number of students with C grade: " + countC);
        System.out.println("Number of students with D grade: " + countD);
        System.out.println("Number of students with E grade: " + countE);
        System.out.println("Number of students with F grade: " + countF);
        System.out.println("Number of students: " + totalCount);
        System.out.printf("Class average: %.2f%n", average);
    }
}
