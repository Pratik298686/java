import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
public class Program57 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        final JLabel label = new JLabel("GlassPane Example");
        JButton b1 = new JButton("ClickMe");
        JButton b2 = new JButton("Show");

        panel1.add(label);
        panel1.add(b1);
        panel1.add(b2);
        frame.getContentPane().add(panel1);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               label.setVisible(!label.isVisible());
            }
        });
        frame.setGlassPane(new JComponent(){
            @Override
            protected void paintComponent(Graphics g){
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0,0,getWidth(),getHeight());
            }
        });
        java.awt.Container glassPane=(Container)frame.getGlassPane();
        glassPane.setLayout(new GridLayout());
        JButton b3 = new JButton("Hide");
        glassPane.add(b3);  

        glassPane.addMouseListener(new MouseAdapter(){});

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               glassPane.setVisible(true);
            }
        });

        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               glassPane.setVisible(false);
            }
        });

    }
}
