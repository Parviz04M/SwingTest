import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJRadioButton {
    public static void main(String[] args) {
        //JRadioButton
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("RadioButton sample");

        JRadioButton rbtn1 = new JRadioButton("Male", true); //If we add true in constructor,
        rbtn1.setBounds(20, 20, 100, 30);              //it will be selected as default
        rbtn1.setActionCommand("m");

        JRadioButton rbtn2 = new JRadioButton("Female");
        rbtn2.setBounds(20, 60, 100, 30);
        rbtn2.setActionCommand("f");

        JRadioButton rbtn3 = new JRadioButton("Rather not to say");
        rbtn3.setActionCommand("n");
        rbtn3.setBounds(20, 100, 200, 30);

        JButton btn = new JButton("Send");
        btn.setBounds(20, 140, 100, 30);

        ButtonGroup bg = new ButtonGroup(); //We use this class to collect radio buttons in a group
        bg.add(rbtn1);
        bg.add(rbtn2);
        bg.add(rbtn3);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbtn1.isSelected()){
                    System.out.println(rbtn1.getText() + " is selected");
                }

                System.out.println(bg.getSelection().getActionCommand());
            }
        });

        frame.add(btn);
        frame.add(rbtn1);
        frame.add(rbtn2);
        frame.add(rbtn3);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
