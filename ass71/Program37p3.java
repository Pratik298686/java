import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class Program37p3{
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Demo");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f.setLayout(null);
       f.setVisible(true);
        
        String[][] rowdata= {
            {"001","Ram","21"},
            {"002","Shyam","20"},
            {"003","Raju","15"}
        };
        String[] columnName = {"Roll No","Name","Age"};

        DefaultTableModel model = new DefaultTableModel(rowdata,columnName);
        JTable table = new JTable(model);

        JTextField t1,t2,t3;
        JButton b1,b2,b3;
        
        f.setLayout(new GridLayout(3,1));

        JPanel panel = new JPanel();
        f.add(new JScrollPane(table));
        f.add(new JPanel());
        f.add(panel);

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        b1=new JButton("Add");
        b2=new JButton("Update");
        b3=new JButton("Delete");

        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("Roll No"));
        panel.add(t1);
        panel.add(b1);

        panel.add(new JLabel("Name"));
        panel.add(t2);
        panel.add(b2);

        panel.add(new JLabel("Age"));
        panel.add(t3);
        panel.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() ||t3.getText().toString().isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);

    
                 }
                else{
                    int rollno=Integer.parseInt(t1.getText().toString());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());

                Object[] nRow = {rollno,name,age};
                model.addRow(nRow);

                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                }
            }
        });
        f.validate();
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int rowindex=table.getSelectedRow();

                int rollno=(int)model.getValueAt(rowindex, 0);
                String name=(String)model.getValueAt(rowindex, 1);
                int age=(int)model.getValueAt(rowindex, 2);

                t1.setText(String.valueOf(rollno));
                t2.setText(name);
                t3.setText(String.valueOf(age));
            }
        }); 

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() ||t3.getText().toString().isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);

    
                 }
                else{
                    int rollno=Integer.parseInt(t1.getText().toString());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());

                int row=table.getSelectedRow();
                model.setValueAt(rollno, row, 0);
                model.setValueAt(name, row, 0);
                model.setValueAt(age, row, 0);

                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
            }
        }
        });

    
    }
}