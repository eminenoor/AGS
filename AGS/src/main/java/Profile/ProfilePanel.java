package Profile;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel {
    private JButton backBtn;
    private JLabel jLabel1;
    private JButton aboutUsBtn;
    private JButton feedbackBtn;
    private JLabel usernameLabel;
    private JLabel userTypeLabel;

    private JButton logoutBtn;

    public ProfilePanel() {
        initComponents();
    }

    private void initComponents() {
        backBtn = new JButton();
        jLabel1 = new JLabel();
        aboutUsBtn = new JButton();
        feedbackBtn = new JButton();
        usernameLabel = new JLabel();
        userTypeLabel = new JLabel();
        backBtn = new JButton();
        logoutBtn = new JButton();

        backBtn.setText("<--");

        setBackground(new java.awt.Color(255, 255, 255));

        
        File img = new File("AGS/src/main/java/Profile/profile.jpg");
        BufferedImage imge;


        if (img.canRead()) {
            try {
                imge = ImageIO.read(new File("AGS/src/main/java/Profile/profile.jpg"));
                
                


                ImageIcon icon = new ImageIcon(imge);
                jLabel1.setIcon(icon);
                
            }

            catch (IOException ex) {
                System.err.println(ex.getMessage());
                ex.printStackTrace();

            }

    }
        //getClass().getResource("/Profile/profile .jpg")
        //jLabel1.setIcon(new javax.swing.ImageIcon());

        aboutUsBtn.setText("About Us");


        feedbackBtn.setText("Feedback");


        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Kerem Topuz");

        userTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userTypeLabel.setText("Pilot");

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setText("<--");

        logoutBtn.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(usernameLabel)
                .addGap(33, 33, 33)
                .addComponent(userTypeLabel)
                .addGap(18, 18, 18)
                .addComponent(aboutUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(feedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(logoutBtn)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }

    public void aboutUsBtnActionPerformed(ActionListener event) {
       
        aboutUsBtn.addActionListener(event);
    }

    public void feedbackBtnActionPerformed(ActionListener event) {
        
        feedbackBtn.addActionListener(event);
    }

    public void goBackBtnListener(ActionListener event) {
        backBtn.addActionListener(event);
    }

    public void QuitBtnListener(ActionListener event){
        logoutBtn.addActionListener(event);
    }


}