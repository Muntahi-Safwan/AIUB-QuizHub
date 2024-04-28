import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Registration extends JFrame {
    
    Registration(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUB QuizHub");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        ImageIcon blur = new ImageIcon("./assets/Rectangle 2.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/background-3.png");
        ImageIcon image = new ImageIcon("./assets/register-2.png");
        ImageIcon logoImg = new ImageIcon("./assets/logo.png");

        JLabel background = new JLabel(BackgroundImg);
        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(195, 30, 210, 210);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(500, 80, 450, 620);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(40, 30, 450, 620);

        JLabel text1 = new JLabel("Sign Up", JLabel.CENTER);
        text1.setFont(new Font("Roboto", Font.BOLD, 30));
        text1.setForeground(Color.white);
        text1.setBounds(160, 140, 200, 200);


        // Student ID
        RoundedJTextField textField1 = new RoundedJTextField(10);
        textField1.setBounds(135, 280, 250, 40);
        textField1.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField1.setBackground(new Color(0xB8E4FA));
        textField1.setForeground(Color.black);
        textField1.setText("Student ID");
        textField1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setHorizontalAlignment(RoundedJTextField.CENTER);

        // Password
        RoundedJTextField textField2 = new RoundedJTextField(10);
        textField2.setBounds(135, 330, 250, 40);
        textField2.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField2.setBackground(new Color(0xB8E4FA));
        textField2.setForeground(Color.black);
        textField2.setText("Password");
        textField2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Full Name
        RoundedJTextField textField3 = new RoundedJTextField(10);
        textField3.setBounds(135, 380, 250, 40);
        textField3.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField3.setBackground(new Color(0xB8E4FA));
        textField3.setForeground(Color.black);
        textField3.setText("Full Name");
        textField3.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Email
        RoundedJTextField textField4 = new RoundedJTextField(10);
        textField4.setBounds(135, 430, 250, 40);
        textField4.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField4.setBackground(new Color(0xB8E4FA));
        textField4.setForeground(Color.black);
        textField4.setText("Email");
        textField4.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Department
        RoundedJTextField textField5 = new RoundedJTextField(10);
        textField5.setBounds(135, 480, 250, 40);
        textField5.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField5.setBackground(new Color(0xB8E4FA));
        textField5.setForeground(Color.black);
        textField5.setText("Department");
        textField5.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setHorizontalAlignment(RoundedJTextField.CENTER);

        JLabel captchaTxt = new JLabel("Captcha");
        captchaTxt.setBounds(135, 530, 100, 40);
        captchaTxt.setFont(new Font("Roboto", Font.PLAIN, 18));
        captchaTxt.setForeground(Color.black);

        // To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);


        RoundedJTextField textField6 = new RoundedJTextField(10);
        textField6.setBounds(215, 530, 165, 40);
        textField6.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField6.setBackground(new Color(0xB8E4FA));
        textField6.setForeground(Color.black);
        textField6.setText(" " + a + " + " + b );
        textField6.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField6.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField6.setHorizontalAlignment(RoundedJTextField.CENTER);

        JButton submit = new JButton("Sign Up");
        submit.setBounds(195, 590, 150, 40);
        submit.setFont(new Font("Roboto", Font.BOLD, 25));
        // submit.setBackground(new Color(0xB8E4FA));
        submit.setBackground(new Color(0xB8E4FA));
        submit.setForeground(Color.black);
        submit.setFocusPainted(false);
        // submit.setBorder(new RoundedBorder(30));
        // submit.setBorderPainted(false);

        // Register Button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String tf1 = textField1.getText(); // Student ID
                String tf2 = textField2.getText(); // Password
                String tf3 = textField3.getText(); // Full Name
                String tf4 = textField4.getText(); // Email
                String tf5 = textField5.getText(); // Department
                String tf6 = textField6.getText(); // Captcha
                int result = 0;

                if (tf6.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(textField6.getText());
                    if (tf1.isEmpty() || tf2.isEmpty() || tf3.isEmpty() || tf4.isEmpty()
                            || tf5.isEmpty() || tf6.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File(".\\Data\\UserData.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("Student ID : " + tf1);
                            pw.println("Password : " + tf2);
                            pw.println("Full Name : " + tf3);
                            pw.println("Email : " + tf4);
                            pw.println("Department : " + tf5);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Welcome frame = new Welcome();
                        frame.setVisible(true);
                    }
                }
            }
        });

        this.add(logo);
        this.add(text1);
        this.add(textField1);
        this.add(textField2);
        this.add(textField3);
        this.add(textField4);
        this.add(textField5);
        this.add(captchaTxt);
        this.add(textField6);
        this.add(submit);
        this.add(blurLabel);
        this.add(imageLabel);
        this.add(background);

    }

    public static void main(String[] args) {
        Registration frame = new Registration();
        frame.setVisible(true);
    }
}
