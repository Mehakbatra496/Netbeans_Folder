/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringpractice;

/**
 *
 * @author mehak
 */
public class A3_StringParts {
    public static void main(String[] args) {
        String st1= new String("MehakBatrattttt"); 
        String st2= new String("");
        int n=3;
        int k=0;
        int sublen=st1.length()/n; 
        System.out.println("Sublen is "+sublen);

        if(st1.length()%n!=0)
        {
            System.out.println("Can not be divided into "+n +" equal parts");
        }
        else
        {
        
        for(int i=0; i<n; i++)
        {
                for(int j=0; j<sublen; j++)
                {
                    st2=st2+st1.charAt(k);
                    k=k+1;
                }
                System.out.println(st2);
                st2="";
                
        }
        }
    }
}
