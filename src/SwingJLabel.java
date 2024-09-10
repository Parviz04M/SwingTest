import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJLabel {
    public static void main(String[] args) {
        //JLabel
        //obj.setBounds(x, y, width, height

        JFrame frame = new JFrame("Label sample");

        JLabel label = new JLabel(); //We also could write here
        label.setText("Text part");
        label.setBounds(20, 20, 200, 60);

        JButton btn = new JButton("Send");
        btn.setBounds(20, 70, 100, 30);

        btn.addActionListener(new ActionListener() {
            int c = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button was clicked ! " + c++ + " times");
            }
        });

        frame.add(btn);
        frame.add(label);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
