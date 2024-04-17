package JAVA.guiInJavaFullCourse;

// this a programm for give the command on menu item and create checkmenuitem.
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// class change implements ChangeListener {
import java.awt.image.Kernel;

//     @Override
//     public void stateChanged(ChangeEvent e) {

//     }

// }
// In inner class we apply actionlistner 
public class notepad1 {
    public  JTextArea box;
    public JSlider j1;
    int k = 20;
    String k1="Times New Roman";
    void notepad(){
        JFrame frame = new JFrame();
        frame.setBounds(420, 110, 890, 600);
        frame.setTitle("Note Pad");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c;
        c = frame.getContentPane();
        // c.setLayout(null);
        c.setBackground(Color.BLUE);
        JMenuBar b = new JMenuBar();
        frame.setJMenuBar(b);
        b.setBackground(Color.lightGray);
        Font font = new Font("perpetua", Font.BOLD, 25);
        Font font1 = new Font("perpetua", Font.BOLD, 20);
        Font font2 = new Font("perpetua", Font.BOLD, 15);
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Edit");
        JMenu m4 = new JMenu("TextColor");
        JMenu m5 = new JMenu("Open");
        JMenu m6 = new JMenu("Terminal");
        m1.setFont(font);
        m3.setFont(font);
        m4.setFont(font);
        m5.setFont(font);
        m6.setFont(font);
        m1.setForeground(Color.blue);
        m3.setForeground(Color.blue);
        m4.setForeground(Color.blue);
        m5.setForeground(Color.blue);
        m6.setForeground(Color.blue);
        JMenuItem i1 = new JMenuItem("new-Tab");
        JMenuItem i2 = new JMenuItem("Undo");
        JMenuItem i3 = new JMenuItem("Redo");
        JMenuItem i4 = new JMenuItem("Exit");
        JMenuItem i5 = new JMenuItem("Font-Size ");
        JMenuItem i6 = new JMenuItem("Font-Family");

        JMenuItem i7 = new JMenuItem("Copy");
        JMenuItem i8 = new JMenuItem("Paste");
        JMenuItem i9 = new JMenuItem("Cut");
        JMenuItem i10 = new JMenuItem("Selectall");
        JMenuItem i11 = new JMenuItem("upper");
        JMenuItem i12 = new JMenuItem("lower");

        // Command For Set Font Size In EntryBox ;
        i5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog frame1 = new JDialog(frame, "Text-Size");
                frame1.setBounds(880, 20, 300, 200);
                Container c1;
                c1 = frame1.getContentPane();
                c1.setLayout(null);
                String arr2[] = { "0", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28","30", "32", "34", "34", "36", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60","62", "64", "66", "68", "70", "72", "74", "76", "78", "80", "82", "84", "86", "88", "90", "92", "94", "96", "98", "100", "102", "104", "106", "108", "110", "112", "114", "116", "118", "120","112", "124", "126", "128", "130", "132", "134", "134", "136", "140", "142", "144", "146",
                "148", "150", "152", "154", "156", "158", "160", "162", "164", "166", "168", "170", "172",
                "174", "176", "178", "180", "182", "184", "186", "188", "190", "192", "194", "196", "198",
                "200", "202" };
                JComboBox box2 = new JComboBox(arr2);
                box2.setBounds(40, 20, 100, 40);
                frame1.add(box2);
                box2.setEditable(true);
                box2.setFont(font);
                frame1.setVisible(true);
                box2.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        String str = (String) box2.getSelectedItem();
                        k = Integer.parseInt(str);
                        Font f = new Font(k1, Font.BOLD, k);
                        box.setFont(f);
                        String k5 =  box.getSelectedText();
                    }
                });
            }
        });

        // Command For Font Family In Entry Box;
        i6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f1 = new Font("Times New Roman", Font.BOLD, 20);
                JDialog d2 = new JDialog(frame, "Font-Family");
                d2.setBounds(880, 20, 400, 200);
                d2.setVisible(true);
                d2.setLayout(null);
                String[] arr = { "Times New Roman", "Algerian", "Verdana", "Arial", "Baskerville Old Face",
                        "Bauhaus 93", "Berlin Sans FB", "Bernard MT", "Blackadder ITC", "Bodoni MT Poster",
                        "Book Antiqua", "Bookman Old Style", "Britannic", "Bowlby One SC", "Bradley Hand ITC",
                        "Broadway", "Brush Script MT", "Bungee Inline", "Cabin Sketch", "Calibri", "Californian FB",
                        "Calisto MT", "Cambria", "Cambria Math", "Candara", "Cascadia Code", "Cascadia Mono",
                        "Castellar", "Centaur", "Century", "Century Gothic", "Century Gothic", "Century Schoolbook",
                        "Chiller", "Cinzel", "Colonna MT", "Comic Sans MS", "Complex", "Consolas", "Cooper",
                        "Copperplate Gothic", "Corbel", "Courgette" };
                JComboBox box1 = new JComboBox(arr);
                box1.setBounds(20, 20, 300, 40);
                box1.setFont(f1);
                box1.setEditable(true);
                d2.add(box1);
                box1.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        k1 = (String) (box1.getSelectedItem());
                        box.setFont(new Font(k1, Font.BOLD, k));

                    }

                });

            }
        });

        i7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.copy();
            }
        });
        i8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.paste();
            }
        });
        i9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.cut();

            }
        });
        i10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.selectAll();
            }
        });
        i11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String k = box.getText();
                k = k.toUpperCase();
                box.setText(k);
            }
        });
        i12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String k = box.getText();
                k = k.toLowerCase();
                box.setText(k);
            }
        });
        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setText("Hii My Name Is Kamlesh Kumar Kushwaha");
            }
        });

        JMenuItem cii1 = new JMenuItem("Red");
        JMenuItem cii2 = new JMenuItem("Blue");
        JMenuItem cii3 = new JMenuItem("Black");
        JMenuItem cii4 = new JMenuItem("Green");
        JMenuItem cii5 = new JMenuItem("Gray");
        JMenuItem cii6 = new JMenuItem("Darkgray");

        JMenuItem cii7 = new JMenuItem("Magenta");
        JMenuItem cii8 = new JMenuItem("Pink");
        JMenuItem cii9 = new JMenuItem("Orange");
        JMenuItem cii10 = new JMenuItem("White");
        JMenuItem cii11 = new JMenuItem("Cyan");
        JMenuItem cii12 = new JMenuItem("Yellow");

        m4.add(cii1);
        cii1.setFont(font1);
        m4.add(cii2);
        cii2.setFont(font1);
        m4.add(cii3);
        cii3.setFont(font1);
        m4.add(cii4);
        cii4.setFont(font1);
        m4.add(cii5);
        cii5.setFont(font1);
        m4.add(cii6);
        cii6.setFont(font1);
        m4.add(cii7);
        cii7.setFont(font1);
        m4.add(cii8);
        cii8.setFont(font1);
        m4.add(cii9);
        cii9.setFont(font1);
        m4.add(cii10);
        cii10.setFont(font1);
        m4.add(cii11);
        cii11.setFont(font1);
        m4.add(cii12);
        cii12.setFont(font1);

        cii1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.red);

            }
        });

        cii2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.blue);

            }
        });

        cii3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.black);

            }
        });

        cii4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.green);

            }
        });

        cii5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.gray);

            }
        });

        cii6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.darkGray);

            }
        });

        cii7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.magenta);

            }
        });

        cii8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.pink);

            }
        });

        cii9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.orange);

            }
        });

        cii10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.white);

            }
        });

        cii11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.cyan);

            }
        });

        cii12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                box.setForeground(Color.YELLOW);

            }
        });

        // JMenuItem ii11 = new JMenuItem(per");
        // JMenuItem ii12 = new JMenuItem(wer");

        m3.add(i7);
        m3.add(i8);
        m3.add(i9);
        m3.add(i10);
        m3.add(i11);
        m3.add(i12);

        i7.setFont(font1);
        i8.setFont(font1);
        i9.setFont(font1);
        i10.setFont(font1);
        i11.setFont(font1);
        i12.setFont(font1);

        i1.setFont(font1);
        m2.setFont(font1);
        i2.setFont(font1);
        i3.setFont(font1);
        i4.setFont(font1);
        i5.setFont(font1);
        i6.setFont(font1);

        JCheckBoxMenuItem ii1 = new JCheckBoxMenuItem("Copy");
        JCheckBoxMenuItem ii2 = new JCheckBoxMenuItem("Pase");
        JCheckBoxMenuItem ii3 = new JCheckBoxMenuItem("Cut");
        JCheckBoxMenuItem ii4 = new JCheckBoxMenuItem("SelectAll");
        JCheckBoxMenuItem ii5 = new JCheckBoxMenuItem("WordWrap");
        JCheckBoxMenuItem ii6 = new JCheckBoxMenuItem("UnEditable");

        ii1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii1.isSelected()) {
                    box.copy();
                }

            }
        });
        ii2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii2.isSelected()) {
                    box.paste();
                }
            }
        });
        ii3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii3.isSelected()) {
                    box.cut();

                }
            }
        });
        ii4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii4.isSelected()) {
                    box.selectAll();
                }

            }
        });

        ii5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii5.isSelected()) {
                    box.setLineWrap(true);
                    box.setWrapStyleWord(true);

                } else {
                    box.setLineWrap(false);
                    box.setWrapStyleWord(false);

                }

            }
        });

        ii6.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ii6.isSelected()) {
                    box.setEditable(false);

                } else {
                    box.setEditable(true);

                }

            }
        });

        ii1.setFont(font2);
        ii2.setFont(font2);
        ii3.setFont(font2);
        ii4.setFont(font2);
        ii5.setFont(font2);
        ii6.setFont(font2);
        b.add(m1);
        b.add(m3);
        b.add(m4);
        b.add(m5);
        b.add(m6);
        m1.add(m2);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        m1.add(i6);
        m2.add(ii1);
        m2.add(ii2);
        m2.add(ii3);
        m2.add(ii4);
        m2.add(ii5);
        m2.add(ii6);

        box = new JTextArea(50, 50);
        box.setBackground(Color.lightGray);

        JScrollPane pane = new JScrollPane(box);
        box.setFont(font1);
        c.add(pane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        notepad1 obj = new notepad1();
      
        Welcomewindow obj1 = new Welcomewindow();
          obj.notepad();
        obj1.window.dispose();

        
    }

}

