import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ItemListener
{
    Container c=getContentPane();
    JCheckBox c1,c2,c3,c4;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     c1=new JCheckBox("10th");
     c2=new JCheckBox("12th");
     c3=new JCheckBox("Graduation");
     c4=new JCheckBox("Post-Graduation");
     c1.setBounds(50,50,100,30);
     c2.setBounds(50,100,100,30);
     c3.setBounds(50,150,100,30);
     c4.setBounds(50,200,100,30);

     c.add(c1);
     c.add(c2);
     c.add(c3);
     c.add(c4);

     c1.addItemListener(this);
     c2.addItemListener(this);
     c3.addItemListener(this);
     c4.addItemListener(this);

     t1 = new JTextArea();
     t1.setBounds(200,50,100,100);
     c.add(t1);
     
       
    }
    @Override
    public void itemStateChanged(ItemEvent e){
         if(c1.isSelected()){
             t1.setText("10th");
         }
         if(c2.isSelected()){
            t1.setText(t1.getText()+"\n"+"12th");
        }
        if(c3.isSelected()){
            t1.setText(t1.getText()+"\n"+"Graduation");
        }
        if(c4.isSelected()){
            t1.setText(t1.getText()+"\n"+"Post-Graduation");
        }
    }
  
    
}
class Program17p3{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}
