package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class signin{
    JDialog frame1;
    Container dilogContainer;
    JLabel nameLabel,rollLabel,emailLabel,collageidLabel,collageNameLabel,genderLabel,DOBLabel,registrationnoLabel,createPasswor,confirmPassword;

    void signpage(){
        frame1 = new JDialog();
        frame1.setBounds(200, 50, 500, 700);
        frame1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
        dilogContainer = frame1.getContentPane();
        dilogContainer.setLayout(null);
    }
    void panel1(){
        JPanel p1 = new JPanel();
        // BoxLayout l1 = new BoxLayout(p1);




    }



}

class loginPge extends signin implements MouseListener{
    JLabel label1,label2,label3,label4,label5,lLabel,plabel;
    JTextField entry1;
    JPasswordField entry2;
    JFrame frame1,frame2;
    JButton lButton;
    Container c1,c2;
    Font f1,f2,f3;
    void mainpage(){
        frame1 = new JFrame();
        frame1.setBounds(500, 100, 630, 450);
        frame1.setTitle("Login Page");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1=frame1.getContentPane();
        // c1.setBackground(Color.cyan);
        c1.setLayout(null);
        mainPageDesign();
        frame1.setVisible(true);
    }
    void mainPageDesign(){
        //for creating a new image
        ImageIcon icon = new ImageIcon("HTML/firstpage.png");
        label1 = new JLabel(icon);
        label1.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        ImageIcon icon1 = new ImageIcon("HTML/head1.png");
        plabel = new JLabel(icon1);
        plabel.setBounds(450, 20, icon1.getIconWidth(), icon1.getIconHeight());
        c1.add(plabel);
        c1.add(label1);
        //creating login design
        label2 = new JLabel("Login ");
        label2.setBounds(430, 65, 150, 50);
        label2.setForeground(Color.blue);
        c1.add(label2);
        f1= new Font("Century",Font.BOLD,35);
        label2.setFont(f1);
        //for enter name 
        label3 = new JLabel("Enter Email-id : ");
        label3.setBounds(400,120,150,30);
        c1.add(label3);
        f2 = new Font("Times New Roman", Font.BOLD, 20);
        label3.setFont(f2);
        //textfield for e_name;
        entry1 = new JTextField();
        entry1.setBounds(380, 150, 210, 35);
        entry1.setBackground(Color.lightGray);
        entry1.setFont(f2);
        c1.add(entry1);
        //label for password;
        label4 = new JLabel("Enter Password : ");
        label4.setBounds(400, 200, 200, 50);
        label4.setFont(f2);
        c1.add(label4);
        //for entry box
        entry2 = new JPasswordField();
        entry2.setBounds(380, 240, 210, 35);
        entry2.setFont(f2);
        entry2.setBackground(Color.lightGray);
        c1.add(entry2);
        //for button
        lButton = new JButton("Login");
        lButton.setBounds(410, 300, 150, 35);
        lButton.setFont(f2);
        c1.add(lButton);
        //for information
        label5 = new JLabel("For new user?");
        label5.setBounds(380, 330, 100, 50);
        f3= new Font("Times New Roman", Font.BOLD, 15);
        label5.setFont(f3);
        c1.add(label5);
        //login label
        lLabel = new JLabel("Signup here ");
        lLabel.setBounds(480, 330, 100, 50);
        lLabel.setFont(f3);
        c1.add(lLabel);
        lLabel.setForeground(Color.blue);
        lLabel.addMouseListener(this);

        
    }
    // void signPage(){
    //     frame2 = new JFrame();
    //     frame2.setBounds(500, 100, 630, 500);
    //     frame2.setTitle("Signin Page");
    //     frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     c2=frame2.getContentPane();
    //     c2.setLayout(null);
    //     frame2.setResizable(false);
    //     frame2.setVisible(true);
    // }
    @Override
    public void mouseClicked(MouseEvent e) {
        signpage();
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }


}
public class projectManegement extends loginPge {
    public static void main(String[] args) {
        loginPge page = new loginPge();
        page.mainpage();
        
    }
}
