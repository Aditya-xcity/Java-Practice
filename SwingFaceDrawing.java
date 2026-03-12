// Write a swing program to create the following shape

/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import javax.swing.*;
import java.awt.*;

public class SwingFaceDrawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(100, 50, 300, 250);

        g.drawRect(80, 120, 20, 80);
        g.drawRect(400, 120, 20, 80);

        g.drawOval(160, 110, 60, 30);
        g.drawOval(280, 110, 60, 30);

        g.fillOval(185, 120, 15, 15);
        g.fillOval(305, 120, 15, 15);

        g.drawLine(250, 130, 250, 200);

        g.drawOval(200, 210, 120, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Face Drawing");

        SwingFaceDrawing panel = new SwingFaceDrawing();

        frame.add(panel);
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}