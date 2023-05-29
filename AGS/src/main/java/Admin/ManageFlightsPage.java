package Admin;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManageFlightsPage extends JPanel {
    private JLabel username;
    private JLabel backicon;
    private JLabel backicon1;
    private JLabel addNewLabel;
    private JScrollPane jScrollPane1;
    private JTable manageFlightsTable;

    public ManageFlightsPage() {
        initComponents();
    }

    private void initComponents() {
        username = new JLabel();
        backicon = new JLabel();
        backicon1 = new JLabel();
        addNewLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        manageFlightsTable = new JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        username.setBackground(new java.awt.Color(153, 255, 102));
        username.setFont(new java.awt.Font("Segoe UI", 1, 18));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Manage Flights");
        username.setOpaque(true);

        backicon.setText("backicon");

        backicon1.setText("addicon");

        addNewLabel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        addNewLabel.setText("Add new flight");

        manageFlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight", "Date", "Time", "Pilot", "Plane ID", "Plane Readiness"
            }
        ));
        jScrollPane1.setViewportView(manageFlightsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap(65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backicon)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36).addComponent(backicon1).addGap(28, 28, 28)
                                        .addComponent(addNewLabel)))
                        .addContainerGap(85, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(backicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addNewLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(167, Short.MAX_VALUE)));
    }
}
