package lab6.task4;

public class Task4Phone implements Task4Priceable{
    private double price;

    public Task4Phone(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Task4Phone{" +
                "price=" + price +
                '}';
    }
}
