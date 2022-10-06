package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Task1Test {
    private int firstTeamCounter = 0;
    private int secondTeamCounter = 0;

    public static void main(String[] args) {
        Task1Test obj = new Task1Test();

        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JLabel label1 = new JLabel("Result: 0 X 0");
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");
        Box box = Box.createVerticalBox();
        label1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(label1);
        box.add(Box.createVerticalStrut(5));
        label2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(label2);
        box.add(Box.createVerticalStrut(5));
        label3.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(label3);
        frame.add(box, BorderLayout.NORTH);

        JButton button1 = new JButton("AC Milan");
        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.increaseFirstTeam(label1, label2, label3);
            }
        };
        button1.addActionListener(actionListener1);
        JButton button2 = new JButton("Real Madrid");
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.increaseSecondTeam(label1, label2, label3);
            }
        };
        button2.addActionListener(actionListener2);
        JPanel panel1 = new JPanel();
        panel1.add(button1);
        panel1.add(button2);
        panel1.setSize(300, 300);
        frame.add(panel1, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void increaseFirstTeam(JLabel label1, JLabel label2, JLabel label3) {
        this.firstTeamCounter += 1;

        label1.setText("Result: " + Integer.toString(this.firstTeamCounter) + " X " + Integer.toString(this.secondTeamCounter));
        label2.setText("Last Scorer: AC Milan");

        if (this.firstTeamCounter == this.secondTeamCounter) {
            label3.setText("Winner: DRAW");
        }
        else if (this.firstTeamCounter > this.secondTeamCounter) {
            label3.setText("Winner: AC Milan");
        }
        else {
            label3.setText("Winner: Real Madrid");
        }
    }

    public void increaseSecondTeam(JLabel label1, JLabel label2, JLabel label3) {
        this.secondTeamCounter += 1;

        label1.setText("Result: " + Integer.toString(this.firstTeamCounter) + " X " + Integer.toString(this.secondTeamCounter));
        label2.setText("Last Scorer: Real Madrid");

        if (this.firstTeamCounter == this.secondTeamCounter) {
            label3.setText("Winner: DRAW");
        }
        else if (this.firstTeamCounter > this.secondTeamCounter) {
            label3.setText("Winner: AC Milan");
        }
        else {
            label3.setText("Winner: Real Madrid");
        }
    }
}
