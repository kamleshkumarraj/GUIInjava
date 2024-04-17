package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Jdailogbox implements ActionListener{
    JFrame frame;
    JButton btn1,btn2,btn3;
    Container c;
    JDialog dframe1,dframe2,dframe3;

    Jdailogbox(){
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
        btn1 = new JButton("DialogBox-1");
        btn2 = new JButton("DialogBox-2");
        btn3 = new JButton("DialogBox-3");
        btn1.setBounds(100, 50, 120, 50);
        btn2.setBounds(230, 50, 120, 50);
        btn3.setBounds(360, 50, 120, 50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }
       @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            dframe1 = new JDialog(frame,"Dialog Box-1");
            dframe1.setBounds(310, 320, 400, 300);
            dframe1.add(new JLabel("DailogBox-1"));
            dframe1.setVisible(true);
        }
        if(e.getSource()==btn2){
            dframe2 = new JDialog(frame,"Dialog Box-2");
            dframe2.setBounds(310, 220, 400, 300);
            dframe2.add(new JLabel("DailogBox-2"));
            dframe2.setVisible(true);
        }
        if(e.getSource()==btn3){
            dframe3 = new JDialog(frame,"Dialog Box-3");
            dframe3.setBounds(310, 320, 400, 300);
            dframe3.add(new JLabel("DailogBox-3"));
            dframe3.setVisible(true);
        }

    }

    

    public static void main(String[] args) {
        new Jdailogbox();
        
    }
 
}
