import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class Program37p2{
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Demo");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f.setLayout(null);
        
        String[][] rowdata= {
            {"001","Ram","21"},
            {"002","Shyam","20"},
            {"003","Raju","15"}
        };
        String[] columnName = {"Roll No","Name","Age"};

        DefaultTableModel model = new DefaultTableModel(rowdata,columnName);
        JTable table = new JTable(model);
        f.add(new JScrollPane(table));

        f.setVisible(true);
    }
}