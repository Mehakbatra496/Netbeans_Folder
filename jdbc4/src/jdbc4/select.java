/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package jdbc4;

    import java.sql.*;
/**
 *
 * @author mehak
 */
public class select {
    
   
        public static void main(String[] args) {
            try {
                   
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "mehak", "111");//Establishing connection
                System.out.println("Connected With the database successfully");
                //Using SQL SELECT Query 
                PreparedStatement preparedStatement =connection.prepareStatement("select * from student");

                //Creating Java ResultSet object
                ResultSet resultSet = preparedStatement.executeQuery();
                
                //Getting Results
                  while(resultSet.next()){
                            String rollNo=resultSet.getString("ROLLNO");
                            String name=resultSet.getString("STUDNAME");
                            String dept=resultSet.getString("DEPT");
                            String city=resultSet.getString("CITY");
                //Printing Results
                            System.out.println("Roll no = "+rollNo);
                            System.out.println("Name = "+name);
                            System.out.println("Department = "+dept);
                            System.out.println("City = "+city);
        }
               


        } catch (SQLException e) {

                System.out.println("Error while connecting to the database");

                        }
                    }

                
    
}
