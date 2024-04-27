/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

import java.util.zip.CRC32;

/**
 *
 * @author mehak
 */
public class A6_ArrayCopyClone 
    {
    public static void main(String[] args) {
        
    
    char[] cc={'i','d','o','k','e','r','o'};
    
    char[] cc2=new char[10];
    
    cc2=cc.clone();
    
    
//System.arraycopy(cc,1 , cc2, 0, 5);
//
//

for(int i=0; i<cc2.length; i++)
        System.out.println(cc2[i]);
//
//        System.out.println(String.valueOf(cc));  
//
    }
    

}