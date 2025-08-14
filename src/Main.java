import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click counter");
        JLabel label = new JLabel("Click the button!");
        JButton button = new JButton("Click me");

        ActionListener listener = new ActionListener() {
            int counter = 0;
            @Override

            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("Button was clicked! Clicks: " + counter);
            }
        };
        button.addActionListener(listener);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}