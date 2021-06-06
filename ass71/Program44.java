import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.FlowLayout;

class SliderTest extends JFrame implements ChangeListener{
    JSlider s;
    JLabel label;
    public SliderTest(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        s=new JSlider();
        add(s);
        s.setMinimum(0);
        s.setMaximum(200);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        s.addChangeListener(this);
        s.setOrientation(JSlider.VERTICAL);

        label=new JLabel();
        label.setText("The Value of Slider :"+s.getValue());
        add(label);
        
    }
    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("The Value of Slider :"+s.getValue()); 
    }
}
class Program44 {
    
    public static void main(String[] args) {
       new SliderTest(); 
    }
}

