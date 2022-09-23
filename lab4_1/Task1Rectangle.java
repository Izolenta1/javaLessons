package lab4_1;

public class Task1Rectangle extends Task1Shape {
    private double a;
    private double b;

    public Task1Rectangle (String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return a + b + a + b;
    }

    @Override
    public String toString() {
        return "Task1Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
