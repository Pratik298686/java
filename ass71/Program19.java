import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements MouseListener
{
    Container c=getContentPane();
    JLabel label;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     label = new JLabel("My Label");
     label.setFont(new Font("Arial",Font.BOLD,18));
     label.setBounds(50,100,100,30);
     c.add(label);
     label.addMouseListener(this);
     
     t1 = new JTextArea();
     t1.setBounds(200,50,300,300);
     c.add(t1);  
    } 
    @Override
    public void mouseClicked(MouseEvent e1){
       t1.setText(t1.getText()+"\n"+"Mouse is clicked");
    }
    @Override
    public void mouseEntered(MouseEvent e1){
        t1.setText(t1.getText()+"\n"+"Mouse is Entered"); 
    }
    @Override
    public void mouseExited(MouseEvent e1){
        t1.setText(t1.getText()+"\n"+"Mouse is exit"); 
    }
    @Override
    public void mousePressed(MouseEvent e1){
        t1.setText(t1.getText()+"\n"+"Mouse is Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e1){
        t1.setText(t1.getText()+"\n"+"Mouse is Released");
    }
    
    
}
class Program19{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Mouse Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}