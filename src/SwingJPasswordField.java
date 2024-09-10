import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJPasswordField {
    public static void main(String[] args) {
        //JPasswordField
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("PasswordField sample");

        JLabel label = new JLabel("Password : ");
        label.setBounds(20, 20, 200, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(20, 60, 100, 30);

        JButton btn = new JButton("Send");
        btn.setBounds(20, 100, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(pass.getPassword());
                label.setText("Password : " + password);
            }
        });


        frame.add(btn);
        frame.add(pass);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
