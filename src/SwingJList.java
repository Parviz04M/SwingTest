import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJList {
    public static void main(String[] args) {
        //JList
        //obj.setBounds(x, x, width, height);
        JFrame frame = new JFrame("List sample");

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("C++");
        l1.addElement("Java");
        l1.addElement("JavaScript");
        l1.addElement("PHP");

        JList list1 = new JList(l1);
        list1.setBounds(100, 100, 75, 75);
        list1.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION); //We force user to select only 1

        DefaultListModel<String> l2 = new DefaultListModel<>();
        l2.addElement("Laravel");
        l2.addElement("Spring");
        l2.addElement("VueJS");
        l2.addElement("BOOTSTRAP");

        JList list2 = new JList(l2);
        list2.setBounds(100, 200, 75, 75);

        JButton btn = new JButton("Show");
        btn.setBounds(200, 200, 100, 30);

        btn.addActionListener(new ActionListener() {
            String txt = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list1.getSelectedIndex() != -1){
                    txt = "Selected programming language : " + list1.getSelectedValue();
                }

                if(list2.getSelectedIndex() != -1){
                    txt += ", Selected Frameworks : ";
                    for (Object item : list2.getSelectedValuesList()){
                        txt += item + " ";
                    }
                }
                System.out.println(txt);
            }
        });

        frame.add(btn);
        frame.add(list1);
        frame.add(list2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
