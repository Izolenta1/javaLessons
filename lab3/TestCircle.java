package lab3;

import java.util.Random;

public class TestCircle {
    private int masLength;
    private Circle[] circleMas;

    public static void main(String[] args) {
        TestCircle test = new TestCircle();
        test.masLength = 10;
        test.circleMas = new Circle[test.masLength];

        Random randomizer = new Random();
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(randomizer.nextDouble() * 10, randomizer.nextDouble() * 10, randomizer.nextDouble() * 10, randomizer.nextDouble() * 10);
            test.circleMas[i] = circle;
        }

        test.printSmallestCircle();
        test.printBiggestCircle();
        System.out.println("======================");
        test.sortCircleMas();
        for (int i = 0; i < 10; i++) {
            System.out.println(test.circleMas[i].toString());
        }
    }

    public void printSmallestCircle() {
        Circle circleObj = circleMas[0];

        for (int i = 1; i < 10; i++) {
            if (circleObj.countR() > circleMas[i].countR()) {
                circleObj = circleMas[i];
            }
        }

        System.out.println(circleObj.toString());
    }

    public void printBiggestCircle() {
        Circle circleObj = circleMas[0];

        for (int i = 1; i < 10; i++) {
            if (circleObj.countR() < circleMas[i].countR()) {
                circleObj = circleMas[i];
            }
        }

        System.out.println(circleObj.toString());
    }

    public void sortCircleMas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (circleMas[j].countR() > circleMas[j+1].countR()) {
                    Circle a = circleMas[j];
                    circleMas[j] = circleMas[j+1];
                    circleMas[j+1] = a;
                }
            }
        }
    }
}