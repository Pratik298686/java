import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

class ToolTipText extends JFrame {
    public ToolTipText(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label=new JLabel("Password: ");
        label.setBounds(50, 100, 80, 30);
        add(label);

        JPasswordField pvd=new JPasswordField();
        pvd.setBounds(140, 100, 100, 30);
        add(pvd);
        String str="<html>"
                  +"<div bgcolor='#800080' color='#ffffff'>"
                  +"Enter Your Password<br/>"
                  +"Password should be atleast a 8 character long"
                  +"</div>"
                  +"</html>";
        pvd.setToolTipText(str);
        
    }
}
class Program42{
    public static void main(String[] args) {
        new ToolTipText();
    }
}
