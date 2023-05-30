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
import java.util.ArrayList;

import swing.*;
public class Login extends JPanel {

    //TODO
    String url = "jdbc:sqlite:/Users/yeet/Desktop/AGS-master 3/SQLite Databse/UserInfo.db";
    Connection connection = null;
    public static ArrayList<String> UserIDs = new ArrayList<String>();
    public static ArrayList<String> passwords = new ArrayList<String>();
    public static ArrayList<String> roles = new ArrayList<String>();


    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> surnames = new ArrayList<String>();

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
            System.out.println("Connected to the DB");


        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public ArrayList<String> getUserIDs(){

        String sql = "SELECT ID FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    UserIDs.add(rs.getString("ID"));
                   
                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return UserIDs;

    }

    public ArrayList<String> getPasswords(){

        String sql = "SELECT Password FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    passwords.add(rs.getString("Password"));

                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return passwords;

    }

    public ArrayList<String> getNames(){

        String sql = "SELECT Name FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    names.add(rs.getString("Name"));

                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return names;

    }

    public ArrayList<String> getSurNames(){

        String sql = "SELECT Surname FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    surnames.add(rs.getString("Surname"));

                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return surnames;

    }

    public ArrayList<String> getRoles(){

        String sql = "SELECT Role FROM Users";
        try (Connection connection = this.connectToDB()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                while(rs.next()){

                    roles.add(rs.getString("Role"));

                }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return roles;

    }



    

    public boolean Autentication(String ID, String password){
 
        
        if(UserIDs.contains(ID))
        {
            System.out.println("Geldin mi 2.");
            System.out.println(UserIDs.indexOf(ID));
            System.out.println(passwords.indexOf(password));
            System.out.println(passwords.toString());
            if(UserIDs.indexOf(ID) == passwords.indexOf(password)){
                System.out.println("Geldin dimi buraya bitti");
                return true;
            }

        }
        return false;
        
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

    public JTextField getUserIDTextField() {
        return userIDTextField;
    }

    public void setUserIDTextField(JTextField userIDTextField) {
        this.userIDTextField = userIDTextField;
    }

    public JPasswordField getPasswordTextArea() {
        return passwordTextArea;
    }

    public void setPasswordTextArea(JPasswordField passwordTextArea) {
        this.passwordTextArea = passwordTextArea;
    }
}