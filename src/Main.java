import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInputValid = false; // A flag to control our loop

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();

                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = numerator / denominator;
                System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);

                isInputValid = true; // If we get here, the input was good, and we can exit the loop
            }
            catch (InputMismatchException e) {
                System.err.println("\nError: You must enter integers. Please try again.\n");
                scanner.nextLine(); // Important: clear the bad input from the scanner
            }
            catch (ArithmeticException e) {
                System.err.println("\nError: Denominator cannot be zero. Please try again.\n");
            }
        } while (!isInputValid);
    }
}