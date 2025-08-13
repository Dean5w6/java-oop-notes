import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(8, 6);

        Shape[] shapes = {circle, rectangle};

        for (Shape currentShape : shapes) {
            System.out.printf("Area of " + currentShape.getName() + ": " + currentShape.getArea() + "\n");
        }
    }
}