package com;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventDAO {

     public void createEvent(Event event) {
        String sql = "INSERT INTO events (event_name, event_date, event_time, location, description, created_by) " + "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, event.getEventName());
            preparedStatement.setString(2, event.getEventDate());
            preparedStatement.setString(3, event.getEventTime());
            preparedStatement.setString(4, event.getEventLocation());
            preparedStatement.setString(5, event.getDescription());
            preparedStatement.setInt(6, event.getCreatedBy()); // user ID of the creator
            preparedStatement.executeUpdate();
            System.out.println("Event created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}