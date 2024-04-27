/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

/**
 *
 * @author mehak
 */
public class C2_StringIndexOutOfBoundsException {
    
    public static void main(String[] args) {
        
        String st="Mehak";
        
        char[] ch = new char[30];
        char a=st.charAt(1);
        System.out.println(a);

        ch=st.toCharArray();
        System.out.println(ch);
        
       
        
    }
}
