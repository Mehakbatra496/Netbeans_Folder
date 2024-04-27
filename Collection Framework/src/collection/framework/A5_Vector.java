/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;

import java.util.Vector;

/**
 *
 * @author mehak
 */
public class A5_Vector {
    
    public static void main(String[] args) {
        
        Vector v1= new Vector();
        
        v1.add(0, "MHk");
        v1.add(1, 55);
        v1.addElement(44);
        
        Vector v2= new Vector();
        
//        v2.add("v21");
//        v2.add("v22");
//        v2.add(77);
       
        for(int i=0; i<55;i++)
        v2.add(i);
        
//        System.out.println(v1);
//        System.out.println(v1.indexOf(v1,44 ));
//        System.out.println(v1.contains(66));
//        System.out.println(v1.lastElement());
//System.out.println(v1.clone());
//
//        System.out.println(v1.add(v2));
//        System.out.println(v1);
//        
//        System.out.println(v1.capacity());
//        v1.insertElementAt(v2, 3);
        System.out.println(v2.capacity());
        System.out.println(v2);
        
            
        

                }
}
