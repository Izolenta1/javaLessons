package lab4_1;

public abstract class Task1Shape {
    private String type;

    public Task1Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}
