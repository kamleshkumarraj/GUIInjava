package JAVA.guiInJavaFullCourse;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;
class frame2 extends JFrame{
    
}

class menu extends frame2 {
   public  static JFrame frame;
   public static JTextArea t1;
   public static Container c;
  public  static JMenuBar bar;
   public static JMenu m1,m2,m3;
   public static JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9;
   public static void screen(){
    frame = new JFrame();
    c=frame.getContentPane();
    c.setBackground(Color.cyan);
    frame.setTitle("Notepad ");
    frame.setBounds(20, 20, 900, 700);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void menubar(){
    bar = new JMenuBar();
    m1=new JMenu("File");
    m2=new JMenu("Edit ");
    m3=new JMenu("View ");
    i1=new JMenuItem("open ");
    i2=new JMenuItem("Close");
    i3=new JMenuItem("Write ");
    i4=new JMenuItem("Cut");
    i5=new JMenuItem("copy ");
    i6=new JMenuItem("paste");
    i7=new JMenuItem("select ");
    i8=new JMenuItem("font ");
    i9=new JMenuItem("fontfamily");
    m1.add(i1);
    m1.add(i2);
    m1.add(i3);
    m2.add(i4);
    m2.add(i5);
    m2.add(i6);
    m3.add(i7);
    m3.add(i8);
    m3.add(i9);
    bar.add(m1);
    bar.add(m2);
    bar.add(m3);
    frame.setJMenuBar(bar);
    bar.setBackground(Color.lightGray);
    Font f = new Font("Times New Roman",Font.BOLD,20);
    m1.setFont(f);
    m2.setFont(f);
    m3.setFont(f);
    t1= new JTextArea();
    t1.setBounds(0, 0, 900, 700);
    c.add(t1);
    Font f1= new Font("Times New Roman",Font.BOLD,20) ;
    t1.setFont(f1);

    // c.add(frame);
 

   }
//    public static void actionPerformed(ActionEvent a){


//    }


}
public class menuingui extends menu {
    public static void main(String[] args) {
        menuingui m = new menuingui();
        screen();
        
        menubar();
    }

    
}
