import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class MyFrame extends JFrame implements WindowListener
{
    
    public MyFrame(){
     this.addWindowListener(this);
     
    }
    public void windowOpened(WindowEvent e){
     System.out.println("Window Open");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Windown Deiconified");
    }
    public void windowactivated(WindowEvent e){
        System.out.println("Window activated");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }

    
}
class Program23{
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setTitle("Item Event");
      f.setBounds(100,100,400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);   
    }
}