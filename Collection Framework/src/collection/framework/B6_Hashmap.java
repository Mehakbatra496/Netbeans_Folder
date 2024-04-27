package collection.framework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
public class B6_Hashmap {
    public static void main(String[] args) {
        
        HashMap h1= new HashMap();
        h1.put(2, "mhk");
        h1.put(4, 9);
        h1.put(1, 'p');
        h1.put(3, 23.5);
        
//        System.out.println(h1);
        
        Set se= h1.entrySet();
        
        
        Iterator it= se.iterator();
        
        while(it.hasNext())
        {
//            System.out.println(it.next());
              Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.println("----------------------------------");
        }
//        Iterator it= h1.i
    }
    
}
