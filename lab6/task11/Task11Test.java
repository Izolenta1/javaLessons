package lab6.task11;

public class Task11Test {
    public static void main(String[] args) {
        Task11Farengeit farengeit = new Task11Farengeit(45);
        Task11Kelvin kelvin = new Task11Kelvin(45);

        System.out.println("45 cel = " + farengeit.convert()+ " farengeit");
        System.out.println("45 cel = " + kelvin.convert() + " kelvin");
    }
}
