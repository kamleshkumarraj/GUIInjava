package JAVA.guiInJavaFullCourse;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;

public class jtextpane {
    JFrame frame;
    Container c;
    JTextPane pane1;
    jtextpane(){
        frame = new JFrame();
        frame.setBounds(200, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        
        frame.setVisible(true);

        pane1 = new JTextPane();
        pane1.setText("Hii My name is kamlesh kumar ");
        c.add(pane1);

        
        SimpleAttributeSet attr = new SimpleAttributeSet();
        



        frame.revalidate();

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new jtextpane();
        
    }
    
}
