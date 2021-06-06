import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Program33{
    public static void main(String[] args) {
        JFrame f = new JFrame("Input Dialog Example");
        f.setVisible(true);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("Click Me");
        f.add(b1);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = JOptionPane.showInputDialog("Enter Your Name");
                if(str.length()>0){
                    System.out.println("The Name of the user is :"+str);
                }
            }
        });

    }
}