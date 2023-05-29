package Profile;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutUs extends JPanel {
    private JLabel aboutUs;
    private JLabel creatorsLabel;
    private JLabel emineLabel;
    private JLabel egeLabel;
    private JLabel yigitLabel;
    private JButton backBtn;

    public AboutUs() {
        initComponents();
    }

    private void initComponents() {
        aboutUs = new JLabel();
        creatorsLabel = new JLabel();
        emineLabel = new JLabel();
        egeLabel = new JLabel();
        yigitLabel = new JLabel();
        backBtn = new JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        aboutUs.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24));
        aboutUs.setText("About Us");
        aboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creatorsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        creatorsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creatorsLabel.setText("Creators");

        emineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emineLabel.setText("Emine Noor");

        egeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        egeLabel.setText("Ege Ateş");

        yigitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yigitLabel.setText("Yiğit Ali Doğan");

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setText("<--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(aboutUs, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(100, 100, 100))
                .addComponent(yigitLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(egeLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addComponent(creatorsLabel,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE).addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(aboutUs))
                        .addGroup(layout.createSequentialGroup().addGap(25, 25, 25)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creatorsLabel).addGap(18, 18, 18).addComponent(emineLabel)
                        .addGap(18, 18, 18).addComponent(egeLabel).addGap(18, 18, 18).addComponent(yigitLabel)
                        .addContainerGap(80, Short.MAX_VALUE)));
    }
}