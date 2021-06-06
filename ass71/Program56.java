import java.awt.Color;
import java.lang.Integer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

class LayeredPane extends JFrame {
    public LayeredPane(){
      setSize(400,400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      JLayeredPane pane = this.getLayeredPane();
       
      JButton b1 = new JButton("RED");
      b1.setBackground(Color.red);
      b1.setBounds(20,20,50,50);

      JButton b2 = new JButton("YELLOW");
      b2.setBackground(Color.YELLOW);
      b2.setBounds(40,40,50,50);

      JButton b3 = new JButton("GREEN");
      b3.setBackground(Color.GREEN);
      b3.setBounds(60,60,50,50);

      pane.add(b1, new Integer(10));
      pane.add(b2, new Integer(20));
      pane.add(b3, new Integer(30));
    }
}
public class Program56 {
    public static void main(String[] args) {
        new LayeredPane(); 
    }
}
