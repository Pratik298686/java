import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;



class Program24{
    public static void main(String[] args) {
      JFrame f = new JFrame("NULL Layout Example");
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

      Container c = f.getContentPane();
      c.setLayout(null);
      JButton b1 = new JButton("Button1");
      JButton b2 = new JButton("Button1");
      JButton b3 = new JButton("Button1");
      JButton b4 = new JButton("Button1");
      JButton b5 = new JButton("Button1");

      b1.setBounds(20,20,80,30);
      b2.setBounds(120,20,80,30);
      b3.setBounds(220,20,80,30);
      b4.setBounds(20,100,80,30);
      b5.setBounds(120,100,80,30);
      
      c.add(b1);
      c.add(b2);
      c.add(b3);
      c.add(b4);
      c.add(b5);

      f.setVisible(true);  
    }
}