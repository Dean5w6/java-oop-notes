public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI * (this.radius * this.radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    @Override
    public String getName() {
        return "circle";
    }
}
