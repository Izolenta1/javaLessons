package lab4_1;

public class Task8Square extends Task8Rectangle {
    public Task8Square() {

    }

    public Task8Square(double side) {
        super(side, side);
    }

    public Task8Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Task8Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
