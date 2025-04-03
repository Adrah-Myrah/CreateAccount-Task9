package AccountPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserInfo {
    
    private static final String URL = "jdbc:mysql://localhost:3306/logincredentials_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Replace with your actual password if applicable

    public static void saveLogin(String userName, String email, String password) {
        String sql = "INSERT INTO logform(userName, email, password) VALUES(?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set parameters for the query
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            // Execute update
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data saved successfully!");
            } else {
                System.out.println("No data was saved.");
            }
        } catch (Exception e) {
            // Print detailed error for debugging
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
