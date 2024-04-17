package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
public class javatoolbar {
    JFrame frame;
    Container c;
    JToolBar tbar;
    JMenuBar mbar;
    JMenu menu;
    JMenuItem i1,i2,i3,i4;
    JComboBox box1;
    JButton btn1,btn2;
    JTextField ent;
    Font font1,font2;

    void mianframe(){
        frame = new JFrame();
        frame.setBounds(200,200,700,600);
        frame.setTitle("Java Toolbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        // c.setLayout(null);
        toolbar();
        frame.setVisible(true);
    }
    void toolbar(){
        tbar = new JToolBar();
        // tbar.setLayout(null);
        // tbar.setBounds(0, 0, 700, 100);
        c.add(tbar,BorderLayout.PAGE_START);
        menubar();
        combobox();
        entrybox();
        button();
    }
    void menubar(){
        font1 = new Font("perpetua",Font.BOLD,25);
        font2 = new Font("perpetua",Font.BOLD,20);
        mbar = new JMenuBar();
        tbar.add(mbar);
        menu = new JMenu("File");
        menu.setFont(font1);
        mbar.add(menu);
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Save as");
        i1.setFont(font2);
        i2.setFont(font2);
        i3.setFont(font2);
        i4.setFont(font2);
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
    }
    void entrybox(){
        ent = new JTextField();
        tbar.add(ent);
        ent.setFont(font2);
    }
    void combobox(){
        String[] arr ={"Edit","Cut","Copy","Paste","SelectAll"};
        box1 = new JComboBox(arr);
        tbar.add(box1);
        box1.setFont(font1);
    }
    void button(){
        btn1 = new JButton("Click-1");
        tbar.add(btn1);
        btn1.setFont(font1);
        tbar.addSeparator();

        btn2 = new JButton("Click-2");
        tbar.add(btn2);
        btn2.setFont(font1);
    }
    



    public static void main(String[] args) {
        javatoolbar obj = new javatoolbar();
        obj.mianframe();
        
    }
    
}
