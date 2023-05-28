import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Homepage extends JFrame {

    Account user;

    JPanel rolePanel;


    public Homepage(Account user){

        this.user = user;
        CreateInitials();

    }
    
    public void CreateInitials(){

        this.setTitle("AGS");
        this.setSize(2400, 1900);
        this.setLayout(new BorderLayout());
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        //Determines which type of role panels are going to be used
        int type = Integer.parseInt(user.getRole());

        if(type == 0)
        {
            rolePanel = new AdminPanel();
        }
        if(type == 1)
        {
            rolePanel = new PilotPanel((PilotAccount)user);
        }
        if(type == 2)
        {
            rolePanel = new MaintenancePanel();
        }



        //TODO timer panel 
        
        //TODO info menu

        //TODO logout button

        JPanel northPanel = new JPanel();
        northPanel.add(rolePanel);
        //add other panels

        this.add(northPanel, BorderLayout.NORTH);

        FlightsPanel flights = new FlightsPanel();

        this.add(flights, BorderLayout.CENTER);

        this.pack();

    }

}
