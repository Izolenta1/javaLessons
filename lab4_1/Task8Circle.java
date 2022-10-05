package lab4_1;

public class Task8Circle extends Task8Shape {
    protected double radius;

    public Task8Circle() {

    }

    public Task8Circle(double radius) {
        this.radius = radius;
    }

    public Task8Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Task8Circle{" +
                "radius=" + radius +
                '}';
    }
}
