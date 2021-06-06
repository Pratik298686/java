import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
    Container c=getContentPane();
    JComboBox combo;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     String values[] = {"A","B","C","D"};
     combo = new JComboBox(values);
     combo.setBounds(50,50,100,30);
     c.add(combo);
     combo.addActionListener(this);

     t1 = new JTextArea();
     t1.setBounds(200,50,100,100);
     c.add(t1);
     
       
    }
    public void actionPerformed(ActionEvent e){
         String str = combo.getSelectedItem().toString();
        t1.setText(str);
    }
  
    
}
class Program17p1{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Action Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}