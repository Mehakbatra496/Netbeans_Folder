/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8features;
import java.time.*;
/**
 *
 * @author mehak
 */
public class A6_Date2 
{
    public static void main(String[] args) {
        Year yy= Year.now();
        
        System.out.println(yy.adjustInto(yy));
        
        YearMonth ym= YearMonth.now();
        System.out.println(ym.getMonth());
        
    }
}
