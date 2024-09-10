import javax.swing.*;

public class SwingJTable {
    public static void main(String[] args) {
        //JTable
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("Table sample");

        String[][] info = {{"1", "Math", "Ali"}, {"2", "Physics", "John"}, {"3", "Chemistry", "Jessie"}};;
        String[] caption = {"ID", "Subject", "Teacher"};

        JTable table = new JTable(info, caption);
        table.setBounds(40, 40, 200, 300);

        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);
        frame.setSize(400, 400);
        //frame.setLayout(null);  //be careful
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
