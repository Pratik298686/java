import javax.swing.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
class Program4{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
       
       JPasswordField pass = new JPasswordField();
       pass.setBounds(100,50,120,30);
       c.add(pass);

       pass.setText("12345678");
       pass.setFont(new Font("Ariel",Font.PLAIN,30));
       pass.setEchoChar('*');
       pass.setEchoChar((char)0);
}
}