package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class javawindow {
    JFrame frame;
    JWindow window;
    JButton btn1,btn2;
    Container c,c1;
    void frame1(){
        frame = new JFrame();
        frame.setBounds(200,150,600,500);
        frame.setTitle("Java DialogBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);
        button();
        frame.setVisible(true);
    }
    void button(){
        btn1 = new JButton("CLick For Window");
        btn1.setBounds(20, 50, 200, 40);
        c.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                newWindow();
              
                
            }

       
        });
    }
    void newWindow(){
        window = new JWindow();
        window.setBounds(500, 250, 400, 300);
        c1= window.getContentPane();
        c1.setBackground(Color.red);
        window.setVisible(true);
        // frame.dispose();

        window.addMouseListener(new  MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                window.dispose();
                }
            }
            
        });


    }



    public static void main(String[] args) {
        javawindow win = new javawindow();
        win.frame1();
        
    }
}
