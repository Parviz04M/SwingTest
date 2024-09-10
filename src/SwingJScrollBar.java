import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class SwingJScrollBar {
    public static void main(String[] args) {
        //JScrollBar
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("ScrollBar sample");

        JLabel label = new JLabel("asf");
        label.setBounds(20, 10, 120, 30);

        JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 100);
        //sb.setMaximum(120);
        //sb.setMinimum(0);
        
        sb.setBounds(20, 50, 40, 120);

        sb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Scrollbar value : " + sb.getValue() + sb.getModel().getExtent());
            }
        });

        frame.add(label);
        frame.add(sb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
