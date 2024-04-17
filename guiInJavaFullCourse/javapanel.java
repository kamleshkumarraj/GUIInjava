package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//programm for create multiple window and create java panel

class newFrame{
    JFrame frame,frame1;
    Container c,c1;
   void NewFrame(){
        frame = new JFrame();
        frame.setBounds(20, 30, 800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Second  Window ");
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        label();
        frame.setVisible(true);

    }
    void label(){
        JLabel lbl= new JLabel("Welcome in new window ");
        lbl.setBounds(20, 50, 700, 100);
        Font font = new Font("Times New Roman", Font.ITALIC, 40);
        c.add(lbl);
        lbl.setFont(font);
        lbl.setForeground(Color.RED);

    }

}

public class javapanel extends newFrame implements ActionListener {
    JButton btn;
    JPanel p;
    javapanel(){
        frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBounds(20, 30, 1200, 1000);
        frame1.setTitle("First Window :");
        c1=frame1.getContentPane();
        c1.setBackground(Color.CYAN);
        c1.setLayout(null);
        frame1.setVisible(true);
        panel();
        button();
    }
    void panel(){
         p = new JPanel();
        p.setBounds(50, 50, 500, 500);
        c1.add(p);
        p.setLayout(null);
        p.setBackground(Color.YELLOW);
    }
    void button(){
        btn= new JButton("Press for new Window ");
        btn.setBounds(50, 100, 250, 50);
        p.add(btn);
        btn.addActionListener(this);

   

    }
    public void actionPerformed(ActionEvent e ){
        if(e.getSource()==btn){
            System.out.println("Hii My name is Kamlesh Kumar");
            NewFrame();
        }
    }
    public static void main(String[] args) {
        javapanel obj = new javapanel();      
    }
}
