package lab4_1;

public class Task2Test {
    public static void main(String[] args) {
        Task2Phone phone1 = new Task2Phone("123-098-456", "Iphone12", 254);
        Task2Phone phone2 = new Task2Phone("345-095-275", "Iphone5", 154);
        Task2Phone phone3 = new Task2Phone("802-574-883", "Iphone7", 204);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("Alex");
        phone2.receiveCall("Buch");
        phone3.receiveCall("Kate");

        phone1.receiveCall("Alex", "912-573-775");

        phone1.sendMessage("023-774-888", "884-623-001");
    }
}
