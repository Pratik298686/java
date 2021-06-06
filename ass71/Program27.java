import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SampleLayout extends JFrame{
    
    
    SampleLayout(){
      Container c = getContentPane();
        
      JButton b1 = new JButton("Button1");
      JButton b2 = new JButton("Button2");
      JButton b3 = new JButton("Button3");
      JButton b4 = new JButton("Button4");
      JButton b5 = new JButton("Button5");
        
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5,0);
        FlowLayout f = new FlowLayout();
        f.setHgap(10);
        f.setVgap(20);
        c.setLayout(f);
      }
}
class Program26{

    public static void main(String[] args) {
    SampleLayout f= new SampleLayout();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //setLocationRelativeTo(null);
    f.setVisible(true);  
    }
}