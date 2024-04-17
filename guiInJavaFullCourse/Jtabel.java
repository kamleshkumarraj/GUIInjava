package JAVA.guiInJavaFullCourse;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class Jtabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame = new JFrame();
        frame.setBounds(420, 120, 700, 600);
        frame.setTitle("Java Tabel ");
        Container c;
        c=frame.getContentPane();
        // c.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.cyan);
      
        // String data[][]={{"kamlesh","40","T22EJICS067"},{"Pintu","41","T22EJICS068"},{"Ankit","42","T22EJICS069"},{"Bittu","43","T22EJICS070"},{"Kaushal","44","T22EJICS071"}};
        // String head[] ={"Name","Age","RollNo."};

        // JTable tabel =  new JTable(data,head);
        // // tabel.setBounds(20, 20, 500, 200);
        // c.add(new JScrollPane(tabel));
        //if we want to perform some task in our tabel then we use some step :-
        //useful method in tabel
        //JTabel(data,columnname);
        //if we want to modify our table then we use 
        //JTabel(tabelModel);
        //step1: we create tabel data like String p[][]={{},{}}
        //step2: we create column namaes
        //step3: we crete the object of DefaultTabelModel Class ;
        //we pass the parameter in this class
        //again we crete the object of JTabel class and pass the object of DefaulTabelmodel class

        String data[][]={{"kamlesh","40","T22EJICS067"},{"Pintu","41","T22EJICS068"},{"Ankit","42","T22EJICS069"},{"Bittu","43","T22EJICS070"},{"Kaushal","44","T22EJICS071"}};
        String head[] ={"Name","Age","RollNo."};

        

        JTable tabel1 =  new JTable(data,head);
        // tabel.setBounds(20, 20, 500, 200);
      




        frame.setVisible(true);

    }
}
