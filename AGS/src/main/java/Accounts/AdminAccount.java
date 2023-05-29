import Admin.*;
import Accounts.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AdminAccount extends Account {

    private AdminPanel panel;

    public AdminAccount(String name, String role, int userID, String password){

        super(name,role,userID,password);

    }

    public void addFlight(Pilot pilot, String from, String to, String date, Time time, Plane plane) {
        try {
            // 1. Establish the database connection

            // 2. Generate a new flight ID
            int newFlightId = generateFlightId();

            // 3. Prepare the SQL statement
            String sql = "INSERT INTO flights (flight_id, pilot_id, source, destination, date, time, plane_id) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // 4. Create a PreparedStatement
            PreparedStatement statement = connection.prepareStatement(sql);

            // 5. Set the parameter values for the flight details
            statement.setInt(1, newFlightId);
            statement.setInt(2, pilot.getId()); // Assuming pilot has an ID property
            statement.setString(3, from);
            statement.setString(4, to);
            statement.setString(5, date);
            statement.setTime(6, time);
            statement.setInt(7, plane.getId()); // Assuming plane has an ID property

            // 6. Execute the SQL statement
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Flight added successfully to the database with ID: " + newFlightId);
            } else {
                System.out.println("Failed to add flight to the database.");
            }

            // 7. Close the statement and database connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error adding flight to the database: " + e.getMessage());
        }
}

    private int generateFlightId() throws SQLException {
        // Generate a new flight ID using your desired logic
        // You can retrieve the last used flight ID from the database and increment it
        // Or you can use a sequence or UUID depending on your database system

        int newFlightId = 0;

        // Example: Retrieve the last used flight ID from the database
        String sql = "SELECT MAX(flight_id) FROM flights";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            newFlightId = resultSet.getInt(1) + 1;
        }
        resultSet.close();
        statement.close();

        return newFlightId;
    }
    
    public void manageFlight() {
        
    }

    public void deleteFlight(int flightId) {
        try {
            // 1. Establish the database connection

            // 2. Prepare the SQL statement
            String sql = "DELETE FROM flights WHERE flight_id = ?";

            // 3. Create a PreparedStatement
            PreparedStatement statement = connection.prepareStatement(sql);

            // 4. Set the parameter value for the flight ID
            statement.setInt(1, flightId);

            // 5. Execute the SQL statement
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Flight deleted successfully from the database.");
            } else {
                System.out.println("Flight not found in the database.");
            }

            // 6. Close the statement and database connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error deleting flight from the database: " + e.getMessage());
    }
}


}
