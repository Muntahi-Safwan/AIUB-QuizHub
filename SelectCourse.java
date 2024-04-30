import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectCourse extends JFrame {

    SelectCourse() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUB QuizHub");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        
        ImageIcon selectImg = new ImageIcon("./assets/select.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/background.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(30, 90, 940, 580);

        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(365, 5, 250, 250);

        // JLabel text1 = new JLabel("Hello Name");
        // text1.setFont(new Font("Roboto", Font.BOLD, 30));
        // text1.setBounds(365, 200, 250, 250);
        // https://colors.muz.li/palette/B8E4FA/81a6af/eefcff/ddf9ff/ffffff 

        JLabel text2 = new JLabel("Select Course");
        text2.setFont(new Font("Roboto", Font.BOLD, 30));
        text2.setBounds(400, 200, 300, 100);
        text2.setBackground(new Color(0xB8E4FA));
        text2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        text2.setForeground(Color.black);


        // JLabel text3 = new JLabel("Name: " + user.name);
        // text3.setFont(new Font("Roboto", Font.BOLD, 30));
        // text3.setBounds(100, 200, 300, 100);
        // text3.setBackground(new Color(0xB8E4FA));
        // text3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        // text3.setForeground(Color.black);
        
        JButton button1 = new JButton("Introduction to Programming");
        button1.setBounds(280, 300, 450, 40);
        button1.setFont(new Font("Roboto", Font.BOLD, 20));
        button1.setBackground(new Color(0xB8E4FA));
        button1.setForeground(Color.black);
        button1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button1.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                IPQuiz o = new IPQuiz("Jawan");
                o.setVisible(true);
            }
        });

        JButton button2 = new JButton("Object Oriented Programming 1");
        button2.setBounds(280, 350, 450, 40);
        button2.setFont(new Font("Roboto", Font.BOLD, 20));
        button2.setBackground(new Color(0xB8E4FA));
        button2.setForeground(Color.black);
        button2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button2.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE111();
                setVisible(false);
                OOP o = new OOP();
                o.setVisible(true);
            }
        });

        JButton button3 = new JButton("Data Structure");
        button3.setBounds(280, 400, 450, 40);
        button3.setFont(new Font("Roboto", Font.BOLD, 20));
        button3.setBackground(new Color(0xB8E4FA));
        button3.setForeground(Color.black);
        button3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button3.setAlignmentY(JButton.CENTER_ALIGNMENT);

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE112();
                System.out.println("CSE 112");
            }
        });

        JButton button4 = new JButton("Algorithms");
        button4.setBounds(280, 450, 450, 40);
        button4.setFont(new Font("Roboto", Font.BOLD, 20));
        button4.setBackground(new Color(0xB8E4FA));
        button4.setForeground(Color.black);
        button4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button4.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE113();
                System.out.println("CSE 113");
            }
        });

        // JButton button5 = new JButton("CSE 114");
        // button5.setBounds(365, 500, 250, 40);
        // button5.setFont(new Font("Roboto", Font.BOLD, 20));
        // button5.setBackground(new Color(0xB8E4FA));
        // button5.setForeground(Color.black);
        // button5.setAlignmentX(JButton.CENTER_ALIGNMENT);
        // button5.setAlignmentY(JButton.CENTER_ALIGNMENT);
        // button5.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         // new CSE114();
        //         System.out.println("CSE 114");
        //     }
        // });

        JButton button6 = new JButton("Exit");
        button6.setBounds(365, 500, 250, 40);
        button6.setFont(new Font("Roboto", Font.BOLD, 20));
        button6.setBackground(new Color(0xB8E4FA));
        button6.setForeground(Color.black);
        button6.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button6.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        this.add(button6);
        this.add(button4);
        this.add(button3);
        this.add(button2);
        this.add(button1);
        this.add(text2);
        // this.add(text1);
        this.add(select);
        this.add(blurLabel);
        this.add(background);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SelectCourse s = new SelectCourse();
        s.setVisible(true);
    }
}
