package lab2;

import java.lang.Math;

public class Circle {
    private Point circlePointObj1;
    private Point circlePointObj2;

    public Circle(double PointX1, double PointY1, double PointX2, double PointY2) {
        this.circlePointObj1 = new Point(PointX1, PointY1);
        this.circlePointObj2 = new Point(PointX2, PointY2);
    }

    public void printPoints(){
        System.out.println(circlePointObj1.toString());
        System.out.println(circlePointObj2.toString());
    }

    public double countR() {
        double firstSlag = Math.pow(circlePointObj2.getX() - circlePointObj1.getX(), 2);
        double secondSlag = Math.pow(circlePointObj2.getY() - circlePointObj1.getY(), 2);

        return Math.sqrt(firstSlag + secondSlag);
    }

    public double countL() {
        return 2 * Math.PI * countR();
    }

    public double countS() {
        return Math.PI * Math.pow(countR(), 2);
    }

    public boolean equal(Circle secondCircle) {
        if (this.countR() == secondCircle.countR()) {
            return true;
        }
        else {
            return false;
        }
    }
}
