
package GUI_elements.HomePage;

/**
 *
 * @author egeni
 */
public class testHomepage extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public testHomepage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        RoleButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        RoleButton.setText("Role");

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        InfoButton.setText("Info");
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });

        UserLabel.setText("Hosgeldin,");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RoleButton)
                .addGap(76, 76, 76)
                .addComponent(LogoutButton)
                .addGap(85, 85, 85)
                .addComponent(InfoButton)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoleButton)
                            .addComponent(LogoutButton)
                            .addComponent(InfoButton))
                        .addGap(23, 23, 23))
                    .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(488, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RoleButton;
    private javax.swing.JLabel UserLabel;
    // End of variables declaration                   
}
