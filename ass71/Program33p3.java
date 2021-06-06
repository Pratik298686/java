import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Program33p3{
    public static void main(String[] args) {
        JFrame f = new JFrame("Input Dialog Example");
        f.setVisible(true);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("CLICK Me");
        f.add(b1);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               int sel = JOptionPane.showConfirmDialog(f, "Do You want to exit", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION){
                    System.out.println("YES option is selected");
                }
                else if(sel==JOptionPane.NO_OPTION){
                    System.out.println("No option is selected");
                }
                else if(sel==JOptionPane.CANCEL_OPTION){
                    System.out.println("CANCEl option is selected");
                }
            }
        });

    }
}