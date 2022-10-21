package lab6.task1_2;

public class Task1MovableRectangle implements Task1Movable {
    public Task1MovablePoint topLeft;
    public Task1MovablePoint bottomRight;

    public Task1MovableRectangle(Task1MovablePoint topLeft, Task1MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += topLeft.ySpeed;

    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.x -= topLeft.xSpeed;

    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= topLeft.xSpeed;

    }

    @Override
    public void moveRight() {

        topLeft.x += topLeft.xSpeed;
        bottomRight.x += topLeft.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
