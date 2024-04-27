/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopspillers.InheritancePractice;

class Device
{
    Object fun()
    {
        return  null;
    }
}
class Smartphone extends Device
{
    Object fun()
   {
       int arr[]= new int[]{34,343,99};
       return arr;
   }
}
class Laptop extends Device
{
   String fun()
   {
       String s1="mehak";
       return s1;
//       return 1;
   }
}

class ModernGadgets
{
    
}

public class A2_Inheritance {
    public static void main(String[] args)
    {
        
        Smartphone s1= new Smartphone();
        Device l1= new Laptop();
        
         System.out.println(s1.fun());
         System.out.println(l1.fun());


    }
  
}
