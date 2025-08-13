import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fNum = JOptionPane.showInputDialog("Enter the first number: ");
        int firstNumber = Integer.parseInt(fNum);

        String sNum = JOptionPane.showInputDialog("Enter the second number: ");
        int secondNumber = Integer.parseInt(sNum);

        int result = firstNumber + secondNumber;

        String message = String.format("The sum of %d and %d is %d", firstNumber, secondNumber, result);

        JOptionPane.showMessageDialog(null, message);
    }
}