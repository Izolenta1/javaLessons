package lab6.task6_7_8_9;

public class Task6Book implements Task6Printable{
    private String name;

    public Task6Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Book: " + getName());

    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
