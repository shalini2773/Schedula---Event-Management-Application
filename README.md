# Schedula---Event-Management-Application

# Overview
Discover Schedula, where you can effortlessly register users and organize events with our user-friendly Java application. Experience seamless event planning at your fingertips with Schedula!

# Features

**User Registration:** Securely register users with a username, password, and email.

**User Authentication:** Log in users and manage sessions effectively.

**Event Creation:** Users can create events with detailed descriptions, including the event name, date, time, location, and more.

**User-Friendly Interface:** Easy-to-use command-line interface to guide users through each step.

**Robust Database Management:** Uses MySQL for data storage, ensuring data persistence and integrity.



---

# Technology Stack

**Java:** Core programming language for building the application.

**MySQL:** Relational database management system for user and event data storage.

**JDBC:** Java Database Connectivity for seamless interaction between the Java application and the MySQL database.



---

# Getting Started

To run Schedula locally, follow these steps:

**Prerequisites**

Ensure you have Java Development Kit (JDK) installed on your machine.

Set up MySQL and create a database named schedula with the following tables:


Users Table
```
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
```

Events Table
```
CREATE TABLE events (
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    event_name VARCHAR(255) NOT NULL,
    event_date DATE NOT NULL,
    event_time TIME NOT NULL,
    location VARCHAR(255) NOT NULL,
    description TEXT,
    created_by INT,
    FOREIGN KEY (created_by) REFERENCES users(user_id)
);
```
**Installation Steps**

1. Clone the repository to your local machine:

  git clone 
```
https://github.com/shalini2773/Schedula---Event-Management-Application.git
```

2. Open the project in your favorite IDE (e.g., Visual Studio Code).


3. Ensure you have the MySQL Connector/J library included in your project to connect to the MySQL database.


4. Configure the database connection details in the DatabaseConnection class.


5. Compile and run the application.




---

# Usage

1. Register: Choose the registration option and enter your username, password, and email to create an account.


2. Login: Use your credentials to log into the application.


3. Create Event: Once logged in, you can create new events by providing the required details.




---

# Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to fork the repository and submit a pull request.


---

# License

This project is licensed under the MIT License - see the LICENSE file for details.


---

**Thank you for exploring Schedula!**
