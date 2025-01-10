package backend;
package main.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingHandler {

    public static void handleBooking(String name, String email, String phone, String message) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO bookings (name, email, phone, message) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.setString(4, message);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Booking successful!");
            }
        } catch (SQLException e) {
            System.err.println("Error saving booking: " + e.getMessage());
        }
    }
}
