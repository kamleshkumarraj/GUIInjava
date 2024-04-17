package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaToggleButton extends JFrame{
    JToggleButton Tbtn;
    Container c;
    JPanel p1;


    javaToggleButton(){
        setBounds(50, 50, 700, 600);
        setTitle("Tabbed Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);
        setVisible(true);
        toggleButton();
        try{
        javaPanel();
        }
        catch(Exception e){}
        
        
    }

    
    void toggleButton(){
        Tbtn = new JToggleButton("Click");
        Tbtn.setBounds(200, 200, 80, 50);
        c.add(Tbtn);

        Tbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(Tbtn.isSelected()){
                    Tbtn.setText("On");
                    p1.setBackground(Color.yellow);
                }
                else{
                    Tbtn.setText("Off");
                    p1.setBackground(Color.GRAY);
                }

                
            }

        });

    }
    void javaPanel() throws InterruptedException{
        p1 = new JPanel();
        p1.setBounds(150, 300, 200, 200);
        c.add(p1);
        p1.setBackground(Color.gray);
        Thread.sleep(1000);
        p1.setBackground(Color.yellow);
        Thread.sleep(1000);
        p1.setBackground(Color.green);
        Thread.sleep(1000);
        p1.setBackground(Color.red);
        Thread.sleep(1000);
        p1.setBackground(Color.white);
        Thread.sleep(1000);
        p1.setBackground(Color.magenta);
        Thread.sleep(1000);
        p1.setBackground(Color.pink);
        Thread.sleep(1000);
        p1.setBackground(Color.blue);
        Thread.sleep(1000);
        p1.setBackground(Color.cyan);
        Thread.sleep(1000);
        p1.setBackground(Color.orange);
        Thread.sleep(1000);
        javaPanel();
        
    }

    

    public static void main(String[] args) {
        new javaToggleButton();
        
    }
}
