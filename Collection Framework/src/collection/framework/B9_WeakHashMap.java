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
public class B9_WeakHashMap {
    
    public static void main(String[] args) {
        Abc a1= new Abc();
//        a1=null;
        a1.fun();
        a1=null;
        System.gc();
          Integer i1=new Integer(101);
        Integer i2=new Integer(102);
        
        HashMap hm=new HashMap();
        //WeakHashMap hm=new WeakHashMap();
        
        hm.put(i1, "deepak");
        hm.put(i2, "rahul");
        
        i2=null;
        System.gc();
        
        System.out.println(hm);
    }
}
class Abc
{

    public Abc()
    {
        System.out.println("Object Created");
    }
    void fun()
    {
        System.out.println("fun");
    }
    
   protected void finalize()
    {
        System.out.println("Deleted");
    }
    
    
}