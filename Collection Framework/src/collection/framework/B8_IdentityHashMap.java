/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;
import java.util.IdentityHashMap;
import java.util.HashMap;

/**
 *
 * @author mehak
 */
public class B8_IdentityHashMap {
    public static void main(String[] args) {
        
        Integer i1=1
        Integer i2=2;
        
        HashMap hm=new HashMap();
        hm.put(i1, "deepak");
        hm.put(i2, "deepak");      
        
// i1.equals(i2) - true
        System.out.println(i1.equals(i2));
        System.out.println(hm);
        
//        IdentityHashMap id= new IdentityHashMap();
//        id.put(4, "poi");
//        id.put(2, 95);
//                id.put(3, 76);
//
//        
//        System.out.println(id);
    }
}
