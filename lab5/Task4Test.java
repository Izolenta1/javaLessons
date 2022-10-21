package lab5;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task4Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 480);

        BufferedImage[] imgMas = new BufferedImage[5];
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\georn\\Desktop\\githubRepos\\javaLessons\\lab5\\animFrames\\1.jpg"));
            imgMas[0] = img;
            img = ImageIO.read(new File("C:\\Users\\georn\\Desktop\\githubRepos\\javaLessons\\lab5\\animFrames\\2.jpg"));
            imgMas[1] = img;
            img = ImageIO.read(new File("C:\\Users\\georn\\Desktop\\githubRepos\\javaLessons\\lab5\\animFrames\\3.jpg"));
            imgMas[2] = img;
            img = ImageIO.read(new File("C:\\Users\\georn\\Desktop\\githubRepos\\javaLessons\\lab5\\animFrames\\4.jpg"));
            imgMas[3] = img;
            img = ImageIO.read(new File("C:\\Users\\georn\\Desktop\\githubRepos\\javaLessons\\lab5\\animFrames\\5.jpg"));
            imgMas[4] = img;
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);

        frame.add(label);

        frame.setVisible(true);

        int counter = 0;
        while (true) {
            if (counter == 5) {
                counter = 0;
            }
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            icon = new ImageIcon(imgMas[counter]);
            label.setIcon(icon);
            counter += 1;

        }
    }
}
