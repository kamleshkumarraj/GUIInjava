package JAVA.guiInJavaFullCourse;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class scrollpanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Scroll Pane");
    
        frame.setBounds(50,50, 800, 600);
        Container c= frame.getContentPane();
        FlowLayout l = new FlowLayout();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        JTextArea a = new JTextArea(50,50);
        a.setLocation(50,50);
        JScrollPane pane = new JScrollPane(a);
        a.setBackground(Color.gray);
        c.add(pane);
        frame.setVisible(true);

    }
}
