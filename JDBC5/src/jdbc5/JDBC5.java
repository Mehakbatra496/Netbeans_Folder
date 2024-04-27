/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc5;
//import com.mysql.cj.callback.UsernameCallback;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.PreparedStatement;
import  java.sql.*;

/**
 *
 * @author mehak
 */
public class JDBC5
    {

    public static void main(String[] args)
    {
            System.out.println("JDBC by MHk"); 

            String url="jdbc:mysql://localhost/jdbc5";
            String username="mehak";
            String password="111";

            try {
                    Connection con =DriverManager.getConnection(url, username, password);
                    System.out.println("Connected to Database Successfully");  
//                  Driver driver = registeredDrivers.get(driverName);
//               `  System.out.println(DriverManager.getDriver(url));
//                con.close());
                    System.out.println("Returned con object is "+con);
                    System.out.println(DriverManager.class);
//                  System.out.println(con.getClientInfo());
//                  String driverName = DriverManager.extractDriverName(url);
//                  System.out.println(DriverManager.registerDriver(driver));
                    PreparedStatement ps= con.prepareStatement("insert into register values('mehak@gmail.com', 'mhk@123')");
//                  ps.executeUpbdate();
                    System.out.println(ps);
                    System.out.println(ps.executeUpdate());
//                    ps.
               }
            
            catch (Exception e)
            {
                   System.out.println("Error while connecting to Database "+e.getMessage());
            }
     }

    }

