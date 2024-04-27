/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc1;
//package com.mycompany.jdbc2;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A simple Java program to connect to a MySQL database.
 * Modify the connection URL, username, and password as needed.
 */
public class jdbc1 {

    public static void main(String[] args) {
        // Modify these variables based on your MySQL setup
        String url = "jdbc:mysql://localhost:3306/studentdb2";
        String username = "mehak";
        String password = "111";

        try {
            // Establishing the database connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully"); // Message after successful connection
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage()); // Message if something goes wrong
        }
    }
}
