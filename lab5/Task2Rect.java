package lab5;

import java.awt.*;

public class Task2Rect extends Task2Shape {
    private int width;
    private int height;

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new Color(this.RedColor, this.GreenColor, this.BlueColor));
        g2d.fillRect(this.xPos, this.yPos, this.width, this.height);
    }

    public Task2Rect(int redColor, int greenColor, int blueColor, int xPos, int yPos, int width, int height) {
        super(redColor, greenColor, blueColor, xPos, yPos);
        this.width = width;
        this.height = height;
    }

    public Task2Rect() {

    }
}
