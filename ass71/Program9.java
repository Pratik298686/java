import javax.swing.*;

import java.awt.*;
class Program9{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100,100,400,200);
        c.add(textArea);

        textArea.setText("This is textarea");
        textArea.setFont(new Font("arial",Font.BOLD,15));
        textArea.setEditable(true);
        textArea.setLineWrap(true);
        frame.setVisible(true);
    }
}