import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class HomePanel2 extends JPanel {
    Account user;




    /**
     * Creates new form HomePanel
     */
    public HomePanel2(Account user) {
        this.user = user;
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

        this.setSize(1000,1000);
        this.setLayout(new BorderLayout());


        int type = Integer.parseInt(user.getRole());

        if(type == 0)
        {
            RolePanel = new AdminPanel();
        }
        if(type == 1)
        {
            RolePanel = new PilotPanel(new PilotAccount(user));
        }
        if(type == 2)
        {
            RolePanel = new MaintenancePanel();
        }

        //TODO time panel

        timePanel = new timerPanel();
        logoutButton = new javax.swing.JButton();
        logoutButton.setText("Logout");

        infoButton = new javax.swing.JButton();
        infoButton.setText("Info");

        jPanel2 = new FlightsPanel();
        this.add(jPanel2, BorderLayout.CENTER);


        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 2, 20, 20));

        northPanel.add(RolePanel,0,0);

        JPanel leftTopPanel = new JPanel();
        leftTopPanel.setLayout(new GridLayout(2, 1, 20, 20));

        leftTopPanel.add(infoButton,1,0);
        leftTopPanel.add(logoutButton,1,0);
        leftTopPanel.add(timePanel,0,0);

        northPanel.add(leftTopPanel,0,1);







        this.add(northPanel,BorderLayout.NORTH);
    



    
    }                       


    // Variables declaration - do not modify                     
    private javax.swing.JPanel RolePanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton infoButton;

    private javax.swing.JPanel timePanel;
    private JPanel jPanel2;


}