import javax.swing.*;

public class SwingJOptionPane {
    public static void main(String[] args) {
        //JOptionPane
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("Table sample");

        //JOptionPane.showConfirmDialog(frame, "Would you like to drink some coffee ?");
        //JOptionPane.showConfirmDialog(frame, "Would you like to get some coffee ?", "Drink ?", JOptionPane.OK_OPTION); //2
        //JOptionPane.showConfirmDialog(frame, "Good ?", "Choose", 2, JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showConfirmDialog(frame, "Good ?", "Choose", 2, JOptionPane.QUESTION_MESSAGE, /*Icon*/);

        //JOptionPane.showMessageDialog(frame, "Salam");
        //JOptionPane.showMessageDialog(frame, "Salam ?", "Salamlama", JOptionPane.QUESTION_MESSAGE);
        //String username = JOptionPane.showInputDialog("What is your name ?");
        //JOptionPane.showInputDialog(frame, "salam");
        //JOptionPane.showInputDialog(frame, "What is your name ?", "Name", JOptionPane.QUESTION_MESSAGE);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
