/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc6;
import java.sql.*;
import jdbc6.JDBC6;

/**
 *
 * @author mehak
 */
public class Insert {
    
    public static void main(String[] args) {
        
        Connection mycon= MyConnection.createConnection();
        String name;
        int age;
        long mobile;
        
        name="shivangi";
        age=25; 
        mobile=798745534;
        String sql="insert into players values (default, ?, ?, ?)"; //name, age mobile
        
        try 
        {
            PreparedStatement ps=mycon.prepareStatement(sql);     
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setLong(3, mobile);
            int k=ps.executeUpdate();
            if(k==1)
            {
                System.out.println("Data inserted successfully");
            }
            System.out.println(k);
        } 
        catch (SQLException e)
        {
            System.out.println(e);
        }
        //correct code start.....................................................
//        System.out.println("Con is"+mycon);
// 
//        jd.closeConnection();
//        try 
//        {
//               System.out.println(mycon.isClosed());
//        } 
//        catch (Exception e)
//        {
//            System.out.println("");
//        }
                //correct code ends.....................................................
                
               

    }
}
