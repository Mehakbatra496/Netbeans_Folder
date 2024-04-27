/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc6;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author mehak
 */
public class MyConnection
{
   
    static Connection con;

    static {
        try 
        {
             String url="jdbc:mysql://localhost/jdbc6";
             String username="mehak";
             String password="111";
             con= DriverManager.getConnection(url,username, password);
        } 
        catch (SQLException e) 
        {
            System.out.println("Issue in establishing the connection");
        } 
    }
    public static Connection createConnection()
    {
        System.out.println("Connection is established successfully...");
        return con;
    }    
    
    
    public static void closeConnection()
    {
        try {
        con.close();
            System.out.println();
            
        } catch (Exception e) {
        }
    }
    
}
