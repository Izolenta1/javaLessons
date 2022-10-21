package lab6.task1_2;

public class Task1MovableCircle implements Task1Movable {
    private int radius;
    private Task1MovablePoint center;

    public Task1MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        this.radius=radius;
        center = new Task1MovablePoint(x,y,xSpeed,ySpeed);
    }

    public Task1MovableCircle(int radius, Task1MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.y-=center.ySpeed;

    }

    @Override
    public void moveDown() {
        center.y+=center.ySpeed;

    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;

    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
