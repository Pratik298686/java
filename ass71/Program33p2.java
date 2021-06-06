import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Program33p2{
    public static void main(String[] args) {
        JFrame f = new JFrame("Input Dialog Example");
        f.setVisible(true);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("Plain");
        f.add(b1);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Hello Their This is Plain Message", "Message", JOptionPane.PLAIN_MESSAGE);

            }
        });

        JButton b2 = new JButton("Info");
        f.add(b2);

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Hello Their This is Info Message", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JButton b3 = new JButton("Ques");
        f.add(b3);

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Hello Their This is Question Message", "Question", JOptionPane.QUESTION_MESSAGE);
            }
        });
        JButton b4 = new JButton("Error");
        f.add(b4);

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Hello Their This is Error Message", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        JButton b5 = new JButton("Warning");
        f.add(b5);

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Hello Their This is Warning Message", "Message", JOptionPane.WARNING_MESSAGE);
            }
        });

    }
}