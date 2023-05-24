

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
        

        for(int i = 0 ; i < flights.length; i++)
        {

            this.add(flights[i].display());
        }



    }
}
