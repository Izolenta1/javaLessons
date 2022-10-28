package lab9.task4;

import java.util.Comparator;
public class Task4Car implements Comparable<Task4Car>{
    public String brand;
    public int cost;
    public int maxSpeed;

    public Task4Car(String brand, int cost, int maxSpeed) {
        this.brand = brand;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Task4Car{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public int compareTo(Task4Car car) {
        return Integer.compare(car.cost, this.cost);
    }
}
