package Login;

import java.awt.Toolkit;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Login login = new Login();
        slide.init(login);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        myPanelBorder1 = new swing.MyPanelBorder();
        slide = new swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(178, 208, 249));
        panelGradiente1.setColorSecundario(new java.awt.Color(19, 46, 66));

        myPanelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        myPanelBorder1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout myPanelBorder1Layout = new javax.swing.GroupLayout(myPanelBorder1);
        myPanelBorder1.setLayout(myPanelBorder1Layout);
        myPanelBorder1Layout.setHorizontalGroup(
            myPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBorder1Layout.setVerticalGroup(
            myPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGradiente1.setLayer(myPanelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(myPanelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(myPanelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    private swing.MyPanelBorder myPanelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;
}