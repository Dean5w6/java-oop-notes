import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        Vehicle[] myVehicles = {myCar, myBicycle};

        for (Vehicle currentVehicle : myVehicles) {
            currentVehicle.honk();
        }
    }
}