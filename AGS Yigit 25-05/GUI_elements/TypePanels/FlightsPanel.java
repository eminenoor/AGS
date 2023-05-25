

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JPanel;
/*
 * This panel will be on the bottom of the main menu
 * it will display all flights in order
 * 
 * 
 */
public class FlightsPanel extends JPanel {
    
    String url = "jdbc:sqlite:C:/Users/User/Desktop/AGS-master/SQLite Databse/Flights.db";
    Connection connection = null;
    
    //The variables for the flights 
    //public Flight[] flights;
    String flightCode;
    double departureTime;
    double arrivalTime;
    String departure;
    String destination;
    String planeID;
    String flightInfo;
    
    
    //Flight tempFlight = new Flight(flightCode, departureTime, arrivalTime, departure, destination, planeID);
    
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

    public void getFlightInfo(){

        String sql = "SELECT ID FROM Flights";
        try(Connection connection = this.connect();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            while(rs.next()){
               System.out.println(rs.getString("ID"));
                             
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

        
    }



    public FlightsPanel(){
       
        

        /*for(int i = 0 ; i < flights.length; i++)
        {

           this.add(flights[i].display());
       }*/



    }

    public static void main(String[] args) {
        FlightsPanel fp = new FlightsPanel();
        fp.getFlightInfo();
       
    }
}
