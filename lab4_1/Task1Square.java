package lab4_1;

public class Task1Square extends Task1Shape{
    private double a;

    public Task1Square (String type, double a) {
        super(type);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Task1Square{" +
                "a=" + a +
                '}';
    }
}
