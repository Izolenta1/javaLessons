package lab4_1;

public class Task3Person {
    private String fullname = "undefined";
    private int age = -1;

    public Task3Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Task3Person() {

    }

    public void move() {
        System.out.println("Такой-то " + this.fullname + " говорит");
    }

    public void talk() {
        System.out.println("Такой-то " + this.fullname + " идет");
    }
}
