import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;


class Program6p3
{
    public static void main(String[] args) {
        JFrame f = new JFrame("Action Demo");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(null);
        JButton btn = new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.red);
            }
        });
    }
}