package JCheckBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SwingJCheckBox2 {
    public static void main(String[] args) {
        //JCheckBox
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("CheckBox sample");

        JLabel label = new JLabel("abc");
        label.setBounds(20, 100, 200, 30);

        JCheckBox chb1 = new JCheckBox("C++");
        chb1.setBounds(20, 20, 100, 30);
        JCheckBox chb2 = new JCheckBox("Java");
        chb2.setBounds(20, 60, 100, 30);

        chb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox is " + (e.getStateChange() == 1 ? "selected" : "not selected"));
            }
        });

        chb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox is " + (e.getStateChange() == 1 ? "selected" : "not selected"));
            }
        });

        frame.add(label);
        frame.add(chb1);
        frame.add(chb2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JCheckBox
    }

}
