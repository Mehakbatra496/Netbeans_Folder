/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.framework;
import java.util.HashSet;
public class A9_HashSet
{
    
    public static void main(String[] args) {
        HashSet h1= new HashSet();
        h1.add(92);
        h1.add(6);
        h1.add("mhk");
        h1.add('k');
        
        for(int i=0 ; i<50; i++)
            h1.add(i);
        System.out.println(h1);
        
        System.out.println(h1.hashCode());
    }
}
