import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Program35{
    public static void main(String[] args) {
        JFrame f = new JFrame("Input Dialog Example");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JTabbedPane sp = new JTabbedPane();
        sp.setBounds(50,50,250,200);
        f.add(sp);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(new JLabel("This is my First Page"));
        panel2.add(new JLabel("This is my Second Page"));
        panel3.add(new JLabel("This is my Third Page"));

        sp.add("First",panel1);
        sp.add("Second",panel2);
        sp.add("Third",panel3);
        f.setVisible(true);
    }
}