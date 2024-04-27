/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mehak
 */
public class Jdbc4 {

    public static void main(String[] args) {
        // Modify these variables based on your MySQL setup
        String url = "jdbc:mysql://localhost/studentdb";
        String username = "mehak";
        String password = "111";

        try {
            // Establishing the database connection
                    Connection connection = DriverManager.getConnection(url, username, password);          
            
                    System.out.println("connection variable is "+connection); // Message after successful connection
                    System.out.println("Connected to the database successfully"); // Message after successful connection
            }
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage()); // Message if something goes wrong
        }
        
//        connection.getName();
               System.out.println("mhk2"); // Message if something goes wrong

    }
    
}








