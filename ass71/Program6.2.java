import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

import java.awt.*;
class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton btn1 = new JButton("Red");
    JButton btn2 = new JButton("Yellow");
    JButton btn3 = new JButton("green");

    MyFrame(){
      c = this.getContentPane();
      c.setLayout(null);

      btn1.setBounds(100,100,100,50);
      btn2.setBounds(250,100,100,50);
      btn3.setBounds(400,100,100,50);
      c.add(btn1);
      c.add(btn2);
      c.add(btn3);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1)
        {
            c.setBackground(Color.RED);
        }
        if(e.getSource()==btn2)
        {
            c.setBackground(Color.yellow);
        }
        if(e.getSource()==btn3)
        {
            c.setBackground(Color.green);
        }
    }
}
class Program6
{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}