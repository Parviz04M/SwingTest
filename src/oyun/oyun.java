package oyun;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class oyun {
    public static void main(String[] args) {

        oyunTools ot = new oyunTools();

        JFrame frame = new JFrame("Kubik oyunu");

        JButton btn1 = new JButton("U");
        btn1.setBounds(60, 10, 50, 50);

        JButton btn2 = new JButton("D");
        btn2.setBounds(60, 60, 50, 50);

        JButton btn3 = new JButton("L");
        btn3.setBounds(10, 60, 50, 50);

        JButton btn4 = new JButton("R");
        btn4.setBounds(110, 60, 50, 50);

        JButton ball = new JButton("o");
        ball.setBounds(ot.x, ot.y, 50, 50);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ot.y -= 30;
                ball.setBounds(ot.x, ot.y,50, 50);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ot.y += 30;
                ball.setBounds(ot.x, ot.y,50, 50);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ot.x -= 30;
                ball.setBounds(ot.x, ot.y,50, 50);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ot.x += 30;
                ball.setBounds(ot.x, ot.y,50, 50);
            }
        });


        frame.add(ball);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
