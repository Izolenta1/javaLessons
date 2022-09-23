package lab4;

public abstract class Task4Computer {
    private int cost;
    private Task4ENUM company;

    public Task4Computer (int cost, Task4ENUM company) {
        this.cost = cost;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Task4Computer{" +
                "cost=" + cost +
                ", company=" + company +
                '}';
    }
}
