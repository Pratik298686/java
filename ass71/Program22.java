import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


class MyFrame extends JFrame implements CaretListener
{
    Container c=getContentPane();
    JTextField f1;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     f1 = new JTextField();
     f1.setBounds(50,100,100,30);
     c.add(f1);
     f1.addCaretListener(this);
     
     t1 = new JTextArea();
     t1.setBounds(200,50,300,300);
     c.add(t1);
    
    }
    
    @Override
    public void caretUpdate(CaretEvent e){
       t1.setText(t1.getText()+"\n"+"Caret updated : "+e.getDot()+":"+e.getMark());
    } 
    
}
class Program22{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}