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
/*
 * This panel will be on the bottom of the main menu
 * it will display all flights in order
 * 
 * 
 */
public class FlightsPanel extends JPanel {
    
    Connection connection = null; 
    static String url = "jdbc:sqlite:C:/Users/egeni/OneDrive/Desktop/MINE/AGS/SQLite Databse/FlightInfo.db";
    
    
    public ArrayList<Flight> flightsList = new ArrayList<Flight>();

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

    public FlightsPanel(){

        //TODO 

       loadFlightsOntoList();

        this.setLayout(new GridLayout(flightsList.size(),0));
        
        for(int i = 0 ; i < flightsList.size(); i++)
        {

            this.add(flightsList.get(i).display(),i,0);
        }



    }
}
