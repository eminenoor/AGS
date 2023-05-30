package Important_Classes;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;


import GUI_elements.TypePanels.ClickablePanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Driver;




public class Flight {
    private Connection connection = null; 
    static String url = "jdbc:sqlite:C:/Users/egeni/OneDrive/Desktop/MINE/AGS/SQLite Databse/FlightInfo.db";

    private String ID;

    private String departureTime;
    private String ETA;

    private String departure;
    private String destination;


    private String planeID;

    private String isSafe;
    private String isFlying;
    private String pilotName;

    private ClickablePanel panel;

    public Flight(String ID, String departure, String destination, String planeID,
            String departureTime, String ETA, String pilotName, String isSafe, String isFlying) {

        this.ID = ID;
        this.departureTime = departureTime;
        this.ETA = ETA;
        this.departure = departure;
        this.destination = destination;
        this.planeID = planeID;
        this.isSafe = isSafe;
        this.isFlying = isFlying;


    }

    public Connection connect(){

        try {
             connection = DriverManager.getConnection(url);
             System.out.println("Connected to the DB");
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }



    public void checkFlight(){


        //pilots health

        //plane isalready

        

        //weather


        


    }
    //Adds a new Flight to the database with the given parameters 
    //Also creates a flight with the given parameters 

    public Flight addFlight(String ID, String Departure, 
    String Destination, String PlaneID, 
    String DepartureTime, String ETA, 
    String PilotName, String isSafe, String isFlying){

    String sql ="INSERT INTO FlightInfo(ID,Departure,Destination,PlaneID,DepartureTime,ETA,PilotName,isSafe,isFlying) VALUES(?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = this.connect()){
            
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, ID);
            statement.setString(2, Departure);
            statement.setString(3, Destination);
            statement.setString(4, PlaneID);
            statement.setString(5, DepartureTime);
            statement.setString(6, ETA);
            statement.setString(7, PilotName);
            statement.setString(8, isSafe);
            statement.setString(9, isFlying);
            statement.executeUpdate();


        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        Flight tempFlight = new Flight(ID, Departure, Destination, PlaneID, DepartureTime, ETA, PilotName, isSafe, isFlying);
        return tempFlight;

    }
    //Removes the flight with the given ID from the database 
    public void removeFlight(String ID){
        String sql = "DELETE FROM FlightInfo WHERE ID = ?";
        try (Connection conn = this.connect()){

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, ID);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            // TODO: handle exception
            e.getStackTrace();
        }
    }
    //Updates isSafe string of the flight with the given ID 
    public void updateIsSafe(String ID, String isSafe){
        String sql = "UPDATE FlightInfo SET isSafe = ? WHERE ID = ?";
        try (Connection conn = this.connect()){
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, isSafe);
            statement.setString(2, ID);

            statement.executeUpdate();


            
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        this.isSafe = isSafe;
    }

    public void updateIsFlying(String ID, String isFlying){
        String sql = "UPDATE FlightInfo SET isFlying = ? WHERE ID = ?";
        try (Connection conn = this.connect()){
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, isFlying);
            statement.setString(2, ID);

            statement.executeUpdate();


            
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void updatePilot(String ID, String pilotName){
        String sql = "UPDATE FlightInfo SET PilotName = ? WHERE ID = ?";
        try (Connection conn = this.connect()){
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, pilotName);
            statement.setString(2, ID);

            statement.executeUpdate();


            
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    // this method will give the summary of the flight as a jpanel.
    public ClickablePanel display(){

        panel = new ClickablePanel(this);
        panel.setLayout(new GridLayout(1,5));

        

        JLabel departJLabel = new JLabel( departure);
        departJLabel.setAlignmentX(20);
        JLabel arrivalJLabel = new JLabel( destination);
        arrivalJLabel.setAlignmentX(20);

        //animation for planess 
        //TODO
        FlightAnimation animation = new FlightAnimation(isFlying.equals("True"));

        JLabel isReady = new JLabel();
        if(isFlying.equals("True"))
        {
            if(isSafe.equals("True"))
            {
                isReady.setText("Flight is ready!");
            }else{
                isReady.setText("Flight is not ready!");
            }
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
        return ID;
    }

    public void setFlightCode(String flightCode) {
        this.ID = flightCode;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return ETA;
    }

    public void setArrivalTime(String arrivalTime) {
        this.ETA = arrivalTime;
    }

    public String getDepartureLocation() {
        return departure;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departure = departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilot(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getPlaneID() {
        return planeID;
    }

    public void setPlane(String planeID) {
        this.planeID = planeID;
    }

    public String isSafe() {
        return isSafe;
    }

    public void setSafe(String isSafe) {
        this.isSafe = isSafe;
    }

    public String isFlying() {
        return isFlying;
    }

    public void setFlying(String isFlying) {
        this.isFlying = isFlying;
    }
}
