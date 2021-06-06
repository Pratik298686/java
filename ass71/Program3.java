import javax.swing.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
class Program3{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
       
        JTextField t1 = new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);

        t1.setText("Pratik");
        Font font = new Font("Arial",Font.BOLD,25);
        t1.setFont(font);
        t1.setForeground(Color.green);
        t1.setBackground(Color.YELLOW);

        t1.setEditable(false);
}
}