import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

import java.awt.event.*;
class SeparatorTest extends JFrame{
    
    public SeparatorTest(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,0));

        panel.add(new JLabel("My First Label"));
        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("My Second Label"));
        add(panel);

        JMenuBar menubar=new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");

        menubar.add(file);
        menubar.add(edit);

        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem redo=new JMenuItem("Redo");
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        JMenuItem find=new JMenuItem("Find");
        JMenuItem findnext=new JMenuItem("Find Next");
        JMenuItem replace=new JMenuItem("Replace");

        edit.add(undo);
        edit.add(redo);

        edit.addSeparator();

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        edit.addSeparator();

        edit.add(find);
        edit.add(findnext);
        edit.add(replace);

        validate();

    }
    public static void main(String[] args) {
        new SeparatorTest();
    }
}