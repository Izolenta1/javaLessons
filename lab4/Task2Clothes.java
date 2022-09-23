package lab4;

public abstract class Task2Clothes {
    private Task2ENUM size;
    private int cost;
    private String color;

    public Task2ENUM getSize() {
        return size;
    }

    public void setSize(Task2ENUM size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
