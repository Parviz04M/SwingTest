package JTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTextField {
    public static void main(String[] args) {
        //JTextField
        //obj.setBounds(x, y, width, height
        JFrame frame = new JFrame("JTextField sample");

        JButton btn = new JButton("Send");
        btn.setBounds(230, 10, 100, 30);

        JTextField jtf = new JTextField();
        jtf.setBounds(10, 10, 200, 30);

        JLabel label = new JLabel();
        label.setBounds(10, 60, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jtf.getText();
                label.setText(text);
            }
        });

        frame.add(label);
        frame.add(btn);
        frame.add(jtf);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
