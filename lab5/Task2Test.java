package lab5;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Task2Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 480);

        frame.setLayout(new GridLayout(4, 5, 1, 1));

        Task2Rect figure = new Task2Rect();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j  < 4; j++) {
                int width = r.nextInt(50) + 50;
                int height = r.nextInt(50) + 50;
                figure = new Task2Rect(r.nextInt(256), r.nextInt(256), r.nextInt(256), 0, 0, width, height);
                figure.setSize(width, height);
                frame.add(figure);
            }
        }

        frame.setVisible(true);
    }
}
