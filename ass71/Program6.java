import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

import java.awt.*;
class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton btn;

    MyFrame(){
      c = this.getContentPane();
      c.setLayout(null);

      btn = new JButton("Click Me");
      btn.setBounds(100,100,100,50);
      c.add(btn);
      btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.yellow);
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