/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.framework;

import java.util.*;
import java.util.List;

/**
 *
 * @author mehak
 */
public interface A2_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList a1= new ArrayList();
        a1.add(11);
        a1.add(12);
        a1.add("MHk");
        a1.add(3,56);
        a1.add(77);
        a1.add(77);
        
        ArrayList a2= new ArrayList();
        a2.add(45);
        a2.add(67);
        a2.add("Amit");
        a2.add(a1);
        a2.add(77);
        
//        a1.clear();
//        System.out.println(a1);
//        a2.removeAll(a1);

//        for(int i=0; i<a2.size(); i++)
//        System.out.println(a2.get(i));
//      
//        
//        System.out.println(a2.contains(a1));
//        
//
        System.out.println(a1.indexOf(77));
        Object obj[]= a1.toArray();

    for (int i=0; i<obj.length; i++)
    {
        System.out.println(obj[i]);
    }
        
 }
    
}