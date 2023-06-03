package Main;

import Login.*;
import Admin.*;
import GUI_elements.HomePage.HomePanel;
import GUI_elements.TypePanels.FlightsPanel;
import Pilot.*;
import Maintenance.*;
import Profile.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Accounts.Account;

public class Main extends javax.swing.JFrame {

    private Account user = new Account("Ege", "Ateş", "0", 111, "!!!");
    AdminPanel adminPanel;
    AddFlightPage addFlightPage;
    DeleteFlightPage deleteFlight;
    ManageFlightsPage manageFlightsPage;
    PilotPanel pilotPanel;
    MaintenancePanel maintenancePanel;
    AboutUs aboutUs;
    Feedback feedback;
    ProfilePanel profilePanel;
    FlightsPanel ShowFlights;
    HomePanel homepage;
    Login login;

    public Main() {
        initComponents();

        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        login = new Login();

        login.getPasswords();
        login.getUserIDs();
        login.getNames();
        login.getSurNames();
        login.getRoles();
        
        adminPanel = new AdminPanel(user);
        addFlightPage = new AddFlightPage();
        deleteFlight = new DeleteFlightPage();
        manageFlightsPage = new ManageFlightsPage();
        pilotPanel = new PilotPanel(user);
        maintenancePanel = new MaintenancePanel(user);
        aboutUs = new AboutUs();
        feedback = new Feedback();
        profilePanel = new ProfilePanel();

        ShowFlights = new FlightsPanel();

        homepage = new HomePanel(user);


        
        slide.setAnimate(20);
        slide.init(login, homepage , adminPanel, addFlightPage, deleteFlight, manageFlightsPage, pilotPanel,
                maintenancePanel,aboutUs, feedback , profilePanel , ShowFlights);


        //Implementing listeners for login
        login.addHomepageListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println("Clicked");
                if(login.Autentication(login.getUserIDTextField().getText(), new String(login.getPasswordTextArea().getPassword())))
                {

                    int indexNo = login.getPasswords().indexOf(new String(login.getPasswordTextArea().getPassword()));
                    System.out.println(indexNo);
                    
                    System.out.println("Login complete");
                    user = new Account(login.getNames().get(indexNo), login.getSurNames().get(indexNo),
                    login.getRoles().get(indexNo), Integer.parseInt(login.getUserIDs().get(indexNo)), 
                    login.getPasswords().get(indexNo));
                    //TODO construct homepage
    
                
                    

                    slide.show(1);
                }

        }
        });
        //Implementing listeners for Home Panel
        homepage.RoleListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                int type =  Integer.parseInt(user.getRole());

        if(type == 0)
        {
            slide.show(2);
        }
        if(type==1)
        {
            slide.show(6);
            //RolePanel = new PilotPanel(user);
        }
        if(type == 2)
        {
            slide.show(7);
          //  RolePanel = new MaintenancePanel();
        }

        }
    
        });


        
        homepage.LogoutListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
        }
    
        });


        homepage.FlightListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(11);

                
        }
      
    
        });



        homepage.InfoListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(10);
        }
    
        });



        //Implementing listeners for Admin Panel
        adminPanel.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(1);
        }
    
        });

        adminPanel.manageFlBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(5);
        }
    
        });



        //Implementing listeners for addFlightPage
        addFlightPage.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(5);
        }
        });

        //Implementing listeners for delete Flight
        deleteFlight.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(5);
        }
        }

        );
        //Implementing listeners for ManageFLight page
        manageFlightsPage.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(2);
        }
        }
        );
        manageFlightsPage.addFlightBtnActionPerformed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(3);
        }
        });
        manageFlightsPage.deleteFlightBtnActionPerformed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(4);
        }
        });
        //Implementing listeners for PilotPanel
        pilotPanel.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(1);
        }
        });
        //Implementing listeners for Maintenance Panel
        maintenancePanel.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(1);
        }
        });
        //Implementing listeners for Profile Panel 
        profilePanel.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(1);
        }
        });
        profilePanel.aboutUsBtnActionPerformed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(8);
        }
        });
        profilePanel.feedbackBtnActionPerformed(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(9);
        }
        });
        profilePanel.QuitBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                slide.show(0);
        }
        });





        //Implementing listeners for About Us
        aboutUs.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(10);
        }
        });

        //Implementing listeners for feedback
        feedback.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(10);
        }
        });

        //Implementing listeners for Flights panel
        ShowFlights.goBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                slide.show(1);
        }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        slide = new swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(178, 208, 249));
        panelGradiente1.setColorSecundario(new java.awt.Color(19, 46, 66));

        slide.setOpaque(false);

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
                slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 659, Short.MAX_VALUE));
        slideLayout.setVerticalGroup(
                slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 467, Short.MAX_VALUE));

        panelGradiente1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
                panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout
                                .createSequentialGroup()
                                .addContainerGap(120, Short.MAX_VALUE)
                                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(120, Short.MAX_VALUE)));
        panelGradiente1Layout.setVerticalGroup(
                panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelGradiente1Layout.createSequentialGroup()
                                .addContainerGap(70, Short.MAX_VALUE)
                                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
