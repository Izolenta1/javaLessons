package lab4_1;

public abstract class Task9Furniture {
    protected String material;
    protected double cost;

    public Task9Furniture(String material, double cost) {
        this.material = material;
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public double getCost() {
        return cost;
    }

    public String getObjName() {
        return "-";
    }
}
