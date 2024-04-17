package JAVA.guiInJavaFullCourse;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.*;
import java.awt.event.*;

//this class is making for givin the command on combobox,Radiobutton when we select any item
class item implements ItemListener{
    JFrame frame2;
    Container c;
    static JComboBox box1,box2,box3,box4,box5;
    static JTextArea txt1,txt2;
    static JRadioButton bt1,btn2;
    static JCheckBox box;
    void newwindow(){
        frame2 = new JFrame();
        frame2.setBounds(10, 20, 1000, 800);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setTitle("Window Closed");
        c=frame2.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==box1){
        txt2.setText("Selection is successfull");
        }
        if(e.getSource()==box2){
            txt2.setText("Selection is successfull1");

        }
        if(e.getSource()==bt1){
          
            txt2.setText("You Selected Male ");
        }
        if(e.getSource()==btn2){
            txt2.setText("You selected Female ");

        }
        if(e.getSource()==box){
            txt2.setText("You selected Checkbox ");
        }

    }

}

public class  firstLectureOfGuiCreateRegistrationForm extends   item  implements   ActionListener {
    static JTextField entry1,entry3,entry4,entry5,entry2;
    static JPasswordField passwordentry;
    static JButton btn;
   
  
   
    static JLabel lbl1,lbl2,lbl3,lb4;
   static Font font1,font2,font3,font;
   
  static  ButtonGroup grp;


    public void actionPerformed(ActionEvent e){
        String k="Male";
        if(btn2.isSelected()){
            k="";
             k="Female";
        }
        if(box.isSelected()){
        String S= "Student's Name : "+entry1.getText()+"\n Roll No : "+entry2.getText()+"\nFather's Name : "+entry3.getText()+"\nMother's Name : "+entry4.getText()+"\nDate-Of-Birth : "+box1.getSelectedItem()+" / "+box2.getSelectedItem()+" / "+box3.getSelectedItem()+"\nGender : "+k+"\nCollage Name : "+box4.getSelectedItem()+"\nAddress : "+txt1.getText();
        
        txt2.setText(S);
        lb4.setText("**Login Successfully Thank You.");
        }
        else{
            lb4.setText("**Please Select Term & Condition And Then Login Form. ");
            newwindow();
        }
    }


    public static void main(String[] args) {
        firstLectureOfGuiCreateRegistrationForm k1 = new firstLectureOfGuiCreateRegistrationForm();
    // create a gui window;
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setTitle("This is our Second Tutorial");
    frame.setSize(1200, 800);
    frame.setLocation(50, 0);
    ImageIcon icon1 = new ImageIcon("HTML/jietlogo.png");
    frame.setIconImage(icon1.getImage());
    Container c= frame.getContentPane();
     c.setBackground(Color.green);
    c.setLayout(null);


    lbl1=new JLabel("JIET GROUP OF INSTUTIONS JODHPUR ");
    lbl1.setBounds(230,0,1000,100);
    font1= new Font("ALGERIAN",Font.BOLD,40);
    font= new Font("ALGERIAN",Font.BOLD,20);
    lbl1.setFont(font1);
    c.add(lbl1);
    lbl1.setForeground(Color.BLUE);

    lbl2=new JLabel("2nd (even) Semester Exam Form  ");
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




    //for cretae a lebel in java we create a object of javalabel
    JLabel label= new JLabel("Student Name : ");
    JLabel label1 = new JLabel("Roll NO : ");
    JLabel label2 = new JLabel("Father's Name : ");
    JLabel label3= new JLabel("Mother's Name : ");
    JLabel label4 = new JLabel("DOB : ");
    JLabel label6 = new JLabel("Gender : ");
    JLabel label7 = new JLabel("Collage Name : ");
    JLabel label8 = new JLabel("Address : ");
   

    //for create a picture level
    JLabel label5 = new JLabel(icon1);

    // we add our label on coantainer 
    c.add(label);
    c.add(label1);
    c.add(label2);
    c.add(label3);
    c.add(label4);
    c.add(label5);
    c.add(label6);
    c.add(label7);
    c.add(label8);
    

    //and we initialized the size of the label
    label.setBounds(50, 150, 180, 50);
    label1.setBounds(50, 200, 180, 50);
    label2.setBounds(50, 250, 180, 50);
    label3.setBounds(50, 300, 200, 50);
    label4.setBounds(50, 350, 180, 50);
    label6.setBounds(50, 400, 180, 50);
    label7.setBounds(50, 450, 180, 50);
    label8.setBounds(50, 520, 180, 50);
  
    label5.setBounds(0, 0, icon1.getIconWidth(),icon1.getIconHeight());

    //for set the font size and fontstyle we create a object of font
    Font font = new Font("Times New Roman",Font.BOLD,25);

    //this function is used for set font family
    label.setFont(font);
    label1.setFont(font);
    label2.setFont(font);
    label3.setFont(font);
    label4.setFont(font);
    label6.setFont(font);
    label7.setFont(font);
    label8.setFont(font);

    //we set the text color of this label
    label.setForeground(Color.RED);
    label1.setForeground(Color.RED);
    label2.setForeground(Color.RED);
    label3.setForeground(Color.RED);
    label4.setForeground(Color.RED);
    label6.setForeground(Color.RED);
    label7.setForeground(Color.RED);
    label8.setForeground(Color.RED);

    //we create a Entry box for this we create a obj of this class
    entry1 = new JTextField();
    entry2 = new JTextField();
    entry3 = new JTextField();
    entry4 = new JTextField();
    String k[]= {"--","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    box1= new JComboBox(k);
    //################


    String k7[]= {"--","01","02","03","04","05","06","07","08","09","10","11","12"};
    box2= new JComboBox(k7);

    String k2[]={"----","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};
    box3 = new JComboBox(k2);

    String k3[]={ "-------------------------------------------------",
        "Jiet Group Of Institutions Jodhpur", "V. Maa Bhagwati Institute.",
       " K S Memorial College Of Physiotherapy Ratings.",
    
       " Unitech Computer Education Unitech Group Of Instituitions. ",
       " Ashapura Group Of Education. ",
        "V. Aisect Ntt Education Centre.",
       " V. Directionguru.",
        "Vihan Institute."};
        box4= new JComboBox(k3);

        txt1= new JTextArea();
        txt2= new JTextArea();


    bt1 = new JRadioButton("Male");
    btn2 = new JRadioButton("Female");
    // btn3= new JRadioButton("Custom");

    box1.addItemListener(k1);
    box2.addItemListener(k1);
    // box3.addItemListener(k1);
    // box4.addItemListener(k1);
    // box5.addItemListener(k1);

     grp = new ButtonGroup();
    grp.add(bt1);
    grp.add(btn2);
    // bt1.setSelected(true);


    //we add the entry box in our container
    c.add(entry1);
    c.add(entry2);
    c.add(entry3);
    c.add(entry4);
    c.add(box1);
    c.add(box2);
    c.add(box3);
    c.add(box4);
    c.add(bt1);
    c.add(btn2);
    // c.add(btn3);
    c.add(txt1);
    c.add(txt2);
    // c.add(entry5);
    
    //we initilized the size of the entry box in our gui window 
    entry1.setBounds(250, 150+10, 300, 35);
    entry2.setBounds(250, 200+10, 300, 35);
    entry3.setBounds(250, 250+10, 300, 35);
    entry4.setBounds(250, 300+10, 300, 35);
    box1.setBounds(250, 350+10, 70, 35);
    box2.setBounds(350, 350+10, 70, 35);
    box3.setBounds(450, 350+10, 100, 35);
    bt1.setBounds(250, 400+10, 80, 35);
    btn2.setBounds(350, 400+10, 80, 35);
    // btn3.setBounds(450, 400+10, 80, 35);
    box4.setBounds(250, 450+10, 600, 35);
    txt1.setBounds(250, 500+10, 600, 60);
    txt2.setBounds(610, 150, 550, 280);



    //set the font in the entry box;  
    entry1.setFont(font);
    entry2.setFont(font);
    entry3.setFont(font);
    entry4.setFont(font);
    box1.setFont(font);
    box2.setFont(font);
    box3.setFont(font);
    box4.setFont(font);
    txt1.setFont(font);
    txt2.setFont(font);

    //set the backgroun color in the entry box;
    entry1.setBackground(Color.LIGHT_GRAY);
    entry2.setBackground(Color.LIGHT_GRAY);
    entry3.setBackground(Color.LIGHT_GRAY);
    entry4.setBackground(Color.LIGHT_GRAY);
    box1.setBackground(Color.LIGHT_GRAY);
    box2.setBackground(Color.LIGHT_GRAY);
    box3.setBackground(Color.LIGHT_GRAY);
    box4.setBackground(Color.LIGHT_GRAY);
    bt1.setBackground(Color.lightGray);
    btn2.setBackground(Color.lightGray);
    // btn3.setBackground(Color.lightGray);
    txt1.setBackground(Color.lightGray);
    txt2.setBackground(Color.lightGray);
    //if we want to set the text in our text field then we used this function;


    //for set the text color we use this function;
    entry1.setForeground(Color.blue);
    // entry2.setForeground(Color.blue);
    entry2.setForeground(Color.blue);
    entry3.setForeground(Color.blue);
    entry4.setForeground(Color.blue);
    box1.setForeground(Color.blue);
    box2.setForeground(Color.blue);
    box3.setForeground(Color.blue);
    box4.setForeground(Color.blue);
    txt1.setForeground(Color.blue);
    txt2.setForeground(Color.blue);
    //if we want to never change the value in entry box the we use if we pass the value true then we change in entry box;;
    entry1.setEditable(true);
    entry2.setEditable(true);
    entry3.setEditable(true);
    entry4.setEditable(true);

    // JScrollPane bar = new JScrollPane(txt2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    // // bar.add(txt2);
    //  frame.add(bar);



    //we create a password entry box for create a entry box we create a object of passwordbox;
    // passwordentry = new JPasswordField();
    // c.add(passwordentry);
    // passwordentry.setBounds(250, 200+10, 200, 35);
    // passwordentry.setBackground(Color.lightGray);
    // passwordentry.setFont(font);
    // passwordentry.setForeground(Color.BLUE);
    // passwordentry.setEditable(true);

    //in password if we want to enter the passwor as * forms then we use;
    // passwordentry.setEchoChar('*');

    //if we to show our password in entry box then we use;
    // passwordentry.setEchoChar((char)0);

    //for Creatin a button we create a object of Button Class 
    btn = new JButton("Click Login Form");
    c.add(btn);
    btn.setBounds(260, 650, 150, 40);
    
    JLabel label9 = new JLabel("Show Result Here : ");
    c.add(label9);
      label9.setBounds(850, 110, 210, 50);
    btn.addActionListener(new firstLectureOfGuiCreateRegistrationForm());
    // so finally complete our project and the end of our lecture;
    label9.setFont(font);
    label9.setForeground(Color.RED);


    box = new JCheckBox("We Follows All Terms And Conditions And I Agree With You.");
    box.setBounds(100, 600, 800, 40);
    c.add(box);
    box.setFont(font);
    box.setBackground(Color.green);
    box.setForeground(Color.red);

    
        lb4 = new JLabel(" ");
        lb4.setBounds(80, 690, 800, 40);
        c.add(lb4);
        lb4.setFont(font);
        lb4.setForeground(Color.RED);
        lb4.setBackground(Color.CYAN);

        bt1.addItemListener(k1);
        btn2.addItemListener(k1);
        box.addItemListener(k1);

        label.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){
                label.setForeground(Color.blue);
                txt2.setText("Mouse action is Clicked ");

            }
            public void mouseEntered(MouseEvent e){
                label.setForeground(Color.blue);
                txt2.setText("Mouse action is Entered ");
            }
            public void mouseExited(MouseEvent e){
                label.setForeground(Color.red);
                txt2.setText("Mouse action is Exited ");
            }
            public void mousePressed(MouseEvent e){
                label.setForeground(Color.black);
                txt2.setText("Mouse action is pressed ");
            }
            public void mouseReleased(MouseEvent e){
                label.setForeground(Color.blue);
                txt2.setText("Mouse action is perform ");
            }
        });
        label2.addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e){
                label2.setForeground(Color.white);
                txt2.setText("Mouse Is Moved ");

            }
            public void mouseDragged(MouseEvent e){
                label2.setForeground(Color.yellow);
                txt2.setText("Mouse Is Drragged ");

            }
        });

        entry1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e){
                txt2.setText("Focused Is Gained ");

            }
            public void focusLost(FocusEvent e){
                txt2.setText("Focus Is Lost ");

            }
        });

        entry2.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e){
                txt2.setText(e.getDot()+"\n"+"Caret Event generate SuccessFully");


            }
        });

   
    }
    
}
