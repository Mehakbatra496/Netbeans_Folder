/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

/**
 *
 * @author mehak
 */
public class B2_NullPointerException {
    public static void main(String[] args)
    {
        
        String ss="ms", se=null;
       
        try {
                    run(se);

        } catch (NullPointerException e) 
        {
            e.printStackTrace();     
        }
        
       
        run(ss);
    }
    
   static void run(String st)
    {
        System.out.println(st.toUpperCase());
    }

        
}
