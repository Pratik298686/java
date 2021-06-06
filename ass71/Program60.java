import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class Program60 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("TOP");
        DefaultMutableTreeNode A=new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B=new DefaultMutableTreeNode("B");

        DefaultMutableTreeNode A1=new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2=new DefaultMutableTreeNode("A2");

        DefaultMutableTreeNode B1=new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode B2=new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode B3=new DefaultMutableTreeNode("B3");
        
        A.add(A1);
        A.add(A2);

        B.add(B1);
        B.add(B2);
        B.add(B3);

        rootnode.add(A);
        rootnode.add(B);

        JTree tree=new JTree(rootnode);
        frame.add(tree);
        frame.setVisible(true);
    }
}
