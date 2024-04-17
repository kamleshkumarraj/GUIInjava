package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class scientificalculator implements ActionListener  {
    JTextField ent;
    static JButton btn;
    Container c;


    public void actionPerformed(ActionEvent e){
        // if (e.getSource()==btn){
        // System.out.println("btn= "+btn.getText());
        // c.setBackground(Color.BLUE);
        
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame = new JFrame();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20 ,1000, 800);
        Container c=frame.getContentPane();
    //    frame.setVisible(true);
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        ImageIcon icon = new ImageIcon("HTML/calwal2.png");
        JLabel lbl= new JLabel(icon);
        lbl.setBounds(130, 280, 330, 200);
        c.add(lbl);
        
        
        //  StringBuilder a= new StringBuilder("1");
        String k="1";
        int a1=1;
        int x=150;
        int y=300;
        for(int i=0; i<3; i++){
            x=150;
            for(int j=0; j<3; j++){
                JButton btn = new JButton(k);
                btn.setBounds(x, y, 80, 40);
                c.add(btn);
                btn.setBackground(Color.BLUE);
                // btn.setBackground(Color.orange);
                btn.setForeground(Color.WHITE);
                // int a1= Integer.parseInt(a);
                a1=a1+1;
                 k="";
                k=k+a1;
                x=x+100;
                // frame.setVisible(true);

                
            }
        
            y=y+50;
        }
        
        

        // JTextField ent = new JTextField();
        // ent.setBounds(150, 150, 290, 100);
        // c.add(ent);

        // System.out.println(btn.getText());
      
       frame.setVisible(true);
    }
}
