
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;




public class Flight {
    private String flightCode;

    private double departureTime = 0;
    private double arrivalTime = 0;

    private String departureLocation = "location A";
    private String destination = "location B";

    private PilotAccount pilot;
    private Plane plane;

    private boolean isSafe = true;
    private boolean isFlying = false;

    public Flight(String flightCode, double departureTime, double arrivalTime, String departureLocation,
            String destination, Plane plane) {

        this.flightCode = flightCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureLocation = departureLocation;
        this.destination = destination;
        this.plane = plane;

    }

    public Flight(){


    }

    public void checkFlight(){

        //pilots health

        //plane isalready

        //is time alright

        //wheather


        


    }
    // this method will give the summary of the flight as a jpanel.
    public ClickablePanel display(){

        ClickablePanel panel = new ClickablePanel();
        panel.setLayout(new GridLayout(1,5));
        

        JLabel departJLabel = new JLabel(departureLocation);
        JLabel arrivalJLabel = new JLabel(destination);

        //animation for planess 
        //TO DO
        JComponent animation = new JComponent() {
            
        };
        JLabel isReady = new JLabel();
        if(isSafe)
        {
            isReady.setText("Flight is ready!");
        }else{
            isReady.setText("Flight is not ready!");
        }
        //Setting the timer
        //TO DO
        JLabel timerJlabel = new JLabel("Time remaining\n" + "xxD xx H xx M");

        panel.add(departJLabel,0,0);
        panel.add(animation,0,1);
        panel.add(arrivalJLabel,0,2);
        panel.add(isReady,0,3);
        panel.add(timerJlabel,0,4);
        
        panel.setPreferredSize(new Dimension(1000,100));

        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        panel.setBorder(border);


        return panel;

    }
}
