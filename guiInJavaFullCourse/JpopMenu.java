package JAVA.guiInJavaFullCourse;
import java.awt.Container;

import javax.swing.*;


class JpopMenu1 {
    JPopupMenu popupmenu;
    JMenuItem i1,i2,i3;
    JFrame frame;
    Container c;
    JpopMenu1(){
        frame = new JFrame();
        frame.setBounds(120, 120, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        c = frame.getContentPane();
        c.setLayout(null);
        pop();
    }
    void pop(){
        popupmenu = new JPopupMenu();
        i1 = new JMenuItem("Item-1");
        i2 = new JMenuItem("Item-1");
        i3 = new JMenuItem("Item-1");
        popupmenu.add(i1);
        popupmenu.add(i2);
        popupmenu.add(i3);
        frame.add(popupmenu);
        popupmenu.show(c, 100, 100);
    }

    public static void main(String[] args) {
        JpopMenu1 obj = new JpopMenu1();
    }
public class JpopMenu{
    
}
}
