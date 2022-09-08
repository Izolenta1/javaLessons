package lab2;

public class Computer {
    private String model;
    private int cost;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
