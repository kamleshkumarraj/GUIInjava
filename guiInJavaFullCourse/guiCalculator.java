package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class calculator extends JFrame implements ActionListener{
   static JTextField ent1,ent2,ent3;
    JButton btn1,btn2,btn3,btn4,btn5;
   static JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,label5;
   static Font font1,font2,font3,font ;
   static Container c;
    calculator(){
        setTitle("Our Simple Gui Calculator : ");
        setBounds(20, 20, 1000, 600);
        ImageIcon icon1 = new ImageIcon("HTML/jietlogo.png");
        setIconImage(icon1.getImage());
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        label5 = new JLabel(icon1);
        c.add(label5);
        label5.setBounds(20, 10, icon1.getIconWidth(),icon1.getIconHeight());
        lbl1=new JLabel("JIET GROUP OF INSTUTIONS JODHPUR ");
        lbl1.setBounds(230,0,1000,100);
        font1= new Font("ALGERIAN",Font.BOLD,40);
        font= new Font("ALGERIAN",Font.BOLD,20);
        lbl1.setFont(font1);
        c.add(lbl1);
        lbl1.setForeground(Color.BLUE);

        lbl2=new JLabel("This Is Our Normal Calculator  ");
        lbl2.setBounds(320,50,1000,100);
        font2= new Font("ALGERIAN",Font.BOLD,30);
        lbl2.setFont(font2);
        c.add(lbl2);
        lbl2.setForeground(Color.BLUE);

        lbl3=new JLabel("Created By- Kamlesh Raj Kushwaha   ");
        lbl3.setBounds(380,85,1000,100);
        font3= new Font("ALGERIAN",Font.BOLD,30);
        lbl3.setFont(font);
        c.add(lbl3);
        lbl3.setForeground(Color.BLUE);

        
        lbl3=new JLabel("Enter Your First Number :   ");
        lbl3.setBounds(100,200,400,50);
        font3= new Font("Time New Roman",Font.BOLD,20);
        lbl3.setFont(font3);
        c.add(lbl3);
        lbl3.setForeground(Color.darkGray);

        lbl4=new JLabel("Enter Your Secon Number :   ");
        lbl4.setBounds(100,250,400,50);
        font3= new Font("Time New Roman",Font.BOLD,20);
        lbl4.setFont(font3);
        c.add(lbl4);
        lbl4.setForeground(Color.darkGray);



        ent1= new JTextField();
        ent1.setBounds(400,210,280,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        ent1.setFont(font3);
        c.add(ent1);
        ent1.setForeground(Color.BLUE);
        ent1.setBackground(Color.lightGray);
        

        ent2= new JTextField();
        ent2.setBounds(400,260,280,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        ent2.setFont(font3);
        c.add(ent2);
        ent2.setBackground(Color.lightGray);
        ent2.setForeground(Color.BLUE);

        ent3= new JTextField();
        ent3.setBounds(100,400,580,100);
        font3= new Font("Time New Roman",Font.BOLD,20);
        ent3.setFont(font3);
        c.add(ent3);
        ent3.setBackground(Color.cyan);
        ent3.setForeground(Color.BLUE);
        
        btn1= new JButton("Sum ");
        btn1.setBounds(100,320,100,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        btn1.setFont(font3);
        c.add(btn1);
        btn1.setBackground(Color.orange);
        btn1.setForeground(Color.BLUE);
        
                
        btn2= new JButton("Subtract ");
        btn2.setBounds(220,320,140,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        btn2.setFont(font3);
        c.add(btn2);
        btn2.setBackground(Color.orange);
        btn2.setForeground(Color.BLUE);
         

        btn3= new JButton("Multiply ");
        btn3.setBounds(380,320,140,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        btn3.setFont(font3);
        c.add(btn3);
        btn3.setBackground(Color.orange);
        btn3.setForeground(Color.BLUE);

        btn4= new JButton("Divide ");
        btn4.setBounds(540,320,140,35);
        font3= new Font("Time New Roman",Font.BOLD,20);
        btn4.setFont(font3);
        c.add(btn4);
        btn4.setBackground(Color.orange);
        btn4.setForeground(Color.BLUE);

        lbl5=new JLabel("Result Box :   ");
        lbl5.setBounds(300,360,150,50);
        // font3= new Font("Time New Roman",Font.BOLD,20);
        lbl5.setFont(font3);
        c.add(lbl5);
        lbl5.setForeground(Color.BLUE);
        
        setVisible(true);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e){
        try{
        if(e.getSource()==btn1){
            float  a=Float.parseFloat(ent1.getText()) ;
            float b= Float.parseFloat(ent2.getText());
            float x= a+b;
            ent3.setText("              Sum = "+x);

        }
    }
    catch(Exception e1){

        JOptionPane .showMessageDialog(new JFrame(), "Please Enter Valid input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
    try{
        if(e.getSource()==btn2){
            float  a=Float.parseFloat(ent1.getText()) ;
            float b= Float.parseFloat(ent2.getText());
            float x= a-b;
            ent3.setText("              Subtaction = "+x);

        }
    }
    catch(Exception e1){

        JOptionPane .showMessageDialog(new JFrame(), "Please Enter Valid input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
    try{
        if(e.getSource()==btn3){
            float  a=Float.parseFloat(ent1.getText()) ;
            float b= Float.parseFloat(ent2.getText());
            float x= a*b;
            ent3.setText("              Multiply = "+x);

        }
    }
    catch(Exception e1){

        JOptionPane .showMessageDialog(new JFrame(), "Please Enter Valid input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
    try{

        if(e.getSource()==btn4){
            float  a=Float.parseFloat(ent1.getText()) ;
            float b= Float.parseFloat(ent2.getText());
            if(b==0){
                throw new ArithmeticException();
            }
            float x= a/b;
            ent3.setText("              Quotient = "+x);

        }
    }
    catch(Exception e1){

        JOptionPane .showMessageDialog(new JFrame(), "Please Enter Valid input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }




}
}

public class guiCalculator {
    public static void main(String[] args) {
        
    
    calculator frame = new calculator();

    }
}
