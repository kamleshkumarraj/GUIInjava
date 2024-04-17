package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class javalist {
    JFrame frame;
    Container c;
    JList list1;
    Font font;
    JLabel l1;

    void mainframe(){
        frame = new JFrame();
        frame.setBounds(200,200,700,600);
        frame.setTitle("Java Toolbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(new FlowLayout());
        font = new Font("Perpetua", Font.BOLD, 20);
        label();
        list();
        frame.setVisible(true);

    }
    void label(){
        l1 = new JLabel("List Of Student Is : ");
        l1.setFont(font);
        l1.setForeground(Color.blue);
        c.add(l1);
    }
    void list(){      
        String[] str = {"Kamlesh Kumar","Pintu Kumar","Mohan Kumar","Sohan Kumar","Ankit Kumar","Bittu Kumar","Guddu Kumar","Raviranjan Kumar","Bablu Kumar","Shyam Kumar","Raju Kumar","Kishan Raj","Kaushal Kumar","Jyotish Kumar","PremKumar"};
       list1 = new JList(str);
       list1.setFont(font);
       list1.setVisibleRowCount(5);
       JScrollPane pane = new JScrollPane(list1);
       c.add(pane);

    list1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e){
            System.out.println(String.valueOf(list1.getSelectedValue()));
        }
    });
    }
    

    public static void main(String[] args){
        javalist obj = new javalist();
        obj.mainframe();
    }
}
