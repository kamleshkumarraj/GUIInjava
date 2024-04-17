package JAVA.guiInJavaFullCourse;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class javaTabbedpane extends JFrame {
    JPanel panel1,panel2,panel3;
    javaTabbedpane(){
        setBounds(50, 50, 700, 600);
        setTitle("Tabbed Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c;
        c=getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        setVisible(true);
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(20, 20, 500, 400);
        c.add(tb);
        tb.setBackground(Color.green);
        panel1= new JPanel();
        panel1.setBackground(Color.blue);
        panel2 = new JPanel();
         panel2.setBackground(Color.yellow);
        panel3 = new JPanel();
     panel3.setBackground(Color.red);
        JLabel lb1= new JLabel("First Page ");
        lb1.setBounds(20, 20, 200, 50);
        panel1.add(lb1);
        JLabel lb2= new JLabel("Second Page ");
        lb2.setBounds(20, 20, 200, 50);
        panel2.add(lb2);
        JLabel lb3= new JLabel("Third Page ");
        lb3.setBounds(20, 20, 200, 50);
        panel3.add(lb3);
        tb.add("Home",panel1);
        tb.add("New",panel2);
        tb.add("Open",panel3);


    }
    public static void main(String[] args) {
        javaTabbedpane p = new javaTabbedpane();
    }
}
