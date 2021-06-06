import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ItemListener
{
    Container c=getContentPane();
    JMenuBar menuBar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     menuBar = new JMenuBar();
     mymenu = new JMenu("Menu");

     c1 = new JCheckBoxMenuItem("Print");
     mymenu.add(c1);
     menuBar.add(mymenu);
     this.setJMenuBar(menuBar);
     c1.addItemListener(this);
     
     t1 = new JTextArea();
     t1.setBounds(200,50,100,100);
     c.add(t1);
     
       
    
    } 
    @Override
    public void itemStateChanged(ItemEvent e){
        if(c1.isSelected()){
            t1.setText("Print is ON");
        }
        else{
            t1.setText("Print is OFF");
        }
    }
    
}
class Program17p4{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}
