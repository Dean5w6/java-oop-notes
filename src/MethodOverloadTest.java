public class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();

        System.out.printf("Square of integer 7 is: %d", methodOverload.square(7));
        System.out.println();
        System.out.printf("Square of double 7.5 is: %f", methodOverload.square(7.5));
    }
}
