/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author mehak
 */
public class B2_SortedSet {
    public static void main(String[] args) {
        SortedSet s1= new TreeSet();
        
        s1.add("ertw");
        s1.add("tyerte");
        s1.add("asre");
                s1.add("amisha");
        
                System.out.println(s1);
               System.out.println(s1.headSet(s1));
    }
}
