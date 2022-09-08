package lab2;

public class TestCircle {
    private int masLength;
    private Circle[] circleMas;

    public static void main(String[] args) {
        TestCircle test = new TestCircle();
        test.masLength = 2;

        test.circleMas = new Circle[test.masLength];

        Circle circle = new Circle(1.2, 2.4, 3.2, 4.5);
        test.circleMas[0] = circle;

        circle = new Circle(2.2, 3.2, 4.6, 7.8);
        test.circleMas[1] = circle;

        System.out.println(test.circleMas[0].countL());
        System.out.println(test.circleMas[0].countS());

        System.out.println(test.circleMas[0].equal(test.circleMas[1]));
    }
}