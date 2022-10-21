package lab6.task1_2;

import lab6.task1_2.Task1Movable;

public class Task1MovablePoint implements Task1Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public Task1MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y +=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;

    }

    @Override
    public void moveLeft() {
        x -= xSpeed;

    }

    @Override
    public void moveRight() {
        x+=xSpeed;

    }
}
