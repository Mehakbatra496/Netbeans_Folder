/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

import java.math.BigDecimal;

/**
 *
 * @author mehak
 */
public class A1_Arithematic {
    
    
    public static void main(String[] args) {
        
//        float a=25, b=7,c;
//        c=a/b;
        
        BigDecimal a=new BigDecimal(10);
        BigDecimal b=new BigDecimal(3);


            a=a.divide(b);
        System.out.println(a);
            
    }
    
}
