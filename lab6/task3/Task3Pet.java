package lab6.task3;

public class Task3Pet implements Task3Nameable{
    private String name;

    public Task3Pet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
