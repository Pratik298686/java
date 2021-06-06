import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

class TextPane {
    public TextPane(){
        JFrame frame = new JFrame("JTextPane Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        JTextPane textpane = new JTextPane();
        textpane.setText("hello");

        SimpleAttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setBold(attr, true);

        Document doc = textpane.getStyledDocument();
        try{
        doc.insertString(doc.getLength(), "Welcome", attr);
        attr = new SimpleAttributeSet();
        StyleConstants.setItalic(attr, true);
        doc.insertString(doc.getLength(), "to", attr);

        attr = new SimpleAttributeSet();
        StyleConstants.setUnderline(attr, true);
        doc.insertString(doc.getLength(), "Java Swing", attr);

        attr = new SimpleAttributeSet();
        StyleConstants.setForeground(attr, Color.RED);
        StyleConstants.setBackground(attr, Color.YELLOW);
        doc.insertString(doc.getLength(), "Java Swing", attr);

        }
        catch(BadLocationException e){

        }
        

        frame.getContentPane().add(textpane);
        frame.revalidate();

    }
}
public class Program54 {
    public static void main(String[] args) {
        new TextPane();
    }
}
