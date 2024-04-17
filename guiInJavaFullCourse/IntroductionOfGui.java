package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;

public class IntroductionOfGui {
    public static void main(String[] args) {
    //Create a object of Swing for using all function 
    JFrame frame = new JFrame();
    //We use the setvisible function for show the window
    frame.setVisible(true);
    //we use the ssettitle function for set the title 
    frame.setTitle("Our First Gui Application ");
    //this function is used for after close the gui application programm is end 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this function is used for initialized the size of GUI Window 
    // frame.setSize(500, 400);
    //this function is used for sate position of our gui window
    // frame.setLocation(100, 100);
    //this function is for both set size the window and set the boundary
    frame.setBounds(50, 50, 1050, 650);
    //for set the icon on our gui window we create a object of Icon
    ImageIcon icon = new ImageIcon("HTML/jietlogo.png");
    //for set the icon we use this function
    frame.setIconImage(icon.getImage());
    //for set the background color we use this function and store our window in a container 
    //container is import from java awt
    Container c=frame.getContentPane();
    //this function is used for set the background
    c.setBackground(Color.cyan);
    //if we want our window is don't reszable then used this function
    frame.setResizable(false);

    
    }   
}
