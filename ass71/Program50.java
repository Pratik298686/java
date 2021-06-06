import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class X implements ActionListener{
    JFrame frame1,frame2;
    JLabel label;
    JTextField t1;
    public X(){
        frame1 = new JFrame("Main Frame");
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);

       JButton b1 = new JButton("Click");
        label = new JLabel("Message Will appear here");
        JPanel panel=new JPanel();
        panel.add(b1);
        panel.add(label);

        frame1.add(panel);
        b1.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getActionCommand().equals("Click")){
        frame1.dispose();
        frame2 = new JFrame("Enter Your Msg");
        frame2.setSize(500,500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(frame1);

        t1=new JTextField();
        t1.setColumns(20);
        JButton b2 = new JButton("submit");

        JPanel panel2 = new JPanel();
        panel2.add(t1);
        panel2.add(b2);

        frame2.add(panel2);
        b2.addActionListener(this);
       }
       else if(e.getActionCommand().equals("submit")){
           String message=t1.getText().toString();
           label.setText("message");
           frame2.dispose();
           frame1.setVisible(true);
       }
    }
}
public class Program50 {
    public static void main(String[] args) {
        new X();
    }
}
