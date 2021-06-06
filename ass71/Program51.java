import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
class Window extends JFrame implements ActionListener{
    //JFrame frame1,frame2;
    JTextField t1;
    //JWindow w;
    public Window(){

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

       JButton b1 = new JButton("Click");
        JPanel panel=new JPanel();
        panel.add(b1);

        add(panel);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        final JWindow w = new JWindow(this);
        w.setSize(300,200);
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(new JLabel("This is a Window"));
        w.add(panel);

        w.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               if(e.getClickCount()==2){
                   w.dispose();
               }
            }
        });
  
  }
    
}
public class Program51 {
    public static void main(String[] args) {
        new Window();
    }
}
