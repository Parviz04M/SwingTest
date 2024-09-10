import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJComboBox {
    public static void main(String[] args) {
        //JComboBox
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("ComboBox sample");

        String[] arr = {"C", "C++", "C#", "Java", "Python"};

        JComboBox cb = new JComboBox(arr);
        cb.setBounds(20, 20, 100, 30);

        JButton btn = new JButton("Select");
        btn.setBounds(20, 60, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Selected programming language is : " + cb.getSelectedItem();
                //String text = "Selected programming language is : " + cb.getItemAt(cb.getSelectedIndex());
                System.out.println(text);
            }
        });

        frame.add(btn);
        frame.add(cb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
