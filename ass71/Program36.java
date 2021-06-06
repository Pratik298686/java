import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SplitPaneText extends JFrame{
    
    
    SplitPaneText(){
      
        
      JButton b1 = new JButton("Left");
      JButton b2 = new JButton("Right");

      JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
      splitpane.setTopComponent(b1);
      splitpane.setBottomComponent(b2);
      splitpane.setDividerSize(10);
      splitpane.setDividerLocation(100);
      splitpane.setOneTouchExpandable(true);

      add(splitpane);
      validate();

      }
}
class Program36{

    public static void main(String[] args) {
    SplitPaneText f= new SplitPaneText();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    f.setLocationRelativeTo(null);
    f.setVisible(true);  
    }
}