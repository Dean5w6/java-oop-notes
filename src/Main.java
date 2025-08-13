import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car myCar = new Car();

        myCar.honk();

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.getModelName());
    }
}