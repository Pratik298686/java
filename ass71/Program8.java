import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    private Container c;
    private JLabel label1,label2,Result;
    private JTextField t1,t2;
    private JButton add,sub,mult,div;
    MyFrame(){
        setTitle("Simple Calculator");
        setSize(300,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);

        label1 = new JLabel("First Number:");
        label1.setBounds(10,20,100,20);
        c.add(label1);

        label2 = new JLabel("Second Number:");
        label2.setBounds(10,50,100,20);
        c.add(label2);
        
        t1 = new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add = new JButton("+");
        add.setBounds(10,80,50,30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(70,80,50,30);
        c.add(sub);

        mult = new JButton("*");
        mult.setBounds(130,80,50,30);
        c.add(mult);

        div = new JButton("/");
        div.setBounds(190,80,50,30);
        c.add(div);

        Result= new JLabel("Result:");
        Result.setBounds(10,120,150,20);
        c.add(Result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            
        try{
            if(e.getSource()==add){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c= a+b;
                Result.setText("Result:"+c);
            }
            if(e.getSource()==sub){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c= a-b;
                Result.setText("Result:"+c);
            }
            if(e.getSource()==mult){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c= a*b;
                Result.setText("Result:"+c);
            }
            if(e.getSource()==div){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c= a/b;
                Result.setText("Result:"+c);
            }
        }
        catch(NumberFormatException e1){
            Result.setText("Plz input integer only");
        }
        catch(ArithmeticException e2){
            Result.setText("cannot divide by zero");
        }
    }
}
class Program8{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

    }
}