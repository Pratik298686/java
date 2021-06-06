import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
class MyFrame extends JFrame implements ActionListener
{
    Container c=getContentPane();
    JButton button;

    public MyFrame(){
       c.setLayout(null);
        button = new JButton("click me");
        button.setBounds(100,100,100,30);
       c.add(button);
       button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
         String str = button.getText();
         button.setText(str.toUpperCase());
    }
}
class Program16{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Action Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}