/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8features;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.time.*;

/**
 *
 * @author mehak
 */
public class A5_Date1 
{
    public static void main(String[] args)
    {
        Date d1= new Date();
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yy hh/mm/ss");
        String currentDate= sd.format(d1);
        System.out.println(currentDate);
        
        LocalTime tt = LocalTime.now();
        System.out.println(tt.getMinute());
        
        LocalDateTime ld= LocalDateTime.now();
        System.out.println(ld.withYear(2024));
        
        Clock c1= Clock.systemDefaultZone();
        
        System.out.println(c1.millis());
                
        
    }
}
