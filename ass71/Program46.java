import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;

class DesktopPane extends JFrame{
    JDesktopPane dp;
    public DesktopPane(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        dp = new JDesktopPane();
        display(dp);
        add(dp,BorderLayout.CENTER);

    }
    private void display(JDesktopPane dp){
        int numFrame=3,x=30,y=30;
        for(int i=0; i<numFrame; i++){
            JInternalFrame iframe = new JInternalFrame("Internal Frame"+(i+1),true , true, true, true);
            iframe.setBounds(x, y, 250, 100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("I Love java"));
            iframe.setVisible(true);

            dp.add(iframe);
            y+=100;
        }
    }
}
public class Program46 {
    public static void main(String[] args) {
        new DesktopPane();
    }
}
