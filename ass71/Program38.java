import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.*;

import java.awt.FlowLayout;

class PopupMenu extends JFrame{
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    public void Popupmenu(){

        Container c=getContentPane();
        pm=new JPopupMenu();
        m1=new JMenuItem("Item 1");
        m2=new JMenuItem("Item 2");
        m3=new JMenuItem("Item 3");

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        pm.show(this,200,200);
        c.add(pm);
        validate();
    }
}
class Program38{
    public static void main(String[] args) {
        
        PopupMenu pop = new PopupMenu();
        pop.setSize(500,500);
        pop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pop.setLocationRelativeTo(null);
        pop.setLayout(new FlowLayout());
        pop.setVisible(true);
    }
}