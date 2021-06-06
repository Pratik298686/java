import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyComponent extends JComponent{
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(10, 10, 200, 200);

    }
}
public class Program59 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        MyComponent comp=new MyComponent();
        frame.getContentPane().add(comp);
    }
}
