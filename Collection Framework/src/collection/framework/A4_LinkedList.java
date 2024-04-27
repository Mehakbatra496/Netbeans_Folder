/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;

import java.util.LinkedList;

/**
 *
 * @author mehak
 */
public class A4_LinkedList {
    
    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
        
        l1.add(12);
        l1.add(34);
        l1.add(77);
        
        l1.add(3,"Aman");
        l1.add(3,"Aman");
        l1.removeFirst();
        l1.removeLast();
        
//        System.out.println(l1);
//        
//        System.out.println(l1.getFirst());
//        System.out.println(l1.getLast());

        LinkedList l2= new LinkedList();
        l2.add(l1);
        l2.add("mhk l2");
        System.out.println(l2);
        
//        l1.getLast();%
                
                }
    
}
