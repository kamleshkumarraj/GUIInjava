package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

public class cardLayout extends JFrame implements ItemListener {
    Container c;
    JPanel panel,panel1,panel2,panel3,panel4,panel5;
    JComboBox box;
    CardLayout layout;

    cardLayout(){
        setBounds(50, 50, 800, 600);
        setTitle("Card Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);
        jpanel();
        combobox();
        setVisible(true);
    }
    public void jpanel(){
        panel= new JPanel();
        panel.setBounds(100, 100, 400, 400);
        panel.setBackground(Color.red);
         layout = new CardLayout();
        panel.setLayout(layout);
        c.add(panel);

        panel1= new JPanel();
        panel1.setBounds(0, 0, 400, 400);
        panel1.setBackground(Color.blue);
        panel.add(panel1,"1");
        panel1.setLayout(null);
        JLabel lbl = new JLabel("Hii My Name Is Kamlesh Kumar ");
        JLabel lbl1 = new JLabel("This Card Is Toward Me For You .");
        lbl.setBounds(20,20,400,100);
        lbl1.setBounds(20,220,400,100);
        Font f = new Font("Times New Roman",Font.BOLD,20);
        lbl.setFont(f);
        lbl1.setFont(f);
        panel1.add(lbl);
        panel1.add(lbl1);         

        panel2= new JPanel();
        panel2.setBounds(0, 0, 500, 400);
        panel2.setBackground(Color.orange);
        panel.add(panel2,"2");
        panel2.setLayout(null);
        JLabel lbl2 = new JLabel("Hii My Name Is Pintu Kumar ");
        JLabel lbl3 = new JLabel("This Card Is Toward Me For You .");
        lbl2.setBounds(20,20,400,100);
        lbl3.setBounds(20,220,400,100);
        lbl2.setFont(f);
        lbl3.setFont(f);
        panel2.add(lbl2);
        panel2.add(lbl3);        

        panel3= new JPanel();
        panel3.setBounds(0, 0, 500, 400);
        panel3.setBackground(Color.MAGENTA);
        panel.add(panel3,"3"); 
        panel3.setLayout(null);
        JLabel lbl4 = new JLabel("Hii My Name Is Bittu Kumar ");
        JLabel lbl5 = new JLabel("This Card Is Toward Me For You .");
        lbl4.setBounds(20,20,400,100);
        lbl5.setBounds(20,220,400,100);

        lbl4.setFont(f);
        lbl5.setFont(f);
        panel3.add(lbl4);
        panel3.add(lbl5);       

        panel4= new JPanel();
        panel4.setBounds(0, 0, 500, 400);
        panel4.setBackground(Color.green);
        panel4.setLayout(null);
        JLabel lbl6 = new JLabel("Hii My Name Is Ankit Kumar ");
        JLabel lbl7 = new JLabel("This Card Is Toward Me For You .");
        lbl6.setBounds(20,20,400,100);
        lbl7.setBounds(20,220,400,100);

        lbl6.setFont(f);
        lbl7.setFont(f);
        panel4.add(lbl6);
        panel4.add(lbl7);
        panel.add(panel4,"4"); 
        
        
        panel5= new JPanel();
        panel5.setBounds(0, 0, 500, 400);
        panel5.setBackground(Color.yellow);
        panel.add(panel5,"5");
        panel5.setLayout(null);
        JLabel lbl8 = new JLabel("Hii My Name Is Kaushal Kumar ");
        JLabel lbl9 = new JLabel("This Card Is Toward Me For You .");
        lbl8.setBounds(20,20,400,100);
        lbl9.setBounds(20,220,400,100);

        lbl8.setFont(f);
        lbl9.setFont(f);
        panel5.add(lbl8);
        panel5.add(lbl9); 
        
        // layout.show(panel, "3");
    }
        public void combobox(){
        String[] s={"Kamlesh","Pintu","Bittu","Ankit","Kaushal"};
        box = new JComboBox(s);
        JLabel lbl = new JLabel("Please Select The Card : ");
        lbl.setBounds(510, 250, 250, 100);
        c.add(lbl);
        Font f = new Font("Times New Roman",Font.BOLD,20);
        lbl.setFont(f); 
        box.setBounds(520, 320, 250, 50);
        box.setFont(f);
        c.add(box);
        box.addItemListener(this);
    }

    public static void main(String[] args) {
        cardLayout l = new cardLayout();
    //    String str= JOptionPane.showInputDialog("Enter Your Name ");
    //    System.out.println("Print Name : "+str);
    //     int a;
    //     System.out.println("Enter a = ");
    //     Scanner sc = new Scanner(System.in);
    //     a=sc.nextInt();
    //     if(a==1){
    //         JOptionPane.showMessageDialog(l, "hii how are you", "Plain message",JOptionPane.PLAIN_MESSAGE);
    //     }
    //     if(a==2){
    //         JOptionPane.showMessageDialog(l,"Are You Sure ?","Question box",JOptionPane.QUESTION_MESSAGE);
    //     }
    //     if(a==3){
    //         JOptionPane.showMessageDialog(l,"Here Is Error ","Error Box",JOptionPane.ERROR_MESSAGE);
    //     }
    //     if(a==4){
    //         JOptionPane.showMessageDialog(l,"Your contact is here","Information box",JOptionPane.INFORMATION_MESSAGE);

    //     }
    //     if(a==5){
    //         JOptionPane.showMessageDialog(l,"Here Is Dangerous","Warning Box",JOptionPane.WARNING_MESSAGE);
    //     }

    JOptionPane.showConfirmDialog(l, "Are You Sure ? ", "Confirmation Box", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);


    }
    public void itemStateChanged(ItemEvent e) {
        if(box.getSelectedItem()=="Kamlesh"){
            layout.show(panel, "1");
        }
        if(box.getSelectedItem()=="Pintu"){
            layout.show(panel, "2");
        }
        if(box.getSelectedItem()=="Bittu"){
            layout.show(panel, "3");
        }
        if(box.getSelectedItem()=="Ankit"){
            layout.show(panel, "4");
        }
        if(box.getSelectedItem()=="Kaushal"){
            layout.show(panel, "5");
        }

    }
}
