package lab4_1;

public class Task8Rectangle extends Task8Shape {
    protected double width;
    protected double length;

    public Task8Rectangle() {

    }

    public Task8Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Task8Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width + length + width + length;
    }

    @Override
    public String toString() {
        return "Task8Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
