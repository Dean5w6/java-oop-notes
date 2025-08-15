import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String action = "";

        do {
            System.out.println("\n[Simple To-Do List Program]");
            System.out.println("Usage: add [task], list, quit");
            System.out.printf("> ");
            action = scanner.nextLine();

            if (action.startsWith("add ")) {
                String newTask = action.substring(4);

                if (newTask.isBlank()) {
                    System.out.println("Task can't be blank!");
                } else {
                    tasks.add(newTask);
                    System.out.println("Task " + newTask + " was added successfully.");
                }
            } else if (action.equals("list")) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                } else {
                    System.out.println("\n--- Your Tasks ---");

                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println("\t" + (i+1) + ". " + tasks.get(i));
                    }
                }
            } else if (action.equals("quit")) {
                System.out.println("Quitting the program...");
            } else {
                System.out.println("Not a valid action.");
            }
        } while(!action.equals("quit"));
    }
}