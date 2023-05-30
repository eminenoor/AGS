package Accounts;


import javax.swing.JPanel;

public class Account {
    private String name = "!!!";
    private String role = "1";
    private int UserID = 0;
    private String password = "!!!";

    private JPanel rolePanel;

  
    public Account(String name, String role, int userID, String password) {
        this.name = name;
        this.role = role;
        UserID = userID;
        this.password = password;

    }
    public Account(){


    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public JPanel getRolePanel() {
        return rolePanel;
    }


    public void setRolePanel(JPanel rolePanel) {
        this.rolePanel = rolePanel;
    }


}
