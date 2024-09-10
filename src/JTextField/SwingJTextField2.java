package JTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTextField2 {
    public static void main(String[] args) {
        //JTextField
        //obj.setBounds(x, y, width, height
        JFrame frame = new JFrame("JTextField sample");

        JButton btn;
        JLabel l1, l2;
        JTextField jtf1, jtf2, jtf3;

        l1 = new JLabel("Number 1");
        l1.setBounds(10, 10, 100, 30);

        jtf1 = new JTextField();
        jtf1.setBounds(10, 50, 100, 30);

        l2 = new JLabel("Number 2");
        l2.setBounds(10, 90, 100, 30);

        jtf2 = new JTextField();
        jtf2.setBounds(10, 130, 100, 30);

        jtf3 = new JTextField();
        jtf3.setBounds(10, 170, 100, 30);
        jtf3.setEditable(false);

        btn = new JButton("Topla");
        btn.setBounds(10, 210, 100, 30);

       btn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int a = Integer.parseInt(jtf1.getText());
               int b = Integer.parseInt(jtf2.getText());
               int c = a + b;
               String sum = String.valueOf(c);
               jtf3.setText(sum);
           }
       });

        frame.add(jtf3);
        frame.add(jtf2);
        frame.add(l2);
        frame.add(jtf1);
        frame.add(l1);
        frame.add(btn);
        //--------------------------------
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
