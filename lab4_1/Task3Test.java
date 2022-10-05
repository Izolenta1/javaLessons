package lab4_1;

public class Task3Test {
    public static void main(String[] args) {
        Task3Person person1 = new Task3Person("Alex", 24);
        Task3Person person2 = new Task3Person();

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
