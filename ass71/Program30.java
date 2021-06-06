import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SampleLayout extends JFrame{
    
    
    SampleLayout(){
      Container c = getContentPane();
      c.setLayout(null);
        
      JPanel panel1 = new JPanel();
      panel1.setBounds(0,0,300,300);
      panel1.setBackground(Color.yellow);
      panel1.setLayout(null);
      c.add(panel1);

      JPanel panel2 = new JPanel();
      panel2.setBounds(0,0,200,200);
      panel2.setBackground(Color.red);
      panel1.add(panel2);
      
      JButton btn = new JButton("Button");
      panel2.add(btn);

      }
}
class Program30{

    public static void main(String[] args) {
    SampleLayout f= new SampleLayout();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //setLocationRelativeTo(null);
    f.setVisible(true);  
    }
}