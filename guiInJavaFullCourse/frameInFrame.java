package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameInFrame {
JFrame frame1,frame2;
Container c1,c2;
JLabel label1,label2;
JTextField ent1,ent2;
JButton btn1,btn2;
Font font;
    void firstFrame(){
        frame1 = new JFrame();
        frame1.setBounds(100, 200, 500, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("Form - Window");
        c1= frame1.getContentPane();
        c1.setBackground(Color.CYAN);
        c1.setLayout(null);
        firstButton();
        firstLabel();
        frame1.setVisible(true);

    }
    void firstButton(){
        font = new Font("Times New Roman", Font.BOLD, 20);
        btn1 = new JButton("Click Form");
        btn1.setBounds(20, 50, 150, 40);
        btn1.setFont(font);
        c1.add(btn1);

        //Command On First Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                secondFrame();
                frame1.dispose();
            }

        });
    }
    void firstLabel(){
        label1 = new JLabel("Click For New Form ");
        label1.setFont(font);
        label1.setBounds(200, 50, 200, 45);
        c1.add(label1);
    }
    void secondFrame(){
        frame2 = new JFrame();
        frame2.setBounds(200, 200, 500, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setTitle("Frame-2 Window");
        c2= frame2.getContentPane();
        c2.setBackground(Color.blue);
        c2.setLayout(null);
        secondButton();
        secondEntry();
        frame2.setVisible(true);

    }
    void secondEntry(){
        ent1 = new JTextField();
        ent1.setBounds(20, 50, 200, 40);
        ent1.setFont(font);
        c2.add(ent1);
    }
    void secondButton(){
        btn2 = new JButton("Submit-Form");
        btn2.setBounds(250, 50, 180, 40);
        btn2.setFont(font);
        c2.add(btn2);

        //For Give The Command On First Buton
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                firstFrame();
                String str = ent1.getText();
                label1.setText(str);
                frame2.dispose();
            }
        });
        


    }

    
        public static void main(String[] args) {
            frameInFrame frame = new frameInFrame();
            frame.firstFrame();
        }
}
