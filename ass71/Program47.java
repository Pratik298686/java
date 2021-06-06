import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

class EditorPane extends JFrame{
    JEditorPane pane;
    public EditorPane(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        pane = new JEditorPane();
        pane.setContentType("text/html");
        pane.setText("<html>"
                    +"<h1 color='red'>Hello World</h1>"
                    +"<p>This is my paragraph</p>"
                    +"<hr>"
                    +"<ol>"
                    +"<li>item1</li>"
                    +"<li>item2</li>"
                    +"<li>item3</li>"
                    +"</ol>"
                    +"</html>");
        add(pane,BorderLayout.CENTER);

        JButton button = new JButton("Show Code");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(""+pane.getText());
            }
        });
        add(button,BorderLayout.PAGE_END);

    }
}
public class Program47 {
    public static void main(String[] args) {
        new EditorPane();
    }
}
