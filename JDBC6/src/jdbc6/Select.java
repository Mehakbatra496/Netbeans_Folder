/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc6;
import java.sql.*;
/**
 *
 * @author mehak
 */
public class Select
{
    public static void main(String[] args) 
    {
        String sql="select * from players where name=?";
        Connection mycon=MyConnection.createConnection();
        try {
            
            PreparedStatement ps= mycon.prepareStatement(sql);
        
            ResultSet rs= ps.executeQuery();
           
        } catch (Exception e) {                                                                    
        System.out.println(e);
        }
     }
    }
    

