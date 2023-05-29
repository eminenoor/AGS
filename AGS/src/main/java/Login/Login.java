package Login;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import swing.*;
public class Login extends JPanel {

    String url = "/Users/yeet/Desktop/AGS-master 2/SQLite Databse/UserInfo.db";
    Connection connection = null;
    String[] UserIDs = new String[10];
    String[] passwords = new String[10];

    private JTextField userIDTextField;
    private JPasswordField passwordTextArea;
    private JLabel userIDLabel;
    private JLabel passwLabel;
    private JLabel loginLabel;
    private JButton loginBtn;

    public Login() {
        initComponents();
    }

    public Connection connectToDB(){
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Connected to the");


        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public String[] getUserIDs(){
        int count = 0;
        String sql = "SELECT ID FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    UserIDs[count] = rs.getString("ID");
                    count++;
                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return UserIDs;

    }

    public String[] getPasswords(){
        int count = 0;
        String sql = "SELECT Password FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    passwords[count] = rs.getString("Password");
                    count++;
                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return passwords;

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