
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

import java.awt.event.*;
class SpinnerTest extends JFrame implements ChangeListener{
    JSpinner s1,s2,s3;
    SpinnerModel model1,model2,model3;
    String[] arr={ "jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sept", "Oct",  "Nov", "Dec"};
    JLabel label=new JLabel();
    public SpinnerTest(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        
        String str = String.valueOf(java.time.Year.now());
        int y= Integer.parseInt(str);

        model1=new SpinnerNumberModel(1, 1, 31, 1);
        model2=new SpinnerListModel(arr);
        model3=new SpinnerNumberModel(y,y-100,y,1);

        s1=new JSpinner(model1);
        s2=new JSpinner(model2);
        s3=new JSpinner(model3);

        s1.setBounds(100, 20, 100, 50);
        s2.setBounds(100, 100, 100, 50);
        s3.setBounds(100, 200, 100, 50);

        add(s1);
        add(s2);
        add(s3);
        
        label.setBounds(100, 300, 150, 20);
        setDOB();
        add(label);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        validate();

    }

    public static void main(String[] args) {
       new SpinnerTest(); 
    }
         
    public void setDOB(){
        int date=(Integer)s1.getValue();
        int year=(Integer)s3.getValue();
        String month=(String)s2.getValue();

        label.setText("DOB is :"+date+"-"+month+"-"+year);
    }
    @Override
    public void stateChanged(ChangeEvent e){
        //reset DOB in label
        setDOB();
    }
}