package JAVA.guiInJavaFullCourse;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.xml.validation.Validator;

import java.awt.*;

public class GUI {
        JFrame frame;
        JTextArea text;
        Container c;
        
        
    GUI() throws Exception{
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800,700);
        c = frame.getContentPane();
        c.setBackground(Color.green);
        c.setLayout(null);
        field();
        frame.setVisible(true);
        for(int i=1; i<=10; i++){
                text.setText("I = "+i);
                Thread.sleep(1000);
        }
        

        
        
        
        }
        void field() throws Exception{
                text  = new JTextArea();
                Font f = new Font("Times New Roman", Font.BOLD, 25);
                text.setBounds(50, 50, 500, 300);
                text.setBackground(Color.gray);
                text.setForeground(Color.blue);
                text.setFont(f);
                c.add(text);
                // for(int i=1; i<=10; i++){
                // Thread.sleep(500);
                // text.setText("i= "+i);
                }
                
        
        public static void main(String[] args) throws Exception {
                new GUI();                
        }
        
}
