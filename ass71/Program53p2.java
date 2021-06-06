import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ListExample extends JFrame   {
    
    JTextField t1 = new JTextField(15);
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Update");
    JButton b3 = new JButton("Delete");
    int updateindex = 0;

    public ListExample(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(1,2));
        JList list = new JList();
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JScrollPane(list));

        DefaultListModel model = new DefaultListModel();
        model.addElement("High School");
        model.addElement("Inter");
        model.addElement("BCA");
        list.setModel(model);
        
        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.add(t1);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);

        revalidate();

        b1.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                if(!t1.getText().toString().isEmpty()){
                    String item = t1.getText().toString();
                    model.addElement(item);
                    t1.setText(null);
                }
            }
        });

        list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    updateindex = list.getSelectedIndex();
                    t1.setText((String)model.get(updateindex));
                }
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String item = t1.getText().toString();
                    model.set(updateindex, item);
                    t1.setText(null);
            }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                model.remove(list.getSelectedIndex());
            }
        });
        
    }
}
public class Program53p2 {
    public static void main(String[] args) {
        new ListExample();
    }
}
