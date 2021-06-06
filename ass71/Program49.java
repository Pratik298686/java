import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JDialogExample implements ActionListener{
    JFrame frame;
    JDialog d;
   public JDialogExample(){
    frame=new JFrame("JFrame");
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    JPanel panel = new JPanel();
    frame.add(panel);

    JButton b1 = new JButton("Click1");
    b1.addActionListener(this);
    panel.add(b1);
}
@Override
public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Click1")){
        showFirstDialog();
    }
    else if(e.getActionCommand().equals("Click2")){
        showSecondDialog();
    }
}
private void showFirstDialog(){
    d=new JDialog(frame,"JDialog");
    d.setSize(200,200);
    d.setVisible(true);
    JPanel panel = new JPanel();
    d.add(panel);

    JButton b=new JButton("Click2");
    b.addActionListener(this);
    panel.add(b);
}
private void showSecondDialog(){
    JDialog d1=new JDialog(d,"JDialog2");
    d1.setSize(200,200);
    d1.setVisible(true);
    d1.add(new JLabel("This is Second Dialog"));
}
   
}
public class Program49{
    public static void main(String[] args) {
     new JDialogExample();
    }
}
