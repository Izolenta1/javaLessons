package lab5;

import javax.swing.*;
import java.awt.*;

public abstract class Task2Shape extends JPanel {
    protected int RedColor;
    protected int GreenColor;
    protected int BlueColor;

    protected int xPos;
    protected int yPos;

    public Task2Shape(int redColor, int greenColor, int blueColor, int xPos, int yPos) {
        RedColor = redColor;
        GreenColor = greenColor;
        BlueColor = blueColor;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Task2Shape() {

    }
}
