import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;

class InternalFrame extends JFrame{
    public InternalFrame(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

        JInternalFrame iframe = new JInternalFrame("My Internal Frame", true, true, true, true);
        initFrame(iframe);
        add(iframe);
    }
    private void initFrame(JInternalFrame iframe){
        iframe.setSize(300,200);
        iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);
        iframe.setVisible(true);
        iframe.setLayout(new FlowLayout());

        iframe.add(new JButton("My Button"));
    }
}

public class Program45 {
    public static void main(String[] args) {
        new InternalFrame();
    }
}
