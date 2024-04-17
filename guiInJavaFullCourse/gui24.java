package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//This program is used for giving the action in textfield the we click enter button
public class gui24 implements WindowListener{
    JFrame frame;
    JTextArea box;
    JLabel lb1;
    Container c;
    Font font,font1;
    gui24(){
        frame = new JFrame();
        frame.setBounds(10, 20, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Window Opened");
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
      
    }
    void newwindow(){
        frame = new JFrame();
        frame.setBounds(10, 20, 1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Window Closed");
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

    }
     void print(){
        lb1 = new JLabel("Enter your text : ");
        lb1.setBounds(20, 50, 200, 50);
        c.add(lb1);

        font = new Font("Times New Roman", Font.ITALIC, 20);
        lb1.setFont(font);
        lb1.setForeground(Color.blue);
        
    }
    void textarea(){
        box = new JTextArea();
        FlowLayout l = new FlowLayout();
        c.setLayout(l);
        box.setSize(170, 100);
        box.setFont(font);
        box.setBackground(Color.gray);
        box.setForeground(Color.white);
        c.add(box);
        frame.addWindowListener(this);
 
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed : ");

    }
    public void windowOpened(WindowEvent e){
        System.out.println("Window Opened : ");

    }
    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing : ");

    }
    public void windowIconified(WindowEvent e){
        System.out.println("Window Iconified : ");

    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Window Deicconified : ");

    }
    public void windowActivated(WindowEvent e){
        print();
        System.out.println("Window Activated : ");

    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated : ");

    }
    // public void actionPerformed(ActionEvent e ){
    //     font1 = new Font("Algerian", Font.BOLD, 30);
    //     box.setForeground(Color.BLUE);
    //     box.setFont(font1);
    //     String k = box.getText();
    //     k=k.toUpperCase();
    //     box.setText(k);
    // }

    public static void main(String[] args) {
        gui24 obj = new gui24();
        gui24 frame1 = new gui24();
        // frame1.print();
        frame1.textarea();
        frame1.frame.setVisible(true);



    }
    
}
