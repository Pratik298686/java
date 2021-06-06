import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

class ToolBarDemo implements ActionListener
{
    JToolBar toolBar = new JToolBar();
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JTextField t1 = new JTextField();
    JComboBox combo = new JComboBox<>(new String[]{"item1","item2","item3","item4"});
    JLabel label = new JLabel();

    public ToolBarDemo(){
        JFrame frame = new JFrame("ToolBar Example");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        toolBar.add(combo);
        toolBar.add(t1);
        toolBar.add(b1);
        toolBar.add(b2);
        toolBar.addSeparator();

        toolBar.setFloatable(false);
        frame.add(BorderLayout.NORTH,toolBar);
        frame.add(label);
        frame.revalidate();

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            label.setText("b1 is clicked");
        }
        else if(e.getSource()==b2){
            label.setText("b2 is clicked");
        }
        else if(e.getSource()==combo){
            label.setText(combo.getSelectedItem()+"Selected");
        }
        else if(e.getSource()==t1){
            label.setText("Enter is Pressed in textfield");
        }
    }
}
public class Program52 {
    public static void main(String[] args) {
        new ToolBarDemo();
    }
}
