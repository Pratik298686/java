import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements KeyListener
{
    Container c=getContentPane();
    
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     
     t1 = new JTextArea();
     t1.setBounds(10,10,350,350);
     c.add(t1);
     t1.addKeyListener(this);
    
    } 
     
    
     public void KeyPassed(KeyEvent e1){
         t1.setText(t1.getText()+"\n"+"Pressed");
     }



     public void KeyTyped(KeyEvent e3){
        t1.setText(t1.getText()+"\n"+"Typed"); 
     }
    
}
class Program18{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}