import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
public class Program58 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chosse Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        final Container c = frame.getContentPane();
        c.setLayout(new GridLayout());
        JButton b1 = new JButton("Change Color");
        b1.setBounds(100,100,60,60);
        c.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               Color color = JColorChooser.showDialog(null, "Select a Color", Color.black);
               c.setBackground(color);
            }
        });
        frame.revalidate();
    }
}
