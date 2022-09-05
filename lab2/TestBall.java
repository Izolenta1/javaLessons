package lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);

        ball.move(1.2, 2.4);
        System.out.println(ball.toString());
    }
}
