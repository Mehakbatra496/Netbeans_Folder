/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
public class E1_BinaryToDecimal {
    public static void main(String[] args) {
        String st="101011";
        int decimal=0;
        int sqrt=1; int result;
        int superscript=0;
        for(int i=st.length()-1; i>=0; i--)
        {
            int k=(byte)(st.charAt(i)-'0');
            System.out.println(k);  
            result = k* (int )(Math.pow(8, superscript));
            
          decimal= decimal+result;
            System.out.println("Decimal is "+decimal);
          superscript= superscript+1;
        }
        
        System.out.println();       
        System.out.println(decimal);

         
    }
}
