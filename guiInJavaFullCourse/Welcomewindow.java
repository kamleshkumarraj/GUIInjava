package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Welcomewindow extends notepad1{
    JWindow window;
    Container c1,c;
    JLabel lbl1,lbl2,lbl3;
    JPanel p1;
    Font font;
    int n;
    Welcomewindow(){
        window = new JWindow();
        window.setBounds(500, 150, 600, 500);
        c1= window.getContentPane();
        c1.setLayout(null);
        label();
        panel();
        window.setVisible(true);
        progressbar();
        
        
        

    }
    void label(){
        font = new Font("perpetua",Font.BOLD,40);
        Font font1 = new Font("Algerian",Font.ITALIC,20);
        lbl1 = new JLabel("WELCOME IN NEW WINDOW ");
        lbl1.setBounds(50, 50, 550, 40);
        lbl1.setFont(font);
        lbl1.setForeground(Color.blue);
        c1.add(lbl1);
        lbl3 = new JLabel("This Note-Pad Is Created By - Kamlesh Raj Kushwaha");
        lbl3.setBounds(10, 400, 570, 30);
        lbl3.setFont(font1);
        lbl3.setForeground(Color.magenta);
        c1.add(lbl3);
    }
    void panel(){
        p1 = new JPanel();
        p1.setBounds(100, 100, 500,300 );
        p1.setLayout(null);
        imagelabel();
        window.add(p1);
    }
    void imagelabel(){
        ImageIcon icon = new ImageIcon("HTML/head.png");
        lbl2 = new JLabel(icon);
        lbl2.setBounds(100, 10, icon.getIconWidth(), icon.getIconHeight());
       
        p1.add(lbl2);

    }
    void progressbar(){
        JProgressBar bar = new JProgressBar();
        bar.setBounds(0, 220, 450, 40);
        p1.add(bar);
        bar.setMaximum(100);
        bar.setMinimum(0);
        bar.setStringPainted(true);
        bar.setForeground(Color.blue);
        for(int i=0; i<=100; i++){
            try{
                Thread.sleep(50);
            }
            catch(Exception e){}
            bar.setValue(i);
            bar.setString("Please Wait Few Minute Processing.....");
            if(i>=90 && i<=100){
                bar.setString("Process Complete");
            }

        }
    }
    
    public static void main(String[] args) {
      Welcomewindow obj =   new Welcomewindow();
    //   obj.notepad();
    //   obj.window.dispose();
    
  

        
    }
    
}
