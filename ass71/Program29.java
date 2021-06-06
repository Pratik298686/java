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
        
      GridBagLayout g = new GridBagLayout();
      //g.setVgap(10);
      //g.setHgap(20);
      c.setLayout(g); 

      GridBagConstraints gbc = new GridBagConstraints();
      gbc.fill=gbc.GridBagConstraints.HORIZONTAL;
      gbc.weightx=0.5; //request for extra horizontal space.

      gbc.gridx=0;
      gbc.gridy=0;
      c.add(b1,gbc);

     // gbc.weightx=0; reset
      gbc.gridx=1;
      gbc.gridy=0;
      c.add(b2,gbc);
      
      gbc.gridx=2;
      gbc.gridy=0;
      c.add(b3,gbc);
      pack();
        
      }
}
class Program29{

    public static void main(String[] args) {
    SampleLayout f= new SampleLayout();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //setLocationRelativeTo(null);
    f.setVisible(true);  
    }
}