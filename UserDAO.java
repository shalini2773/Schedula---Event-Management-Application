package com;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

public void registerUser(User user) { 
    String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
    try (Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){

          //Debug output
          System.out.println("Registering User: " + user.getUsername() + ", "
+ user.getEmail());

        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.executeUpdate();

                 
                  System.out.println("User registered successfully!");
   }
    catch (SQLException e) {
      System.out.println("SQL error: " + e.getMessage());
        e.printStackTrace();
    }

  }


public int loginUser(String username, String password) {
    String sql = "SELECT user_id FROM users WHERE username = ? AND password = ? ";
    
    try (Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        

if(resultSet.next()){
        return resultSet.getInt("user_id");
}else{
  return -1;
}
       
} catch (SQLException e) {
        e.printStackTrace();
       return -1; 
    }
  
  }
}


