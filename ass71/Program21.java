import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements FocusListener
{
    Container c=getContentPane();
    JTextField f1;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     f1 = new JTextField();
     f1.setBounds(50,100,100,30);
     c.add(f1);
     f1.addFocusListener(this);
     
     t1 = new JTextArea();
     t1.setBounds(200,50,300,300);
     c.add(t1);
    
    }
    @Override
    public void focusGained(FocusEvent e){
       t1.setText(t1.getText()+"\n"+"Focus Gained");
    } 
    @Override
    public void focusLost(FocusEvent e){
        t1.setText(t1.getText()+"\n"+"Focus Lost"); 
    } 
    
    
}
class Program21{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}