import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class Program12{
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCombox");
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        String value[] = {"A","B","C","D"};

        JComboBox c1 = new JComboBox(value);
        c1.setBounds(100,100,100,30);
        c.add(c1);

        //c1.setEditable(true);
        //c1.setSelectedItem("B");
        //c1.setSelectedIndex(3);
        //c.setFont(new Font("Arial",Font.PLAIN,20));

        JButton button = new JButton("ok");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label = new JLabel("");
        label.setBounds(100,300,100,30);
        c.add(label);

        c1.addItem("E");
        c1.removeItem("C");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String item = String.valueOf(c1.getSelectedItem());
                label.setText(item);
            }
        });

        frame.setVisible(true);

    }
}