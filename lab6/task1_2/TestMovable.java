package lab6.task1_2;

import lab6.task1_2.Task1Movable;
import lab6.task1_2.Task1MovableCircle;
import lab6.task1_2.Task1MovablePoint;
import lab6.task1_2.Task1MovableRectangle;

public class TestMovable {
    public static void main(String[] args) {
        Task1Movable m1 = new Task1MovablePoint(1,2,2,3);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Task1Movable m2 = new Task1MovableCircle(3,1,3,-3,8);

        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Task1Movable m4 = new Task1MovablePoint(4,1,2,3);
        Task1Movable m3 = new Task1MovableRectangle((Task1MovablePoint) m4,(Task1MovablePoint) m4);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
    }
}
