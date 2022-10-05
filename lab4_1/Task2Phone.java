package lab4_1;

public class Task2Phone {
    private String number;
    private String model;
    private int weight;

    public Task2Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Task2Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Task2Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Task2Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
