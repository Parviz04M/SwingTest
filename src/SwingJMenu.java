import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class SwingJMenu {
    public static void main(String[] args) {
        //JMenu
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("Menu sample");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Main Menu");
        JMenu submenu = new JMenu("Submenu");

        JMenuItem i1 = new JMenuItem("Teachers");
        JMenuItem i2 = new JMenuItem("Students");
        JMenuItem i3 = new JMenuItem("Grades");
        JMenuItem i4 = new JMenuItem("Exams");

        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You clicked item 1");
            }
        });

        JMenuItem si1 = new JMenuItem("submenu 1");
        JMenuItem si2 = new JMenuItem("submenu 2");
        submenu.add(si1);
        submenu.add(si2);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(submenu);

        mb.add(menu);

        frame.setJMenuBar(mb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
