

import java.awt.GridLayout;

import javax.swing.JPanel;
/*
 * This panel will be on the bottom of the main menu
 * it will display all flights in order
 * 
 * 
 */
public class FlightsPanel extends JPanel {
    

    public Flight[] flights;

    public FlightsPanel(){

        //TODO 
        flights = new Flight[3];
        flights[0] = new Flight();
        flights[1] = new Flight();
        flights[2] = new Flight();


        this.setLayout(new GridLayout(flights.length,0));
        for(int i = 0 ; i < flights.length; i++)
        {

            this.add(flights[i].display(),i,0);
        }



    }
}
