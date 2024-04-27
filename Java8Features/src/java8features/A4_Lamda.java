/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8features;

interface I1
{
    void m1();
}

class Demo1 implements I1
{
    
}
public class A4_Lamda 
{    
   
    public static void main(String[] args)
    {
            I1 ob=new I1()
            
            {
                public void m1()
                {
                    System.out.println("i am in m1() method...!!");
                }
    //            public void m2()
//            {
//                
//            }
        };
        ob.m1();
    }
}

