import java.awt.Color;
import java.awt.Container;
import java.awt.color.*;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Toggle extends JFrame implements ActionListener{
   private Container c;
   private JToggleButton togg;
    private Color defaultColor;
    public Toggle(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);

        defaultColor = c.getBackground();
        
        JToggleButton togg = new JToggleButton("OFF");
        togg.setBounds(200, 200, 100, 30);
        c.add(togg);

        togg.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(togg.isSelected()){
            c.setBackground(Color.YELLOW);
            togg.setText("ON");
        }
        else{
            c.setBackground(defaultColor);
            togg.setText("OFF");
        }
    }
}
public class Program48 {
    public static void main(String[] args) {
        new Toggle();
    }
}
