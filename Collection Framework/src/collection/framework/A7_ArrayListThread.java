/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;

import java.util.*;

/**
 *
 * @author mehak
 */
public class A7_ArrayListThread {
    public static void main(String[] args) {
        
        Calculate c= new Calculate();
        
        One o= new One();
        One t= new One();

        o.start();
        t.start();
    }
}

 class One extends Thread
 {     
   static Calculate c1= new Calculate();
   
        public void run()
         {
             String name= Thread.currentThread().getName();
             c1.fun(name);
         }
}
 
 class Calculate
{
   
     ArrayList v1= new ArrayList();
     int i;      
     static String Name;
   public void fun(String name)
     {
        Name=name;
         
        v1.add(name);
//        v1.add(name);
//        v1.add(3);
        System.out.println();
//        for(int i=0; i<50 ; i++)
        System.out.println(v1);
     }
}