import javax.swing.*;

import java.awt.*;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
class Program5{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
       
       ImageIcon icon = new ImageIcon("Pratik.jpg");
        JButton btn = new JButton(icon);
       btn.setSize(icon.getIconWidth(),icon.getIconHeight());
       btn.setLocation(100,100);
       c.add(btn);

       /*Font font = new Font("Arial",Font.PLAIN,20);
       btn.setFont(font);
       btn.setText("Mybutton");
       btn.setForeground(Color.RED);
       btn.setBackground(Color.YELLOW);

       //Cursor cur = new Cursor(Cursor.HAND_CURSOR);
       //Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
       //Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
       //btn.setCursor(cur);
       btn.setEnabled(false);
       btn.setVisible(false);*/
    }
}