import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

class RootPane extends JFrame{
    
    public RootPane(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        JRootPane rootpane = this.getRootPane();
        JButton b1 = new JButton();
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("file");
        file.add("New File");
        file.add("Open File");
        file.add("Save File");
        file.add("Close File");
        menubar.add(file);
        rootpane.getContentPane().add(b1);
        rootpane.setJMenuBar(menubar);

    }
}
public class Program55 {
    public static void main(String[] args) {
        new RootPane();
    }
}
