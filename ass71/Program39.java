import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

import java.awt.event.*;

class CheckBoxMenuExample extends JFrame{
    JMenuItem newfile = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem undo = new JMenuItem("Undo");
    JMenuItem redo = new JMenuItem("Redo");
    JCheckBoxMenuItem checkMenuItem = new JCheckBoxMenuItem("Word Wrap");
    JTextArea ta=new JTextArea("lorem fjfkdlfkdlfkdlflfkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdjfjjjfhfjdjfhhfjdbncbnnccxdbfnvcvcv v v v bvgb vffgbddfbddbbfbbfnghgmjmvnhvnvnfhfb");
    public CheckBoxMenuExample()
    {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JMenuBar menubar=new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu format=new JMenu("Format");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);

        file.add(newfile);
        file.add(open);

        edit.add(undo);
        edit.add(redo);

        format.add(checkMenuItem);
        add(ta,BorderLayout.CENTER);
        
        checkMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkMenuItem.isSelected()){
                    ta.setLineWrap(true);
                    ta.setWrapStyleWord(true);
                }
                else{
                    ta.setLineWrap(false);
                    ta.setWrapStyleWord(false); 
                }
            }
        });

        validate();
    }
    public static void main(String[] args) {
        new CheckBoxMenuExample();
    }
}