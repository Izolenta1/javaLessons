package lab4_1;

public class Task8Test {
    public static void main(String[] args) {
        Task8Circle circle = new Task8Circle(8.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Task8Rectangle rect = new Task8Rectangle(12.0, 8.0);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Task8Square square = new Task8Square(5.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
