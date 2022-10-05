package lab4_1;

public abstract class Task10Transport {
    protected double costPerKm;

    public Task10Transport(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    public double calculateTravel(double path) {
        return path * costPerKm;
    }
}
