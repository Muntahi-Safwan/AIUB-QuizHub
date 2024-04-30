import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame{

    // private Jlabel label;

    Welcome () {

        Font font = new Font("Fredoka One", Font.BOLD, 30);

        ImageIcon logoImg = new ImageIcon("./assets/logo.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/welcome1.png");

        JLabel background = new JLabel(BackgroundImg);

        // JLabel logo = new JLabel();
        // logo.setIcon(logoImg);
        // logo.setBounds(450, 50, 210, 210);

        JLabel txt1 = new JLabel("Welcome to");
        txt1.setFont(new Font("Fredoka One", Font.BOLD, 35));
        txt1.setForeground(Color.white);
        txt1.setVerticalTextPosition(JLabel.CENTER);
        txt1.setHorizontalTextPosition(JLabel.CENTER);
        txt1.setBounds(390, 118, 336, 56);


        JLabel txt2 = new JLabel("UniQuiz");
        txt2.setFont(new Font("Fredoka One", Font.BOLD, 70));
        txt2.setForeground(Color.white);
        txt2.setVerticalTextPosition(JLabel.CENTER);
        txt2.setHorizontalTextPosition(JLabel.CENTER);
        txt2.setBounds(364, 185, 336, 56);

        JButton loginbtn = new JButton("Sign In");
        loginbtn.setBounds(130, 283, 226, 50);
        loginbtn.setFont(new Font("Roboto", Font.BOLD, 30));
        // loginbtn.setBackground(new Color(0xB8E4FA));
        loginbtn.setBackground(new Color(0xB8E4FA));
        loginbtn.setForeground(Color.black);
        loginbtn.setFocusPainted(false);

        JButton registerbtn = new JButton("Sign Up");
        registerbtn.setBounds(400, 283, 226, 50);
        registerbtn.setFont(new Font("Roboto", Font.BOLD, 30));
        // registerbtn.setBackground(new Color(0xB8E4FA));
        registerbtn.setBackground(new Color(0xB8E4FA));
        registerbtn.setForeground(Color.black);
        registerbtn.setFocusPainted(false);

        JButton teambtn = new JButton("Team");
        teambtn.setBounds(670, 283, 226, 50);
        teambtn.setFont(new Font("Roboto", Font.BOLD, 30));
        // teambtn.setBackground(new Color(0xB8E4FA));
        teambtn.setBackground(new Color(0xB8E4FA));
        teambtn.setForeground(Color.black);
        teambtn.setFocusPainted(false);

        // JButton exitbtn = new JButton("Exit");
        // exitbtn.setBounds(550, 350, 140, 40);
        // exitbtn.setFont(new Font("Roboto", Font.BOLD, 25));
        // // exitbtn.setBackground(new Color(0xB8E4FA));
        // exitbtn.setBackground(new Color(0xB8E4FA));
        // exitbtn.setForeground(Color.black);
        // exitbtn.setFocusPainted(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/rounde-icon-logo.png");
        this.setIconImage(img.getImage());

        // this.add(exitbtn);
        this.add(teambtn);
        this.add(registerbtn);
        this.add(loginbtn);
        this.add(txt2);
        this.add(txt1);
        this.add(background);
        
        this.setVisible(true);

        

        // Sign In Button
       loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {

             setVisible(false);
              Login frame = new Login();
             frame.setVisible(true);
         }
      });

        // Sign Up Button
        registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });

        // Exit Button
        // exitbtn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         System.exit(0);
        //     }
        // });
    }

    public static void main(String[] args) {
        // JFrame frame = new JFrame("AIUB QuizHub");
        // frame.setSize(850, 650);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.getContentPane().setBackground(Color.DARK_GRAY);
        // frame.setVisible(true);

        // ImageIcon img = new ImageIcon("./assets/icon.png");
        // frame.setIconImage(img.getImage());

        Welcome frame = new Welcome();
    }
}