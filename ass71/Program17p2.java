import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
    Container c=getContentPane();
    JRadioButton male,female;
    JTextArea t1;
    public MyFrame(){
     c.setLayout(null);
     male=new JRadioButton("male");
     female=new JRadioButton("Female");
     male.setBounds(50,50,100,20);
     female.setBounds(50,100,100,20);
     c.add(male);
     c.add(female);
     ButtonGroup bp = new ButtonGroup();
     bp.add(male);
     bp.add(female);
     male.addActionListener(this);
     female.addActionListener(this);

     t1 = new JTextArea();
     t1.setBounds(200,50,100,100);
     c.add(t1);
     
       
    }
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==male){
            t1.setText("Male is Click");
         }
         if(e.getSource()==female){
            t1.setText("Female is Click");
         }
    }
  
    
}
class Program17p2{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Action Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}