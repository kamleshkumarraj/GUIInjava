package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class tutorial5Gui {
    static Container c;
    static JButton btn;
    static JFrame frame;
    static Font font;
    static JLabel lbl1,lbl2;
    static JTextField ent1,ent2;
    public static void main(String[] args) {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20 ,1000, 800);
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        ImageIcon icon = new ImageIcon("b-1.png");
        frame.setIconImage(icon.getImage());
        lbl1 = new JLabel("User Name : ");
        lbl1.setBounds(50, 20, 200, 50);
        c.add(lbl1);
        Font font = new Font("Times New Roman",Font.BOLD,20);
        lbl1.setFont(font);

       JPasswordField passent = new JPasswordField();
        passent.setBounds(200, 65, 200, 35);
        c.add(passent);
        passent.setFont(font); 
        
        lbl2 = new JLabel("Password : ");
        lbl2.setBounds(50, 60, 200, 50);
        c.add(lbl2);
        lbl2.setFont(font);

        JTextField ent = new JTextField();
        ent.setBounds(200, 25, 200, 35);
        c.add(ent);
        ent.setFont(font);
        btn = new JButton("Click Login Form");
        c.add(btn);
        btn.setBounds(100, 130, 150, 40);
        // btn.addActionListener(new performOperation());

    }
}
// class performOperation implements ActionListener{
//     public void actionPerformed(ActionEvent e){
//         // tutorial5Gui.c.setBackground(Color.magenta);
//        tutorial5Gui.lbl1 = new JLabel("Login Successfull");
//       tutorial5Gui.lbl1.add(tutorial5Gui.c);
//     tutorial5Gui. lbl1.setBounds(50, 130, 200, 50);
//       tutorial5Gui.  lbl1.setFont(tutorial5Gui.font);
//     }


// }
