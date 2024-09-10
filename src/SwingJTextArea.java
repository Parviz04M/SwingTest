import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTextArea {
    public static void main(String[] args) {
        //JTextArea
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("TextArea Sample");

        JTextArea jta = new JTextArea();
        JLabel lbl1 = new JLabel("a");
        JLabel lbl2 = new JLabel("b");
        JButton btn = new JButton("Calculate");

        lbl1.setBounds(20, 20, 100, 30);
        lbl2.setBounds(160, 20, 100, 30);
        jta.setBounds(20,70, 300, 220);
        btn.setBounds(20, 310, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jta.getText();
                String[] words = text.split("\\s");
                lbl1.setText("Words : " + words.length);
                lbl2.setText("Characters : " + text.length());
            }
        });

        frame.add(jta);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
