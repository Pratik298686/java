import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Program34{
    public static void main(String[] args) {
        JFrame f = new JFrame("JScrollFrame Demo");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JTextArea t1 = new JTextArea(10,15);

        JScrollPane sp = new JScrollPane(t1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        f.add(sp);
        f.setVisible(true);
    }
}