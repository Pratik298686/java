import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WelcomeScreen extends JFrame{
    Timer time;
    public WelcomeScreen(){
        displayWelcomeScreen();
       
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
        setLocationRelativeTo(null);
        JLabel label=new JLabel("Welcome to java tutorial");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }
    private void displayWelcomeScreen(){
     JWindow w=new JWindow(this);
     w.setSize(600,400);
     w.setLocationRelativeTo(null);
     w.setVisible(true);

     JPanel panel=new JPanel();
     w.add(panel);
     //String imgpath = "";
     panel.setBorder(BorderFactory.createLineBorder(Color.black));

     JProgressBar progress=new JProgressBar(0,100);
     w.add(BorderLayout.PAGE_END,progress);
     w.revalidate();

      time = new Timer(100,new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             int x=progress.getValue();
             if(x==100){
                 w.dispose();
                 WelcomeScreen.this.setVisible(true);
                 time.stop();
             }else{
                 progress.setValue(x+4);
             }
         }
     });
     time.start();
     
    }
}
public class Program51p2 {
    public static void main(String[] args) {
        new WelcomeScreen();
    }
}
