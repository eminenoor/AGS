package Login;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import swing.*;
public class Login extends JPanel {

    private JTextField userIDTextField;
    private JPasswordField passwordTextArea;
    private JLabel userIDLabel;
    private JLabel passwLabel;
    private JLabel loginLabel;
    private JButton loginBtn;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null);

        loginLabel = new JLabel("AGS Login");
        loginLabel.setFont(new java.awt.Font("SansSerif", 1, 36));
        loginLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setBounds(0, 50, 320, 50);
        add(loginLabel);

        userIDLabel = new JLabel("UserID");
        userIDLabel.setBounds(50, 130, 60, 24);
        add(userIDLabel);

        userIDTextField = new JTextField();
        userIDTextField.setBounds(50, 160, 220, 24);
        add(userIDTextField);

        passwLabel = new JLabel("Password");
        passwLabel.setBounds(50, 200, 70, 24);
        add(passwLabel);

        passwordTextArea = new JPasswordField();
        passwordTextArea.setBounds(50, 230, 220, 24);
        add(passwordTextArea);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(50, 280, 220, 30);
        add(loginBtn);
    }

    public void addHomepageListener(ActionListener event) {
        loginBtn.addActionListener(event);
    }
}