import javax.swing.*;
import java.awt.*;

class Program2{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
       /* JLabel label = new JLabel("Username");
        label.setBounds(100,50,200,30);
        
        Font font = new Font("Arial",Font.ITALIC,30);
        label.setFont(font);

        ImageIcon icon = new ImageIcon("Pratik.jpg");
        JLabel label = new JLabel(icon);

        label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());*/
        ImageIcon icon = new ImageIcon("Pratik.jpg");
        JLabel label = new JLabel("Text",icon,JLabel.LEFT);
        JLabel.setBounds(0,100,500,100);


        c.add(label);
    }
}