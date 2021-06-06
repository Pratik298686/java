import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
class MyFrame extends JFrame implements ActionListener
{
    Container c=getContentPane();
    JButton button;
    JTextField t1;
    public MyFrame(){
       c.setLayout(null);
        t1 = new JTextField("click me");
        t1.setBounds(100,100,100,30);
       c.add(t1);
       
       t1.setFont(new Font("Arial",Font.BOLD,15));
       t1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
         String str = t1.getText();
         t1.setText(str.toUpperCase());
    }
}
class Program16p2{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Action Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}