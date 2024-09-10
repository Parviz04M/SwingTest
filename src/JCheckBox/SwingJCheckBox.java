package JCheckBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJCheckBox {
    public static void main(String[] args) {
        //JCheckBox
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("CheckBox sample");

        JCheckBox chb1 = new JCheckBox("Yes");
        chb1.setBounds(20, 20, 100, 30);
        JCheckBox chb2 = new JCheckBox("No");
        chb2.setBounds(20, 60, 100, 30);

        JButton btn = new JButton("Send");
        btn.setBounds(20, 100, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chb1.isSelected()){
                    System.out.println(chb1.getText() + " selected");
                }

                if(chb2.isSelected()){
                    System.out.println(chb2.getText() + " selected");
                }
            }
        });

        frame.add(btn);
        frame.add(chb1);
        frame.add(chb2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
