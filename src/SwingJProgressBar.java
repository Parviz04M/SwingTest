import javax.swing.*;
import java.awt.*;

public class SwingJProgressBar {
    public static void main(String[] args) {
        //JProgressMenu
        //obj.setBounds(x, y, width, height
        JFrame frame = new JFrame("Progress Menu Sample");

        JProgressBar jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);

        frame.add(jb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i = 0;
        while(i <= 2000){
            jb.setValue(i);
            i+=20;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
