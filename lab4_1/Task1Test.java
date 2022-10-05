package lab4_1;

public class Task1Test {
    public static void main(String[] args) {
        Task1Circle circleObj = new Task1Circle("circle", 12.3);
        Task1Rectangle rectangleObj = new Task1Rectangle("rectangle", 12.4, 2.5);
        Task1Square squareObj = new Task1Square("square", 7.4);

        System.out.println(circleObj.getType());
        System.out.println(circleObj.toString());
        System.out.println(circleObj.getArea());
        System.out.println(circleObj.getPerimeter());
    }
}
