package lab2;

public class Circle {
    private Point circlePointObj;

    public Circle(double PointX, double PointY) {
        this.circlePointObj = new Point(PointX, PointY);
    }

    public String getPoint(){
        return circlePointObj.toString();
    }
}
