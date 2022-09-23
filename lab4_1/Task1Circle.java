package lab4_1;

public class Task1Circle extends Task1Shape{
    private double R;

    public Task1Circle (String type, double R) {
        super(type);
        this.R = R;
    }

    @Override
    public double getArea() {
        return 3.14 * R * R;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * R;
    }

    @Override
    public String toString() {
        return "Task1Circle{" +
                "R=" + R +
                '}';
    }
}
