public class MethodOverload {
    public int square(int intValue) {
        System.out.printf("Called square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    public double square(double doubleValue) {
        System.out.printf("Called square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}