package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tutorial4Gui {
      static JFrame frame;
    public static Container c;
    static JLabel lbl,lb2;
   static JButton btn;
    static JTextField ent1;
    tutorial4Gui(){

    }

    public static void main(String[] args) {
        frame = new JFrame();
       
        frame.setSize(1000, 800);
        frame.setLocation(50, 10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn= new JButton("Click Me");
        c=frame.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        lbl=new JLabel("Welcome In Our First Programm");
        lbl.setBounds(20,20 ,600 ,70);
        c.add(lbl);
        Font font = new Font("ALGERIAN",Font.BOLD,30);
        Font font1 = new Font("Times New Roman",Font.BOLD,20);
        lbl.setFont(font);
        lbl.setForeground(Color.BLUE);
        // lbl.setBackground(Color.RED);
        lb2=new JLabel("Enter Yourname : ") ;
        lb2.setBounds(20, 80, 200, 50);
        c.add(lb2);
        lb2.setFont(font1);
        lb2.setForeground(Color.red);
        ent1 = new JTextField();
        ent1.setBounds(20, 130, 200, 35);
        c.add(ent1);
        ent1.setFont(font1);
        ent1.setForeground(Color.BLUE);
        ent1.setBackground(Color.GRAY);
        btn= new JButton("Click Login");
        btn.setBounds(20, 180, 100, 35);
        c.add(btn);
        btn.addActionListener(new function());
        frame.setVisible(true);

    }
}
class function implements ActionListener{
    public void actionPerformed(ActionEvent e){
          tutorial4Gui.c.setBackground(Color.red);
          tutorial4Gui.c.setLayout(null);

    }
}
