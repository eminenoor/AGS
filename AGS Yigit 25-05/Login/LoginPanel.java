package Login;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class LoginPanel implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	String url = "jdbc:sqlite:C:/Users/User/Desktop/AGS-master/SQLite Databse/UserInfo.db";
	Connection conn = null;
	
	LoginPanel(String dbUrl){
		url = dbUrl;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {

			try {
				conn = DriverManager.getConnection(url);
				System.out.println("Connection to SQLite has been established.");

				String userID = userIDField.getText();
				String password = String.valueOf(userPasswordField.getPassword());
				String sql = "SELECT * FROM Users WHERE ID = ? AND Password = ?";

				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, userID);
				stmt.setString(2, password);

				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("Login successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				} else {
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("Wrong username or password");
				}

			} catch (SQLException s) {
				System.out.println(s.getMessage());
			} finally {
				try {
					if (conn != null) {
						conn.close();
						System.out.println("Connection closed.");
					}
				} catch (SQLException s) {
					System.out.println(s.getMessage());
				}
			}

			/*

			}*/
		}
	}	
}
