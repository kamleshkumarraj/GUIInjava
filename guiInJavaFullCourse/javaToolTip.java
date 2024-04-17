package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;


public class javaToolTip {
    JFrame frame;
    Container c;
    JLabel l1;
    JPasswordField f1;
    Font f;
    javaToolTip(){
        frame = new JFrame();
        frame.setBounds(200,150,600,500);
        frame.setTitle("Java Tool Tip");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);
        labelAndPass();

        frame.setVisible(true);



    }
    void labelAndPass(){
        f= new Font("Times New Roman", Font.BOLD, 20);
        l1 = new JLabel("Enter Your Password  : ");
        l1.setBounds(20, 40, 250, 30);
        l1.setFont(f);
        c.add(l1);

        f1 = new JPasswordField();
        f1.setBounds(250,40,150,30);
        c.add(f1);
        f1.setFont(f);
        String str = "<html>"+
            "<div bgcolor=cyan color=blue font-size = 30%> "+
            "Enter Your PassWord <br>"+
            "Minimum 10 Character <br> "+
            "First Character Must Should Be Capital"+
            "</div>"+
        "</html>";
        //If We Want Single Line Message Then We Pass Text In function
        f1.setToolTipText(str);

    }

    

    public static void main(String[] args) {
        new javaToolTip();
        
    }
}
