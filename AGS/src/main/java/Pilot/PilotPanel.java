package Pilot;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class PilotPanel extends JPanel {
    private JLabel username;
    private JButton backBtn;
    private JLabel userType;
    private JSeparator lineSeparator;
    private JButton addHealthRprtBtn;
    private JLabel countdownForExpiryLabel;
    private JLabel countdownLabel;

    public PilotPanel() {
        initComponents();
    }

    private void initComponents() {
        username = new JLabel();
        backBtn = new JButton();
        userType = new JLabel();
        lineSeparator = new JSeparator();
        addHealthRprtBtn = new JButton();
        countdownForExpiryLabel = new JLabel();
        countdownLabel = new JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 1, 18));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");
        username.setOpaque(true);

        backBtn.setText("<--");

        userType.setFont(new java.awt.Font("Segoe UI", 1, 18));
        userType.setText("Pilot");

        lineSeparator.setForeground(new java.awt.Color(0, 0, 0));

        addHealthRprtBtn.setBackground(new java.awt.Color(153, 255, 102));
        addHealthRprtBtn.setText("Add Health Report");

        countdownForExpiryLabel.setBackground(new java.awt.Color(102, 102, 255));
        countdownForExpiryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countdownForExpiryLabel.setText("Countdown for the expiry of the report:");
        countdownForExpiryLabel.setOpaque(true);

        countdownLabel.setText("time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(addHealthRprtBtn,
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(countdownForExpiryLabel,
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                        .addGap(57, 57, 57).addComponent(countdownLabel)))
                        .addContainerGap(147, Short.MAX_VALUE)));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18).addComponent(userType).addGap(41, 41, 41)
                        .addComponent(addHealthRprtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(countdownForExpiryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(135, Short.MAX_VALUE)));
    }
}