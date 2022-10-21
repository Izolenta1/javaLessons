package lab7.task4;

public class Task4Test {
    public static void main(String[] args) {
        Task4MathCalculable calculator = new Task4MathFunc(4,5);
        int radius = 3;

        double area = calculator.PI() * calculator.degree(radius, 2);
        System.out.println("Circle S: " + area);

        System.out.println("Module: " + calculator.comNum());
    }
}
