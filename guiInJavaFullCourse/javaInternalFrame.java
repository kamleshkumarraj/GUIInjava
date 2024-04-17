package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;

public class javaInternalFrame {
    JFrame frame;
    JInternalFrame frame1;
    Container c,c1;


    javaInternalFrame(){
        frame = new JFrame();
        frame.setBounds(20, 30, 800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First  Window ");
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        internalframe();
        frame.setVisible(true);
    }
    void internalframe(){
        frame1 = new JInternalFrame( "Second Window",true, true, true,true);
        frame1.setTitle("Second Window");
        frame1.setBounds(20, 50, 600, 500);
        
        c1 = frame1.getContentPane();
        c1.setBackground(Color.green);
        c1.setLayout(null);
        c.add(frame1);
        frame1.setVisible(true);
        frame1.setResizable(true);
        JLabel l1 = new JLabel("This Is Our Internal Frame  : ");
        l1.setBounds(20, 50, 400, 50);
        Font f = new Font("Times New Roman",Font.ITALIC,30);
        l1.setFont(f);
        l1.setForeground(Color.blue);
        c1.add(l1);
        
    }
    

    public static void main(String[] args) {
        new javaInternalFrame();
    }
}
