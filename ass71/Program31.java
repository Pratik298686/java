import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Program31{

    public static void main(String[] args) {
    JFrame f= new JFrame();
    f.setTitle("Item Event");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //setLocationRelativeTo(null);
    f.setVisible(true);
    
    Container c = f.getContentPane();
    CardLayout cardlayout = new CardLayout();
    c.setLayout(cardlayout);

    JButton b1 = new JButton("Page 1");
    JButton b2 = new JButton("Page 2");
    JButton b3 = new JButton("Page 3");
    JButton b4 = new JButton("Page 4");

    c.add(b1,"1");
    c.add(b2,"2");
    c.add(b3,"3");
    c.add(b4,"4");

    cardlayout.next(c);
    cardlayout.previous(c);
    cardlayout.first(c);
    cardlayout.last(c);
    cardlayout.show(c, "3");

    }
}