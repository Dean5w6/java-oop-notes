public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area;

        area = this.width * this.height;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;

        perimeter = 2 * (this.width + this.height);
        return perimeter;
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
