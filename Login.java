import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;


public class Login extends JFrame {
    Person user;
    
    Login(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUB QuizHub");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        ImageIcon blur = new ImageIcon("./assets/Rectangle 2.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/background-7.png");
        ImageIcon image = new ImageIcon("./assets/login.png");
        ImageIcon logoImg = new ImageIcon("./assets/logo.png");

        JLabel background = new JLabel(BackgroundImg);
        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(660, 100, 210, 210);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(30, 80, 450, 620);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(500, 30, 450, 620);

        JLabel text1 = new JLabel("Sign In", JLabel.CENTER);
        text1.setFont(new Font("Roboto", Font.BOLD, 30));
        text1.setForeground(Color.white);
        text1.setBounds(625, 200, 200, 200);


        // Full Name
        RoundedJTextField textField1 = new RoundedJTextField(10);
        textField1.setBounds(600, 350, 250, 40);
        textField1.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField1.setBackground(new Color(0xB8E4FA));
        textField1.setForeground(Color.black);
        textField1.setText("Student ID");
        textField1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setHorizontalAlignment(RoundedJTextField.CENTER);

        // Student ID
        RoundedJTextField textField2 = new RoundedJTextField(10);
        textField2.setBounds(600, 400, 250, 40);
        textField2.setFont(new Font("Roboto", Font.PLAIN, 18));
        textField2.setBackground(new Color(0xB8E4FA));
        textField2.setForeground(Color.black);
        textField2.setText("Password");
        textField2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setHorizontalAlignment(RoundedJTextField.CENTER);

        

        JButton submit = new JButton("Sign In");
        submit.setBounds(650, 470, 150, 40);
        submit.setFont(new Font("Roboto", Font.BOLD, 25));
        // submit.setBackground(new Color(0xB8E4FA));
        submit.setBackground(new Color(0xB8E4FA));
        submit.setForeground(Color.black);
        submit.setFocusPainted(false);
        // submit.setBorder(new RoundedBorder(30));
        // submit.setBorderPainted(false);

        // Login Button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String tf1 = textField1.getText(); // User Name 
                String tf2 = textField2.getText(); // Password

                if (tf1.isEmpty() || tf2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String StdIdS = textField1.getText();
                        String PasswordS = textField2.getText();
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\UserData.txt"));
                    
                        String line;
                        boolean found = false;
                    
                        while ((line = reader.readLine()) != null) {
                            if (line.startsWith("Student ID : ") && line.substring(13).equals(StdIdS)) {
                                // Found matching student ID
                                // String studentId = line.substring(13);
                                String nextLine = reader.readLine(); // Read next line for password
                                if (nextLine.startsWith("Password : ") && nextLine.substring(11).equals(PasswordS)) {
                                    // // Password matches
                                    // String password = nextLine.substring(11);
                                    // String fullName = reader.readLine().substring(12); // Read next line for full name
                                    // String email = reader.readLine().substring(8); // Read next line for email
                                    // String department = reader.readLine().substring(13); // Read next line for department
                                    // user = new Person(fullName, studentId, email, password, department);
                                    found = true;
                                    break;
                                }
                            }
                        }
                        reader.close();
                    
                        if (found) {
                            JOptionPane.showMessageDialog(null, "Login Successful.", "Aiub QuizHub", JOptionPane.WARNING_MESSAGE);
                            setVisible(false);
                            // StudentID, email
                            // Person user = new Person(StudentID, email);
                            // SelectCourse frame = new SelectCourse(user);
                            SelectCourse frame = new SelectCourse();
                            frame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
                        }
                    
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    

                }

            }
        });

        // Register Button
        // submit.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae) {

        //         String tf1 = textField1.getText(); // Full Name
        //         String tf2 = textField2.getText(); // Student ID
        //         String tf3 = textField3.getText(); // Department
        //         String tf4 = textField4.getText(); // Password
        //         String tf5 = textField5.getText(); // Confirm Password
        //         String tf6 = textField6.getText(); // Captcha
        //         int result = 0;

        //         if (tf6.isEmpty()) {
        //             JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
        //                     JOptionPane.WARNING_MESSAGE);
        //         } else {
        //             result = Integer.parseInt(textField6.getText());
        //             if (tf1.isEmpty() || tf2.isEmpty() || tf3.isEmpty() || tf4.isEmpty()
        //                     || tf5.isEmpty() || tf6.isEmpty()) {
        //                 JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
        //                         JOptionPane.WARNING_MESSAGE);
        //             } else if (result != (a + b)) {
        //                 JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
        //             } else {

        //                 try {
        //                     File file = new File(".\\Data\\user_data.txt");
        //                     if (!file.exists()) {
        //                         file.createNewFile();
        //                     }
        //                     FileWriter fw = new FileWriter(file, true);
        //                     BufferedWriter bw = new BufferedWriter(fw);
        //                     PrintWriter pw = new PrintWriter(bw);

        //                     LocalDateTime myDateObj = LocalDateTime.now();
        //                     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

        //                     String timeAndDate = myDateObj.format(myFormatObj);

        //                     pw.println("Full Name : " + tf1);
        //                     pw.println("Student ID : " + tf2);
        //                     pw.println("Department : " + tf3);
        //                     pw.println("Email : " + tf4);
        //                     pw.println("Password : " + tf5);
        //                     pw.println("Time & Date : " + timeAndDate);
        //                     pw.println("===============================================");
        //                     pw.close();

        //                 } catch (Exception ex) {
        //                     System.out.print(ex);
        //                 }

        //                 JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
        //                         "Registration Complete", JOptionPane.WARNING_MESSAGE);
        //                 setVisible(false);
        //                 Welcome frame = new Welcome();
        //                 frame.setVisible(true);
        //             }
        //         }
        //     }
        // });

        this.add(logo);
        this.add(text1);
        this.add(textField1);
        this.add(textField2);
        this.add(submit);
        this.add(blurLabel);
        this.add(imageLabel);
        this.add(background);
    }

    public static void main(String[] args) {
        Login frame = new Login();
        frame.setVisible(true);
    }
}
