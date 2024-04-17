package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;

public class gridbaglayout extends JFrame {
    Container c;
    JButton btn1,btn2,btn3,btn4,btn5;
    gridbaglayout(){
        setBounds(250,250,400,400);
        setTitle("Grid BagLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        // c.setBackground(Color.red);
        GridBagLayout bgl = new GridBagLayout();
        c.setLayout(bgl);
        Button();
        setVisible(true);
    }
   public void Button(){
        btn1= new JButton("Open");
        btn2= new JButton("Save");
        btn3= new JButton("File");
        btn4= new JButton("New");
        btn5= new JButton("Edit");
        GridBagConstraints c1= new GridBagConstraints();
        c1.weightx=0.5;
        c1.fill=GridBagConstraints.HORIZONTAL;
        c1.gridx=0;
        c1.gridy=0;
        c.add(btn1,c1);
        c1.gridx=1;
        c1.gridy=0;
        c.add(btn2,c1);
        c1.gridx=2;
        c1.gridy=0;
        c.add(btn3,c1);
        c1.gridx=0;
        c1.gridy=1;
        c1.gridwidth=3;
        c1.ipady=40;
        c.add(btn4,c1);
        c1.gridx=1;
        c1.gridy=2;
        c1.gridwidth=2;
        c1.ipady=0;
        c1.anchor=GridBagConstraints.PAGE_END;
        c1.weighty=1;
        c.add(btn5,c1);
        pack();

    }

    public static void main(String[] args) {
        gridbaglayout bg= new gridbaglayout();
        
    }
}
