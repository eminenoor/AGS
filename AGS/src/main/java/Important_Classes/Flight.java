
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
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

    private PilotAccount pilot = new PilotAccount("ege", "pilot", 0, "blabla");
    private Plane plane = new Plane(000, true);

    private boolean isSafe = true;
    private boolean isFlying = false;

    private ClickablePanel panel;

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

        panel = new ClickablePanel(this);
        panel.setLayout(new GridLayout(1,5));

        

        JLabel departJLabel = new JLabel( departureLocation);
        departJLabel.setAlignmentX(20);
        JLabel arrivalJLabel = new JLabel( destination);
        arrivalJLabel.setAlignmentX(20);

        //animation for planess 
        //TODO
        FlightAnimation animation = new FlightAnimation(isFlying);

        JLabel isReady = new JLabel();
        if(isSafe)
        {
            isReady.setText("Flight is ready!");
        }else{
            isReady.setText("Flight is not ready!");
        }
        //Setting the timer
        //TODO
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

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PilotAccount getPilot() {
        return pilot;
    }

    public void setPilot(PilotAccount pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean isSafe) {
        this.isSafe = isSafe;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }
}
