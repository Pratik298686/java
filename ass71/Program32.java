import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class Program32{

    public static void main(String[] args) {
    JFrame f= new JFrame();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //setLocationRelativeTo(null);
    f.setVisible(true);
    
    Container c = f.getContentPane();
    BoxLayout boxlayout = new BoxLayout(c,BoxLayout.Y_AXIS);
    c.setLayout(boxlayout);

    JButton b1 = new JButton("button 1");
    JButton b2 = new JButton("button 2");
    JButton b3 = new JButton("button 3");
    JButton b4 = new JButton("button 4");

    b1.setAlignmentX(Component.CENTER_ALIGNMENT);
    b2.setAlignmentX(Component.CENTER_ALIGNMENT);
    b3.setAlignmentX(Component.CENTER_ALIGNMENT);
    b4.setAlignmentX(Component.CENTER_ALIGNMENT);

    c.add(b1);
    c.add(Box.createRigidArea(new Dimension(0,50)));
    c.add(b2);
    c.add(b3);
    c.add(b4);

    f.setVisible(true);

    }
}