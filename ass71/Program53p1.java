import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


class ListExample extends JFrame {
    String[] item = {"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10"};
    JLabel label=new JLabel();
    public ListExample(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list = new JList(item);
        list.setVisibleRowCount(5);
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));
        panel.add(label);
        add(panel);
        revalidate();
        list.addMouseListener(new MouseAdapter(){
            @Override
             public void mouseClicked(MouseEvent e){
                 if(e.getClickCount()==2){
                     int index=list.getSelectedIndex();
                     String item=(String)list.getSelectedValue();

                     label.setText("Selected item="+item+"and Selected index="+index);
                 }
             }
        });
        
    }
}
public class Program53p1 {
    public static void main(String[] args) {
        new ListExample();
    }
}
