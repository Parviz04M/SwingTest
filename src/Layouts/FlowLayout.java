package Layouts;

import javax.swing.*;

public class FlowLayout {
    public static void main(String[] args) {
        //FlowLayout
        //obj.setBounds(x, y, width, height);

        JFrame frame = new JFrame("Flow Layout Sample");

        JButton btn1 = new JButton("b1");
        JButton btn2 = new JButton("b2");
        JButton btn3 = new JButton("b3");
        JButton btn4 = new JButton("b4");
        JButton btn5 = new JButton("b5");
        JButton btn6 = new JButton("b6");

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.FlowLayout());

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);

        frame.add(panel);
        frame.setSize(400, 400);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
