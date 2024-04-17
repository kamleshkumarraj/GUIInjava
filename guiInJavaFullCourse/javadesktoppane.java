package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import java.awt.*;

public class javadesktoppane extends JFrame{
        Container c;
        JDesktopPane p1;
        JInternalFrame f1,f2,f3,f4;


    javadesktoppane(){
        setBounds(100, 100, 800, 700);
        setTitle("Java DesktopPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c= getContentPane();
        p1 = new JDesktopPane();
        c.add(p1,BorderLayout.CENTER);
        p1.setLayout(null);
        desktoppane();
        setVisible(true);
    }
    void desktoppane(){
        int x=50,y=50;
        for(int i=3; i<=5; i++){
            f1 = new JInternalFrame("DeskTopFrame"+i,true,true,true,true);
            f1.setBounds(x, y, 300, 200);
            f1.setVisible(true);
            p1.add(f1);
            y=y+300;


        }



    }

    

    public static void main(String[] args) {
        new javadesktoppane();
        
    }
}
