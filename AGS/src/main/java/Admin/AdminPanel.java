package Admin;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import Accounts.Account;

public class AdminPanel extends JPanel {
    private JLabel username;
    private JLabel userType;
    private JSeparator lineSeparator;
    private JButton manageFlightsBtn;
    private JButton backBtn;
    private Account user;

    public AdminPanel(Account user) {
        this.user = user;
        initComponents();
        
    }

    private void initComponents() {
        username = new JLabel();
        userType = new JLabel();
        manageFlightsBtn = new JButton();
        backBtn = new JButton();
    
        setBackground(new java.awt.Color(204, 204, 204));
    
        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 1, 18));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText(user.getName() + " " + user.getSurname());
        username.setOpaque(true);
    
        userType.setFont(new java.awt.Font("Segoe UI", 1, 18));
        userType.setText("Admin");
    
        manageFlightsBtn.setBackground(new java.awt.Color(102, 102, 255));
        manageFlightsBtn.setText("Manage Flights");
    
        backBtn.setText("<--");
    
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Handle back button click event
            }
        });
    
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(manageFlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userType))
                    .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(userType)
                    .addGap(51, 51, 51)
                    .addComponent(manageFlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE))
        );
    }
    public void goBackBtnListener(ActionListener event) {
        backBtn.addActionListener(event);
    }
}
