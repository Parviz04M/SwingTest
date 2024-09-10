import javax.swing.*;

public class SwingJTabbedPane {
    public static void main(String[] args) {
        //JTabbedPane
        //obj.setBounds(x, y, width, height);

        JFrame frame = new JFrame("Tabbed Pane Sample");

        JLabel lb1 = new JLabel("First Area");
        JPanel pn1 = new JPanel();
        pn1.add(lb1);

        JLabel lb2 = new JLabel("Second Area");
        JPanel pn2 = new JPanel();
        pn2.add(lb2);

        JLabel lb3 = new JLabel("Third Area");
        JPanel pn3 = new JPanel();
        pn3.add(lb3);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("first", pn1);
        tp.add("second", pn2);
        tp.add("third", pn3);

        frame.add(tp);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
