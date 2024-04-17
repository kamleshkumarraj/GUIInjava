package JAVA.guiInJavaFullCourse;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class javasplitpane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(20, 20, 500, 400);
        frame.setTitle("split Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c;
        c=frame.getContentPane();
        c.setBackground(Color.BLUE);
        JSplitPane p = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JPanel pn = new JPanel();
        JPanel pn2 = new JPanel();
        JLabel l = new JLabel("Hii How are you");
        l.setBounds(20, 20, 150, 50);
        pn.add(l);
        JLabel l1 = new JLabel("Hii How are you");
        l1.setBounds(20, 20, 150, 50);
        pn2.add(l1);
        p.setLeftComponent(pn);
        p.setRightComponent(pn2);
        p.setDividerLocation(300);
        p.setDividerSize(20);
        p.setOneTouchExpandable(true);
        p.setBackground(Color.red);
        c.add(p);

        frame.setVisible(true);
    }
}
