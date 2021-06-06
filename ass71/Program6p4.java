

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;



class Program6p4{
    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Demo");
        frame.setBounds(100,100,700,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=frame.getContentPane();

        JButton Red = new JButton("RED");
        JButton Yellow = new JButton("YELLOW");
        JButton Green = new JButton("GREEN");

        Red.setBounds(100,100,100,50);
        Yellow.setBounds(250,100,100,50);
        Green.setBounds(400,100,100,50);

        c.add(Red);
        c.add(Yellow);
        c.add(Green);

        Red.addActionListener(new RedClass());
        Yellow.addActionListener(new YellowClass());
        Green.addActionListener(new GreenClass());
    }
}
class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
      Program6p4.c.setBackground(Color.RED);
    }
}
class YellowClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
      Program6p4.c.setBackground(Color.YELLOW);
    }
}
class GreenClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
      Program6p4.c.setBackground(Color.GREEN);
    }
}