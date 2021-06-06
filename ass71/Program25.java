import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;



class Program25{
    public static void main(String[] args) {
      JFrame f = new JFrame("NULL Layout Example");
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      //f.setLocationRelativeTo(null);

      Container c = f.getContentPane();

      JButton b1 = new JButton("PAGE_START");
      JButton b2 = new JButton("PAGE_END");
      JButton b3 = new JButton("LINE_START");
      JButton b4 = new JButton("CENTER");
      JButton b5 = new JButton("LINE_END");
      
      c.add(b1,BorderLayout.PAGE_START);
      c.add(b2,BorderLayout.PAGE_END);
      c.add(b3,BorderLayout.LINE_START);
      c.add(b4,BorderLayout.CENTER);
      c.add(b5,BorderLayout.LINE_END);

      f.setVisible(true);  
    }
}