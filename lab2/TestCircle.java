package lab2;

public class TestCircle {
    private int masLength;
    private Circle[] circleMas;

    public static void main(String[] args) {
        TestCircle test = new TestCircle();
        test.masLength = 1;

        test.circleMas = new Circle[test.masLength];

        Circle circle = new Circle(1.2, 2.4);
        test.circleMas[0] = circle;

        System.out.println(test.circleMas[0].getPoint());
    }
}