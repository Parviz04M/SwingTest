import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJButton {
    public static void main(String[] args) {
        //JButton
        //btn.setBounds(x, x, width, height);
        JFrame frame = new JFrame("Button Sample");
        JButton btn = new JButton(); //We can also set the text in constructor
        btn.setText("Send");

        btn.setBounds(0, 0, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
