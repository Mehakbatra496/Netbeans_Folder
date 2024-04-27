/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package jdbc4;
import java.sql.*;

  public class Insert {
    
       public static void main(String[] args) {
            try {
                   
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "mehak", "111");//Establishing connection
                System.out.println("Connected With the database successfully");
                //Creating PreparedStatement Object
                PreparedStatement preparedStatement =connection.prepareStatement("insert into student values(?,?,?,?)");

                //Setting values for each parameter
                preparedStatement.setString(1,"1");
                preparedStatement.setString(2,"Mehtab");
                preparedStatement.setString(3,"Computer");
                preparedStatement.setString(4,"Ranchi");

                //Executing Query
                preparedStatement.executeUpdate();
                System.out.println("Data inserted Successfully");
               
            }
            
            catch (SQLException e) {

                System.out.println("Error while connecting to the database");

                        }
                    }   
    
  } 
