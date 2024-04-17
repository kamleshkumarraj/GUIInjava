package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;


public class javaProgressBar implements ChangeListener{
    JFrame frame;
    Container c;
    JProgressBar bar;
    JSlider s1;
    JLabel l1;
    Font f;

    javaProgressBar(){
        frame = new JFrame();
        frame.setBounds(200,150,600,500);
        frame.setTitle("Java Progress Bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);
        javaslider();
        frame.setVisible(true);
        javaprogressbar(1);

        

    }
    void javaprogressbar(int j){
        bar = new JProgressBar(0,100);
        bar.setBounds(120, 100, 350, 40);
        c.add(bar);
        // bar.setOrientation(SwingConstants.VERTICAL);
        bar.setStringPainted(true);
        // bar.setBackground(Color.blue);
       
        for(int i=0; i<=100; i=i+1 ){
            if(i>=0 && i<=50){
                bar.setString("Processing ....");
                c.setBackground(Color.blue);
            }
            if(i>=51 && i<=70){
                bar.setString("Wait Some Time ....");
                c.setBackground(Color.red);
            }
            if(i>=71 && i<=90){
                bar.setString("Progess about complete ...");
                c.setBackground(Color.cyan);
            }
            if(i>=91 && i<100){
                bar.setString("Progress about Finished ....");
                c.setBackground(Color.yellow);
            }
            if(i==100){
                bar.setString("Finished ....");
                c.setBackground(Color.magenta);
            }

            bar.setValue(i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
       
    }
    void javaslider(){
        f = new Font("Times New Roman",Font.BOLD,20);
        s1 = new JSlider();
        s1.setBounds(120, 200, 350, 50);
        c.add(s1);
        // s1.setBackground(Color.blue);
        s1.setPaintTicks(true);
        s1.setPaintLabels(true);
        s1.setMaximum(100);
        s1.setMinimum(0);
        s1.setMajorTickSpacing(20);
        s1.setMinorTickSpacing(2);

        l1= new JLabel("Our Value Of Jslider Is :   "+s1.getValue());
        l1.setBounds(120,250,350, 50);
        l1.setFont(f);
        c.add(l1);
        s1.addChangeListener(this);

        //if We Want To Create a verticle slider Then We Use This Function
        // s1.setOrientation(SwingConstants.VERTICAL);

    }
        @Override
    public void stateChanged(ChangeEvent e) {
        l1.setText("Our Value Of Jslider Is :  "+s1.getValue());
        int k= s1.getValue();
        if(k>=0 && k<=20){
            c.setBackground(Color.GREEN);
        }
        if(k>=21 && k<=40){
            c.setBackground(Color.blue);
        }
      
        if(k>=41 && k<=60){
            c.setBackground(Color.RED);
        }
        if(k>=61 && k<=80){
            c.setBackground(Color.magenta);
        }
        if(k>=81 && k<=100){
            c.setBackground(Color.white);
        }

    }






    public static void main(String[] args) {
        new javaProgressBar();
        
    }
}

