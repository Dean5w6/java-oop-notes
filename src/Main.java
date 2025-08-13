import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("For the circle, provide the value of radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Provide the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.printf("Provide the height of the rectangle: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        Shape[] shapes = {circle, rectangle};

        for (Shape currentShape : shapes) {
            currentShape.getArea();
            currentShape.getPerimeter();

            if (currentShape == circle) {
                System.out.println("\n[Circle]\nArea: " + currentShape.getArea() + "\nPerimeter: " + currentShape.getPerimeter());
            } else {
                System.out.println("\n[Rectangle]\nArea: " + currentShape.getArea() + "\nPerimeter: " + currentShape.getPerimeter());
            }
        }
    }
}