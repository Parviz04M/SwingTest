package Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayout {
    public static void main(String[] args) {
        //BorderLayout
        //obj.setBounds(x, y, width, height);

        JFrame frame = new JFrame("Border Layout Sample");

        JButton btn1 = new JButton("b1");
        JButton btn2 = new JButton("b2");
        JButton btn3 = new JButton("b3");
        JButton btn4 = new JButton("b4");
        JButton btn5 = new JButton("b5");

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(btn1, java.awt.BorderLayout.NORTH);
        panel.add(btn2, java.awt.BorderLayout.SOUTH);
        panel.add(btn3, java.awt.BorderLayout.EAST);
        panel.add(btn4, java.awt.BorderLayout.WEST);
        panel.add(btn5, java.awt.BorderLayout.CENTER);

        frame.add(panel);
        //frame.pack();
        frame.setSize(400, 400);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
