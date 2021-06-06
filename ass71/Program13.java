import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,msg;
    JTextField t1,t2;
    JRadioButton Male,Female;
    JComboBox Day,Month,Year;
    JTextArea tal,screen;
    JCheckBox terms;
    JButton submit;
    
    MyFrame(){
        setTitle("Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c= getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Name");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        Male = new JRadioButton("Male");
        Female = new JRadioButton("Female");
        Male.setBounds(130,150,80,20);
        Female.setBounds(220,150,80,20);
        c.add(Male);
        c.add(Female);
        Male.setSelected(true);
        ButtonGroup gen = new ButtonGroup();
        gen.add(Male);
        gen.add(Female);

        label4 = new JLabel("DOB");
        label4.setBounds(20,200,100,20);
        c.add(label4);
        
        String days[] = {"1","2","3","4","5"};
        String months[] = {"Jan","Feb","Mar","Ap","May"};
        String years[] = {"1998","1999","2000","2001","2002"};

        Day = new JComboBox(days);
        Month = new JComboBox(months);
        Year = new JComboBox(years);
        
        Day.setBounds(130,200,50,20);
        Month.setBounds(190,200,50,20);
        Year.setBounds(250,200,60,20);
        c.add(Day);
        c.add(Month);
        c.add(Year);

        label5 = new JLabel("Address");
        label5.setBounds(20,250,100,20);
        c.add(label5);
        tal = new JTextArea();
        tal.setBounds(130,240,200,50);
        c.add(tal);

        terms = new JCheckBox("Please accept terms and condition");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        submit = new JButton("submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);
        
        screen = new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);

        msg = new JLabel();
        msg.setBounds(20,400,250,20);
        c.add(msg);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(terms.isSelected()){
            msg.setText("Registration Successfull");
            String Name = t1.getText();
            String Mobile = t2.getText();
            String Gender = "Male";
            if(Female.isSelected()){
                Gender = "Female";
            }
            String DOB = Day.getSelectedItem()+""+Month.getSelectedItem()+""+Year.getSelectedItem();
            String Address = new tal.getText();
            
            screen.setText("Name:"+Name+"\n"+"Mobile:"+Mobile+"\n"+"Gender:"+Gender+"\n"+"DOB:"+"\n"+"Address:"+Address);
        }
    }
}
class Program13{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}