import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

class ProgressBarExample extends JFrame{
    public ProgressBarExample(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JProgressBar pb=new JProgressBar(0,100);
        add(pb);
        pb.setStringPainted(true);
        pb.setOrientation(SwingConstants.VERTICAL);

        int i=0;
        while(i<=100){
            if(i>=0 && i<=50){
                pb.setString("Processing.....");
            }
            else if(i>50 && i<=70){
                pb.setString("Wait for some time.....");
            }
            else if(i>70 && i<=90){
                pb.setString(" About to Completed.");
            }
            else if(i==100){
                pb.setString("Completed");
            }

            
            pb.setValue(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
            i=i+10;
        }
    }
}
class Program43 {
    
    public static void main(String[] args) {
       new ProgressBarExample(); 
    }
}
