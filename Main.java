package com;


import java.util.Scanner;

public class Main {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();
        EventDAO eventDAO = new EventDAO();

        int loggedInUserId = -1;
       
        while (true) {
          System.out.println(" **Step into Schedula: Your Gateway to Effortless Event Management!** ");
          System.out.println("1. Register");
          System.out.println("2. Login");
          System.out.println("3. Create Event(Login required)");
          System.out.println("4. Exit");
          System.out.print("Enter your choice: ");
          int choice = scanner.nextInt();
          scanner.nextLine(); // consume newline

        switch (choice) {
           case 1:
            // Registration
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            System.out.println("Enter email: ");
            String email = scanner.nextLine();

               User newUser = new User(username,password,email);
               
                userDAO.registerUser(newUser);
                System.out.println("User registered successfully!");
                break;

           case 2:
              // Login 
             System.out.println("Enter username: ");
             username = scanner.nextLine();
             System.out.println("Enter password: ");
             password = scanner.nextLine();

             loggedInUserId = userDAO.loginUser(username, password);
             if (loggedInUserId != -1) {
                    System.out.println("Login successful! Welcome User ID: " + loggedInUserId);
                    } else {
                    System.out.println(" Login failed. Invalid username or password.");
                    }
                    break;
case 3:
// Create Event (only if logged in)
if (loggedInUserId == -1) {
System.out.println("You must log in first to create an event.");
break;
}
System.out.print("Enter event Id: ");
int eventId = scanner.nextInt();
scanner.nextLine();
System.out.print("Enter event name: ");
String eventName = scanner.nextLine();
System.out.print("Enter event date (YYYY-MM-DD): ");
String eventDate = scanner.nextLine();
System.out.print("Enter event time (HH:MM): ");
String eventTime = scanner.nextLine();
System.out.print("Enter location: ");
String location = scanner.nextLine();
System.out.print("Enter description: ");
String description = scanner.nextLine();

Event event = new Event(3,"Coding Quiz","19-12-2024","10:00:00 A.M","XYZ college","Welcome to our quest event",1);
event.setEventId(eventId);
event.setEventName(eventName);
event.setEventDate(eventDate);
event.setEventTime(eventTime);
event.setEventLocation(location);
event.setDescription(description);
event.setCreatedBy(loggedInUserId); // Set to the logged-in user's ID

eventDAO.createEvent(event);
break;
case 4:
// Exit
System.out.println("Exiting...");
scanner.close();
return;
default:
System.out.println("Invalid option. Please try again.");
}
}
}
}

