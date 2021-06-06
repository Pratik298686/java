import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
class Program1{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(700,500);
       // frame.setLocation(100,50);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("My Frame");
        ImageIcon icon = new ImageIcon("Pratik.jpg");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.RED);

        frame.setResizable(false); //stop the user to resizing
    }
}