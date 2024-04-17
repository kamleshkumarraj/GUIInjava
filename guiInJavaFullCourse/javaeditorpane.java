package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class javaeditorpane extends JFrame{
    Container c,c1;
    JEditorPane p1,pane2;
    JButton btn;
    
    javaeditorpane(){
        setBounds(100, 100, 800, 700);
        setTitle("Java DesktopPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c= getContentPane();
        editorPane();
        button();
        setVisible(true);
    }
    void  editorPane(){
        Font f = new Font("Times New Roman",Font.BOLD,20);
        p1 = new JEditorPane();
        p1.setFont(f);
        JScrollPane pane = new JScrollPane(p1);
        c.add(pane,BorderLayout.CENTER);
        p1.setContentType("text/html");
        // String str = "<html>"+
        // "<h1> My Name Is Kamlesh Kumar </h1>"+
        // "</html>";
       
        p1.setText("");
         

    }
   void  button(){
    btn = new JButton("Print Code");
    c.add(btn,BorderLayout.PAGE_END);

    btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            codeBox();
            
        }
    });
   }
 
   void codeBox(){
    JFrame frame = new JFrame();
    frame.setBounds(500, 100, 800, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("HTML Code ");
    c1 = frame.getContentPane();
    pane2 = new JEditorPane();
    JScrollPane pp = new JScrollPane(pane2);
    c1.add(pp,BorderLayout.CENTER);
    pane2.setText(p1.getText());
    frame.setVisible(true);



   }

    public static void main(String[] args) {
        new javaeditorpane();
    }
}
