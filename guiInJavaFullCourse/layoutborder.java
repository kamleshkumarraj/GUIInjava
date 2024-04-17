package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import java.awt.*;

//this is a programm for layout like as border layout , flow layouot 
public class layoutborder {
    JFrame frame;
    JButton btn1,btn2,btn3,btn4,btn5;
    Container c;
    BorderLayout bd;
    CardLayout cd;
    BoxLayout bx;
    layoutborder(){
        frame = new JFrame();
        frame.setBounds(20, 20, 500, 200);
        frame.setTitle("Java Layout ");
        c=frame.getContentPane();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.cyan);
        // c.setLayout(null);
        // bd = new BorderLayout(20,10);
        //if we eant to align our comonent then we use three property left,right&center and we set horizontal gap and vertical gap.
        // FlowLayout flayout = new FlowLayout(FlowLayout.RIGHT);
        // c.setLayout(flayout);
        // flayout.setHgap(40);
        // flayout.setVgap(100);  
        // GridLayout glayout = new GridLayout(2,3);
        // glayout.setVgap(20);
        // glayout.setHgap(30);
        // c.setLayout(glayout);
        // GridBagLayout bLayout = new GridBagLayout();
        // c.setLayout(bLayout);
        //  cd = new CardLayout();
        // c.setLayout(cd);
        // bx= new BoxLayout(c, BoxLayout.X_AXIS);
        // bx= new BoxLayout(c, BoxLayout.Y_AXIS);
        bx= new BoxLayout(c, BoxLayout.X_AXIS);
        c.setLayout(bx);
        button();

    }
    void button(){
        btn1 = new JButton("Open Hii How Are You ");
        btn2 = new JButton("File ");
        btn3 = new JButton("New ");
        btn4 = new JButton("Save ");
        btn5 = new JButton("Help ");

      

        // GridBagConstraints cs = new GridBagConstraints();
        // cs.fill=GridBagConstraints.HORIZONTAL;
        // cs.weightx=0.5;
        // cs.gridx=0;
        // cs.gridy=0;
        // c.add(btn1,cs);
        // cs.weightx=0;
        // cs.gridx=1;
        // cs.gridy=0;
        // c.add(btn2,cs);
        // cs.gridx=2;
        // cs.gridy=0;
        
        // c.add(btn3,cs);
        // cs.gridx=0;
        // cs.gridy=1;
        // cs.ipady=40;
        // cs.gridwidth=3;
        // c.add(btn4,cs);
        // cs.gridx=2;
        // cs.gridy=2;
        // cs.gridwidth=2;
        // cs.ipady=10;
        // cs.fill=GridBagConstraints.PAGE_END;
        // cs.weighty=2;

        // c.add(btn5,cs); 

        // c.add(btn1,BorderLayout.PAGE_START);
        // c.add(btn2,BorderLayout.LINE_START);
        // c.add(btn3,BorderLayout.CENTER);
        // c.add(btn4,BorderLayout.PAGE_END);
        // c.add(btn5,BorderLayout.LINE_END);

        // c.add(btn1,"a1");
        // c.add(btn2,"a2");
        // c.add(btn3,"a3");
        // c.add(btn4,"a4");
        // c.add(btn5,"a5");

        //  cd.show(c, "a3");
        // cd.first(c);
        // cd.next(c);
        // cd.previous(c);
        // cd.last(c);
        // btn1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        // btn2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        // btn3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        // btn4.setAlignmentX(Component.RIGHT_ALIGNMENT);
        // btn5.setAlignmentX(Component.RIGHT_ALIGNMENT);

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);


    
    }

    public static void main(String[] args) {
        layoutborder obj = new layoutborder();
        obj.frame.setVisible(true);
        
    }
}
