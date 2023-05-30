package GUI_elements.TypePanels;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Driver;



import javax.swing.JPanel;

import Important_Classes.Flight;
import Important_Classes.Plane;
/*
 * This panel will be on the bottom of the main menu
 * it will display all flights in order
 * 
 * 
 */
public class FlightsPanel extends JPanel {
    //TODO
    Connection connection = null; 
    static String url = "jdbc:sqlite:/Users/yeet/Desktop/AGS-master 3/SQLite Databse/FlightInfo.db";
    static String planeURL = "jdbc:sqlite:/Users/yeet/Desktop/AGS-master 3/SQLite Databse/Planes.db";
    static String pilotURL = "jdbc:sqlite:/Users/yeet/Desktop/AGS-master 3/SQLite Databse/PilotInfo.db";
    
    public static  ArrayList<Flight> flightsList = new ArrayList<Flight>();
    public static ArrayList<Plane> planeList = new ArrayList<Plane>();
    public static ArrayList<String> pilotHealthList = new ArrayList<String>();
    public static ArrayList<String> pilotNameList = new ArrayList<String>();


    //Connects the user to the flights database with the local path 
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

    //Retrieves information from the flights database, creating flight objects, loading them onto the arraylist
    public void loadFlightsOntoList(){
        String sql = "SELECT * FROM FlightInfo";

        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)){


                while(rs.next()){
                    Flight temp = new Flight(rs.getString("ID"), rs.getString("Departure"),
                    rs.getString("Destination"), rs.getString("PlaneID"), rs.getString("DepartureTime"), 
                    rs.getString("ETA"), rs.getString("PilotName"), rs.getString("isSafe"), 
                    rs.getString("IsFlying"));

                    flightsList.add(temp);
                }
           
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


    }
    //Return connection to the plane database by the local path 
    public Connection connectToPlanesDB(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(planeURL);
            System.out.println("Connected to planes DB");
        } catch (SQLException e) {
            // TODO: handle exception
            e.getStackTrace();
        }
        return conn;
    }

    //Retrieves information from the planes database and created plane objects, adding them to the plane arraylist

    public void loadPlanesOntoList(){
        String sql = "SELECT * FROM Planes";
        try (Connection conn = this.connectToPlanesDB()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                Plane temp = new Plane(rs.getString("ID"), rs.getString("isReady"));
                planeList.add(temp);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public Connection connectToPilotDB(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(pilotURL);
            System.out.println("Connected to the Pilot Info DB");

        } catch (SQLException e) {

            e.getStackTrace();
            // TODO: handle exception
        }
        return conn;
    }

    public void loadPilotHealth(){
        String sql = "SELECT * FROM PilotInfo";
        try (Connection conn = this.connectToPilotDB()){
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                pilotHealthList.add(rs.getString("isHealthy"));
            }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

    public void loadPilotNames(){
        String sql = "SELECT * FROM PilotInfo";
        try (Connection conn = this.connectToPilotDB()){
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                pilotNameList.add(rs.getString("Name"));
            }
            
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

    public static ArrayList<String> getPilotNameList(){
        return pilotNameList;
    }



    public FlightsPanel(){

        //TODO 

       loadFlightsOntoList();
       loadPilotHealth();
       System.out.println(pilotHealthList.toString());
       loadPlanesOntoList();
       loadPilotNames();
       System.out.println(pilotNameList.toString());

        this.setLayout(new GridLayout(flightsList.size(),0));
        
        for(int i = 0 ; i < flightsList.size(); i++)
        {

            this.add(flightsList.get(i).display(),i,0);
        }



    }
}
