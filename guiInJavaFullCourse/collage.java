package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frontPage extends JFrame {
    static JFrame frame;
    static JLabel lb1, lb2, lb3;
    static JButton btn1, btn2;
    static Container c;
    static Font f;
    static ImageIcon icon;


    static void mainframe() {
        frame = new JFrame();
        frame.setBounds(20, 20, 1000, 700);

    }

    static void page1() {
        // icon=new ImageIcon("kamlesh raj kushwaha");

    }
}

public class collage extends frontPage {
    public static void main(String[] args) {
        frontPage.mainframe();
        
        lb1 = new JLabel("kamlesh raj kushwahah");
        lb1.setBounds(10, 10, 700, 400);
        c = frame.getContentPane();
        c.add(lb1);
        c.setLayout(null);
        frame.setVisible(true);

    }

}
