package Maintenance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Driver;

import Accounts.Account;
import GUI_elements.TypePanels.FlightsPanel;

public class MaintenancePanel extends JPanel {
    static String  url = "jdbc:sqlite:C:/Users/egeni/OneDrive/Desktop/MINE/AGS-master 3/SQLite Databse/Planes.db";
    private JButton backBtn;
    private JButton enterBtn;
    private JLabel enterLabel;
    private JTextField flightTextFieldArea;
    private JSeparator lineSeparator;
    private JCheckBox noCheckBox;
    private JLabel readyLabel;
    private JLabel userType;
    private JLabel username;
    private JCheckBox yesCheckBox;
    private Account user;

    public MaintenancePanel(Account user) {
        this.user = user;
        initComponents();
    }

    private void initComponents() {
        username = new JLabel();
        backBtn = new JButton();
        userType = new JLabel();
        lineSeparator = new JSeparator();
        flightTextFieldArea = new JTextField();
        enterLabel = new JLabel();
        enterBtn = new JButton();
        readyLabel = new JLabel();
        yesCheckBox = new JCheckBox();
        noCheckBox = new JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 1, 18));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText(user.getName() + " " + user.getSurname());
        username.setOpaque(true);

        backBtn.setText("<--");

        userType.setFont(new java.awt.Font("Segoe UI", 1, 18));
        userType.setText("Maintenance Menu");

        lineSeparator.setForeground(new java.awt.Color(0, 0, 0));

        enterLabel.setBackground(new java.awt.Color(102, 102, 255));
        enterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterLabel.setText("Enter the flight number:");
        enterLabel.setOpaque(true);

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new updateListener());

        readyLabel.setBackground(new java.awt.Color(102, 102, 255));
        readyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readyLabel.setText("Is the plane ready:");
        readyLabel.setOpaque(true);

        yesCheckBox.setText("Yes");

        noCheckBox.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flightTextFieldArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(readyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noCheckBox))
                            .addComponent(enterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(userType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(enterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesCheckBox)
                    .addComponent(noCheckBox))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }

    public void goBackBtnListener(ActionListener event) {
        backBtn.addActionListener(event);
    }

    public static Connection ConnectToPlanesDB(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to planes DB (M)");
        } catch (SQLException e) {
            // TODO: handle exception
            e.getStackTrace();
        }
        return conn;
    }

    class updateListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {

            String temp = "False";
            if(yesCheckBox.isSelected())
            {
                temp = "True";
            }
            if(noCheckBox.isSelected())
            {
                temp= "False";
            }
            
            MaintenancePanel.updatePlaneStatus(flightTextFieldArea.getText(), temp);
            JOptionPane.showMessageDialog(null, "Plane Status Updated!");
            
        }

    }

//Updates the isReady for each plane with the given value 
    public static void updatePlaneStatus(String planeID, String isReady){
        int index = FlightsPanel.getIndexFromPlaneID(planeID);
        String sql = "UPDATE Planes SET isReady = ? WHERE ID = ?";
        try (Connection conn = ConnectToPlanesDB())
        {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, isReady);
            statement.setString(2, planeID);

            statement.executeUpdate();
            FlightsPanel.loadPlanesOntoList();
            
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
