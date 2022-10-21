package lab6.task6_7_8_9;

public class Task6Shop implements Task6Printable{
    private String name;

    public Task6Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Shop: " + getName());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
